package com.example.testapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Counter {

    public int count;
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment(){
        count++;
    }

}
