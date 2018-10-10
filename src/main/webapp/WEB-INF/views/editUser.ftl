<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update User</title>
</head>
<body>

<form name="user" action="/updateUser" method="post">
    <#--User id:${user.id} <br>-->
    <input type="text" name="id" value="${user.id}"><br>
    User name:<br>
    <input type="text" name="name" value="${user.name}"  ><br>
    User email:<br>
    <input type="text" name="email" value="${user.email}" ><br>
    User age:<br>
    <input type="text" name="age" value="${user.age}" ><br>
    <br>
    <input type="submit" value="Submit">
</form>
<br>

<a href="/users"> Back </a>
</body>
</html>