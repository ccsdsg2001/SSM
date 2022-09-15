import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author cc
 * @date 2022年09月15日 22:04
 */
public class setest {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User userByid = mapper.getUserByid(3);
        System.out.println(userByid);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(System.out::println);
    }

    @Test
    public void tes2t(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer userByid = mapper.getCount();
        System.out.println(userByid);

    }

    @Test
    public void tes21t(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userByIDTOmap = mapper.getUserByIDTOmap(3);
        System.out.println(userByIDTOmap);
    }

    @Test
    public void tes121t(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> userByIDTOmap = mapper.getUsermap();
        System.out.println(userByIDTOmap);
    }
}
