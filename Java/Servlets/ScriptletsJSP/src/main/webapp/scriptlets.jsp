<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Pcon Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%-- Scriptlets para enviar informacion al navegador--%>
        <%
            out.print("Saludos desde un Scriptlets");
        %>
        <%-- Scriptlets para manipular los objetos implicitos--%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%-- Scriptlet con codigo condicionado --%>
        <%
            if(session != null && session.isNew()){
        %>
        la session SI es nueva
        <%
            }else if(session != null){
        %>
        la sesion NO es nueva
        <%
            }
        %>
        <br>
         <a href="index.html">Regresar al inicio</a>
    </body>
</html>
