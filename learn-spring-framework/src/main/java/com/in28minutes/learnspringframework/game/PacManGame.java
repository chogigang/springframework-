package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//여러 개의 매칭이 되는 빈 이 있고 스프링 프레임워크에게 하나를 고르게 하고 싶다면무언가 높은 우선권을 주고싶으면 사용하자

public class PacManGame implements GamingConsole {

        public  void up() {
            System.out.println("PacManGame up");
        }
        public  void down() {
        System.out.println("down");
    }
        public  void left() {
            System.out.println("left");
        }
    public  void right() {
        System.out.println("right");
    }
}
