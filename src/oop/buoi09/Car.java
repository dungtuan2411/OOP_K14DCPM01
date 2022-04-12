package oop.buoi09;

import oop.buoi09.animal.InterfaceName;

public class Car implements InterfaceName {
    // attribute của riêng Car
    private String name;

    // ghi đè những abstract của InterfaceNane
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
