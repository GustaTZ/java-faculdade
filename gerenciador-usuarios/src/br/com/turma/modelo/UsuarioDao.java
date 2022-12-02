package br.com.turma.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDao {

	public void cadastrar(Usuario usuario) {

		Connection con=Conexao.obterConexao();
		
		String sql="INSERT INTO usuario(nome,login,senha) VALUES(?,?,?)";
		
		try {
			PreparedStatement preparador= con.prepareStatement(sql);
			preparador.setString(1,usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.execute();
			preparador.close();
			System.out.println("Usuário Cadastrado com Sucesso!!!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		}

	public ArrayList<Usuario> mostrarTodos(){
		ArrayList<Usuario> usuarios=new ArrayList<>();
		Connection con=Conexao.obterConexao();
		String sql="SELECT * FROM usuario";
		try {
			PreparedStatement preparador=con.prepareStatement(sql);
			ResultSet resultado=preparador.executeQuery();
			while(resultado.next()) {
				Usuario usuario=new Usuario();
				usuario.setCodigo(resultado.getInt("codigo"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return usuarios;
	}

	public Usuario buscarPorCodigo(int codigo) {
		Usuario usuario=null;
		Connection con=Conexao.obterConexao();
		String sql="SELECT * FROM usuario WHERE codigo=?";
		
		try {
			PreparedStatement preparador=con.prepareStatement(sql);
			preparador.setInt(1, codigo);
			
			ResultSet resultado=preparador.executeQuery();
			
			if(resultado.next()) {
				usuario=new Usuario();
				usuario.setCodigo(resultado.getInt("codigo"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	public void alterar(Usuario usuario) {
		Connection con=Conexao.obterConexao();
		
		String sql = "UPDATE usuario SET nome=?,login=?,senha=? WHERE codigo=?";
		
		try {
			PreparedStatement preparador=con.prepareStatement(sql);
			preparador.setString(1,usuario.getNome());
			preparador.setString(2,usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4,usuario.getCodigo());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Usuario Alterado com Sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void remover(int codigo) {
		Connection con=Conexao.obterConexao();
		
		String sql="DELETE FROM usuario WHERE codigo=?";
		
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			preparador.setInt(1, codigo);
			
			preparador.execute();
			preparador.close();
			System.out.println("Usuario Removido com Sucesso!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Usuario verificarLogin(String login,String senha) {
		
		Usuario usuario=null;
		Connection con=Conexao.obterConexao();
		String sql="SELECT * FROM Usuario WHERE login=? AND senha=?";
		
		try {
			PreparedStatement preparador=con.prepareStatement(sql);
			preparador.setString(1,login);
			preparador.setString(2, senha);
			
			ResultSet resultado=preparador.executeQuery();
			
			if(resultado.next()) {
				usuario=new Usuario();
				usuario.setCodigo(resultado.getInt("codigo"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
}

