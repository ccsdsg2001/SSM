package com.atguigu.spring.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * @author cc
 * @date 2022年09月19日 21:33
 */
public class Student implements person{
    private Integer sid;
    private String sname;
    private String[] hobbit;
    private Integer age;
    private String gender;
    private double score;
    private Clazz clazz;
    private Map<String,Teacher> teacherMap;


    public Student() {
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", hobbit=" + Arrays.toString(hobbit) +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", clazz=" + clazz +
                ", teacherMap=" + teacherMap +
                '}';
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String[] getHobbit() {
        return hobbit;
    }

    public void setHobbit(String[] hobbit) {
        this.hobbit = hobbit;
    }

    public Student(Integer sid, String sname, Integer age, String gender, double score, Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.score = score;
        this.clazz = clazz;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student(Integer sid, String sname, Integer age, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }
    public Student(Integer sid, String sname, Integer age, double score) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
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
}
