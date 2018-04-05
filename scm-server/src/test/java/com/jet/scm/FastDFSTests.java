package com.jet.scm;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.junit.Test;

import java.io.IOException;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/27 下午5:43
 */
public class FastDFSTests {


    @Test
    public void testUpload() {

        try {
            ClientGlobal.initByTrackers("10.211.55.13:22122");
            TrackerClient tracker = new TrackerClient();
            TrackerServer trackerServer = tracker.getConnection();
            StorageServer storageServer = null;
            StorageClient1 client = new StorageClient1(trackerServer, storageServer);
            NameValuePair[] pairs = new NameValuePair[1];
            pairs[0] = new NameValuePair("name", "小明");
            String id = client.upload_file1("/Users/huangrupeng/Pictures/calvin_and_hobbes-2016-01-21-0514.jpg", null, pairs);

            System.out.println(id);
            String id1 = client.upload_file1("M00", "M11", "/Users/huangrupeng/Pictures/calvin_and_hobbes-2016-01-21-0514.jpg", null, null);
            System.out.println(id1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
