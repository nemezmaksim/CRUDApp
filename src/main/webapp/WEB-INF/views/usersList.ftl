<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Users</title>
</head>
<body>
<h1>Users list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>name</th>
        <th>email</th>
        <th>age</th>
    </tr>

<#list users505 as user>
    <tr>
     <td><a href="/user/${user.id}">${user.id}</a></td>
     <td>${user.name}</td>
     <td>${user.email}</td>
     <td>${user.age}</td>
     <td><a href="/delete/${user.id}">Delete</a></td>
     <td><a href="/update/${user.id}">Edit</a></td>
    </tr>
</#list>
</table>
<br>
<a href="/addUser">Add User</a>
</body>
</html>