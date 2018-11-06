package atj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double value = Double.parseDouble(request.getParameter("temp"));
		int operation = Integer.parseInt(request.getParameter("operation"));

		double result = 0;

		switch (operation) {
		case 1:
			request.setAttribute("resultTextBegin", value + "C = ");
			request.setAttribute("resultTextEnd", "F");
			result = (32 + (value * 9 / 5.0));
			break;
		case 2:
			request.setAttribute("resultTextBegin", value + "F = ");
			request.setAttribute("resultTextEnd", "C");
			result = ((value - 32) * 5 / 9.0);
			break;
		default:
			result = 0;
			break;
		}

		request.setAttribute("result", new Double(result));
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
