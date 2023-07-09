package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.accountCommand;
import model.accountCreateCommand;
import java.io.IOException;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public FrontController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        actionDo(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        actionDo(request, response);
    }

    private void actionDo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String viewPage = null;
        String uri = request.getRequestURI();
        System.out.println("uri : " + uri);

        String conPath = request.getContextPath();
        System.out.println("conPath : " + conPath);

        String command = uri.substring(conPath.length());
        System.out.println("command : " + command);

        if (command.equals("/account.do")) {
            System.out.println("account.do");
            accountCommand ac = new accountCreateCommand();
            ac.execute(request, response);
            viewPage = "success.jsp";
        } else {
            System.out.println("잘못된 command");
            viewPage = "error.jsp"; // 또는 다른 적절한 에러 페이지로 초기화
        }
        
        RequestDispatcher reqDpt = request.getRequestDispatcher(viewPage);
        reqDpt.forward(request, response);
    }
}
