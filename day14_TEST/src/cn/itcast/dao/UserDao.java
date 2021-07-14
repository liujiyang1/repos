package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.until.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by 刘吉阳 on 2021/3/3.
 *
 * 操作数据库中user表的类
 *
 */
public class UserDao {


    //声明JDBCTemplate对象共用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());


    /**
     * 登录方法
     *
     * @param loginUser 只有用户名密码
     * @return user包含用户全部数据
     *
     */


    public User login(User loginUser) {


        try {
            //编写sql
            String sql = "select * from user where username = ? and password = ?";
            //调用query方法
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(),loginUser.getPassword());

            return user;

        }catch (DataAccessException e){

        e.printStackTrace();

        return null;

        }


    }

}
