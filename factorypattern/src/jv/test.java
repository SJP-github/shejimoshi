package jv;

import jv.com.sjp.impl.ConcreteFactoryA;
import jv.com.sjp.inter.AbstractFactory;
import jv.com.sjp.inter.Product;
import jv.com.sjp.impl.ConcreteFactoryB;

public class test {
    public static void main(String[] args) {
        serviceFactory(new ConcreteFactoryA());
        serviceFactory(new ConcreteFactoryB());
    }

    public static void serviceFactory(AbstractFactory factory) {
        Product product = factory.createProduct();
        System.out.println(factory.getClass().getSimpleName()+"#"+product.getClass().getSimpleName());
        product.method1();
        product.method2();
    }
}
