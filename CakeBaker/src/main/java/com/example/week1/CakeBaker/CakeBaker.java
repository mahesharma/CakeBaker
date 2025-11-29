package com.example.week1.CakeBaker;


import com.example.week1.CakeBaker.Service.Frosting;
import com.example.week1.CakeBaker.Service.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CakeBaker {
    @Autowired
    Map<String, Frosting> frostingMap = new HashMap<>();

    @Autowired
    Map<String, Syrup> syrupMap = new HashMap<>();

    void bakeCake(String frostingType, String syrupType) {
        String getFrosting;
        String getSyrup;
        if(frostingType.equals("CHOCOLATE")) {
            getFrosting = frostingMap.get("chocolateFrosting").getFrostingType();
        } else {
            getFrosting = frostingMap.get("strawberryFrosting").getFrostingType();
        }
        if (syrupType.equals("CHOCOLATE")) {
            getSyrup = syrupMap.get("chocolateSyrup").getSyrupType();
        } else {
            getSyrup = syrupMap.get("strawberrySyrup").getSyrupType();
        }
        System.out.println("Baking a cake with " + getFrosting + " and " + getSyrup);
    }
}


