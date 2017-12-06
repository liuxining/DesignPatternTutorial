
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 */
public class DBUtil {

	/**
	 * Default constructor
	 */
	public DBUtil() {
	}

	private static String username;
	private static String password;
	private static String driver;
	private static String url;

	static {
		username = XMLUtil.getBean("username");
		password = XMLUtil.getBean("password");
		driver = XMLUtil.getBean("driver");
		url = XMLUtil.getBean("url");
	}

	/**
	 * @return
	 */
	public Connection getConnection() {
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(new DBUtil().getConnection());
	}

}