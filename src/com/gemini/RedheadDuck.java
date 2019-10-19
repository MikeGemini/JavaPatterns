package com.gemini;

public class RedheadDuck extends Duck {

    void RedheadDuck() {
        flyingBehaviour = new FlyWithWings();
        quackBehaviour = new Squize();
    }

    public void display() {

    }
}
