package org.example.structure.decorator;

/**
 * @author winterfell
 */
public class Car implements ICar {

    @Override
    public void move() {
        System.out.println("车子普通的跑");
    }
}