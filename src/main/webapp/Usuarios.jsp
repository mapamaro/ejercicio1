<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Tienda Genérica</h1>
		<table border="0" width="1000" align="center">
 			<tr bgcolor="skyblue" padding: 50px 20px 20px 50px>
 				<th><a href="Usuarios.jsp">Usuarios</a></th>
 				<th><a href="Clientes.jsp">Clientes</a></th>
 				<th><a href="Proveedores.jsp">Proveedores</a></th>
 				<th><a href="Productos.jsp">Productos</a></th>
 				<th><a href="Ventas.jsp">Ventas</a></th>
 				<th><a href="Reportes.jsp">Reportes</a></th>
 				<th><a href="ServetLogueoaccion=cerrar">Cerrar sesión<Reportes/a></th>
 				
 			</tr>
 		</table>
 		
 		 		
			<form method="get" action="./DemoServlet">
				<table border="0" width="1000" align="center">
				<tr align="center">
					<td><label>Cédula</label><td>
					<td><input type="text" name="Cedula"><td>
					<td><label>Usuario</label><td>
					<td><input type="text" name="Usuario"><td>
				</tr>
				
				<tr align="center">
				<td><label>Nombre Completo</label><td>
				<td><input type="text" name="Nombre"><td>
				<td><label>Contraseña</label><td>
				<td><input type="password" name="Contraseña"><td>
				</tr>
				
				<tr align="center">
				<td><label>Correo electrónico</label><td>
				<td><input type="text" name="Correo"><td>
				</tr>
				
				<tr><td></td></tr>
						
				<tr align="center">
				<td><input type="submit" value="Consultar"><td>
				<td><input type="submit" value="Crear"><td>
				<td><input type="submit" value="Actualizar"><td>
				<td><input type="submit" value="Borrar"><td>
				</tr>
			</table>
		</form>
</body>
</html>