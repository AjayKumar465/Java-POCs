<%@page import="java.util.Set"%>
<%@page import="com.ibaseit.atts.service.RenderAtts"%>
<%@page import="java.util.Map"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<body>

<h1  align="center">Login Form</h1><br>
<table  align="center">
<% 
Map<String, Map<String, String>> attsMap  = (Map<String, Map<String, String>>)session.getAttribute("atts_loginForm");

RenderAtts render = new  RenderAtts();
Map<String,String> atts = attsMap.get("atts_loginForm");
Set<String> keys =atts.keySet();
for(String key  : keys){

%>


<tr><td><%=key %></td><td>:<%=render.renderAttribute(key, atts.get(key)) %></td></tr>
<% }%>
<tr><td><input type="submit" value="Login"></td></tr>
</table>
</body>
</html>