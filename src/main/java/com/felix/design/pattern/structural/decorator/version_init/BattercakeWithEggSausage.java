package com.felix.design.pattern.structural.decorator.version_init;

/**
 * Created by lifei
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
