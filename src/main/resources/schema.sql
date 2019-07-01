use shopping;

drop table if exists signup;
drop table if exists review;
drop table if exists basket;
drop table if exists bestproduct;
drop table if exists mdoffer;
drop table if exists newproduct;
drop table if exists product;
drop table if exists category;
drop table if exists subcategory;

create table signup(
  id bigint primary key auto_increment,
  account varchar(100) not null unique,
  password varchar(100) not null,
  name varchar(20) not null,
  phone varchar(20),
  mobile varchar(20) not null,
  zipcode varchar(20) not null,
  address varchar(200) not null,
  email varchar(100) not null
) default charset utf8mb4 engine=InnoDB;

create table basket(
  id bigint primary key auto_increment,
  product varchar(50) not null unique,
  price varchar(50) not null,
  count int(255) not null,
  total int(255) not null
) default charset utf8mb4 engine=InnoDB;

create table product(
  id bigint primary key auto_increment,
  categoryId bigint,
  subId bigint,
  name varchar(50) not null unique,
  content varchar(200) not null,
  price varchar(50) not null,
  filename varchar(100),
  filepath varchar (300),
  detail varchar(1000)
) default charset utf8mb4 engine=InnoDB;

create table review(
  id bigint primary key auto_increment,
  name varchar(50) not null,
  title varchar(50) not null,
  account varchar(100) not null,
  content text,
  created datetime default current_timestamp
) default charset utf8mb4 engine=InnoDB;

create table newproduct(
  name varchar(50) not null,
  content varchar(200) not null,
  price varchar(50) not null,
  filename varchar(100) not null,
  file mediumblob not null
) default charset utf8mb4 engine=InnoDB;

create table bestproduct(
  name varchar(50) not null,
  content varchar(200) not null,
  price varchar(50) not null,
  filename varchar(100) not null,
  file mediumblob not null
) default charset utf8mb4 engine=InnoDB;

create table mdoffer(
  name varchar(50) not null,
  content varchar(200) not null,
  price varchar(50) not null,
  filename varchar(100) not null,
  file mediumblob not null
) default charset utf8mb4 engine=InnoDB;

create table category(
  id bigint primary key auto_increment,
  name varchar(30) not null
) default charset utf8mb4 engine=InnoDB;

create table subcategory(
  id bigint primary key auto_increment,
  categoryId bigint,
  name varchar(30) not null
) default charset utf8mb4 engine=InnoDB;