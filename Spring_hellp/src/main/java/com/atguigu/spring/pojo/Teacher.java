package com.atguigu.spring.pojo;

/**
 * @author cc
 * @date 2022年09月20日 17:04
 */
public class Teacher {
    private String tid;
    private String tname;

    public Teacher() {
    }

    public Teacher(String tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
