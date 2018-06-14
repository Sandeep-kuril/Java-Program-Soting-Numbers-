import java.util.*;
import java.util.Arrays;
public class Test {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter number of size:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
		        int arry[]=new int[n];
		        for( i=0;i<n;i++)
		        {
		        	arry[i]=sc.nextInt();
		        }
		      
		        Arrays.sort(arry);
		        String sort=Arrays.toString(arry);
		        System.out.println(sort);
        
	}

}
