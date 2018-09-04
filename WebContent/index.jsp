<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Formulario Registro</h1>

	<form action="ciudadano" method="post">
		<table>
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="nombre"></td>
			<tr>
			<tr>
				<td>Apellidos</td>
				<td><input type="text" name="apellidos"></td>
			<tr>
			<tr>
				<td>Edad</td>
				<td><input type="text" name="edad"></td>
			<tr>
			
			<tr>
				<td></td>
				<td><button type="submit">Guardar Ciudadano</button></td>
			<tr>
		</table>
	</form>
	
	<a href="ciudadano">Mostrar Ciudadanos</a>

</body>
</html>