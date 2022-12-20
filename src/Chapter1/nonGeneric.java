package Chapter1;

public class nonGeneric {
	
	Object obj;
	nonGeneric(Object obj){
		this.obj=obj;
	}
	Object getObject() {
		return this.obj;
			}
	void showType() {
		System.out.println("Type of the element is "+obj.getClass().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonGeneric n1;
		n1=new nonGeneric(75);
		n1.showType();
		int v=(Integer)n1.getObject();
		System.out.println(v);

	}

}
