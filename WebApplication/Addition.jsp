<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Addition Result</title>
    </head>
    <body>
        <h2>Addition Result</h2>
        <%
            String num1 = request.getParameter("num1");
            String num2 = request.getParameter("num2");
            int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
            out.print(num1 + " + " + num2 + " = " + sum);
        %>
    </body>
</html>
