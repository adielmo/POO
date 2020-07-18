package com.java.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteInputJdbc {

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			//preparedStatement.setDate(3, new java.sql.Date(df.parse("23/12/1984").getTime()));			
			connection = DB.getConnection();
			
			preparedStatement = connection.prepareStatement("INSERT INTO seller(name, email, birthDate, baseSalary, departmentId)"
					+ "VALUES(?, ?, ?, ?, ?)"
					, Statement.RETURN_GENERATED_KEYS);
			
			preparedStatement.setString(1, "Adielmo");
			preparedStatement.setString(2, "adielmorabelo@gmail.com");
			preparedStatement.setDate(3, new Date(df.parse("23/12/1984").getTime()));
			preparedStatement.setDouble(4, 4500.0);
			preparedStatement.setInt(5, 4);
			
			int rows = preparedStatement.executeUpdate();
			
			if (rows > 0) {
				ResultSet rs = preparedStatement.getGeneratedKeys();
				
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Id salvo " + id);
				}
			} else {
				System.out.println("Não alterado !");
			}
			

		} catch (SQLException e) {			
		System.out.println("Error !");
		
		} catch (ParseException e) {
			System.out.println("Error !");
			
		} finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}

	}

}
