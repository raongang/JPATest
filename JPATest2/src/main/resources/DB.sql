create table school (
    school_id int auto_increment,
    name varchar(50),
    region varchar(50),
    ranking int,
    primary key(school_id)
);

create table student (
    student_id varchar(30),
    name varchar(30),
    school_id int,
    score int,
    primary key(student_id, name)
);

insert into school(name, region, ranking) values ('강원 고등학교', '강원', 3);
insert into school(name, region, ranking) values ('서울 고등학교', '서울', 1);
insert into school(name, region, ranking) values ('제주 고등학교', '제주', 4);
insert into school(name, region, ranking) values ('경기 고등학교', '경기', 2);

insert into student values ('1234', '김고기', 3, 89);
insert into student values ('2345', '정덮밥', 1, 78);
insert into student values ('3456', '박찌개', 2, 82);
insert into student values ('4567', '문초밥', 3, 99);
insert into student values ('5678', '이족발', 4, 73);
insert into student values ('6789', '진짬뽕', 2, 85);
insert into student values ('0000', '김가네', 5, 89);