package cn.itcast.web.Servlet;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 刘吉阳 on 2021/3/3.
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     //设置编码
        request.setCharacterEncoding("utf—8");
     //获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
    //封装user对象
        User user = new User();

        user.setUsername(username);

        user.setPassword(password);

    //调用UserDao的login方法
        UserDao userDao = new UserDao();

        User login = userDao.login(user);

    //判断user



    }
}
