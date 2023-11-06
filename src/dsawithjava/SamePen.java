package dsawithjava;

public class SamePen{
    public static void main(String[] args) {
        Pens pen1 = new Pens();
        Pens pen2 = new Pens();
        pen1.setBrand("Goldex");
        pen1.setPrice(20);
        pen2.setBrand("Goldex");
        pen2.setPrice(20);
        if(pen1.equals(pen2)){
            System.out.println("Equals");
        }else{
            System.out.println("Different Pen");
        }

        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());
    }

}
class Pens {
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object Obj) {
        if ((Obj instanceof Pens)) {
            Pens that = (Pens) Obj;
            return (this.brand == that.brand && this.price == that.price);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return 31*price;
    }
}

