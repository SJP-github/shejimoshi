package jv.com.sjp.product;

import jv.com.sjp.inter.Product;

/**
 * 具体的产品类B
 */
public class ConcreteProductB implements Product {
    @Override
    public void method1() {
        System.out.println("ConcreteProductB implements's method1()");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteProductB implements's method2()");
    }
}
