package com.swjd.pojo;

public class User {
    private int id;
    private String stuName;
    private String stuAge;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuAge='" + stuAge + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }
}
