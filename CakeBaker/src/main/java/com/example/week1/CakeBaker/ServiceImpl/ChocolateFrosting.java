package com.example.week1.CakeBaker.ServiceImpl;

import com.example.week1.CakeBaker.Service.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
@Qualifier("chocolateFrosting")
public class ChocolateFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "chocolate frosting";
    }
}
