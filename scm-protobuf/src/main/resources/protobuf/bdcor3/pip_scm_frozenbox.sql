create table PIP_SCM_FROZENBOX
(
  box_code        VARCHAR2(128) not null,
  box_type        VARCHAR2(128) not null,
  fridge_id       VARCHAR2(128),
  box_state       NUMBER(2),
  project_id      VARCHAR2(128) not null,
  remark          VARCHAR2(128),
  is_checkin      NUMBER(1) default 2,
  checkinlist_id  VARCHAR2(37),
  lcc_code        VARCHAR2(128) not null,
  create_date     DATE,
  create_by       VARCHAR2(128),
  id              VARCHAR2(64),
  version         VARCHAR2(64),
  client_id       VARCHAR2(64),
  update_flag     NUMBER(4),
  hr3_update_date DATE,
  trans_date      DATE
)