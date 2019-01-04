<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<%=path %>/resources/jquery-3.2.1.min.js" type="text/javascript"></script>
<title>MVC</title>
<script type="text/javascript">
	/* $(document).ready(function(){
		var data = {roleName : 'ROLE', note : 'NOTE', pageParams : {start : 1, limit : 88}};
		$.post({
			url : "./findRoles.do",
			contentType : "application/json",
			data : JSON.stringify(data),
			success : function(result){}
		});
	}); */
</script>
</head>
<body>
	<form action="addRole.do">
		<button name="submit" type="submit">Add Role</button>
	</form>
</body>
</html>