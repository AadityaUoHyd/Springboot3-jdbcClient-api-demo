# Springboot3-jdbc-client-api
As of version 6.1 of the Spring Framework, there is a unified JDBC access facade available in the 
form of org.springframework.jdbc.core.simple.JdbcClient. The JdbcClient provides a fluent API style 
for common JDBC queries/updates with flexible use of indexed or named parameters. Behind the hoods, 
It delegates to JdbcOperations/NamedParameterJdbcOperations} for actual execution.

# Here is a demo Proof of Concept example of JDBCClient API.

- Before running this program, create one database in your mysql with name "test".
- Now run the spring boot code.
- Go to postman and test it according to url configured in controller class for CRUD operations.

# Source to learn :
- https://www.masterspringboot.com/data-access/jdbc-template/getting-started-with-spring-6-jdbcclient-api/ 
