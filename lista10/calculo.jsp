<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>Operações Matemáticas</title>
</head>
<body>
    <h2>Insira três números para calcular</h2>
    <form action="Controller/CalculoServlet" method="post">
        <label for="numero1">Número 1:</label>
        <input type="number" id="numero1" name="numero1" required><br><br>
        
        <label for="numero2">Número 2:</label>
        <input type="number" id="numero2" name="numero2" required><br><br>
        
        <label for="numero3">Número 3:</label>
        <input type="number" id="numero3" name="numero3" required><br><br>
        
        <input type="submit" value="Calcular">
    </form>
</body>
</html>
