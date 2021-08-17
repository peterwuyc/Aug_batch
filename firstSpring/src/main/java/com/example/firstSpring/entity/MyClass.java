package com.example.firstSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.entity
 * @ClassName : MyClass.java
 * @createTime : 2021/8/16 14:13
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */
@Entity
@Table(name="my_class")
public class MyClass {
    @Id
    private Integer id;
    @Column(name="name")
    private String name;

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
}
