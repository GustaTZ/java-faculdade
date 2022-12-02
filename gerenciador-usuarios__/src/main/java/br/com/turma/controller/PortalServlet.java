package br.com.turma.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.modelo.Usuario;
import br.com.turma.modelo.UsuarioDao;


	@WebServlet("/portal")
	public class PortalServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String codigoStr=request.getParameter("txtcodigo");
		String nome= request.getParameter("txtnome");
		String login= request.getParameter("txtlogin");
		String senha= request.getParameter("txtsenha");
		
		if(codigoStr==null) {
			Usuario usuario=new Usuario(nome,login,senha);
			
			UsuarioDao usuarioDao=new UsuarioDao();
			usuarioDao.cadastrar(usuario);
		}else {
			int codigo=Integer.valueOf(codigoStr);
			Usuario usuario=new Usuario(codigo,nome,login,senha);
			UsuarioDao usuarioDao=new UsuarioDao();
			usuarioDao.alterar(usuario);
		}
		
		
		response.sendRedirect("portal?acao=mostrar");
	}
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			System.out.println("chamou o metodo doGet");
			String acao=request.getParameter("acao");
			
		if(acao.equals("mostrar")) {
			UsuarioDao usuarioDao=new UsuarioDao();
			ArrayList<Usuario> usuarios=usuarioDao.mostrarTodos();
			request.setAttribute("lista",usuarios);
			RequestDispatcher rd=request.getRequestDispatcher("mostrartodos.jsp");
			rd.forward(request, response);
			
		}else if(acao.equals("excluir")) {
			int codigo=Integer.valueOf(request.getParameter("codigo"));
			UsuarioDao usuarioDao=new UsuarioDao();
			usuarioDao.remover(codigo);
			response.sendRedirect("portal?acao=mostrar");
			
		}else if(acao.equals("alterar")) {
			int codigo=Integer.valueOf(request.getParameter("codigo"));
			UsuarioDao usuarioDao=new UsuarioDao();
			Usuario usuario=usuarioDao.buscarPorCodigo(codigo);
			request.setAttribute("usuario", usuario);
			RequestDispatcher rd=request.getRequestDispatcher("formalterar.jsp");
			rd.forward(request, response);
		}
	}
}
