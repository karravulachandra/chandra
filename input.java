import java.util.*;
import java.lang.*;
class input{
  public static void main(String args[]){
    Scanner a=new Scanner(System.in);
    int b=a.nectInt();
    char c=a.next().charAt(0);
    double d=a.nextDouble();
    short s=a.nextShort();
    long l=a.nextLong();
    System.out.println("int "+b);
    System.out.println("char "+c);
    System.out.println("double "+d);
    System.out.println("short "+s);
    System.out.println("long "+l);
    a.close();
  }
}

    
