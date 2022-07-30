package programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// DB接続情報
		String dbname = "postgres";
		String url = "jdbc:postgresql://localhost:5432/" + dbname;
		String user = "postgres";
		String password = "postgres";

		// データベースとの接続
		try (Connection con = DriverManager.getConnection(url, user, password);	// 接続
				Statement stmt = con.createStatement();	// ステートメント
				ResultSet rs = stmt.executeQuery("SELECT * FROM postnumber");	// SQL
				) {
				// データの取得
				while (rs.next()) {
					int code = rs.getInt(1);
					String postnum = rs.getString("postalcode");
					System.out.println("code=" + code + ", postnum=" + postnum);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
