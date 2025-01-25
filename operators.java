import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number A: ");
        int a=sc.nextInt();
        System.out.println("enter another number B: ");
        int b=sc.nextInt();
        int c;
        System.out.println("addition of two numbers: "+(c=a+b));
        System.out.println("subtraction of two numbers: "+(c=a-b));
        System.out.println("multiplication of two numbers: "+(c=a*b));
        System.out.println("division of two numbers: "+(c=a/b));
    }
}