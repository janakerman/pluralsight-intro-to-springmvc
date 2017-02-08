<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes Page</title>
</head>
<body>
    <h1>Add Minutes Exercised</h1>

    Language: <a href="?language=en">English</a> | <a href="?language=es">Espanol</a>

    <form:form commandName="exercise">
        <table>
            <tr>
                <td><spring:message code="goal.text" /></td>
                <td><form:input path="minutes" /></td>
                <td>
                    <form:select id="activities" path="activity"></form:select>
                </td>
            </tr>
            <tr>
                <td col-span="3">
                    <input type="submit" value="Enter exercise" />
                </td>
            </tr>
        </table>
    </form:form>

    <h1>Current goal: ${goal.minutes}</h1>
    <a href="addGoal.html">Set goal</a>

    <script
        src="https://code.jquery.com/jquery-3.1.1.js"
        integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA="
        crossorigin="anonymous"></script>

    <script type="text/javascript">
        $(document).ready(() => $.getJSON('<spring:url value="activities.json"/>', {
                ajax: 'true'
            }, (data) => {
                var html = '<option value="">--Please select one--</option>'
                data.forEach((d) => html += '<option value="' + d.description + '">' + d.description + '</option>');

                $('#activities').html(html);
            })
        );
    </script>
</body>
</html>