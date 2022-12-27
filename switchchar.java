import java.util.*;
class switchchar{
public static void main(String args[]){
Scanner n=new Scanner(System.in);
char a=n.next().charAt(0);
switch(a){
 	case 'a': System.out.println("hello");
		  break;
	case 'e': System.out.println("hey guys");
		 break;
	case 'i': System.out.println("Hey man");
		 break;
	case 'o': System.out.println("Esha");
		break;
	case 'u': System.out.println("chandra");
		break;
	default: System.out.println("Consonants");
		break;
}
}
}

       