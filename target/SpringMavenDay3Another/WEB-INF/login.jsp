<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<form action = "logincheck" method = "post">
    <input type = "text" name="txtUser" />
    <input type = "password" name="txtPassword" />
    <input type = "submit"/>
</form>

<% String status = (String) request.getAttribute("fresh");
if(status!=null && status.equals("false"){
out.println("<h1> Invalid User </h1>");
}
%>
</body>
</html>