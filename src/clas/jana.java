package clas;


import java.util.ArrayList;

public class jana {

	public static Object generate(int i) {
		// TODO Auto-generated method stub
		int rem;
		ArrayList <Integer>li=new ArrayList<Integer>();
		
		for(int j=2;i>1;j++) {
			while(i%j==0 && i>0) {
				
				li.add(j);
				i=i/j;
			}
			
		}
		
			return li;
	
	}

}
