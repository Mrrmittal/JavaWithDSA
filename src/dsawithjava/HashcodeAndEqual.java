package dsawithjava;

public class HashcodeAndEqual {
    public static void main(String[] args) {
        pen myPen1 = new pen(10, "Blue");
        pen myPen2= new pen(10, "Blue");
        System.out.println(myPen1 == myPen2);
        System.out.println(myPen1.equals(myPen2));
        System.out.println(myPen1.hashcode());
        System.out.println(myPen2.hashcode());

    }
}
    class pen{
        int price;
        String color;
        public pen(int price,String color){
            this.price = price;
            this.color = color;
        }

        @Override
        public boolean equals(Object o){
            pen that = (pen)o;
            boolean isEqual= this.price == that.price && this.color == that.color;
            return true;
        }

        public int hashcode(){
            return price * color.hashCode();
        }
    }

