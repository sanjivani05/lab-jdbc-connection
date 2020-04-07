package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws SQLException, IOException {
		Connection cn= null;
		//ConnectionManager connectionmanager =new ConnectionManager();
		cn=ConnectionManager.getConnection();
		if(cn!=null) {
			System.out.println("Connection Established");
			
		}
		else
		{
			System.out.println("Check your connection");
		}
		
	// Fill your code
		
	}
}