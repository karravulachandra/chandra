
import java.util.*;
import java.lang.*;
import java.io.*;
class Tekken
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(a==0){
		       System.out.println("NO");
		   }
		   int m=min(b,c);
		   b=b-m;
		   c=c-m;
		   int x=max(b,c);
		   if(a>x){
		       System.out.println("YES");
		   }
		   else{
		       System.out.println("NO");
		   }
		   n--;
		}
	}
	public static int min(int x,int y){
	    return x<y?x:y;
	}
	public static int max(int x,int y){
	    return x>y?x:y;
	}
}
