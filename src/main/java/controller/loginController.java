package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.DBContext;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/login")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");

		if (action == null) {
			request.getRequestDispatcher("jsp/home.jsp").forward(request,
					response);
		} else if (action.equals("login")) {
			
			request.setAttribute("email", "");
			request.setAttribute("password", "");
			request.setAttribute("error", "");
			
			request.getRequestDispatcher("jsp/login.jsp").forward(request,
					response);
		} else if (action.equals("register")) {
			DBContext db = new DBContext();
			try {
				Connection 	conn = db.getConnection();
				Statement 	stmt = conn.createStatement();
				ResultSet	rs   = stmt.executeQuery("SELECT * FROM Account"); 
				while (rs.next()) {
	                System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
	                        + "  " + rs.getString(3));
	            }
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("jsp/register.jsp").forward(request,
					response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
