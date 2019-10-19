package com.gemini;

public class FlyNoFly implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("Не умею я летать!");
    }

}
