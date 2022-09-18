import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author cc
 * @date 2022年09月18日 13:48
 */
public class test {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "", 23, "男");
        List<Emp> emp1 = mapper.getEmp(emp);
        emp1.forEach(System.out::println);
    }


    @Test
    public void t3est13() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] Ee=new Integer[]{11,32};
        mapper.delete(Ee);
    }

    @Test
    public void test13(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(11, "小1", 23, "男");
        Emp emp1 = new Emp(1233, "小1", 23, "男");
        Emp emp2= new Emp(32, "小1", 23, "男");
        List<Emp> emps = Arrays.asList(emp, emp1, emp2);
        mapper.insert(emps);
    }
    }
