
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 */
public class UserDAO {

	/**
	 * Default constructor
	 */
	public UserDAO() {
		db = new DBUtil();
	}

	/**
	 * 
	 */
	private DBUtil db;

	/**
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean findUser(String username, String password) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = db.getConnection();
			String sql = "select * from user where username=? and password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				flag = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(conn, pstmt, rs);
		}
		return flag;

	}

}