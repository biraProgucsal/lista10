package Controller;

import Model.OperacoesMatematicas;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Controller/CalculoServlet")
public class CalculoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            int numero1 = Integer.parseInt(request.getParameter("numero1"));
            int numero2 = Integer.parseInt(request.getParameter("numero2"));
            int numero3 = Integer.parseInt(request.getParameter("numero3"));
            
            OperacoesMatematicas op = new OperacoesMatematicas(numero1, numero2, numero3);
            
            out.println("<h1>Resultados:</h1>");
            out.println("<p>Soma: " + op.soma() + "</p>");
            out.println("<p>Subtração: " + op.subtracao() + "</p>");
            out.println("<p>Multiplicação: " + op.multiplicacao() + "</p>");
            out.println("<p>Divisão: " + op.divisao() + "</p>");
            out.println("<p>Resto da Divisão: " + op.restoDivisao() + "</p>");
        } finally {
            out.close();
        }
    }
}
