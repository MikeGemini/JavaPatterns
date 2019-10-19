package com.gemini;

import first_facing.ff_MallardDuck;
import first_facing.ff_RedheadDuck;
import first_facing.ff_RubberDuck;

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

        ff_RubberDuck rubberDuck = new ff_RubberDuck();
        rubberDuck.display();
        rubberDuck.fly();
    }
}
