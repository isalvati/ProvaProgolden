<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
	It works!! ${variable} ${linkTo[IndexController].index}
	<br>
	It works!! ${listaEnderecos}
	<br>
	It works!! ${listaPessoas}
	<br>
	It works!! ${listaUsuarios}
	<br><br>
	<form action="adicionaContato">
      Rua: <input type="text" name="rua" /><br />
      Bairro: <input type="text" name="bairro" /><br />
      Telefone: <input type="text" name="telefone" /><br />
      Data Nascimento: 
        <input type="text" name="dataNascimento" /><br />
      
      <input type="submit" value="Gravar" />
    </form>
	 
</body>
</html>