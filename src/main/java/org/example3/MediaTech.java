package org.example3;

import org.springframework.stereotype.Component;

@Component
public class MediaTech implements Processor{
    public void processor() {
        System.out.println("MediaTech MT6753 [4G] : Rs. 15,000");
    }
}
