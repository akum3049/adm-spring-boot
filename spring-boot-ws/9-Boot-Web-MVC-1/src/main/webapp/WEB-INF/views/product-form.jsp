<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Product Form</h1>
	<hr />

	<jsp:include page="./menu.jsp"/>
	<form action="./saveProductV1" method="post">
	
		<table align="center">
			<tr>
				<th>Product ID</th>
				<td><input name="id"></td>
			</tr>

			<tr>
				<th>Product Name</th>
				<td><input name="name"></td>
			</tr>

			<tr>
				<th>Price</th>
				<td><input name="price"></td>
			</tr>

			<tr>
				<th>Description</th>
				<td><textarea name="description"></textarea></td>
			</tr>

			<tr>
				<th colspan="2">
					<button>Save</button>
					<button type="reset">Clear All</button>
				</th>
			</tr>


		</table>
	</form>

	<hr />


</body>
</html>