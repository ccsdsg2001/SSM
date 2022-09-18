import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月18日 19:24
 */
public class test {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNameEqualTo("张三");
        empExample.or().andGenderEqualTo("男");
        List<Emp> emps = mapper.selectByExample(empExample);
        emps.forEach(System.out::println);
        Emp emp1 = new Emp(1, "陈", 12, "男");
//        mapper.updateByPrimaryKey(emp1);
        mapper.updateByPrimaryKeySelective(emp1);

    }
}
