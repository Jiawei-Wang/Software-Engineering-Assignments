# Requirement Explanation for SSAS

 [1] A user should be able to register/login to the SSAS by opening an account with username and password.

 - To realize this requirement, I added to the design a class ‘Login’ with 2 attributes: 'username' and 'password' and give it 3 methods, to register, login and also reset the password when necessary. And class ‘Login’ is related to class ‘Account’.
 
[2] The user account should contain user information such as: full name, email address, account status (active, closed), date account was created.
 
- I added a class ‘Account’ with 4 attributes: 'name', 'email', 'accountStatus' and 'creatDate' and give it 2 methods, you can look up for the account info by 'showInfo' or change the email address by 'changeEmail', it will return a boolean to show whether you have successfully changed it or not. 'Account' is related with class 'StudentInfo' and also 'ModifyClass' is dependent on it to get access to 'Class' and do the modification.

[3] The user should be able to add/delete/modify classes to his/her account

- 'ModifyClass' is used to change the class in one's account, you can use it to add or delete a calss, or use info of a new class to modify it. And also this class is related to 'Class' and 'Account'

[4] The class should have unique id, class name, status: offered or not, and number of
offerings.

- To realize this requirement, I added to the design a class ‘Class’ with 4 attributes: 'id', 'name', 'status'(to see whether it is available at this moment) and 'offeringNumber' and give it 2 methods, to show the class' information and allow professor to modify the class info. And it is related to 'ModifyClass', 'StudentInfo', 'Offering' and 'Attendance'

[5] Each class offering should have the following: date and time offered, number of students,
and classroom

- I made a class 'Offering' and it composites the class 'Class', it gives the date and time of the class, how many students are currently in class and where the class is hold. By calling 'showInfo', you can see the listed info. 

[6] The user should be able to add, modify or delete students, and update their information.

- By using 'ModifyStudent', you can add or delete certain student from the class and accordingly, make the change in student's personal enrollment in 'StudentInfo', 'ModifyStudent' is related to two class 'Class' and 'StudentInfo'.

[7] The student profile should have: unique ID, name, email, status: freshman, junior, etc.
and payment information.

- To realize this requirement, I added to the design a class ‘StudentInfo’ with 6 attributes: 'ID', 'name', 'email', 'status', 'paymentInfo' and also a dictionary to store all the enrollment info 'enrollment' and give it 2 methods, to show the info in this class and to allow changing in payment method. And class ‘StudentInfo’ is related to 'Account', 'Class' and also 'Attendance', 'ModifyStudent', 'Check' and 'Search'.

[8] User should be able to mark student attendance status presence / absence and date.

- 'Attendance' allows professor to edit the attendance info by marking a new attendance or modify an existing attendance, and store the record in a dictionary. It is related to 'Class' and 'StudentInfo' and is dependened by 'Check' to check the record.

[9] User should be able to search students by student name or student ID.

- 'Search' allows both students and professor to search for student's info by giving the name or ID, and successful search will return student's name. It is related to 'StudentInfo' alone.

[10] User should be able check the absence data for specified period of time with statistics.

  - 'Check' is professor to check the attendance record by certain student, upon given the required date range, it will give the record. And this is related with both 'Attendance' and 'StudentInfo'
