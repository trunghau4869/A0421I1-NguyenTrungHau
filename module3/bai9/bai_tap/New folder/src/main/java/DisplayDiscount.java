import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayDiscount ", value = "/productDiscountCalculator")
public class DisplayDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ProductDescription = request.getParameter("ProductDescription");
        float ListPrice = Float.parseFloat(request.getParameter("ListPrice"));

        int DiscountPercent = Integer.parseInt(request.getParameter("DiscountPercent"));
        PrintWriter writer = response.getWriter();
        double DiscountAmount = ListPrice * DiscountPercent * 0.01;
        double DiscountPrice = ListPrice - DiscountAmount;
        writer.println("<html>");

        writer.println("<h1>Product Description:  " + ProductDescription + "</h1>"+"</br>");
        writer.println("<h2>Discount Amount:  " + DiscountAmount + "</h2>"+"</br>");
        writer.println("<h2>Discount Price: " + DiscountPrice + "</h2>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
