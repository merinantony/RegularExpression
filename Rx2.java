package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
Pattern pattern = Pattern.compile(regex);
System.out.println("Enter the Email id:");
String email=sc.next();
Matcher em=pattern.matcher(email);
System.out.println("Enter the password");
String password=sc.next();
Matcher mtch=pswNamePtrn.matcher(password);
if(em.matches())
{
	System.out.println("Valid Email id");
	}
else
{
	System.out.println("Invalid Email Id");
	
}
if(mtch.matches())
{
	System.out.println("Valid password");
}
else
{
	System.out.println("invalid password");
}
sc.close();
	}

}
