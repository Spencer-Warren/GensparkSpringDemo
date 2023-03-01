package org.example3;

import org.springframework.stereotype.Component;

@Component("snap")
public class SnapDragon implements Processor{
    public void processor() {
        System.out.println("SnapDragon 855 [5G] : Rs. 45,000");
    }
}
