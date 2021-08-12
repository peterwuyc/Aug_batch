package com.example.firstSpring.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.entity
 * @ClassName : studentBodyRequest.java
 * @createTime : 2021/8/10 15:25
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */

public class studentBodyRequest {
    private Integer id;
    private String name;
    private Integer age;

    public studentBodyRequest(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
