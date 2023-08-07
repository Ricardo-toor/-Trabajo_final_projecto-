<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.util.List"%>
<%@ page import="talentodigital.etzel.certificacion.modelos.Usuario"%>

<div class="container text-center">
    <h1>Lista de Usuarios</h1>
    <table class="table table-dark table-bordered">
        <tbody>
            <% int count = 0; %>
            <% for (Usuario usuario : (List<Usuario>) request.getAttribute("usuarios")) { %>
            <% if (count % 10 == 0) { %>
            <% if (count != 0) { %>
            <% } %>
            <thead>
                <tr>
					<th>Nombre</th>
					<th>Email</th>
					<th>Fecha de registro</th>
					<th></th>
					<td><a href="#" class="btn btn-info">Registrar</a></td>
                </tr>
            </thead>
        </tbody>
        <tbody>
        <% } %>
        <tr>
			<td><%= usuario.getNombre() %></td>
			<td><%= usuario.getEmail() %></td>
			<td><%= usuario.getFecha_registro() %></td>
			<td><a href="#?id=<%= usuario.getId() %>" class="btn btn-warning">Editar</a></td>
			<td><a href="#?id=<%= usuario.getId() %>" class="btn btn-danger">Borrar</a></td>
        </tr>
        <% count++; %>
        <% } %>
        </tbody>
    </table>
    <ul class="pagination">
        <% int pages = count / 10 + 1; %>
        <li class="page-item"><a class="page-link" href="?pages=<%= pages %>"><%= pages %></a></li>
    </ul>
</div>