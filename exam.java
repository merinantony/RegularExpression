package regularExpression;
import java.util.*;
public class exam {
	
	  public static void main(String [] args)
	  {
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int a[]=new int[n];
		  int sum=0;
		  int max=a[0];
		  int min=a[1];
		  int i;
		  for(i=0;i<n;i++)
		  {
		a[i]=s.nextInt();
	  }
		 for(i=0;i<n;i++)
		 {
			sum=sum+a[i]; 
	  }
		  System.out.println("Sum:"+sum);
		 for(i=0;i<n;i++)
		 {
			if(max<a[i])
			{
				max=a[i];
			}
		 }
				  System.out.println("Largest element:"+max);
	 for(i=0;i<n;i++)
		 {
			if(min>a[i])
			{
				min=a[i];
			}
			}
	 System.out.println("Smallest element:"+min);
s.close();
	  }
}