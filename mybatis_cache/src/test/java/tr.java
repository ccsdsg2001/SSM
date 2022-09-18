import com.atguigu.mybatis.mapper.CacheMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author cc
 * @date 2022年09月18日 15:33
 */
public class tr {
    @Test
    public void te(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.get(1);
        sqlSession.clearCache();
        System.out.println(emp);
        Emp emp2 = mapper.get(1);
        System.out.println(emp2);
    }

    @Test
    public void t() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.get(1);
        System.out.println(emp);
        Emp emp2 = mapper.get(1);
        System.out.println(emp2);
    }
}
