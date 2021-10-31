import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet" ,urlPatterns = {"/list"})
public class CustomerServlet extends HttpServlet {
    List<Customer> customersList=new ArrayList<>();

    @Override
    public void init() throws ServletException {
        customersList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","img.img"));
        customersList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","img.img"));
        customersList.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định" ,"img.img"));
        customersList.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây","img.img"));
        customersList.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","img.img"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",customersList);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("home.jsp");
        requestDispatcher.forward(request,response);
    }
}
