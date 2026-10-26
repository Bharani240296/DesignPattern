package com.sp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {
    public static void main(String[] args) {
            Pen p=new PenAdapter();
            Assignment as=new Assignment();
            as.setP(p);
            as.writeAss("I am write to completed assignment");
    }
}
