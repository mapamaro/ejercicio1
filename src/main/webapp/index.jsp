<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tienda virtual</title>
</head>
<body>
	<table border="0" width="1000" align="center"> 
		<tr>
			Bienvenidos a la Tienda Genérica
		</tr>	
	</table>
	
	<form method="get" action="./tv_Servlet">
		<table>
			<tr>
				<td><label>Usuario:</label><td>
				<td><input type="text" name="Usuario" value="admininicial"><td>
			</tr>
			<tr>
				<td><label>Contraseña:</label><td>
				<td><input type="password" name="Contrasena" value="admin123456"><td>
			</tr>
			<tr>
				<td><input type="submit" value="Aceptar"><td>
				<td><input type="reset" value="Cancelar"><td>
			</tr>
		</table>
	</form>
</body>
</html>