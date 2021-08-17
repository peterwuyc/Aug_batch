package com.example.firstSpring.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.entity
 * @ClassName : TeacherRequestBody.java
 * @createTime : 2021/8/16 14:41
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */

//update
public class TeacherRequestBody {
    private Integer id;
    private String name;
    private MyClass myClass;

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

    public MyClass getMyClass() {
        return myClass;
    }

    public void setMyClass(MyClass myClass) {
        this.myClass = myClass;
    }
}
