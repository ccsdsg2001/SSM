package mybatis.mapper;

import mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月16日 22:18
 */
public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empid") Integer empid);
    Emp getemp(@Param("empid") Integer empid);
    Emp getone(@Param("empid") Integer empid);

    List<Emp> gettwo(@Param("deptid")Integer deptid);
}
