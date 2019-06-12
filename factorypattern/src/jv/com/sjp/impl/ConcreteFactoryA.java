package jv.com.sjp.impl;

import jv.com.sjp.inter.AbstractFactory;
import jv.com.sjp.inter.Product;
import jv.com.sjp.product.ConcreteProductA;

/**
 * 具体工厂A生产A产品
 */
public class ConcreteFactoryA implements AbstractFactory {

    public ConcreteFactoryA() {
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
