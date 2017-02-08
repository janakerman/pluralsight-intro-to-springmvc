<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Goal Page</title>

<style type="text/css">
.error {
    color: #ff0000;
}
.error-block {
    color: #000;
    background-color: #ffeeee;
    border: 3px solid #ff0000;
    padding: 8px;
    margin: 16px;
}
</style>

</head>
<body>
    <form:form commandName="goal">
    <!-- Display this section if any errors (path=*) occur display this -->
    <form:errors path="*" cssClass="error-block" element="div" />
        <table>
            <tr>
                <td>Enter goal</td>
                <td><form:input path="minutes" cssErrorClass="error" /></td>
                <td><form:errors path="minutes" cssClass="error" /></td>
            </tr>
            <tr>
                <td col-span="3">
                    <input type="submit" value="Add goal" />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>