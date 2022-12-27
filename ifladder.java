import java.lang.*;
class ifladder{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a==1){
      System.out.println("Monday");
    }
    else if(a==2){
      System.out.println("Tuesday");
    }else if(a==3){
      System.out.println("wednsday");
    }else if(a==4){
      System.out.println("Thursday");
    } else if(a==5){
      System.out.println("Friday");
    }else if(a==6){
      System.out.println("Saturday");
    }else{
      System.out.println("Sunday");
    }
  }
}
