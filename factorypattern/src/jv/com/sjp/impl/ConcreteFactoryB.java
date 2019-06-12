package jv.com.sjp.impl;

import jv.com.sjp.inter.AbstractFactory;
import jv.com.sjp.inter.Product;
import jv.com.sjp.product.ConcreteProductB;

/**
 * 具体工厂B:生产B产品
 */
public class ConcreteFactoryB implements AbstractFactory {

    public ConcreteFactoryB() {
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
