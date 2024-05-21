package com.example.game.demo.game;

import com.example.game.demo.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println(" SupercontraGame up");
    }
    public void down(){
        System.out.println("SupercontraGame down");
    }
    public void right(){
        System.out.println("SupercontraGame right");
    }
    public void left(){
        System.out.println("SupercontraGame left");
    }
}
