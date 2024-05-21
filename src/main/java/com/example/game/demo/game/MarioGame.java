package com.example.game.demo.game;

import com.example.game.demo.GamingConsole;
import org.springframework.stereotype.Component;


public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("down");
    }
    public void right(){
        System.out.println("right");
    }
    public void left(){
        System.out.println("left");
    }
}
