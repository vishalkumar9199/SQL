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

  -----------------------------SQL STATEMENT STRUCTURE----------------------------------------
  1. SQL Keyword
=>A keyword is a reserved word in SQL that has a predefined meaning.

  2. SQL Clause
=>A clause is a part of an SQL statement that performs a specific operation.
  
  3. SQL Statement
=>An SQL statement is a complete instruction given to the database.

  4. SQL Terminator
=>An SQL statement terminator is used to indicate the end of an SQL statement.

  --------------------------------indentifiers----------------
  =>SQL identifiers are names given to database objects so that they can be uniquely identified and referenced in SQL statements.
  .TYPES
-Table Identifier
    Identifies a table.

-Column Identifier
  Identifies a column.

-Database Identifier
 Identifies a database.

  -----------------------------------------SQL Literals----------------------
  def=>SQL literals are constant values that are explicitly written in an SQL statement and are not treated as database object names.
  
  =>Types of SQL Literals
Boolean values
Integer literals
Date-time literals
Hexadecimal literals
Decimal literals
NULL literal
Floating-point literals
Numeric literals
Binary literals
String literals
Date literals
Time literals

  ----------------------------------------------------------Databases and Schemas------------------------------
- 3.1 Database Commands
    - SHOW DATABASES
    - CREATE DATABASE
    - CREATE DATABASE IF NOT EXISTS
    - USE
    - SELECT DATABASE()
    - ALTER DATABASE
    - DROP DATABASE
    - DROP DATABASE IF EXISTS
  
- 3.2 Table commands
    - CREATE TABLE
    - ALTER TABLE
    - RENAME
    - TRUNCATE
    - DROP
  
- 3.3 Database Properties
    - Default character set
    - Default collation
    - Database existence
  
- 3.4 Inspecting Database Objects
    - SHOW TABLES
    - SHOW FULL TABLES
    - DESCRIBE
    - DESC
    - SHOW COLUMNS
    - SHOW FULL COLUMNS
    - SHOW CREATE DATABASE
    - SHOW CREATE TABLE
  
- 3.5 Modifying table structure
    - Add column
    - Modify column
    - Rename column
    - Drop column
    - Reorder column

  ----------------------------------------------------------------SQL DATA TYPE-----------------------------------
  SQL Data Types
  
- 4.1 Integer Data Types
    - TINYINT
    - SMALLINT
    - MEDIUMINT
    - INT
    - INTEGER
    - BIGINT
    - Signed  & Unsigned integers
  
- 4.2 Decimal and floating-point types
    - DECIMAL
    - NUMERIC
    - Float
    - Double
    - Precision and Scale
  
- 4.3 Character Data Types
    - CHAR
    - VARCHAR
    - TEXT
  
- 4.4 Binary Data Types
    - BINARY
    - VARBINARY
    - BLOB
  
- 4.5 Bit and Boolean Types
    - BIT
    - BOOLEAN
    - BOOL
    - True and false values
  
- 4.6 Date and Time Data Types
    - DATE
    - TIME
    - DATETIME
    - TIMESTAMP
    - YEAR
  
- 4.7 Special String Types
    - ENUM
    - SET
    - JSON
    - Spatial data types
  
- 4.8 Character Sets and Collations
    - Character set
    - Collation
    - utf8mb4
  
- 4.9 Data-Type Conversion
    - Implicit conversion
    - Explicit conversion
    - CAST
    - CONVERT
  
---------------------------------------KEY AND CONSTRAINT---------------------------------------------------------------
  1. Super Key

A super key is any column or combination of columns that can uniquely identify a row.

Examples
  
student_id
email
student_id + name
student_id + email

  2. Candidate Key

A candidate key is a minimal super key.
That means it uniquely identifies a row and doesn't contain unnecessary columns.

  3. Primary Key

The primary key is the candidate key selected to uniquely identify each row.
=>Properties
A primary key:

Must be unique
Cannot contain NULL
There is normally one primary-key constraint per table
Can consist of multiple columns (composite primary key)

  4. Alternate Key

An alternate key is a candidate key that was not selected as the primary key

  5. Foreign Key

A foreign key is a column or set of columns that references a key in another table, usually the primary key.
It helps maintain referential integrity between related tables.

  6. Composite Key

A composite key is a key made using two or more columns together.

  7. Unique Key

A unique key is a constraint used to ensure that values in a column or combination of columns are not duplicated.
  
  8. Natural Key

A natural key is a key based on real-world/business data that already exists.

 9. Surrogate Key

A surrogate key is an artificial/generated key created specifically to identify records.


  --------------------------------------------SQL CONSTRAINT=------------------------------------------------
  1. UNIQUE Constraint

The UNIQUE constraint ensures that duplicate values are not allowed in a column.

  2. NOT NULL Constraint

NOT NULL ensures that a column cannot contain a NULL value.
  
  3. DEFAULT Constraint

DEFAULT automatically provides a predefined value when no value is supplied for a column.

  4. CHECK Constraint

CHECK ensures that a value satisfies a specified condition.

  ---------------------------------------------------------------Referential Actions in SQL-----------------------------------------------------------
  Referential actions define what should happen to related rows in a child table when a referenced row in the parent table is deleted or updated.

  1. ON DELETE

ON DELETE specifies what happens to child records when the referenced parent record is deleted.

  2. ON UPDATE

ON UPDATE specifies what happens to child records when the referenced key in the parent table is updated.

  3. CASCADE

CASCADE means:

CASCADE automatically propagates DELETE or UPDATE operations from the parent table to related child rows.
  
  4. SET NULL

SET NULL means:

When the parent row is deleted or its referenced key is updated, set the corresponding foreign-key value in the child table to NULL.

  5. RESTRICT

RESTRICT means:

Do not allow the parent row to be deleted or updated if related child rows exist.

  6. NO ACTION

NO ACTION means:

Do not automatically modify the child rows; reject the operation if it would violate the foreign-key relationship.


  ------------------------------------------------------Operators and Expressions----------------------------------------------
  Operators and Expressions
- 10.1 Arithmetic Operators
    - Addition
    - Subtraction
    - Multiplication
    - Division
    - Integer division
    - Modulo
- 10.2 Comparison Operators
    - Equal
    - Not equal
    - Greater than
    - Less than
    - Greater than or equal
    - Less than or equal
    - NULL-safe equality
- 10.3 Logical Operators
    - AND
    - OR
    - NOT
    - XOR
    - Operator precedence
    - Parentheses
- 10.4 Range and List Operators
    - BETWEEN
    - NOT BETWEEN
    - IN
    - NOT IN
- 10.5 Pattern matching
    - LIKE
    - NOT LIKE 
    - EXIST
    - NOT EXIST
    - % wildcard
    - _ wildcard
    - Regular Expression
- 10.7 NULL Operators
    - IS NULL
    - IS NOT NULL
    - IS TRUE
    - IS FALSE
- 10.8 Bitwise Operators
    - Bitwise AND
    - Bitwise OR
    - Bitwise XOR
    - Bit shifting
- 10.9 Assignment Operators
    - =
    - :=
- Conditional Expressions  
    - CASE expression
    - Conditional functions
        - IF()
        - IFNULL()
        - NULLIF()
        - COALESCE()
- Types of filtering
    - Numeric
    - STRING
    - DATE
    - Boolean
    - NULL

  -------------------------------------------------------- Aggregate Functions --------------------------------------------------------------------
- Aggregate Functions
    - COUNT
    - SUM
    - AVG
    - MIN
    - MAX
    - GROUP_CONCAT
- Aggregate variations
    - COUNT(*)
    - COUNT(column)
    - COUNT(DISTINCT column)
- 
  -------------------------------------------------------JOINS------------------------------------------------------
  SQL Joins
    - INNER JOIN
    - LEFT JOIN
    - RIGHT JOIN
    - CROSS JOIN
    - SELF JOIN
    - ON
    - USING
  
