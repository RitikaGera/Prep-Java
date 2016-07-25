public class Node{
	private Object data;
	private Node link;
	
	public Node()
	{
	data=0;
	link=null;
	}
	
	public Node(Object d,Node l)
	{
	data=d;
	link=l;
	}
	
	public void setLink(Node n)
	{
	link=n;
	}
	
	public void setData(Object d)
	{
	data=d;
	}
	
	public Node getLink()
	{
	return link;
	}
	
	public String getData()
	{
	return data.toString();
	}

}
