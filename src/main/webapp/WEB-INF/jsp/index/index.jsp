<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="progolden.agenda.entidades.Endereco"%>
<%@page import="progolden.agenda.repositorios.EnderecoRepositorio"%>
<%@page import="java.util.List" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
	It works!! ${variable} ${linkTo[IndexController].index}
	<br> It works!! ${listaEnderecos}
	<br> It works!! ${listaPessoas}
	<br> It works!! ${listaUsuarios}
	<br>
	<br>
	<%
		EnderecoRepositorio dao = new EnderecoRepositorio();
		List<Endereco> enderecos = dao.listEndereco();

		for (Endereco endereco : enderecos) {
	%>
	<li><%=endereco.getRua()%>, <%=endereco.getBairro()%>: <%=endereco.getTelefone()%></li>

	<%
		}
	%>
	<br>
	<br>
	<form action="${linkTo[EnderecoController].adcionaEndereco}" method="POST">
		Rua: <input type="text" name="endereco.rua" /><br /> 
		Bairro: <input type="text" name="endereco.bairro" /><br /> 
		Telefone: <input type="text" name="endereco.telefone" /><br /> 
		Id Pessoa: <input type="text" name="endereco.id_pessoa" /><br /> 
		<input type="submit" value="Gravar" />
	</form>

</body>
</html>