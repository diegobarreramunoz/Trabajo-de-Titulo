/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2005                    */
/* Created on:     16-06-2015 18:52:37                          */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ORDEN_TRABAJO') and o.name = 'FK_ORDEN_TR_ORDEN_CLI_CLIENTE')
alter table ORDEN_TRABAJO
   drop constraint FK_ORDEN_TR_ORDEN_CLI_CLIENTE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ORDEN_TRABAJO') and o.name = 'FK_ORDEN_TR_ORDEN_EQU_EQUIPO')
alter table ORDEN_TRABAJO
   drop constraint FK_ORDEN_TR_ORDEN_EQU_EQUIPO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ORDEN_TRABAJO') and o.name = 'FK_ORDEN_TR_ORDEN_PER_PERSONAL')
alter table ORDEN_TRABAJO
   drop constraint FK_ORDEN_TR_ORDEN_PER_PERSONAL
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ORDEN_TRABAJO') and o.name = 'FK_ORDEN_TR_TIENDA_OR_TIENDA')
alter table ORDEN_TRABAJO
   drop constraint FK_ORDEN_TR_TIENDA_OR_TIENDA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('PERSONAL') and o.name = 'FK_PERSONAL_TIENDA_PE_TIENDA')
alter table PERSONAL
   drop constraint FK_PERSONAL_TIENDA_PE_TIENDA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('REPUESTO') and o.name = 'FK_REPUESTO_ORDEN_REP_ORDEN_TR')
alter table REPUESTO
   drop constraint FK_REPUESTO_ORDEN_REP_ORDEN_TR
go

if exists (select 1
            from  sysobjects
           where  id = object_id('CLIENTE')
            and   type = 'U')
   drop table CLIENTE
go

if exists (select 1
            from  sysobjects
           where  id = object_id('EQUIPO')
            and   type = 'U')
   drop table EQUIPO
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ORDEN_TRABAJO')
            and   name  = 'TIENDA_ORDEN_FK'
            and   indid > 0
            and   indid < 255)
   drop index ORDEN_TRABAJO.TIENDA_ORDEN_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ORDEN_TRABAJO')
            and   name  = 'ORDEN_PERSONAL_FK'
            and   indid > 0
            and   indid < 255)
   drop index ORDEN_TRABAJO.ORDEN_PERSONAL_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ORDEN_TRABAJO')
            and   name  = 'ORDEN_EQUIPO_FK'
            and   indid > 0
            and   indid < 255)
   drop index ORDEN_TRABAJO.ORDEN_EQUIPO_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ORDEN_TRABAJO')
            and   name  = 'ORDEN_CLIENTE_FK'
            and   indid > 0
            and   indid < 255)
   drop index ORDEN_TRABAJO.ORDEN_CLIENTE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('ORDEN_TRABAJO')
            and   type = 'U')
   drop table ORDEN_TRABAJO
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('PERSONAL')
            and   name  = 'TIENDA_PERSONAL_FK'
            and   indid > 0
            and   indid < 255)
   drop index PERSONAL.TIENDA_PERSONAL_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PERSONAL')
            and   type = 'U')
   drop table PERSONAL
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('REPUESTO')
            and   name  = 'ORDEN_REPUESTO_FK'
            and   indid > 0
            and   indid < 255)
   drop index REPUESTO.ORDEN_REPUESTO_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('REPUESTO')
            and   type = 'U')
   drop table REPUESTO
go

if exists (select 1
            from  sysobjects
           where  id = object_id('TIENDA')
            and   type = 'U')
   drop table TIENDA
go

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE (
   RUT_C                char(10)             not null,
   TELEFONO             bigint               null,
   EMAIL                char(60)             null,
   DIRECCION            char(60)             null,
   NOMBRE               char(60)             null,
   constraint PK_CLIENTE primary key nonclustered (RUT_C)
)
go

/*==============================================================*/
/* Table: EQUIPO                                                */
/*==============================================================*/
create table EQUIPO (
   IMEI                 char(8)              not null,
   MARCA                char(50)             null,
   MODELO               char(60)             null,
   constraint PK_EQUIPO primary key nonclustered (IMEI)
)
go

/*==============================================================*/
/* Table: ORDEN_TRABAJO                                         */
/*==============================================================*/
create table ORDEN_TRABAJO (
   NUM_ORDEN            bigint               identity(1,1),
   IMEI                 char(8)              not null,
   COD_TIENDA           int                  not null,
   RUT_C                char(10)             not null,
   RUT_P                char(10)             not null,
   FECHA_ING            datetime             not null,
   FECHA_ENT            datetime             not null,
   ABONO                bigint               not null,
   TOTAL                bigint               not null,
   DESCRIP_OBSER        char(100)            null,
   FALLA                char(30)             not null,
   DIAGNOSTICO          char(100)            null,
   ESTADO               char(10)             null,
   SERIE                char(7)              null,
   constraint PK_ORDEN_TRABAJO primary key nonclustered (NUM_ORDEN)
)
go

/*==============================================================*/
/* Index: ORDEN_CLIENTE_FK                                      */
/*==============================================================*/
create index ORDEN_CLIENTE_FK on ORDEN_TRABAJO (
RUT_C ASC
)
go

/*==============================================================*/
/* Index: ORDEN_EQUIPO_FK                                       */
/*==============================================================*/
create index ORDEN_EQUIPO_FK on ORDEN_TRABAJO (
IMEI ASC
)
go

/*==============================================================*/
/* Index: ORDEN_PERSONAL_FK                                     */
/*==============================================================*/
create index ORDEN_PERSONAL_FK on ORDEN_TRABAJO (
RUT_P ASC
)
go

/*==============================================================*/
/* Index: TIENDA_ORDEN_FK                                       */
/*==============================================================*/
create index TIENDA_ORDEN_FK on ORDEN_TRABAJO (
COD_TIENDA ASC
)
go

/*==============================================================*/
/* Table: PERSONAL                                              */
/*==============================================================*/
create table PERSONAL (
   RUT_P                char(10)             not null,
   COD_TIENDA           int                  not null,
   CONTRASENA           char(10)             null,
   PERMISO              char(1)              null,
   COLORES              char(23)             null,
   TITULO               char(70)             null,
   TELEFONO             bigint               null,
   AYUDACONTRASENA      char(70)             null,
   NOMBRE               char(60)             null,
   constraint PK_PERSONAL primary key nonclustered (RUT_P)
)
go

/*==============================================================*/
/* Index: TIENDA_PERSONAL_FK                                    */
/*==============================================================*/
create index TIENDA_PERSONAL_FK on PERSONAL (
COD_TIENDA ASC
)
go

/*==============================================================*/
/* Table: REPUESTO                                              */
/*==============================================================*/
create table REPUESTO (
   NUM_ORDEN            bigint               not null,
   REPUESTO             char(100)            null,
   ESTADO               bit                  null
)
go

/*==============================================================*/
/* Index: ORDEN_REPUESTO_FK                                     */
/*==============================================================*/
create index ORDEN_REPUESTO_FK on REPUESTO (
NUM_ORDEN ASC
)
go

/*==============================================================*/
/* Table: TIENDA                                                */
/*==============================================================*/
create table TIENDA (
   COD_TIENDA           int                  identity(1,1),
   DIRECCION            char(60)             null,
   TELEFONO             bigint               null,
   NOMBRE               char(60)             null,
   constraint PK_TIENDA primary key nonclustered (COD_TIENDA)
)
go

alter table ORDEN_TRABAJO
   add constraint FK_ORDEN_TR_ORDEN_CLI_CLIENTE foreign key (RUT_C)
      references CLIENTE (RUT_C)
go

alter table ORDEN_TRABAJO
   add constraint FK_ORDEN_TR_ORDEN_EQU_EQUIPO foreign key (IMEI)
      references EQUIPO (IMEI)
go

alter table ORDEN_TRABAJO
   add constraint FK_ORDEN_TR_ORDEN_PER_PERSONAL foreign key (RUT_P)
      references PERSONAL (RUT_P)
go

alter table ORDEN_TRABAJO
   add constraint FK_ORDEN_TR_TIENDA_OR_TIENDA foreign key (COD_TIENDA)
      references TIENDA (COD_TIENDA)
go

alter table PERSONAL
   add constraint FK_PERSONAL_TIENDA_PE_TIENDA foreign key (COD_TIENDA)
      references TIENDA (COD_TIENDA)
go

alter table REPUESTO
   add constraint FK_REPUESTO_ORDEN_REP_ORDEN_TR foreign key (NUM_ORDEN)
      references ORDEN_TRABAJO (NUM_ORDEN)
go

INSERT INTO tienda (DIRECCION, TELEFONO, NOMBRE) 
VALUES (NULL, NULL, 'TIENDA 1')

go

INSERT INTO PERSONAL(RUT_P, COD_TIENDA, NOMBRE, PERMISO, CONTRASENA, TELEFONO, COLORES, AYUDACONTRASENA, TITULO) 
VALUES ('00000000-0', 1, 'root', 'A', 'root', NULL, NULL, 'root', 'Cambia la Contraseña (Crea Personal)/(Modifica Tienda)')

go

BULK
INSERT EQUIPO
FROM 'C:\BDIMEI.txt'
WITH
(FIELDTERMINATOR = ';',
ROWTERMINATOR = '\n')

go