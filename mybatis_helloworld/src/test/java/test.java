import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author cc
 * @date 2022年09月14日 18:39
 */
public class test {
    @Test
    public void testInsert() throws IOException {
        //获取核心配置文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SQLSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        //获取sql的会话对象SqlSession。是mybatis操作的数据库对象
        SqlSession sqlSession = build.openSession(true);//设置为true表示自动提交事务
        //获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用mapper接口方法，实现添加用户信息的功能
        int i = mapper.insertUser();
//        System.out.println(i);
//        int insert = sqlSession.insert("com.atguigu.mybatis.mapper.UserMapper.insertUser");
//        System.out.println(insert);
//        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void update(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }

    @Test
    public void delete(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }

    @Test
    public void query(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void queryAll(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.getAllUser();
        user.forEach(System.out::println);
    }


}
