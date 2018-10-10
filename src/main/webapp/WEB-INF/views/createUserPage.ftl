<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create User</title>
</head>
<body>

<form name="user" action="/addUser" method="post">
    User name:<br>
    <input type="text" name="name" required><br>
    User email:<br>
    <input type="text" name="email" required><br>
    User age:<br>
    <input type="text" name="age" required><br>
    <br>
    <input type="submit" value="Submit">
</form>
<br>
<a href="/users"> Back </a>
</body>
</html>