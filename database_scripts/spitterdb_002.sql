create table db_versions (
  dbversion   varchar(6)  not null primary key,
  record_date datetime    not null,
  author      varchar(20) not null,
  reason      varchar(200),
  type        varchar(50) not null
);

