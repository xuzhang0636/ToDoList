create table user
(
    user_id  int         not null primary key auto_increment,
    username varchar(50) not null,
    password varchar(60) not null,
    phone    varchar(20) not null,
    gender   int
);