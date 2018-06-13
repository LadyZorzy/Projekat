/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     6/13/2018 4:06:58 PM                         */
/*==============================================================*/


drop table if exists LEGLO;

drop table if exists PAS;

drop table if exists ROLE;

drop table if exists USERS;

/*==============================================================*/
/* Table: LEGLO                                                 */
/*==============================================================*/
create table LEGLO
(
   LEGLO_ID             int not null,
   USERS_ID             int,
   DATUMSTENJENJA       date not null,
   OTAC                 varchar(30) not null,
   MAJKA                varchar(30) not null,
   primary key (LEGLO_ID)
);

/*==============================================================*/
/* Table: PAS                                                   */
/*==============================================================*/
create table PAS
(
   PAS_ID               char(10) not null,
   USERS_ID             int,
   IME                  varchar(30) not null,
   DATUMSTENJENJA       date not null,
   RASA                 char(10) not null,
   BROJ_MIKROCIPA       char(10) not null,
   MAJKA                varchar(30) not null,
   OTAC                 varchar(30) not null,
   POTOMCI              char(10) not null,
   SAMPIONATI           char(10) not null,
   primary key (PAS_ID)
);

/*==============================================================*/
/* Table: ROLE                                                  */
/*==============================================================*/
create table ROLE
(
   ROLE_ID              int not null,
   ROLE_NAME            varchar(30) not null,
   primary key (ROLE_ID)
);

/*==============================================================*/
/* Table: USERS                                                 */
/*==============================================================*/
create table USERS
(
   USERS_ID             int not null,
   ROLE_ID              int,
   USERNAME             varchar(30) not null,
   PASSWORD             varchar(30) not null,
   IME                  varchar(30) not null,
   PREZIME              varchar(30) not null,
   ZEMLJA               varchar(30) not null,
   GRAD                 varchar(30) not null,
   TIP                  varchar(30) not null,
   primary key (USERS_ID)
);

alter table LEGLO add constraint FK_RELATIONSHIP_2 foreign key (USERS_ID)
      references USERS (USERS_ID) on delete restrict on update restrict;

alter table PAS add constraint FK_RELATIONSHIP_1 foreign key (USERS_ID)
      references USERS (USERS_ID) on delete restrict on update restrict;

alter table USERS add constraint FK_RELATIONSHIP_3 foreign key (ROLE_ID)
      references ROLE (ROLE_ID) on delete restrict on update restrict;

