package janatest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clas.jana;



public class testing {


	@Test
	public void pr_test() throws Exception {
		
		assertEquals(list(3,3),jana.generate(9));
			
	}

	 private ArrayList <Integer> list(Integer ... i) {
		// TODO Auto-generated method stub
		 ArrayList<Integer>j=new ArrayList<Integer>();
		 for(Integer x:i) {
		j.add(x);	 
		 }
		 
		 return j;
		 
	}

}
