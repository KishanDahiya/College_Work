package Chapter1;
public class ExtendNumber<T> {
	
	private T t;

	public void set(T t) {
		this.t=t;
	}
	
	public T get () {
		return t;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T : "+t.getClass().getName());
		System.out.println("U : "+u.getClass().getName());
		
	}
	
	@SuppressWarnings("removal") //Suppressed the warnings
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendNumber<Integer> obj=new ExtendNumber<Integer>();
		obj.set(new Integer(10));
		Integer value=obj.get();
		obj.inspect(value);
		obj.inspect(1.0F);
		obj.inspect(10.5);
		obj.inspect(15L);
		
		

	}

}
