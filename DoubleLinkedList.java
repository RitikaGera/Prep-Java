//Double Linked List
import java.util.Scanner;

class Node{
	private Object data;
	private Node forward;
	private Node backward;
	
	public Node()
	{
		data=0;
		forward=null;
		backward=null;
	}
	
	public Node(Object d,Node f,Node b)
	{
		data=d;
		forward=f;
		backward=b;
	}
	
	public void setFLink(Node n)
	{
		forward=n;
	}
	
	public void setBLink(Node n)
	{
		backward=n;
	}

	
	public void setData(Object d)
	{
		data=d;
	}
	
	public Node getFLink()
	{
	return forward;
	}
	
	public Node getBLink()
	{
	return backward;
	}

	public String getData()//yahan
	{
	return data.toString();
	}

}

public class DoubleLinkedList{

	private Node start;
	private Node end;
	private int size;

	public DoubleLinkedList()
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
	Node newNode=new Node(obj,null,null);
	if(start==null)
	{
		start=newNode;
		start.setFLink(null);
		start.setBLink(null);
		size++;
		return;
	}
	if(pos==1 && start!=null)
	{
		newNode.setFLink(start);
		newNode.setBLink(null);
		start.setBLink(newNode);
		start=newNode;
		size++;
		return;
	}
	pos=pos-1;
	for(int i=1;i<size;i++)
	{
	
	if(i==pos)
		{
		Node tmp=ptr.getFLink();
		tmp.setBLink(newNode);
		newNode.setFLink(tmp);
		newNode.setBLink(ptr);
		ptr.setFLink(newNode);
		size++;
		break;
		}
	ptr=ptr.getFLink();
	}
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

if(start.getFLink()==null)
{
	start=null;
	end=null;
	return;
}

if(pos==1)
{
	Node tmp=start.getFLink();
	tmp.setBLink(null);
	start=tmp;
	size--;
	return;
}

for(int i=1;i<pos-1;i++)
{
		ptr=ptr.getFLink();
}

Node tmp=ptr.getFLink();
Node tmp1=tmp.getFLink();
ptr.setFLink(tmp1);
if(tmp1!=null)
{
	tmp1.setBLink(ptr);
}
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
		ptr=ptr.getFLink();
	}
return ptr;
}
	

public int find(Object obj) {
 Node ptr=start;
Node newNode=new Node(obj,null,null);
for(int i=1;i<=size;i++)
	{
		if(ptr.getData().equals(newNode.getData()))
		{
			return i; 
		}

ptr=ptr.getFLink();
	}
	return -1;
}

public void clear() {
	//System.out.println("inside clear");
	start=null;
	end=null;
	//System.out.println(""+start);
}

public void append(Object obj)
{
	Node newNode=new Node(obj,null,null);
if(end==null)
{

	start=newNode;
	end=newNode;
	newNode.setFLink(null);
	newNode.setBLink(null);
	size++;
	return;
}
	end.setFLink(newNode);
	newNode.setBLink(end);
	newNode.setFLink(null);
	end=newNode;
	size++;
}

public String toString() 
{
	//System.out.println(""+start);
	Node ptr = start;
	String s = "";
	while(ptr != null){
		s = s+ptr.getData()+" ";
		ptr = ptr.getFLink();
	}

	return s;

}

public static void main(String[] args){
DoubleLinkedList bookList = new DoubleLinkedList();
bookList.append(1);
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

