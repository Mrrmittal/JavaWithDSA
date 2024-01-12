package Inheritance;

class CargoPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("CargoPlane fly with Goods");
    }

    public void carryGoods() {
        System.out.println("Cargo plane carry Goods");
    }
}
