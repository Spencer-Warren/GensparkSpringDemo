package org.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    @Autowired
    @Qualifier("snap")
    private Processor cpu;

    public void config() {
        System.out.println("Nokia 1100 [2G] : Rs. 1,500");
        cpu.processor();
    }


}
