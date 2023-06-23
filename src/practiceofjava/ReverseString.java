package practiceofjava;

public class ReverseString {
    public static void main(String[] args) {
          String name = "Jatin Mittal";
//        System.out.println("Input your String : ");
//        Scanner sc = new Scanner(System.in);
//        char name[] = sc.nextLine().toCharArray();
        System.out.println("Reverse will be : ");

        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
