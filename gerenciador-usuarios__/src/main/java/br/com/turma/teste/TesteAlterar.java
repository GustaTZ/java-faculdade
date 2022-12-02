package br.com.turma.teste;

import br.com.turma.modelo.Usuario;
import br.com.turma.modelo.UsuarioDao;

public class TesteAlterar {

	public static void main(String[] args) {
		Usuario usuario=new Usuario();
		usuario.setCodigo(2);
		usuario.setNome("Pedro Lima");
		usuario.setLogin("plima");
		usuario.setSenha("pl321");
		
		UsuarioDao usuarioDao=new UsuarioDao();
		usuarioDao.alterar(usuario);

	}

}
