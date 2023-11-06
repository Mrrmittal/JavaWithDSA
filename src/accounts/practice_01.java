package accounts;
// practice for constructor randomly
public class practice_01 {
    public String shape;
    public int radius;
    public String brand;
    public String taste;


    practice_01(String shape, int radius, String brand , String taste){
        this.shape = shape;
        this.radius = radius;
        this.brand = brand;
        this.taste = taste;

    }
    public static void main(String[] args) {
        practice_01 myObj = new practice_01("Round", 2 , "Monaco", "Sweet And Salty");

    }
}
