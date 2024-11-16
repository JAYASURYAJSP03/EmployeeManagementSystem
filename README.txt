Employee Management Application This project is an Employee Management application developed using Spring Boot and Thymeleaf. It allows users to manage employee details, including adding, updating, and deleting employee records.

Features Add New Employee: Users can add new employee details, including Employee ID, Employee Name, Employee Email, and Location. View All Employees: A homepage displays a list of all employees, showing their details. Update Employee Details: Users can update information for an existing employee. Delete Employee: Users can delete employee records from the list. Endpoints and Functionalities Home Page

URL: /homePage Description: Displays a list of all employees and their details. Template: index.html Add New Employee

URL: /addNew Description: Provides a form to add new employee details. Template: newEmployee.html Save Employee

URL: /save Method: POST Description: Saves the new employee details and redirects to the homepage. Update Employee

URL: /showFormForUpdate/{id} Description: Fetches the details of a specific employee by ID and provides a form to update their information. Template: update.html Delete Employee

URL: /deleteEmployee/{id} Description: Deletes the employee with the specified ID and redirects to the homepage. Technologies Used Spring Boot: For creating RESTful services and handling backend logic. Thymeleaf: To render dynamic HTML pages for adding, viewing, and updating employee details. MySQL: Used as the database to store employee information.