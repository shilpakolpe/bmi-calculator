<html>
<body>
	<h2>Welcome to Bmi Calculator</h2>
	<h3>
		Written by
		<%=java.lang.System.getProperty("user.name")%></h3>
		<form action="results.jsp" method="get">
			Height in meters<input type="text" name="height">
			<br>
			Weight in kgs<input type="text" name="weight">
			<br>
			<input type="submit">
		</form>
</body>
</html>
