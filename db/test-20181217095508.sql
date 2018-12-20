--  *********************************************************************
--  Update Database Script
--  *********************************************************************
--  Change Log: G:/none/Java/idea/qycms/db/liquibase/changelog-mysql-master-20181217095508.yaml
--  Ran at: 18-12-17 上午9:55
--  Against: qycmsdev@localhost@jdbc:MySQL://localhost:3306/qycmsdev?characterEncoding=utf8&useSSL=false
--  Liquibase version: 3.6.2
--  *********************************************************************

--  Lock Database
UPDATE qycmsdev.DATABASECHANGELOGLOCK SET `LOCKED` = 1, LOCKEDBY = 'DESKTOP-SI04Q2I (172.19.102.97)', LOCKGRANTED = '2018-12-17 09:55:16.069' WHERE ID = 1 AND `LOCKED` = 0;

--  Changeset G:/none/Java/idea/qycms/db/liquibase/changelog-mysql-master-20181217095508.yaml::1545011713874-1::zhangrucong (generated)
CREATE TABLE qycmsdev.test (name VARCHAR(255) NULL);

INSERT INTO qycmsdev.DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, `DESCRIPTION`, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE, DEPLOYMENT_ID) VALUES ('1545011713874-1', 'zhangrucong (generated)', 'G:/none/Java/idea/qycms/db/liquibase/changelog-mysql-master-20181217095508.yaml', NOW(), 3, '8:342933665821af9b6f4b4e4c67b09aa9', 'createTable tableName=test', '', 'EXECUTED', NULL, NULL, '3.6.2', '5011717553');

--  Changeset G:/none/Java/idea/qycms/db/liquibase/changelog-mysql-master-20181217095508.yaml::1545011713874-2::zhangrucong (generated)
ALTER TABLE qycmsdev.blog_article ADD article_type VARCHAR(255) NULL;

INSERT INTO qycmsdev.DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, `DESCRIPTION`, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE, DEPLOYMENT_ID) VALUES ('1545011713874-2', 'zhangrucong (generated)', 'G:/none/Java/idea/qycms/db/liquibase/changelog-mysql-master-20181217095508.yaml', NOW(), 4, '8:ad657ba1737e3b539d53bff884ede86a', 'addColumn tableName=blog_article', '', 'EXECUTED', NULL, NULL, '3.6.2', '5011717553');

--  Changeset G:/none/Java/idea/qycms/db/liquibase/changelog-mysql-master-20181217095508.yaml::1545011713874-3::zhangrucong (generated)
ALTER TABLE qycmsdev.sys_role DROP COLUMN remark;

INSERT INTO qycmsdev.DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, `DESCRIPTION`, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE, DEPLOYMENT_ID) VALUES ('1545011713874-3', 'zhangrucong (generated)', 'G:/none/Java/idea/qycms/db/liquibase/changelog-mysql-master-20181217095508.yaml', NOW(), 5, '8:d9c170081767ad2a9b06b41c0375a11e', 'dropColumn columnName=remark, tableName=sys_role', '', 'EXECUTED', NULL, NULL, '3.6.2', '5011717553');

--  Release Database Lock
UPDATE qycmsdev.DATABASECHANGELOGLOCK SET `LOCKED` = 0, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;
