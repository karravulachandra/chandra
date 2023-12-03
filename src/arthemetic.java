import java.sql.SQLOutput;
import java.util.Scanner;

public class arthemetic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int result;
        //addition
        result=a+b;
        System.out.println("addition"+result);
        result=a-b;
        System.out.println("subtraction"+result);
        result=a/b;
        System.out.println("division"+result);
        result=a*b;
        System.out.println("multiplication"+result);
        result=a%b;
        System.out.println("modulo"+result);
    }
}
