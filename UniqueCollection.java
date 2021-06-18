package day1;
import java.util.*;
public class UniqueCollection {
	static Set<String> getCollection(String[] str){
		List<String> st = new ArrayList<>();
		Collections.addAll(st, str);
		Collections.sort(st);
		Set<String> s= new HashSet<>();
		s.addAll(st);
		return s;
	}
	public static void main(String[] args) {
		String[] str = {"gayatri","Harsha","Palak","Harsha"};
		System.out.println(getCollection(str));
	}
}
