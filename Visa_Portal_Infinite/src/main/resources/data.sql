





//Project Details;
Insert into project(project_Id , project_Name , project_Owner ) 
values(1001 , 'Scrips' , 'ChandraMam' );

Insert into project(project_Id , project_Name , project_Owner ) 
values(1002 , 'Verizon' , 'Joti' );


//StatusDesc Details ;
Insert into Status_Desc(Status_Id , s_Desc)
values(0 , "visa_Not_Initiated");

Insert into Status_Desc(Status_Id , s_Desc)
values(1 , "visa_Initiated");

Insert into Status_Desc(Status_Id , s_Desc)
values(2 , "visa_Accepted_By_HR_And_Waitng_For_Employee_Document_Update");

Insert into Status_Desc(Status_Id , s_Desc)
values(3 , "visa_Document_Error_And_Waitng_For_Employee_Document_Re_Update");

Insert into Status_Desc(Status_Id , s_Desc)
values(4 , "visa_Applyed_Successfully");



//Employee Details;
Insert into employee(employee_Id ,employee_Name , employee_Mail_Id , employee_Doj ,
employee_Previous_Experience , employee_Mobile_Number , project_Manager ,project_id , status_Id) 
values(1805569 , 'Pruthweeraj Panda' , 'Pruthweeraj.panda@infinite.com' , sysdate() ,
0 , 7008044393 , 'ChandraMam' ,1001 ,0);

Insert into employee(employee_Id ,employee_Name , employee_Mail_Id , employee_Doj ,
employee_Previous_Experience , employee_Mobile_Number ,project_Manager ,project_id  ,status_Id) 
values(1805588 , 'Jogindra Raut' , 'Jogindra.raut@infinite.com' , sysdate() ,
0 , 8046875425 , 'ChandraMam' ,1001 ,0);

Insert into employee(employee_Id ,employee_Name , employee_Mail_Id , employee_Doj ,
employee_Previous_Experience , employee_Mobile_Number ,project_Manager ,project_id ,status_Id) 
values(2002050 , 'Anukriti Sahu' , 'Anukriti.sahu@infinite.com' , '2010-02-02' ,
1 , 9938457587 , 'ChandraMam' ,1001 ,0);

Insert into employee(employee_Id ,employee_Name , employee_Mail_Id , employee_Doj ,
employee_Previous_Experience , employee_Mobile_Number,project_Manager ,project_id ,status_Id) 
values(2003030 , 'Pupa Panda' , 'Pupa.panda@infinite.com' , sysdate() ,
3 , 9938143143 , 'ChandraMam'  ,1002 ,0);


Insert into employee(employee_Id ,employee_Name , employee_Mail_Id , employee_Doj ,
employee_Previous_Experience , employee_Mobile_Number,project_Manager ,project_id ,status_Id) 
values(2003022 , 'MR. Panda' , 'Pupaesdfsdf.panda@infinite.com' , sysdate() ,
0 , 9938143143 , 'Arun'  ,1002 ,0);



Insert into Status(Status_Year)
values('2010-02-02');

