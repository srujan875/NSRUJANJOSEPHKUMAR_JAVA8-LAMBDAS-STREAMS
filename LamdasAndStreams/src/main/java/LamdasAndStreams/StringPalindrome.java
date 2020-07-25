package LamdasAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@FunctionalInterface
interface Interf
{
	//Single abstract method of Fucntional Interface
	public List<String> palindrome(List<String> list);
}
public class StringPalindrome {

	public static List<String> isPalindrome(List<String> sample)
	{
		List<String> list=sample.stream().filter(s->s.equals(new StringBuffer(s).reverse().toString())).collect(Collectors.toList());
		return list;
	}
	public static void main(String args[])
	{
		List<String> list1=Arrays.asList("aba","appa","madam","abb","bba","ananana","apple","student","level","radar","light","epam","task","lamda");
	
		//Using the Static Reference of Functional Interface 
		Interf test=StringPalindrome::isPalindrome;
		List<String>list2=test.palindrome(list1);
		list2.stream().forEach(System.out::println);
		
	}
}
