package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Pattern p=Pattern.compile(".@");
Matcher m=p.matcher("a");
boolean b=m.matches();
System.out.println(b);
sc.close();
	}

}
