package com.example.week1.CakeBaker.ServiceImpl;


import com.example.week1.CakeBaker.Service.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
@Qualifier("chocolateSyrup")
public class ChocolateSyrup implements Syrup {
    @Override
    public String getSyrupType() { return "chocolate syrup";
    }
}