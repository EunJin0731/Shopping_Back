create table signup(
  id bigint primary key auto_increment,
  account varchar(100) not null unique,
  password varchar(100) not null,
  name varchar(20) not null,
  phone varchar(20),
  mobile varchar(20) not null,
  zipcode varchar(20) not null,
  address varchar(200) not null
) default charset utf8mb4 engine=InnoDB;

create table basket(
  product varchar(50) not null unique,
  price varchar(50) not null,
  count int(255) not null,
  total int(255) not null
) default charset utf8mb4 engine=InnoDB;

create table product(
  name varchar(50) not null unique,
  content varchar(200) not null,
  price varchar(50) not null,
  category varchar(50) not null,
  filename varchar(100) not null,
  file mediumblob not null,
  detail varchar(1000) not null
) default charset utf8mb4 engine=InnoDB;

create table review(
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