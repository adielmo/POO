package com.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteOutputJdbc {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		System.out.println("Lista Departamento");
		try {
			connection = DB.getConnection();
			statement = connection.createStatement();

			resultSet = statement.executeQuery("select * from department");

			while (resultSet.next()) {

				System.out.println(resultSet.getInt("Id") + " " + resultSet.getString("Name"));

			}

		} catch (SQLException e) {
			System.out.println("Error");
			
			
		} 

		System.out.println("\nLista Vendedor");
		try {

			connection = DB.getConnection();
			statement = connection.createStatement();

			resultSet = statement.executeQuery("select * from seller");

			while (resultSet.next()) {

  System.out.println(resultSet.getInt("Id") + " - " + resultSet.getString("Name") + " - "+ resultSet.getString("Email") 
  + " - " + resultSet.getTimestamp("BirthDate")+ " - " + resultSet.getDouble("BaseSalary") + " - " + resultSet.getInt("DepartmentId"));
			}

		} catch (SQLException e) {
			System.out.println("Error");
			
		} finally {
			DB.closeStatement(statement);
			DB.closeResultSet(resultSet);
			DB.closeConnection();
		}

	}

}
