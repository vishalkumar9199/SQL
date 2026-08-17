1. What is Schema
Interview answer: A schema is the logical structure or blueprint of a database. It defines how tables,
columns, relationships, constraints, and other database objects are organized.
Easy meaning: Schema = blueprint of the database.
  
2. What is Table
Interview answer: A table is a collection of related data organized into rows and columns. It is used to store
data in a relational database.
  
3. What is Row
Interview answer: A row represents a single entry or instance of data in a table.
  
4. What is Record
Interview answer: A record is a complete set of related data representing one entity or instance. In a
relational table, a record is generally represented by a row.
Remember: Row and record are generally used interchangeably in SQL.
  
5. What is Column
Interview answer: A column represents a particular attribute or property of the data stored in a table. Values
in a column generally have the same data type.
  
6. What is Field
Interview answer: A field is a single data value at the intersection of a row and a column.
Example: In 101 | Rahul | 50000, the value Rahul is a field value.
  
7. What is Attribute
Interview answer: An attribute is a property or characteristic that describes an entity. In a relational
database, an attribute is usually represented as a column.
Distinction: Attribute is the conceptual/design term; column is the relational database implementation.
  
8. What is Entity
Interview answer: An entity is a real-world object or concept about which we want to store information in a
database.
Examples: Employee, Student, Customer, Product, Department.
9. What is Relationship
Interview answer: A relationship defines how two or more entities are associated with each other.
Common types: One-to-One (1:1), One-to-Many (1:N), Many-to-Many (M:N).
Example: Department 1 fi many Employees.
  
10. What is Metadata
Interview answer: Metadata is data that describes the structure or properties of other data.
Examples: table name, column names, data types, constraints.
Easy meaning: Metadata = data about data.
  
11. What is Query
Interview answer: A query is a request made to a database to retrieve or manipulate data.
Example:
SELECT name FROM Employee WHERE salary > 50000;

12. What is RDBMS
Interview answer: RDBMS stands for Relational Database Management System. It is software used to
store, manage, and manipulate data in relational tables, where tables can be related using keys.
Examples: MySQL, PostgreSQL, Oracle Database, Microsoft SQL Server

  --------------------------------------------------------------------------------------------------------------------------------
  1. Degree of a Table
The degree of a table is the number of columns (attributes) present in the table.
  ex->
  Columns = emp_id, name, salary
  Degree = 3

  2. Cardinality of a Table
The cardinality of a table is the number of rows (records/tuples) present in the table.
101 | Rahul | 50000
102 | Amit  | 60000
103 | Neha  | 55000
  cardinality-3

  3. Duplicate Row
A duplicate row is a row that contains the same values as another row in the table.

  ---------------------------------RelationShip in sql--------------------------------
  1. One-to-One (1:1)
In a one-to-one relationship, one record in one table is associated with exactly one record in another table, and vice versa.

  2. One-to-Many (1:N) 
"In a one-to-many relationship, one record in the parent table can have many related records in the child table,
  while each child record belongs to one parent

  3. Many-to-Many (M:N)
  In a many-to-many relationship, multiple records in one table can be associated with multiple records in another table. In a relational database,
  we implement it using a junction or bridge table containing foreign keys from both tables

  4. Self-Referencing Relationship
  (A table can have a relationship with itself.);
  A self-referencing relationship occurs when a table has a foreign key that references its own primary key.
  A common example is an employee-manager hierarchy

    ---------------------------------------Types Of Coomand-----------------------------------------------------
1. DDL — Data Definition Language
    "DDL is used to define and modify the structure of database objects. 
    Examples are CREATE, ALTER, DROP, TRUNCATE, and RENAME.
    
2. DML — Data Manipulation Language
    DML is used to manipulate the data inside database tables. 
    Common commands are INSERT, UPDATE, and DELETE.

3. DQL — Data Query Language
    DQL is used to retrieve data from database tables. The main DQL command is SELECT.

4. DCL — Data Control Language
  "DCL is used to manage user permissions and access to database objects. 
  The main commands are GRANT and REVOKE.

  5. TCL — Transaction Control Language
  TCL is used to manage transactions in a databases
Main commands:
COMMIT
ROLLBACK
SAVEPOINT
  
  
  
  
