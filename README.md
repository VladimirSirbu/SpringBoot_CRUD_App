# SpringBoot_CRUD_App
This is a CRUD app that perform following operation:
- CREATE employee
- READ employee
- UPDATE employee
- DELETE employee
<br/>
->The structure of this project use: Java, Spring Boot, Spring MVC, and one of the most importand , Spring Data JPA (which perform operation with data base)

-> In order for the application to work, a database must be connected (in my case this is MySQL with a schema: employee and table: employees); 
<br/>
**Script for MySQL data base:**
```
CREATE TABLE `employee`.`employees` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `job_title` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  ```
  ## Some screenshots from project: 
  </br>
  ### Display all Employees
  </br>
  <img src="/screenshots/all_employees.JPG">
  
  </br>
  ### Add new Employee
  </br>
  <img src="/screenshots/new_employee.JPG">
  
  </br>
  ### Requirements when adding / editing an employee
  </br>
  <img src="/screenshots/requirements.JPG">
