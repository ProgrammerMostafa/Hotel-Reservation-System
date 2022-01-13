/*create table Employee (
F_Name varchar(10) , M_Name varchar(10) , L_Name varchar(10) , Emp_id int primary key auto_increment , Address varchar(20) not null , 
Salary double check(Salary >= 1000) , Emp_Postion varchar(15) not null , Gender varchar(10) not null  
);
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('ahmed ','khaled','mohamed','Giza',1200,'House Keeping','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('Ali ','Mohamed','ali','cairo',1200,'House Keeping','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('amr ','mostafa','ibrahim','alex',1200,'House Keeping','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('dina ','naser','mohamed','Giza',1200,'House Keeping','female');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('nada ','khaled','mostafa','suez',1200,'House Keeping','female');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('ahmed ','hassan','maher','cairo',2500,'chef','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('mostafa ','ali','salem','benha',2500,'chef','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('Amira ','mostafa','reda','cairo',2500,'chef','female');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('mostafa ','ashraf','maamon','benha',2000,'Kitchen worker','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('mohi ','ahmed','fathy','benha',2000,'Kitchen worker','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('manar ','ehab','mohamed','Giza',2000,'Kitchen worker','female');
insert into employee (F_Name , M_Namebill , L_Name , Address , Salary , Emp_Postion , Gender) values ('hossam ','yehia','mohamed','alex',1600,'Room Services ','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('mona ','ali','gaber','suez',1600,'Room Services ','female');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('hesham ','ayman','mohamed','cairo',1600,'Room Services ','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('assela ','joussef','george','taywan',1600,'Room Services ','female');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('hassouna ','gamal','mohamed','sharm',1600,'Room Services ','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('mena ','khaled','george','Giza',1300,'Bagger','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('adel','amr','tamer','cairo',1300,'Bagger','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('weal ','mohamed','hassan','cairo',1300,'Bagger','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('mostafa ','mahmoud','mohamed','benha',1750,'Security','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('nahed ','mohamed','eladawy','cairo',1750,'Security','male');
insert into employee (F_Name , M_Name , L_Name , Address , Salary , Emp_Postion , Gender) values ('salah ','gomaa','tawfiq','Giza',1750,'Security','male');
*/

/*create table Receptionist(
ID int primary key auto_increment , F_Name varchar(10) , M_Name varchar(10) , L_Name varchar(10) , Address varchar(20) not null , 
Salary double check(Salary >= 1500 ),Gender varchar(10) not null ,pass varchar(10) unique 
); 
insert into receptionist (F_Name , M_Name , L_Name , Address , Salary , Gender, pass) values ('mark ','jossef','rassendle','USA',3000,'male','mark101');
insert into receptionist (F_Name , M_Name , L_Name , Address , Salary , Gender, pass) values ('Alice ','Brawn','Voltory','Brazil',3000,'female','Alice102');
insert into receptionist (F_Name , M_Name , L_Name , Address , Salary , Gender, pass) values ('Ali ','Maher','ibrahem','cairo',3000,'male','Ali103');

create table manager(
ID int primary key ,  F_Name varchar(10) , M_Name varchar(10) , L_Name varchar(10) , Address varchar(20) not null , pass varchar(10) unique 
);
insert into manager (ID ,F_Name , M_Name , L_Name , Address , pass) values(2000 ,'elsaid ','ahmed','fathy','cairo','12345');


create table customer(
ID int primary key auto_increment ,  F_Name varchar(10) , M_Name varchar(10) , L_Name varchar(10) , Address varchar(20) not null ,
phone varchar(20) 
);

create table bill(
ID int primary key auto_increment , Check_in date not null , Check_out date not null , total_payment double not null);

create table rec_cust_bill(
rec_id int , cust_id int , bill_id int ,
foreign key (rec_id) references  Receptionist(ID),foreign key (cust_id) references  customer(ID),
foreign key (bill_id) references  bill(ID)
);

create table manage (
mng_ID int , rec_ID int , emp_ID int ,
foreign key (mng_id) references  manager(ID),foreign key (rec_id) references  Receptionist(ID),
foreign key (emp_ID) references  employee(Emp_id)
);

create table rec_room(
rec_id int , room_id int , 
foreign key (rec_id) references  Receptionist(ID) , foreign key (room_id) references  rooms(Room_Number)
);

create table rec_cust(
rec_id int , cust_id int , 
foreign key (rec_id) references  Receptionist(ID) , foreign key (cust_id) references  customer(ID)
);
*/


alter table bill modify column Check_in varchar(15) ;
alter table bill modify column Check_out varchar(15) ;