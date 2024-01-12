package Inheritance;

class PassengerPlan extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("Passenger Plan fly with passenger");
    }

    public void carryPassenger() {
        System.out.println("Passenger plan carry passengers");
    }
}
