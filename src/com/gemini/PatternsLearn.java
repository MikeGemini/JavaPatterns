package com.gemini;

import first_facing.ff_MallardDuck;
import first_facing.ff_RedheadDuck;

public class PatternsLearn {

    public static void main(String[] args) {
	    System.out.println("Hello!\n***");

        UsingFFClassesObjects();
    }

    private static void UsingFFClassesObjects() {
        ff_MallardDuck mallardDuck = new ff_MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();

        ff_RedheadDuck redheadDuck = new ff_RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
    }
}
