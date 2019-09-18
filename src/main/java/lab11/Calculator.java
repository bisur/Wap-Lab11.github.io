package lab11;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="simple_Calculator",urlPatterns = "/DemoServer")

public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1=req.getParameter("num1");
        String num2=req.getParameter("num2");
        String prd1=req.getParameter("prd1");
        String prd2=req.getParameter("prd2");
        PrintWriter out = resp.getWriter();
        int sum = 0;
        if (num1!="" && num2!="") {
            sum = Integer.valueOf(num1) + Integer.valueOf(num2);
        }

        out.println(num1 + "+" + num2 + "=" + sum + "");

        int product = 0;
        if (prd1!="" && prd2!="") {
            product = Integer.valueOf(prd1) *Integer.valueOf(prd2);
        }

        out.println(prd1 + "*" + prd2 + "=" + product + "");
    }


}
