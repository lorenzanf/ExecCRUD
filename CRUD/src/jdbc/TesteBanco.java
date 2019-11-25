package jdbc;

import java.sql.Connection;

public class TesteBanco {

	public static void main(String[] args) {
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conectado");
	
	}

}
