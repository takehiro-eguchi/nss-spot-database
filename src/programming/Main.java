package programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main{
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// JDBCドライバの登録
		Class.forName("org.postgresql.Driver");

		// DB接続情報
		String dbname   = "postgres";
		String url = "jdbc:postgresql://localhost:5432/" + dbname;
		String user = "postgres";
		String password = "postgres";

		// データベースとの接続
		try(Connection con = DriverManager.getConnection(url, user, password)) {

			// ステートメントの作成
			try(Statement stmt = con.createStatement()) {

				// SQLの実行
				String sql = "SELECT * FROM postnumber";
				try(ResultSet rs = stmt.executeQuery(sql)) {

					// データの取得
					while (rs.next()) {
						int code = rs.getInt(1);
						String postnum = rs.getString("postalcode");
						System.out.println("code=" + code + ", postnum=" + postnum);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
