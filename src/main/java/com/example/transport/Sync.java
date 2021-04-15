package com.example.transport;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.example.model.Users;

public class Sync {

	public String insert(List<Users> users) {
		PostgreDbConn conn = new PostgreDbConn();

		for (Users user : users) {

			Statement stmnt = null;
			int id = user.getId();
			String title = user.getTitle();
			String fname = user.getFname();
			String lname = user.getLname();
			System.out.println(id + ":" + title + ":" + fname + ":" + lname);
			try {

				stmnt = conn.DbConn().createStatement();
				String sql = "INSERT INTO Users (id, title, fname, lname) " + "VALUES " + "(" + id + ", " + title + ", "
						+ fname + ", " + lname + ")";
				stmnt.executeUpdate(sql);

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		return "inserted";
	}

}
