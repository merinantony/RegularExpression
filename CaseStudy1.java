package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//Name
String regex = "(^[A-Za-z]*$)";
Pattern pswNamePtrn = Pattern.compile("^[A-Za-z]*$\"");
Pattern pattern = Pattern.compile(regex);
System.out.println("Enter the name");
String name=sc.next();
Matcher em=pattern.matcher(name);

	//Email.id
String regex1 = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
Pattern pswNamePtrn1 = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
Pattern pattern1 = Pattern.compile(regex1);
System.out.println("Enter the Email id:");
String email=sc.next();
Matcher em1=pattern1.matcher(email);

//Reg No"^[0-9]*$"
String regex2 = "^[0-9]*$";
Pattern pswNamePtrn2 = Pattern.compile("^[0-9]*$");
Pattern pattern2 = Pattern.compile(regex2);
System.out.println("Enter the register no:");
String reg=sc.next();
Matcher em2=pattern2.matcher(reg);

//Rank
String regex3 = "^[0-9]";
Pattern pswNamePtrn3 = Pattern.compile("^[0-9]");
Pattern pattern3 = Pattern.compile(regex3);
System.out.println("Enter the rank:");
String rank=sc.next();
Matcher em3=pattern3.matcher(rank);

//Year
String regex4 = "^[0-9]";
Pattern pswNamePtrn4 = Pattern.compile("^[0-9][0-9][0-9][0-9]");
Pattern pattern4 = Pattern.compile(regex4);
System.out.println("Enter the year:");
String year=sc.next();
Matcher em4=pattern4.matcher(year);

//Dep
String regex5= "[A-Z][.][a-z]*";;
Pattern pswNamePtrn5 = Pattern.compile("[A-Z][.][a-z]*\"");
Pattern pattern5 = Pattern.compile(regex5);
System.out.println("Enter the dep");
String dep=sc.next();
Matcher em5=pattern5.matcher(dep);
//name
if(name.matches("^[A-Za-z]*$")) {
	System.out.println("Name :"+name);
}
else
{
	System.out.println("not valid");
}
//email.id

if(em1.matches())
{
	System.out.println("Email :"+email);
}
else
{
	System.out.println("invalid email id");
}
//regno
if(em2.matches())
{
	System.out.println(" reg.no :"+reg);
}
else
{
	System.out.println("invalid  reg.no");
}
//rank
if(em3.matches())
{
	System.out.println(" rank :"+rank);
}
else
{
	System.out.println("invalid  rank");
}
//year
if(em3.matches())
{
	System.out.println(" year :"+year);
}
else
{
	System.out.println("invalid  year");
}
//dep
if(dep.matches("[A-Z][.][a-z]*")) {
	System.out.println("department :"+dep);
}
else
{
	System.out.println(" invalid");
}
	}}
