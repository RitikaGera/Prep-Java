import java.util.*;

class Car{
private String car_name;
private int car_id;
public Car(String name,int id)
{
	car_name=name;
	car_id=id;
}

public String getCarName()
{
	return car_name;
}
public int getId()
{
	return car_id;
}

public String toString()
{
	return "Car name is:"+car_name+"and car Id is :"+car_id;
}
}
public class GenericStack<T>{

	private ArrayList<T> stack=new ArrayList<T>();
	ListIterator lt = stack.listIterator();
	private int top=0;
	
	public int size()
	{
		return top;
	}
	
	public void push(T item)
	{
		stack.add(top++,item);
	}
	
	public T pop()
	{
		return stack.remove(--top);
	}
	
	public String toString()
	{
		String a="";
		System.out.println(lt.next());
		while(lt.hasNext())
			{

				Object b=(lt.next()).toString();
				a=a+b.toString();
			}
		System.out.println(a);
		return a;
	}

	public static void main(String args[])
	{
		GenericStack<Integer> s= new GenericStack<Integer>();
		s.push(10);
		s.push(199);
		s.push(100);
		//System.out.println(s);
		int i = s.pop ();
 	        System.out.println (""+ i);

		GenericStack<String> s1=new GenericStack<String>();
		s1.push("i am a string");
		s1.push("ijhjgju");
		String j = s1.pop ();
 	        System.out.println (j);

		GenericStack<Car> s3=new GenericStack<Car>();
		Car car=new Car("Audi ",1);
		Car car1=new Car("BMW ",2);
		System.out.println(car);

		s3.push(car);
		s3.push(car1);
		Car k=s3.pop();
		System.out.println(k);
		
			
	}


}
