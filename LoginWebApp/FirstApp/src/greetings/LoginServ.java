package greetings;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con;
	String url,user,password,driver;
	RequestDispatcher rd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		url=config.getInitParameter("url");
		user=config.getInitParameter("user");
		password=config.getInitParameter("password");
		driver=config.getInitParameter("driver");
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		String uid=request.getParameter("uid");
		String pass=request.getParameter("password");
		try
		{
			Statement stmt=con.createStatement();	
			ResultSet rs=stmt.executeQuery("SELECT password FROM login WHERE uid='"+uid+"'");
			
			if(rs.next())
			{
				if(pass.equals(rs.getString("password")))
				{
					rd=request.getRequestDispatcher("/success.jsp");
					rd.forward(request, response);
				}
				else
				{
					rd=request.getRequestDispatcher("/index.jsp");
					rd.include(request, response);
					out.println("Invalid password!");
				}
			}
			else
			{
				rd=request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
				out.println("Invalid user name!");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
