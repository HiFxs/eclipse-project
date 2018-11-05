<%@page import="web_hibernate_test.UserDao"%>
<jsp:useBean id="obj" class="web_hibernate_test.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%
    int i = UserDao.save(obj);
    if (i > 0) {
        System.out.print("You are successfully registered");
    }
%>