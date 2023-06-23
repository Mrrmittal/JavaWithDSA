package flowControl;
import java.util.*;


public class BuyProduct {
    int price;
   public void buyProduct() {
        System.out.println("Can buy products");
    }
    public boolean getApproval(int amount, int limit){
       if(amount<=limit){
           return true;
       }
       return false;
//        System.out.println("Need approval to but product");
    }
    public void dontBuyProduct(){
        System.out.println("Purchase hold");
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int price = sc.nextInt();
       int limit = sc.nextInt();
        BuyProduct buyProduct = new BuyProduct();

        if(buyProduct.getApproval(price,limit)){
            buyProduct.buyProduct();
        }else{
            buyProduct.dontBuyProduct();
        }
    }
}
