package br.com.contatos.view;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnect {

	public static Connection ConectarDb(){

		Connection con = null ;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://10.107.134.37/contatos", "root", "root");

		}catch(Exception ex){

			System.out.println(ex.getMessage());
		}

		return con;
	}
}
