package p1;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWebClass
 */
public class HelloWebClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String uid, upass;
	Connection con=null;
	PreparedStatement stm=null;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWebClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in init");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helloweb","root","root");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<h1> Welcome</h1>");
		String uid = request.getParameter("id");
		String upass = request.getParameter("pass");
		String resp="<h2>Your uid is </h2>";
		resp+=uid + "<h2>and your upass is </h2> ";
		resp+=upass;
		out.println(resp);
		Statement stm;
		String dbUser,dbPass;
		out.println("after  stm");
		try {
			 
			stm = con.createStatement();
							out.println("after setstring");
			ResultSet rs= stm.executeQuery("SELECT * FROM user");
							out.println("after executequery");
			
			while(rs.next())
			{
				dbUser = rs.getString(1);
				dbPass=rs.getString(2);
				if(upass.equals(dbPass)&&uid.equals(dbUser))
				{
					out.println("welcome... connected");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
