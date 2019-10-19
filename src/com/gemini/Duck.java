package com.gemini;

public abstract class Duck {

    FlyingBehaviour flyingBehaviour;
    QuackBehaviour quackBehaviour;

    Duck() {

    }

    public abstract void display();

    void prepareFly() {
        flyingBehaviour.fly();
    }

    void prepareQuack() {
        quackBehaviour.quack();
    }

}
