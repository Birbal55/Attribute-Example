import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ABCServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> sessionNames = new ArrayList<String>();
		for(int i = 0; i < 12; i++) {
			names.add("Name " + i);
			sessionNames.add("Session - Names " + i);
		}
		req.setAttribute("names",names );
		session.setAttribute("session-names",sessionNames);
		req.getRequestDispatcher("abc.jsp").forward(req, resp);		
	}

}
