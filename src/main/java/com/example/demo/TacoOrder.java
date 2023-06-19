package com.example.demo;

import com.example.demo.Taco;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:剑豪
 * @Date:2023/6/14
 * @VERSON:1.8
 */
@Data
public class TacoOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }


}
