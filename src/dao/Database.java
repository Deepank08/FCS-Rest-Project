package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database
{
public Connection getConnection() throws Exception
{
try
{ //Database connection
String connectionURL = "jdbc:mysql://localhost:3306/Raw Data";
Connection connection = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
connection = DriverManager.getConnection(connectionURL, "root", "omegaDS");
return connection;
} catch (Exception e)
{
throw e;
}

}

}
