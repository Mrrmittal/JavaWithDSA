package Main.ProblemSolvingPractice.ConditionalAndLoops;
// WAP to describe Kunti's Putra (Mahabharata) using Switch cases

import java.util.Scanner;

public class DescribeKuntiPutra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name of Maharathi out of 6 : ");
        String name = sc.nextLine();

        switch (name){
            case ("Karan") -> System.out.println("Greatest archer of all time. Also Knows as surya Putra");
            case ("Yudhistra") -> System.out.println("The king of Indraprastha");
            case ("Bheem") -> System.out.println("Second among the five Pandavas.");
            case ("Arjun") -> System.out.println("Arjuna was a key warrior from the Pandava side and killed many warriors.");
            case ("Nakul") -> System.out.println("Nakul was fourth of the five Pandava brothers");
            case ("Sehdev") -> System.out.println("Sehdev was fourth of the five Pandava brothers");
            default -> System.out.println("Please check before submit");
        }
    }
}
