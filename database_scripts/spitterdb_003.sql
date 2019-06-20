ALTER TABLE `spitterdb`.`spittle` 
CHANGE COLUMN `id_spittle` `id_spittle` INT(11) NOT NULL DEFAULT '0' ;


INSERT INTO spitterdb.db_versions (dbversion, record_date, author, reason, type)
VALUES ('003', '2019-06-20 15:40:20', 'nektarios', 'made id_spittle int', 'DDL');