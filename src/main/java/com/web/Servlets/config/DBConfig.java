package com.web.Servlets.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DBConfig {

    private static final String URL = "jdbc:mysql://localhost:3306/practice";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";
    private static HikariDataSource dataSource;
    Connection con;
  public Connection getConnectionJdbc() throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  con=DriverManager.getConnection(URL,USER,PASSWORD);
	  return con;
  }
  
  
  static {
	  HikariConfig config=new HikariConfig();
	  config.setDriverClassName("com.mysql.cj.jdbc.Driver");
	  config.setJdbcUrl("jdbc:mysql://localhost:3306/practice");
	  config.setUsername("root");
	  config.setPassword("vishnu");
	  dataSource=new HikariDataSource(config);
	  
	  }
  public static Connection getConnection() throws SQLException {
      return dataSource.getConnection();
  }

}
