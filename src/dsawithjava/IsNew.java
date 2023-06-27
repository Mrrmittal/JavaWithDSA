package dsawithjava;

public class IsNew {
    public boolean check(int est){
        if(est>2000){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        IsNew myObj = new IsNew();
        boolean check = myObj.check(2005);
        if(check){
            System.out.println("New");
        }else{
            System.out.println("O");
        }
    }
}
