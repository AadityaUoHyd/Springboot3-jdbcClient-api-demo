# Springboot3-jdbc-client-api
As of version 6.1 of the Spring Framework, there is a unified JDBC access facade available in the 
form of org.springframework.jdbc.core.simple.JdbcClient. The JdbcClient provides a fluent API style 
for common JDBC queries/updates with flexible use of indexed or named parameters. Behind the hoods, 
It delegates to JdbcOperations/NamedParameterJdbcOperations} for actual execution.

Spring JDBC-Template was similar to new JDBC-Client, though it has few cons as it can get pretty verbose 
if you're building simple CRUD services based on resources. It demands a deeper understanding of all the 
methods you need to communicate with a database - factors like row mappers, column to field mapping and so on,
 which can be pretty tricky.

One exciting feature with the JDBC client is that it's auto-configured for us in Spring Boot 3.2. This means, 
we can simply ask for a bean in our application, and we get an instance of it, hassle-free!
The JdbcClient API will take care of dynamically creating a RowMapper by using SimplePropertyRowMapper. 
It will perform the mapping between bean property names to table column names by converting camelCase to underscore notation. 
If you need more control over the mapping, you can always create a RowMapper by yourself and use it.


# Here is a demo Proof of Concept example of JDBCClient API.

- Before running this program, create one database in your mysql with name "test".
- Now run the spring boot code.
- Go to postman and test it according to url configured in controller class for CRUD operations.

# Source to learn :
- https://www.masterspringboot.com/data-access/jdbc-template/getting-started-with-spring-6-jdbcclient-api/ 
