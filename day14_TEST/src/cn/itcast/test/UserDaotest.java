package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.junit.Test;
import org.springframework.dao.support.DaoSupport;

/**
 * Created by 刘吉阳 on 2021/3/3.
 */
public class UserDaotest {

    @Test
    public void testlogin(){

        //创建一个用户表表实体类的对象
        User loginuser = new User();

        loginuser.setUsername("李琳");

        loginuser.setPassword("123");



        //创建一个操作表用户表实体类的对象
        UserDao dao = new UserDao();

        User user = dao.login(loginuser);

        System.out.println(user);


    }


}
