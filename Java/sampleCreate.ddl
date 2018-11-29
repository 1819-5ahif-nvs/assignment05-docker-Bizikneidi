create table Car (id bigint not null auto_increment, brand varchar(255), type varchar(255), OWNER bigint, primary key (id))
create table Person (id bigint not null auto_increment, name varchar(255), primary key (id))
alter table Car add constraint FK86rkldg35bxikmwrqs7yn18cg foreign key (OWNER) references Person (id)
