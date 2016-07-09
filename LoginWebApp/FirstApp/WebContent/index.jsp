<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	table tbody tr th:FIRST-LETTER {
	font-size: 2em;
}
table tbody tr th:HOVER {
	font-style: italic;
}
</style>
</head>
<body>
<fieldset>
	<legend>Dear User! Login to continue</legend>
	<form action="LoginServ" method="post">
		<table>
			<tbody>
				<tr>
					<th>User Name</th>
					<td><input type="text" name="uid" placeholder="User Name"></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="password" placeholder="********"></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td></td>
					<td><input type="submit" value="Log In"></td>
				</tr>
			</tfoot>
		</table>
	</form>
</fieldset>
</body>
</html>