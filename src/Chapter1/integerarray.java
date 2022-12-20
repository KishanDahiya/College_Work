package Chapter1;

import java.util.*;

public class integerarray {
	
	public static <T> int indexOfInteger(T[] array,T object) {
		for(int i=0;i<array.length;i++) {
			if(object.equals(array[i])){
				return i;
			}
		}
		return -1;
	}
	
	public static <T> void indexOfString(List<T> list,T object) {
		for(int i=0;i<list.size();i++) {
			if(object.equals(list.get(i))){
				System.out.println("Found String at "+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] IntArray= {1,2,3,4,5};
		String[] NameArray= {"I","Am","Kishan","Dahiya"};
		List<Integer> intLL= new LinkedList<Integer>(Arrays.asList(IntArray));
		List<String> strLL= new LinkedList<String>();
		
		Collections.addAll(intLL, IntArray);
		Collections.addAll(strLL, NameArray);
		
		//Searching Integer 
		int searchInt=1;
		int ind=indexOfInteger(IntArray,searchInt );
		System.out.println("Integer Found at "+ind);
		
		//Searching String
		String searchStr="Kishan";
		indexOfString(strLL, searchStr);


	}

}
