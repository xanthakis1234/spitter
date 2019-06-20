create table db_versions
(
  dbversion   varchar(6)  not null primary key,
  record_date datetime    not null,
  author      varchar(20) not null,
  reason      varchar(200),
  type        varchar(50) not null
);

INSERT INTO spitterdb.db_versions (dbversion, record_date, author, reason, type)
VALUES ('001', '2019-06-20 10:25:51', 'nektarios', 'Create spitter and spittle tables.
Populate tables above with sample data', 'DDL');

INSERT INTO spitterdb.db_versions (dbversion, record_date, author, reason, type)
VALUES ('002', '2019-06-20 10:27:35', 'stroh', 'Create dbversion table', 'DDL');