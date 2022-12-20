package Chapter1;

public class generic<T> {
	
	T obj;
	generic(T obj){
		this.obj=obj;
	}
	
	T getObject() {
		return this.obj;
	};
	
	void showType() {
		System.out.println("Type of element is "+obj.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generic<Integer> obj1=new generic<Integer>(15);
		obj1.showType();
		int v=obj1.getObject();
		System.out.println(v);
		generic<String> obj2=new generic<String>("ABC");
		obj2.showType();
		System.out.println(obj2.getObject());
		
	
	}

}


//Jay Shah Version

//package Chapter1;
//
//import java.util.*;
//public class generic<T> {
//
//	T obj;
////	generic(T obj1){
////		this.obj=obj1;
////	}
//	void setObject(T obj1) {
//		this.obj=obj1;
//	}
//	
//	T getObject() {
//		return this.obj;
//	};
//	
//	void showType() {
//		System.out.println("Type of element is "+obj.getClass().getName());
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		generic<Integer> obj1=new generic<Integer>();
//		obj1.setObject(15);
//		obj1.showType();
//		int v=obj1.getObject();
//		System.out.println(v);
//		generic<String> obj2=new generic<String>();
//		obj2.setObject("ABC");
//		obj2.showType();
//		System.out.println(obj2.getObject());
//		Map <generic<Integer>,generic<String>> map1;
//	
//	}
//
//}
