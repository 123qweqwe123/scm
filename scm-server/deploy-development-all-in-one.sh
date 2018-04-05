#!/usr/bin/env bash

# 执行编译操作
# cd /Users/huangrupeng/work/java/gitlab/scm/scm-fe
# npm run build

# 执行打包操作
cd /Users/huangrupeng/work/java/gitlab/scm/scm-server
mvn clean install -DskipTests

# 执行上传操作

hostname="10.24.10.174"
username="root"
password="genertech"
sourcefile="/Users/huangrupeng/work/java/gitlab/scm/scm-server/war/ROOT.war"
destdir="/usr/local/tomcat/"

# 将包上传到服务器

expect -c '
    spawn scp '$sourcefile' root@'$hostname':'$destdir'
    set timeout 100
    expect {
        password {
            # 这个地方得使用两个斜杠
            send  "'${password}'\n"
            #显示scp进度
            interact
        }
    }
'
bkwarname="`date +%Y%m%d-%H%M`-ROOT.war.bak"
expect -c '
    spawn ssh root@'$hostname'
    set timeout 100
    send_user "'${username}'\n"
    expect {
        password {
            send  "'${password}'\n"
        }
    }
    #开始执行打包操作
    send "pkill -9 java\n"
    send "cd /usr/local/tomcat/webapps\n"
    send "mv ROOT.war '${bkwarname}'\n"
    send "mv ../ROOT.war .\n"
    send "rm -rf ROOT\n"
    send "cd /usr/local/tomcat/bin\n"
    send "./startup.sh\n"
    send "tail -f /usr/local/tomcat/logs/catalina.out\n"
    interact
'

