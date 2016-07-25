import java.util.*;

public class StackWithInheritance extends LList{

private int top;

public StackWithInheritance(){
	super();
	top=-1;
}

void push(Object obj){

	append(Object obj);

}

public static void main (String []args){

StackWithInheritance stack=new StackWithInheritance();
//stack.append("ist object string");
stack.push(1);
stack.append("hi");
stack.remove(top);
}
}
