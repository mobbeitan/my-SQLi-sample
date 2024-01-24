import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogForgingExample extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        // Get user input from request
        String userInput = request.getParameter("userInput");

        // Vulnerable logging without sanitization
        System.out.println("User input: " + userInput);
    }
}
