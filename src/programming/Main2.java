package programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main2 {
	private static final String NEW_LINE = System.getProperty("line.separator");

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// DB接続情報
		String dbname = "postgres";
		String url = "jdbc:postgresql://localhost:5432/" + dbname;
		String user = "postgres";
		String password = "postgres";


        // StatementとPreparedStatementとで実行時間に差があるか検証
		try (Connection con = DriverManager.getConnection(url, user, password)) {
            // Statement
			System.out.println("--------------------Statement--------------------");
			long sStart = System.nanoTime();
			executeByStatement(con);
			System.out.println("Time = " + ((System.nanoTime() - sStart) / 1000000) + " [ms]");

            System.out.print(NEW_LINE);

			// PreparedStatement
			System.out.println("----------------PreparedStatement----------------");
			long pStart = System.nanoTime();
			executeByPreparedStatement(con);
			System.out.println("Time = " + ((System.nanoTime() - pStart) / 1000000) + " [ms]");
		}
	}

	private static void executeByStatement(Connection con) throws SQLException {
		String sql = "SELECT * FROM details";
		try (Statement stmt = con.createStatement()) {
			for (int i = 1; i <= 100; i++) {
				// WHERE条件式の追加
				String exeSql = sql + " WHERE quantity = " + i;

				try (ResultSet rs = stmt.executeQuery(exeSql)) {
					printResult(rs);
				}
			}
		}
	}

	private static void executeByPreparedStatement(Connection con) throws SQLException {
		String preparedSql = "SELECT * FROM details WHERE quantity = ?";
		try (PreparedStatement stmt = con.prepareStatement(preparedSql)){
			for (int i = 1; i <= 100; i++) {
				// パラメータの設定
				stmt.setInt(1, i);

				try (ResultSet rs = stmt.executeQuery()) {
					printResult(rs);
				}
			}
		}
	}

	private static void printResult(ResultSet rs) throws SQLException {
		System.out.println("orderid,itemid,quantity");
		while (rs.next()) {
			int orderId = rs.getInt("orderid");
			int itemid = rs.getInt("itemid");
			int quantity = rs.getInt("quantity");
			System.out.println(String.format("%d,%d,%d", orderId, itemid, quantity));
		}
		System.out.print(NEW_LINE);
	}

}
