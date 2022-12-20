package Chapter1;
import java.util.*;

//19 December 2022

public class Wild1 {
	
	//Function to print the Objects of unknown Collection
	void printCollection(Collection<?> c) {
		for(Object e:c) {
			System.out.println(e);
		}
		System.out.println("Type of elements is "+c.getClass().getName());
	}
	
	//method to calculate the sum, it accepts only List
	private static double sum(List<? extends Number> list) {
		double sum=0.0;
		for(Number i:list){
			sum+=i.intValue();
		}
		return sum;
	}
	
	//genertic method which takes everything and displays it
	private <T> void printlist(T obj) {
		System.out.println(obj);
	}
	
	//Method which takes list of any type of collection objects and displays,
	//it only takes Integer as it is the lower limit of it
		private <T> void print1(List<? super Integer> list) {
			System.out.println(list);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i1= {1,2,3,4,5};
		String[] s1= {"I","am","Kishan"};
		//Created the aArrayList and linkedList
		List<Integer> iList=new ArrayList<Integer>(Arrays.asList(i1));
		List<String> sList=new LinkedList<String>(Arrays.asList(s1));
		Wild1 w=new Wild1();
		
		student stud=new student("1RVCE21MC052","Kishan","MCA","RVCE");
		ArrayList<student> list1= new ArrayList<student>();
		list1.add(stud);
		
		w.printCollection(iList);
		w.printCollection(sList);
		w.printCollection(list1);
		//stud.displayStudent();
		
		List<Double> list2=Arrays.asList(4.1,3.6,8.9);
		System.out.println("Total sum is "+sum(list2));
		
		w.printlist(iList);
		
		Double[] d1= {1.7,2.9,3.4,4.4,5.2};
		//If we create the List with Number then the method regardless of its lower limit
		//( Ex : super Integer) will take all type of List objects passed to it.
		List<Number> dList=new ArrayList<Number>(Arrays.asList(d1));		
		w.print1(dList);
		
		
	}

}
