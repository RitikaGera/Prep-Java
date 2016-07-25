import java.util.*;
public class PatternNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nos="0123456789";
		String nosrev="9876543210";
		int i=0;
		int spacess;
		String form;
		for(i=1;i<=10;i++)
		{
			//spacess=10+i;
			//form="%"+Integer.toString(spacess)+"s";
			//System.out.println(String.format(form,nos.substring(0,i)+nosrev.substring(10-i+1,10)));
			System.out.println(nos.substring(0,i)+nosrev.substring(10-i+1,10));
		}
	}

}
