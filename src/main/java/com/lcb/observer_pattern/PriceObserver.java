package com.lcb.observer_pattern;

/**
 * @author lichangbao
 */
public class PriceObserver implements Observer {

    @Override
    public void update(AbstractObservable o, Object args) {
        if (args instanceof Double) {
            Double price = (Double) args;
            System.out.println("被观察者：" + o + ":" + "物品价格已改为" + price);
        }
    }
}
