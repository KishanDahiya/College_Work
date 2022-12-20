package Chapter1;

class A{
	public void displayClass() {
		System.out.println("Inside Class A");
	}
}
class B extends A{
	public void displayClass() {
		System.out.println("Inside Class B");
	}
}

public class Bound<T extends A> {

	private T obj;
	public Bound(T obj) {
		this.obj=obj;
	}
	
	public void doRunTest() {
		this.obj.displayClass();
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bound<A> a1=new Bound<A>(new A());
		a1.doRunTest();
		
		Bound<B> b1=new Bound<B>(new B());
		b1.doRunTest();
		
	}

}
