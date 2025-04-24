<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
<html>
<head>
    <title>Live Score</title>
</head>
<body>
    <p>Live cricket score IND Vs AUS</p>
    <p id="score">Waiting for updates...</p>
    
        <script type="text/javascript">
        var socket = new WebSocket("ws://localhost:8080/myapp/cricketScore");

        socket.onmessage = function(event) {
            document.getElementById("score").innerText = event.data;
        };
    </script>
</body>
</html>
