package dsawithjava;

public class EqualTest {
    public static void main(String[] args) {
        Moof myObj = new Moof(7);
        Moof myObj2 = new Moof(7);
        if(myObj.equals(myObj2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equal");
        }
//        System.out.println(myObj==myObj2);
        System.out.println(myObj.hashcode());
        System.out.println(myObj2.hashcode());
    }
}
class Moof {
    public int number;
    Moof(int number){

        this.number = number;
    }
    public int getNumber(){

        return number;
    }

    @Override
    public boolean equals(Object Obj){
        Moof that = (Moof) Obj;
        if(that.number == this.number){
            return true;
        }
        return false;
        }
    public int hashcode() {
        return number*17;
    }
    }

