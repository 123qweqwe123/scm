SELECT *
FROM SYS_MENU;
SELECT *
FROM SYS_ROLE r
  LEFT JOIN SYS_ROLE_PERMISSION p
    ON r.ID = p.ROLE_ID;

-- 角色页面查询sql
SELECT
  role.*,
  rps.permissionIds,
  rps.permissionNames
FROM SYS_ROLE role
  LEFT JOIN (
              SELECT
                rp.ROLE_ID,
                listagg(p.NAME, ',')
                WITHIN GROUP (
                  ORDER BY p.ID) permissionNames,
                listagg(p.ID, ',')
                WITHIN GROUP (
                  ORDER BY p.ID) permissionIds
              FROM SYS_ROLE_PERMISSION rp
                LEFT JOIN SYS_PERMISSION p
                  ON rp.PERMISSIONS_ID = p.ID
              GROUP BY rp.ROLE_ID) rps
    ON role.ID = rps.ROLE_ID;

-- 账户页面查询sql
SELECT
  a.*,
  ars.roleIds,
  ars.roleNames
FROM SYS_ACCOUNT a
  LEFT JOIN (
              SELECT
                ar.ACCOUNT_ID,
                listagg(r.NAME, ',')
                WITHIN GROUP (
                  ORDER BY r.ID) roleNames,
                listagg(r.ID, ',')
                WITHIN GROUP (
                  ORDER BY r.ID) roleIds
              FROM SYS_ACCOUNT_ROLE ar
                LEFT JOIN SYS_ROLE r
                  ON ar.ROLE_ID = r.ID
              GROUP BY ar.ACCOUNT_ID
            ) ars
    ON a.ID = ars.ACCOUNT_ID;

-- 样本转运相关 sql
SELECT *3 ?  087654
FROM pip_scm_trans_proc_master;
SELECT *
FROM pip_scm_trans_proc_detail;


SELECT
  ID,
  TRANS_NO,
  STATUS,
  BOX_COUNT,
  CREATE_TIME,
  CREATE_BY,
  UPDATE_TIME,
  UPDATE_BY,
  RCC_CODE,
  CREATE_BY_NAME
FROM PIP_SCM_TRANS_PROC_MASTER
WHERE 1 = 1;


SELECT *
FROM PIP_SCM_TRANS_LINK
WHERE LCC_CODE = '320205';

SELECT

  ID,
  TRANS_ID,
  DETAIL_ID,
  SRC_FILE_NAME,
  FILE_NAME,
  FILE_PATH,
  CREATE_TIME,
  CREATE_BY,
  UPDATE_TIME,
  UPDATE_BY

FROM PIP_SCM_TRANS_PROC_DETAIL_PIC
WHERE (DETAIL_ID = '6b903c6689b94586a90bf7f7112a288d');


SELECT *
FROM PIP_SCM_TRANS_LINK
WHERE LINK_NAME = '王伟军';
SELECT *
FROM PIP_SCM_TRANS_PROC_DETAIL
WHERE TRANS_DETAIL_NO = 'D0040-4403-20170502-01_1';


SELECT
  box.BOX_CODE BOXCODE,
  count(*)     TUBENUM
FROM PIP_SCM_FROZENBOX box
  LEFT JOIN PIP_SCM_TRANS_PROC_DETAIL_BOX dbox ON dbox.BOX_CODE = box.BOX_CODE
  INNER JOIN PIP_SCM_FROZENTUBE tube ON tube.BOX_CODE = box.BOX_CODE AND tube.BOX_TYPE = box.BOX_TYPE
WHERE 1 = 1
      -- AND box.LCC_CODE = #{lccCode}
      AND box.BOX_TYPE = 'A' AND dbox.BOX_CODE IS NULL
GROUP BY box.BOX_CODE
ORDER BY BOXCODE


SELECT #{transDetailNo} || '_B' ||
       (nvl(max(CASE WHEN INSTR(TRANS_DETAIL_NO, '_B', 1) = 0
         THEN NULL
                ELSE to_number(SUBSTR(TRANS_DETAIL_NO, INSTR(TRANS_DETAIL_NO, '_B', 1) + 2)) END), 0) + 1)
FROM PIP_SCM_TRANS_PROC_DETAIL
WHERE TRANS_DETAIL_NO LIKE #{transDetailNo} || '%';


SELECT *
FROM PIP_SYS_ACCOUNT
WHERE upper(LOGIN_NAME) LIKE '%CHEN%';

SELECT *
FROM PIP_SCM_TRANS_PROC_MASTER;


SELECT
  box.lcc_code          lccCode,
  box.box_code          boxCode,
  count(tube.tube_code) total,
  max(lcc.lcc_name)     lccName,
  max(lcc.rcc_code)     rccCode,
  max(rcc.rcc_name)     rccName
FROM pip_scm_frozenbox box
  LEFT JOIN pip_scm_frozentube tube
    ON box.box_code = tube.box_code
       AND box.box_type = tube.tube_type
  LEFT JOIN PIP_COMM_LCC lcc
    ON box.lcc_code = lcc.lcc_code
  LEFT JOIN PIP_COMM_RCC rcc
    ON rcc.RCC_CODE = lcc.RCC_CODE
WHERE 1 = 1
      AND box.box_type = 'A'
      AND box.is_checkin = 2
      AND lcc.LCC_CODE = '440399'
--and lcc.rcc_code = #{rccCode}
GROUP BY box.lcc_code, box.box_code
ORDER BY box.lcc_code, box.box_code;


SELECT *
FROM pip_scm_frozentube;
SELECT *
FROM PIP_SCM_FROZENBOX box
WHERE box.IS_CHECKIN = 2 AND box.BOX_TYPE = 'A'


SELECT
  box.lcc_code          lccCode,
  box.box_code          boxCode,
  count(tube.tube_code) total
FROM pip_scm_frozenbox box
  LEFT JOIN pip_scm_frozentube tube
    ON box.box_code = tube.box_code
       AND box.box_type = tube.tube_type
WHERE box.BOX_TYPE = 'A' AND box.IS_CHECKIN = 1
GROUP BY box.LCC_CODE, box.BOX_CODE;


SELECT
  box.lcc_code          lccCode,
  box.box_code          boxCode,
  count(tube.tube_code) total,
  max(lcc.lcc_name)     lccName,
  max(lcc.rcc_code)     rccCode,
  max(rcc.RCC_NAME)     rccName
FROM pip_scm_frozenbox box LEFT JOIN pip_scm_frozentube tube ON box.box_code = tube.box_code AND box.box_type = tube.tube_type
  LEFT JOIN PIP_COMM_LCC lcc ON box.lcc_code = lcc.lcc_code
  LEFT JOIN PIP_COMM_RCC rcc ON rcc.RCC_CODE = lcc.RCC_CODE
WHERE 1 = 1 AND box.box_type = 'A' AND box.is_checkin = 2 AND lcc.rcc_code = ?
GROUP BY box.lcc_code, box.box_code
ORDER BY box.lcc_code, box.box_code;

SELECT *
FROM PIP_COMM_RCC
WHERE RCC_CODE = 4403;


SELECT
  box.lcc_code          lccCode,
  box.box_code          boxCode,
  count(tube.tube_code) total,
  max(lcc.lcc_name)     lccName,
  max(lcc.rcc_code)     rccCode,
  max(rcc.rcc_name)     rccName
FROM pip_scm_frozenbox box
  LEFT JOIN pip_scm_frozentube tube
    ON box.box_code = tube.box_code
       AND box.box_type = tube.tube_type
  LEFT JOIN PIP_COMM_LCC lcc
    ON box.lcc_code = lcc.lcc_code
  LEFT JOIN PIP_COMM_RCC rcc
    ON rcc.RCC_CODE = lcc.RCC_CODE
WHERE 1 = 1
      AND box.box_type = 'A'
      AND box.is_checkin = 2
      AND lcc.rcc_code = '4403'
GROUP BY box.lcc_code, box.box_code
ORDER BY box.lcc_code, box.box_code;

SELECT *
FROM pip_scm_frozentube;
