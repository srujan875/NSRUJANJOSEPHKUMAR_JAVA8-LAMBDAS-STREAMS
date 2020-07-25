package LamdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperations {

	public static List stringFilter(List<String> sample)
	{
		return  sample.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
	}
	public static void main(String args[])
	{
		List<String>list1=Arrays.asList("aaba","aab","abc","bca","aaa","bcd","azs");
		List<String>list2=stringFilter(list1);
	    list2.forEach(System.out::println);	
	}
}
