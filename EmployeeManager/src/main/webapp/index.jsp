<html>
<head>
<title>Employee Manager Project 11/29</title>
</head>
<body>
<h1>Add New Employee</h1>
<div>
<form action="NewEmpServlet" method="post">
	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="password"/></td>
		</tr>
		<tr>
			<td>Role:</td>
			<td>
				<select name="role" style="width:150px">
					<option>Manager</option>
					<option>Developer</option>
					<option>HR</option>
					<option>Trainer</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Save New Employee"/></td>
		</tr>
	</table>
</form>

</div>

<br/>
<div>
<a href="ViewEmpServlet"><button>View All Employees</button></a>
</div>

</body>
</html>
