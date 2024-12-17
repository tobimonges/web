package tm.crudempleado.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tm.crudempleado.modelo.dao.EmpleadoDAO;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "empleadoControlador", value = "/empleado-controlador")
public class EmpleadoControlador extends HttpServlet {

    private EmpleadoDAO empDAO = new EmpleadoDAO();
    private final String pagListar = "/vista/listar.jsp";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String accion = request.getParameter("accion");

        switch (accion) {
            case "listar":
                listar(request, response);
                break;
            default:
                throw new AssertionError();
        }

    }
    public void listar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String accion = request.getParameter("accion");

        request.setAttribute("empleado", empDAO.ListarTodos());
        request.getRequestDispatcher("/vista/listar.jsp").forward(request,response);
    }
}