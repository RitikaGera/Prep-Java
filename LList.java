import java.util.Scanner;

public class LList{

	private Node start;
	private Node end;
	private int size;

	public LList()
	{
	start=null;
	end=null;
	size=0;

	}

	public boolean isEmpty()
	{
	return start==null;
	}

	public int size()
	{
	return size;//else count elements of list(primitive)
	}

	public void insert(int pos, Object obj) {
	Node ptr=start;
	if(start==null)
	{
	start=new Node(obj,null);
	//obj.setLink(null); is wrong since you cant call method of class Node with obj, o=you have to make obj of type Node first
	size++;
	return;
	}
	if(pos==1)
	{
		Node newNode = new Node(obj,null);
		newNode.setLink(start);
                start = newNode;
		size++;
		return;
	}
	pos=pos-1;
	//System.out.println(""+size);
	for(int i=1;i<size;i++)
	{
	//ptr=ptr.getLink();
	//System.out.println("inside for");
	if(i==pos)
		{
		Node newNode=new Node(obj,null);
		newNode.setLink(ptr.getLink());
		ptr.setLink(newNode);
		size++;
		break;
		}
	ptr=ptr.getLink();
	//System.out.println("end of for");
	}
	//System.out.println("outside for");
	}

public void remove(int pos) {

Node ptr=start;
if(pos>size)
{
	System.out.println("position does not exist");
	return;
}
if(start==null)
{
	System.out.println("Empty List");
	return;
}

if(pos==1)
{
	//System.out.println(start.getLink());
	
	Node tmp=start.getLink();
	//System.out.println(tmp);
	//String yo=tmp.getData();
	//System.out.println(yo);
	start=tmp;
	size--;
	return;
}
for(int i=1;i<pos-1;i++)
	{
	ptr=ptr.getLink();
	}
Node tmp1=ptr.getLink();
ptr.setLink(tmp1.getLink());
size--;
}

public Node get(int pos) {
	Node ptr=start;
	if(pos>size)
	{
		return null;
	}
	for(int i=1;i<pos;i++)
	{
		ptr=ptr.getLink();
	}
return ptr;
}
	

public int find(Object obj) {
 Node ptr=start;

for(int i=1;i<=size;i++)
	{
		Node newNode=new Node(obj,null);
		//System.out.println("hi"+newNode.getData()+"hello"+ptr.getData());
		if((ptr.getData()).equals(newNode.getData()))
		{
			//System.out.println("node found at index"+i);
			return i; 
		}

		ptr=ptr.getLink();
	}
	return -1;
}

public void clear() {
	start=null;
	end=null;
	//System.out.println(start);
}

public void append(Object obj)
{
Node newNode= new Node(obj,null);
if(end==null)
{

	start=newNode;
	end=newNode;
	
	//newNode.setLink(null);
	size++;
	//System.out.println(end.getData());
	return;
}
	end.setLink(newNode);
	//newNode.setLink(null);
	end=newNode;
	//System.out.println(end.getData());
	size++;

}

public String toString() 
{
	
	Node ptr = start;
	String s = "";
	while(ptr != null){
		s = s+ptr.getData()+" ";
		ptr = ptr.getLink();
	}

	return s;

}

public static void main(String[] args){
LList bookList = new LList();

bookList.append("Harry Potter I");
System.out.println(bookList);
bookList.insert(1, "Hamlet");
System.out.println(bookList);
bookList.insert(1, "Cosmos");
System.out.println(bookList);
bookList.insert(1, "Java");
System.out.println(bookList);
bookList.remove(1);
System.out.println(bookList);
bookList.insert(1, "C++");
System.out.println(bookList);
bookList.insert(2, "LISP");//here
System.out.println(bookList);
bookList.insert(2, "Calvin & Hobbes");
System.out.println(bookList);
int pos = bookList.find("LISP");
System.out.println(""+pos);
bookList.remove(pos);
System.out.println("after removal of LISp"+bookList);
// autoboxing and unboxing
bookList.clear();
System.out.println("after clear"+bookList);
bookList.append(5);
bookList.append(1);
bookList.append(2);
bookList.append(3);
System.out.println(bookList);
pos = bookList.find(1);
System.out.println("found at position :"+pos);
bookList.remove(pos);
System.out.println(bookList);

}
}
