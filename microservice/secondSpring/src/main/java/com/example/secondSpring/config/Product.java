package com.example.secondSpring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;

//@Bean
@Component
@PropertySource(value={"classpath:product.properties"})
//@ImportResource() //xml bean
public class Product {

    //---------------------------------------------------------------------------------
    // 8.17 配置文件
    //--------------------------------------------------------------------------------
    @Value("product.name")
    private String name;
    //@Value("product.price")
    @Value(value="#{5*4}") //初始化值
    private Integer price;
    @Value("product.imageUrl")
    private String imageUrl;
    @Value("true") //默认值
    private boolean soldOut;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", soldOut=" + soldOut +
                '}';
    }
}
