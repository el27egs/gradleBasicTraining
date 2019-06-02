package web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.math3.primes.Primes;

@SuppressWarnings("serial")
@WebServlet("/primo")
public class PrimosServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String parametro = req.getParameter("numero");
		if (parametro == null || parametro.equals("")) {
			resp.getWriter().println("Especifique parametro numero");
		} else {
			int numero = Integer.valueOf(parametro);
			resp.getWriter().println("Es primo? " + Primes.isPrime(numero));
		}
	}

}
