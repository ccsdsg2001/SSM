import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cc
 * @date 2022年09月15日 19:06
 */
public class test {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User admin = mapper.getUserByUsername("admin");
        System.out.println(admin);
    }

    @Test
    public void test32(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User admin = mapper.checkLogin("admin", "123456");
        System.out.println(admin);
    }


    @Test
    public void tes2t32(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map =new HashMap<>();
        map.put("username", "admin");
        map.put("password", "123456");
        User admin = mapper.checkLoginBymap(map);
        System.out.println(admin);
    }


    @Test
    public void inser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(2, "csa", "2313", 23, "男", "123123@qq.com");
        mapper.inseruser(user);
    }

    @Test
    public void test322(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User admin = mapper.checkLoginByParam("admin", "123456");
        System.out.println(admin);
    }

}
