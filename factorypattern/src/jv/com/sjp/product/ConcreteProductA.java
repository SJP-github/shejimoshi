package jv.com.sjp.product;

import jv.com.sjp.inter.Product;

/**
 * 具体的产品类A
 */
public class ConcreteProductA  implements Product {
    @Override
    public void method1() {
        System.out.println("implements ConcreteProductA's method1");
    }

    @Override
    public void method2() {
        System.out.println("implements ConcreteProductA's method2");
    }
}
