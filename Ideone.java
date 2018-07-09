import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=str.replaceAll(" ","");
		int len=str1.length();
		System.out.println(len);
	}
}
