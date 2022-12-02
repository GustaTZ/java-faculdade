package br.com.turma.teste;

import java.util.ArrayList;

import br.com.turma.modelo.Usuario;
import br.com.turma.modelo.UsuarioDao;

public class TesteMostrarTodos {
	
	public static void main(String[]args) {
		UsuarioDao usuarioDao=new UsuarioDao();
		ArrayList<Usuario>usuarios=usuarioDao.mostrarTodos();
		
		for(Usuario usuario:usuarios) {
			System.out.println(usuario);
		}
		
	}
}
