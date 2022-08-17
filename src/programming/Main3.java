package programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main3 {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws  SQLException {
		// DB接続情報
		String dbname = "postgres";
		String url = "jdbc:postgresql://localhost:5432/" + dbname;
		String user = "postgres";
		String password = "postgres";

		try (Connection con = DriverManager.getConnection(url, user, password)) {
			System.out.println("--------------------Pattern1--------------------");
			execute(con, "ルフィ");
			System.out.println();
			System.out.println("--------------------Pattern2--------------------");
			execute(con, "ルフィ' OR 'A' = 'A");
		}
	}

	private static void execute(Connection con, String arg) throws SQLException {
		String sql = "SELECT * FROM users WHERE name = '" + escape_quote(arg) + "'";
		System.out.println("Executing SQL = " + sql);
		try (Statement stmt = con.createStatement()) {
			try (ResultSet rs = stmt.executeQuery(sql)) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String pref = rs.getString("birth");
					System.out.println(String.format("%d,%s,%s", id, name, pref));
				}
			}
		}
	}

	private static String escape_quote(String s) {
		StringBuffer buf = new StringBuffer();
		for (int k = 0; k < s.length(); k++) {
			char ch = s.charAt(k);
			if (ch == '\'')
			buf.append("''");
			else
			buf.append(ch);
		}
		return buf.toString();
	}
}
