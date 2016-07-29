<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="progolden.agenda.entidades.Pessoa"%>
<%@page import="progolden.agenda.repositorios.PessoaRepositorio"%>
<%@page import="java.util.List"%>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3>Adicionar contato na Agenda</h3>
			</div>
			<div class="panel-body">
				<form action="${linkTo[PessoaController].adcionaPessoa}"
					method="POST">
					<div class="input-group input-group-lg">
						<span class="input-group-addon" id="sizing-addon1">Rua </span> <input
							name="pessoa.nome" id="nome" type="text" class="form-control"
							placeholder="Ex.: Fulano de Tal"
							aria-describedby="sizing-addon1">
					</div>
					<br>
					<div class="input-group input-group-lg">
						<span class="input-group-addon" id="sizing-addon1"> Bairro
						</span> <input name="pessoa.cpf" id="cpf" type="text"
							class="form-control" placeholder="Ex.: 000.000.000-00"
							aria-describedby="sizing-addon1">
					</div>
					<br>
					<div class="input-group input-group-lg">
						<span class="input-group-addon" id="sizing-addon1">
							Data de Nascimento </span> <input name="pessoa.nascimento" id="nascimento"
							type="text" class="form-control"
							placeholder=""
							aria-describedby="sizing-addon1">
					</div>
					<br>
					<br>
					<button type="submit" class="btn btn-success" title="Salvar">
						<span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>
					</button>
				</form>
			</div>
		</div>
</body>
</html>