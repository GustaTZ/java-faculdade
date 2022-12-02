package br.com.turma.teste;

import br.com.turma.modelo.Usuario;
import br.com.turma.modelo.UsuarioDao;

public class TesteCadastrar {
	
	public static void main(String[]args){
		
		Usuario usuario=new Usuario();
		usuario.setNome("Katia Francisco");
		usuario.setLogin("kfrancisco");
		usuario.setSenha("kf321");
		
		UsuarioDao usuarioDao=new UsuarioDao();
		usuarioDao.cadastrar(usuario);
		
	}
	
}
