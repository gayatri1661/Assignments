package day1;

import java.util.HashMap;
import java.util.Set;

public class Mapmanager {
	static Set getKeys(HashMap<Integer,String> map)
	{
		Set keyset=map.keySet();
		return keyset;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"gayatri");  
		   map.put(2,"monica");    
		   map.put(3,"indu");   
		   map.put(4,"chatu"); 
		   System.out.println(getKeys(map));

	}

}
