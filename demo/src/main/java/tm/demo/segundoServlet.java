package tm.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "segundoServlet", value = "/segundo-servlet")
public class segundoServlet extends HttpServlet {
    private String texto;

    @Override
    public void init() {
        texto = "mensaje desde el segundo servlet";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + texto + "</h1>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {

    }
}
