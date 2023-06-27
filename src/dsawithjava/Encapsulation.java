package dsawithjava;

public class Encapsulation {
    public static void main(String[] args) {
        bottle myBottle = new bottle();
        myBottle.setCapacity(25);
        myBottle.setColor("Red");
        System.out.println("My bottle capacity is : " + myBottle.getCapacity());
        System.out.println("My bottle color is : " + myBottle.getColor());
    }
}

    class bottle{
        private int capacity;
        private String color;

        public void setCapacity(int capacity1){
            this.capacity = capacity1;
        }
        public int getCapacity(){
            return capacity;
        }

        public void setColor(String color1){
            this.color = color1;
        }
        public String getColor(){
            return color;
        }
    }

