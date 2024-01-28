package lessonSolid.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

  private Connection conn;

  private static DatabaseConnectionManager connectionInstace = new DatabaseConnectionManager();

  private DatabaseConnectionManager() {

  }

  public static DatabaseConnectionManager getManagerInstance() {
    return connectionInstace;
  }

  /**
   * contains connection details
   *
   * @throws SQLException
   */
  public void connect() throws SQLException {
    // processing specific to database connection details...
    conn = DriverManager.getConnection("Some/Database/URL");
    System.out.println("Established Database Connection...");
  }

  public Connection getConnectionObject() {
    return conn;
  }

  public void disconnect() throws SQLException {
    conn.close();
    System.out.println("Disconnecting Database Connection...");
  }


}
