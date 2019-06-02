package web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simple.Utilidad;

@SuppressWarnings("serial")
@WebServlet("/primo")
public class PrimosServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Utilidad utilidad = new Utilidad();
		System.out.println(req.getServletContext().getInitParameter("app"));
		String parametro = req.getParameter("numero");
		if (parametro != null && !parametro.equals("")) {
			int numero = Integer.valueOf(parametro);
			req.setAttribute("siguiente", utilidad.siguientePrimo(numero));
			req.setAttribute("esPrimo", utilidad.esPrimo(numero));
		}
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
   

}
