package com.example.week1.CakeBaker.ServiceImpl;


import com.example.week1.CakeBaker.Service.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
@Qualifier("strawberrySyrup")
public class StrawberrySyrup implements Syrup {
    @Override
    public String getSyrupType() { return "strawberry syrup";
    }
}