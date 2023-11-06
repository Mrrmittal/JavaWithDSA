package dsawithjava;

public class SameCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = new Car();
        myCar.setBrandName("BMW");
        myCar.setModelName("Q7");
        myCar2.setBrandName("Audi");
        myCar2.setModelName("Q7");
        if(myCar.equals(myCar2)){
            System.out.println("Both are same Car");
        }else{
            System.out.println("Different Car");
        }
        System.out.println(myCar.hashCode());
        System.out.println(myCar2.hashCode());
    }

}
class Car {
    private String brandName;
    private String modelName;

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Car)) {
            Car that = (Car) obj;
            return (this.brandName == that.brandName && this.modelName == that.modelName);


        }
        return false;
    }
//    @Override
//    public int hashCode(){
//        return  hashCode();
//    }
}