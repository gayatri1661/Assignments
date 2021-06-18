package day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListManager1 {
	static List<String> getArrayList(String[] str)
	{
		List l1 = Arrays.asList(str);
		Collections.sort(l1);
		return l1;
	}
	public static void main(String[] args) {
		String[] str=new String[] {"Anita", "indu", "chatu","monica","harsha","gayatri"};
		System.out.println(getArrayList(str));

	}

}
