<%@ page import="java.util.*, modele.Plat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Plats</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="">
    </head>
    <body>
        <h3>Bienvenue, <%= request.getAttribute("clientNom") %> !</h3>
        <h2>Nos plats disponibles :</h2>
        
        <ul>
            <%
                List<Plat> plats = (List<Plat>) request.getAttribute("plats");

                for(Plat p : plats) {
            %>
            <li>
                <img src="<%= p.getImage()%>" width="120">
                <strong><%= p.getNom()%></strong>
                <p><%= p.getPrix()%> Ariary</p>
            </li>
            <%    }
            %>
        </ul>
        <script src="" async defer></script>
    </body>
</html>