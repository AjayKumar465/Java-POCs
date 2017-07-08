package com.nacre.resume_builder.dbutil;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;





/**
 * This class contains all the utility methods for database connection.
 * 
 * @version 1.0.0 9th July 2014
 * @author Nacre Batch 19 Java
 */
public class DbUtil {

	/*
	 * Database user name.
	 */
	private static String UNAME;

	/*
	 * Database password.
	 */
	private static String PWD;

	/*
	 * Database driver class name i.e com.mysql.jdbc.Driver .
	 */
	private static String DRIVER;

	/*
	 * Database connection url name i.e jdbc:mysql://hostname:3306/schemaname .
	 */
	private static String URL;

	/*
	 * log4j logger will be used for logging purposes.
	 */
	// private static Logger dblogger = Logger.getLogger();

	/*
	 * static block to load database connection parameters from
	 * database.properties file.
	 */
	static {
		Properties p = new Properties();
		try {
			p.load(DbUtil.class.getClassLoader().getResourceAsStream("Database.properties"));
			UNAME = p.getProperty("username");
			PWD = p.getProperty("password");
			URL = p.getProperty("url");
			DRIVER = p.getProperty("driver");
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// dblogger.error(DBConstants.DRIVER_LOAD_ERR_MSG);
			System.out.println("Exception--->"+e);
		} catch (IOException e) {
			// dblogger.error(DBConstants.PROP_LOAD_ERR_MSG);
			System.out.println("Exception--->"+e);
		}
	}
	public static Connection getConnection() throws ResumeBuilderDBExceptions {
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(URL,UNAME,PWD);
		} catch (SQLException e) {
			System.out.println("Exception--->"+e);
			throw new ResumeBuilderDBExceptions("Not able to connect to database now plz try after some time");
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection) throws ResumeBuilderDBExceptions {
		if(connection!=null)
			try {
				connection.close();
			} catch (SQLException e) {
				throw new ResumeBuilderDBExceptions("Not able to connect to database now plz try after some time \n Error"+e);
			}
	}
	
	/*public static void main(String [] a) throws ResumeBuilderDBException, SQLException{
		Connection connection = getConnection();
		DatabaseMetaData databaseMetaData = connection.getMetaData();
		System.out.println("Database connected---->"+databaseMetaData.getDatabaseProductName());
	}*/
	
}
