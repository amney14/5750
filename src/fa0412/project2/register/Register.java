package fa0412.project2.register;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		File file = new File("/Users/Amney/Documents/workspace/csc5750/src/fa0412/Register.html");
		
		BufferedReader reader = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<link rel='stylesheet' type='text/css' href= 'bootstrap.css' />");
		//out.println(file);
		try {
		    reader = new BufferedReader(new FileReader(file));
		    String text = null;

		    while ((text = reader.readLine()) != null) {
		        out.println(text);
		    }
		}catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		//Gathering content from text boxes to variables
		String first = request.getParameter("firstName");
		String last = request.getParameter("lastName");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String areaCode = request.getParameter("areaCode");
		String prefix = request.getParameter("prefix");
		String suffix = request.getParameter("suffix");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		
		if (first=="" || last =="" || email1=="" || email2=="" || areaCode == ""|| prefix == ""|| suffix == "" || password1=="" || password2==""){
			out.println("Please Fill out the whole form");
		}		
		else{
			//out.println(first);  
			out.println("Your Registered");
		}
    }

	}
