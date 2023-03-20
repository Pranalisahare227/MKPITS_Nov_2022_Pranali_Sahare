<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Pranali
  Date: 20-03-2023
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second Page</title>
</head>
<body>

<h1>Welcome<h1>

 <%
       String name = request.getParameter("ename");
        String pass = request.getParameter("epass");
        String role = request.getParameter("role");

        out.print(name);

%>

<%
      try{
          Class.forName("com.mysql.jdbc.Driver");
          out.print("Driver Downloaded");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project1", "root", "PRAN@22");
           out.print("DATABASE CONNECTED");
           PreparedStatement ps = con.prepareStatement("insert into employ values (?, ?, ? )");
           ps.setString(1, name);
           ps.setString(2, pass);
           ps.setString(3,role);
           ps.execute();

         }catch (Exception e){

                out.print(e);

         }

  %>

</body>
</html>
