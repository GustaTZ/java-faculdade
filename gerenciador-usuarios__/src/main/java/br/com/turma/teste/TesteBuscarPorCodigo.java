package br.com.turma.teste;

import br.com.turma.modelo.Usuario;
import br.com.turma.modelo.UsuarioDao;

public class TesteBuscarPorCodigo {

	public static void main(String[] args) {
		
		UsuarioDao usuarioDao=new UsuarioDao();
		Usuario usuario=usuarioDao.buscarPorCodigo(2);
		System.out.println(usuario);

	}

}
