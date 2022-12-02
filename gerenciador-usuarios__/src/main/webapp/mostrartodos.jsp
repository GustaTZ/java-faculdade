<%@page import="br.com.turma.modelo.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrar usuarios</title>
</head>
<body>

<% ArrayList<Usuario>usuarios=(ArrayList<Usuario>)request.getAttribute("lista"); %>

<h1>Mostrar Usuarios</h1>

<a href="formcadastro.html"><button>Cadastrar Usuário</button></a>
<br><br>
<table border="1" style="width: 80%">
	<thead>
		<tr style="background-color: black;color:white">
			<th>Codigo</th>
			<th>Nome</th>
			<th>Login</th>
			<th>Senha</th>
			<th colspan="2">Ação</th>
		</tr>
	</thead>
	<tbody>
	<%for(Usuario usuario:usuarios){ %>
		<tr>
			<td><%=usuario.getCodigo() %></td>
			<td><%=usuario.getNome() %></td>
			<td><%=usuario.getLogin() %></td>
			<td><%=usuario.getSenha() %></td>
			<td><a href="?acao=alterar&codigo=<%=usuario.getCodigo()%>">Alterar</a></td>
			<td><a href="?acao=excluir&codigo=<%=usuario.getCodigo()%>">Excluir</a></td>
		</tr>
		<%} %>
	</tbody>
</table>
</body>
</html>