package br.com.turma.teste;

import br.com.turma.modelo.UsuarioDao;

public class TesteRemover {

	public static void main(String[] args) {
		UsuarioDao usuarioDao=new UsuarioDao();
		usuarioDao.remover(1);
	}

}
