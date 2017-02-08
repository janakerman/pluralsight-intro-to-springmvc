<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Goal Page</title>
</head>
<body>
    <form:form commandName="goal">
        <table>
            <tr>
                <td>Enter goal</td>
                <td><form:input path="minutes" /></td>
            </tr>
            <tr>
                <td col-span="2">
                    <input type="submit" value="Add goal" />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>