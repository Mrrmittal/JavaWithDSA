package DemoPractice;

import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class Demo {
    public static void main(String[] args) {
        String a = new String("Jatin");
        String b = new String("Jatin");
        int hashCodeA = System.identityHashCode(a);
        int hashCodeB = System.identityHashCode(b);
        System.out.println(hashCodeA);
        System.out.println(hashCodeB);
////
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//
//        if(a.equals(b)){
//            System.out.println("equal");
////        }
//
//        String s = new String("JATIN");
//        String t = new String("JATIN");
//        System.out.println(System.identityHashCode(s));
//        System.out.println(System.identityHashCode(t));
//        System.out.println(s.hashCode());
//        System.out.println(t.hashCode());
//
//        String p = "Jatin";
//        String q = "Jatin";
//
//        if(p == q){
//            System.out.println("True");
//        }
//        if(s.equals(t)){
//            System.out.println("true");
//        }
        char[] pass = new char[]{
                'a','b','c'
        };
        String s = new String("abc");

        System.out.println(pass);
        System.out.println(s);

//        String c = "abc";
//        String d = "abc";
//        int hashCodeC = System.identityHashCode(c);
//        int hashCodeD = System.identityHashCode(d);
//
//
//        System.out.println(hashCodeC);
//        System.out.println(hashCodeD);

//        if(a==b){
//            System.out.println("equals");
//        }
//        else{
//            System.out.println("false");
//        }
//
//        Object obj = 5;
//        int num = 5;
//        System.out.println(System.identityHashCode(obj));
//        System.out.println(System.identityHashCode(num));
//        System.out.println(obj);
//
//        if(obj.equals(num)){
//            System.out.println("Equals");
//        }
//        else{
//            System.out.println("False");
//        }
//
//        Integer ab = new Integer(25);
//        Integer bc = new Integer(25);
//        System.out.println(System.identityHashCode(ab));
//        System.out.println(System.identityHashCode(bc));

//        String abc = "abc";
//        System.out.println(System.identityHashCode(abc));
//
//         String efg ="abc";
//        System.out.println(System.identityHashCode(efg));
//
//        if(abc==efg){
//            System.out.println("true");
//        }

//        Integer num = 25;
//        System.out.println(System.identityHashCode(num));
//        Integer num2 = 25;
//        num = 35;
//        System.out.println(System.identityHashCode(num2));
//        System.out.println(System.identityHashCode(num));
//
//
//        if(num==num2){
//            System.out.println("ok");
//        }
////
//
//        num+=5;
//        System.out.println(System.identityHashCode(num));

//        String abcd = new String("abc");
//        String efgh = new String("abc");
//
//        System.out.println(System.identityHashCode(abcd));
//        System.out.println(System.identityHashCode(efgh));
    }
}
