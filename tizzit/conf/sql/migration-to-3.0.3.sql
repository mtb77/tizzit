# mysql
ALTER TABLE `content` ADD COLUMN `update_search_index` TINYINT DEFAULT 1;
ALTER TABLE `document` ADD COLUMN `update_search_index` TINYINT DEFAULT 1;
ALTER TABLE `edition` ADD COLUMN `edition_file_name` VARCHAR(255) NULL;
ALTER TABLE `edition` ADD COLUMN `needs_import` TINYINT DEFAULT 0 NULL;
ALTER TABLE `edition` ADD COLUMN `site_id` INTEGER NULL;
ALTER TABLE `edition` ADD COLUMN `view_component_id` INTEGER NULL;
DROP TABLE COMP_PERSONTOUNITLINK;
ALTER TABLE `contentversion` DROP COLUMN `version_comment`;
# oracle
ALTER TABLE document ADD UPDATE_SEARCH_INDEX NUMBER(5) DEFAULT '1' NULL;
ALTER TABLE content ADD UPDATE_SEARCH_INDEX NUMBER(5) DEFAULT '1' NULL;
ALTER TABLE edition ADD edition_file_name VARCHAR2(255) NULL;
ALTER TABLE edition ADD needs_import NUMBER(5) DEFAULT 0 NULL;
ALTER TABLE edition ADD site_id NUMBER(10) NULL;
ALTER TABLE edition ADD view_component_id NUMBER(10) NULL;
DROP TABLE COMP_PERSONTOUNITLINK;
ALTER TABLE contentversion DROP COLUMN version_comment;
# sapdb
ALTER TABLE document ADD (UPDATE_SEARCH_INDEX SMALLINT DEFAULT '1' NULL);
ALTER TABLE content ADD (UPDATE_SEARCH_INDEX SMALLINT DEFAULT '1' NULL);
ALTER TABLE edition ADD (edition_file_name VARCHAR(255) NULL);
ALTER TABLE edition ADD (needs_import SMALLINT DEFAULT 0 NULL);
ALTER TABLE edition ADD (site_id INTEGER NULL);
ALTER TABLE edition ADD (view_component_id INTEGER NULL);
DROP TABLE COMP_PERSONTOUNITLINK;
ALTER TABLE contentversion DROP COLUMN version_comment;
# mssql
ALTER TABLE document ADD COLUMN UPDATE_SEARCH_INDEX SMALLINT DEFAULT '1' NULL;
ALTER TABLE content ADD COLUMN UPDATE_SEARCH_INDEX SMALLINT DEFAULT '1' NULL;
ALTER TABLE edition ADD COLUMN edition_file_name VARCHAR(255) NULL;
ALTER TABLE edition ADD COLUMN needs_import SMALLINT DEFAULT 0 NULL;
ALTER TABLE edition ADD COLUMN site_id INTEGER NULL;
ALTER TABLE edition ADD COLUMN view_component_id INTEGER NULL;
DROP TABLE COMP_PERSONTOUNITLINK;
ALTER TABLE contentversion DROP COLUMN version_comment;
Add to conquest.properties
# EDITION MANAGEMENT ##########################################################
cqPropertiesBeanSpring.editionCronExpression=0 * * * * ?