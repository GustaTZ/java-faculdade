package br.com.turma.teste;

import br.com.turma.modelo.Usuario;
import br.com.turma.modelo.UsuarioDao;

public class TesteVerificarLogin {

	public static void main(String[] args) {
		
		UsuarioDao usuarioDao=new UsuarioDao();
		Usuario usuario=usuarioDao.verificarLogin("plima", "pl321");
		System.out.println(usuario);

	}

}
