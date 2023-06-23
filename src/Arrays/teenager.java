package Arrays;

public class teenager {
    public boolean isTeenager(int age) {
        if (age < 13 && age >18 ){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        teenager myobj = new teenager();
        boolean isTeenager = myobj.isTeenager(21);

        if(isTeenager){
            System.out.println("A teenager");
        }else {
            System.out.println("Not a teenager");
        }
    }
}
