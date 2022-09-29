package com.atguigu.pojo;

/**
 * @author cc
 * @date 2022年09月29日 22:44
 */
public class emp {
    private Integer empId;
    private String empname;
    private Integer age;
    private String gender;
    private String email;

    public emp() {
    }

    public emp(Integer empId, String empname, Integer age, String gender, String email) {
        this.empId = empId;
        this.empname = empname;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public Integer getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "emp{" +
                "empId=" + empId +
                ", empname='" + empname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
