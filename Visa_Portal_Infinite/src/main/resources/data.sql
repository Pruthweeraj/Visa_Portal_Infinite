

//Project Details;
Insert into project(project_Id , project_Name , project_Owner ) 
values(1001 , 'Scrips' , 'ChandraMam' );

Insert into project(project_Id , project_Name , project_Owner ) 
values(1002 , 'Verizon' , 'Joti' );




//Employee Details;
Insert into employee(employee_Id ,employee_Name , employee_Mail_Id , employee_Doj ,
employee_Previous_Experience , employee_Mobile_Number , project_Manager ,project_id) 
values(1805569 , 'Pruthweeraj Panda' , 'Pruthweeraj.panda@infinite.com' , sysdate() ,
0 , 7008044393 , 'ChandraMam' ,1001);

Insert into employee(employee_Id ,employee_Name , employee_Mail_Id , employee_Doj ,
employee_Previous_Experience , employee_Mobile_Number ,project_Manager ,project_id) 
values(1805588 , 'Jogindra Raut' , 'Jogindra.raut@infinite.com' , sysdate() ,
0 , 8046875425 , 'ChandraMam' ,1001);

Insert into employee(employee_Id ,employee_Name , employee_Mail_Id , employee_Doj ,
employee_Previous_Experience , employee_Mobile_Number ,project_Manager ,project_id) 
values(2002050 , 'Anukriti Sahu' , 'Anukriti.sahu@infinite.com' , '2010-02-02' ,
1 , 9938457587 , 'ChandraMam' ,1001);

Insert into employee(employee_Id ,employee_Name , employee_Mail_Id , employee_Doj ,
employee_Previous_Experience , employee_Mobile_Number,project_Manager ,project_id) 
values(2003030 , 'Pupa Panda' , 'Pupa.panda@infinite.com' , sysdate() ,
3 , 9938143143 , 'ChandraMam'  ,1002);





