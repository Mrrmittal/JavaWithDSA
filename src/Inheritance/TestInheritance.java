package Inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        AeroPlane plane1 = new AeroPlane();
        CargoPlane plane2 = new CargoPlane();
        PassengerPlan plane3 = new PassengerPlan();
        AeroPlane plane4 = new CargoPlane();

        plane1.fly();
        plane1.takeOff();
        plane2.fly();
        plane2.takeOff();
        plane2.carryGoods();
        plane3.fly();
        plane3.takeOff();
        plane3.carryPassenger();
        plane4.fly();
    }
}
