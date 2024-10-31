Employee Management System
An Employee Management System built with Spring Boot and Thymeleaf for managing employee details. It includes CRUD operations (Create, Read, Update, Delete) on employee records, with MySQL as the database.

Features
Add New Employee: Provides a form for entering employee details like ID, name, email, and location.
View All Employees: Lists all employees with their information on the homepage.
Update Employee: Allows modifications of existing employee details.
Delete Employee: Removes an employee’s record.

Endpoints
Homepage (/homePage): Displays all employees.
Add Employee (/addNew): Presents the employee creation form.
Save Employee (/save): Submits new employee data via POST.
Update Employee (/showFormForUpdate/{id}): Loads employee data for updating.
Delete Employee (/deleteEmployee/{id}): Deletes a specified employee.

Technologies Used
Spring Boot: Backend API development
Thymeleaf: Dynamic HTML rendering
MySQL: Data storage

Setup
Clone the repository and navigate to the project directory.
Configure the application.properties with MySQL connection details.
Run the application via your IDE or command line.

Usage
Access the homepage at /homePage to view and manage employee details.
