package co.edu.unbosque.ciclo3demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class tv_Servlet
 */
@WebServlet("/tv_Servlet")
public class tv_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO test;
	DAO miDAO 						  = new DAO ();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tv_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	public void init() throws ServletException {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUserName = getServletContext().getInitParameter("jdbcUserName");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		System.out.println(jdbcURL);
		try {
			test = new DAO(jdbcURL, jdbcUserName, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
			try {	
			String usuario = request.getParameter("Usuario");
			String passw = request.getParameter("Contrasena");
			PrintWriter writer= response.getWriter();
		
			if (usuario!= null && passw!= null ) {
					if (usuario.equals("admininicial") && passw.equals("admin123456")) {
						response.sendRedirect("menu.jsp");
						//DAO daousuario=new DAO();
						//daousuario.crear();
						miDAO.adicionar();
					}else
						//response.sendRedirect("index.jsp");
						writer.println("Error usuario o contraseña ingresados");
			}
			writer.close();
			} catch (NullPointerException error) {
				System.out.println(error);
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
