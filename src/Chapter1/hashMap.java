package Chapter1;

import java.util.*;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of states and capitals");
//		int no=sc.nextInt();
//		System.out.println("Enter the states and capitals");
		
		//Created HashMap Object
		Map<String,String> map1=new HashMap<>();
		
		map1.put("Karnataka","Bengaluru");
		map1.put("Telangana","Hyderabad");
		
		//Copying into another map object
		Map<String,String> map2=new HashMap<>();
		map2.putAll(map1);
		
		//Applying various methods on set
		
		System.out.println("Original Map 1 Data : "+map1);

		System.out.println("Copied Map 2 Data : "+map2);
		
		map1.remove("Karnataka");
		System.out.println("Map 1 Data after removing Bengaluru : "+map1);
				
		System.out.println("Size of Map 1: "+map1.size());
		
		System.out.println("Does Map 1 Contain Bengaluru? : "+map1.containsKey("Karnataka"));

		System.out.println("The Map 2 set is : "+map2.entrySet());
		System.out.println("The Map 2 Keys are : "+map2.keySet());
		System.out.println("The Map 2 Values are : "+map2.values());
		
		map1.putIfAbsent(null, "Panaji");
		System.out.println("Map 1 Data after adding(putIfAbsent) is : "+map1);


		
//		//Entering the Values
//		while(no-->9) {
//			map1.put(sc.next(), sc.next());
//		}
		
		

	}

}
