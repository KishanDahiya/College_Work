package Chapter1;
import java.util.ArrayList;

//Main Class
class practice<students> {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			student s1=new student("1RVCE21MC052","Kishan","MCA","RVCE");
			ArrayList<student> list1= new ArrayList<student>();
			list1.add(s1);
			s1.displayStudent();
			System.out.println("Type of element is "+s1.getClass().getName());

			
	}

}
