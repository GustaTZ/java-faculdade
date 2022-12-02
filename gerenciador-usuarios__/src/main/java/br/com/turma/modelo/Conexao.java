package br.com.turma.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

		public static Connection obterConexao() {
			
			Connection con=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://localhost/dbusuarios?useTimezone=true&serverTimezone=UTC", "root", "root");
				System.out.println("Banco de Dados Conectado com Sucesso!!!");
			} catch (SQLException | ClassNotFoundException e) {
				System.err.println("Não Foi Possível Conectar ao Banco de Dados!!!");
				e.printStackTrace();
			}
			
			return con;
		}
}
