package com.gof;

import com.gof.facade.Facade;
import com.gof.singleton.SingletonEager;
import com.gof.singleton.SingletonLazy;
import com.gof.singleton.SingletonLazyHolder;
import com.gof.strategy.*;

public class Test {

    public static void main(String[] args) {
        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);

        Behavior normalBehavior = new NormalBehavior();
        Behavior defensiveBehavior = new DefensiveBehavior();
        Behavior aggressiveBehavior = new AggressiveBehavior();


        Robot robot = new Robot();

        robot.setBehavior(normalBehavior);
        robot.move();

        robot.setBehavior(defensiveBehavior);
        robot.move();

        robot.setBehavior(aggressiveBehavior);
        robot.move();

        Facade facade = new Facade();
        facade.migrate("John", "12345678");



    }

}
