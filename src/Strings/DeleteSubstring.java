package Strings;

public class DeleteSubstring extends StringBuilders{
    public static void main(String[] args) {
        StringBuilder Age = new StringBuilder("27");
        System.out.println(Age);
        Age.delete(0, Age.length());
        System.out.println(Age);
    }
}
