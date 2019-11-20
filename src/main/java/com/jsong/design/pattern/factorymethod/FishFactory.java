package com.jsong.design.pattern.factorymethod;

/**
 * Function:
 *
 * @author jsong
 *         Date: 19/03/2018 15:21
 * @since JDK 1.8
 */
public class FishFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Fish() ;
    }
}
