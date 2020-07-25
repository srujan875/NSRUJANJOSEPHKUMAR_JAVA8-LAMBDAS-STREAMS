package LamdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.List;

public class Average 
{
	public static double averageList(List<Integer> list)
	{
	return list.stream().mapToDouble(i ->  (double) i).average().getAsDouble();
		
	}
    public static void main( String[] args )
    {
       List<Integer>list=new ArrayList<Integer>(Arrays.asList(123,154,96,48,20,15,35,78,12,56,24));
     System.out.println(averageList(list));
    }
}
