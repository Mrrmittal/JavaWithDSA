package dsawithjava;

public class HashcodeAndEqual {
    public static void main(String[] args) {
        pen myPen1 = new pen(10, "Blue");
        pen myPen2= new pen(10, "Blue");
        System.out.println(myPen1 == myPen2);
        System.out.println(myPen1.equals(myPen2));
        System.out.println(myPen1.hashCode());
        System.out.println(myPen2.hashCode());

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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            pen pen = (pen) o;

            if (price != pen.price) return false;
            return color.equals(pen.color);
        }

        @Override
        public int hashCode() {
            int result = price;
            result = 31 * result + color.hashCode();
            return result;
        }

        //        @Override
//        public boolean equals(Object o){
//            if( o instanceof pen){
//                pen pen = (pen) o;
//                return (this.price == pen.price);
//            }
//            return false;
////            pen that = (pen)o;
////            boolean isEqual= this.price == that.price && this.color == that.color;
////            return true;
//        }



//        public int hashCode(){
//            return price *31 + color.hashCode();
//        }

        // red - 10 * 7 = 70
        // blue - 7 * 10 = 70
    }

