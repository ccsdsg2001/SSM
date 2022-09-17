package mybatis.mapper;

import mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmp(@Param("deptid")Integer deptid);

    Dept getDpet(@Param("deptid")Integer deptid);

    Dept getone(@Param("deptid")Integer deptid);


}
