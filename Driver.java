package com.entech.challenge.queueUsingStack;

public class Driver {
public static void main(String[] args){
	MyQueue testQueue = new MyQueue();
	String a ="A";
	String b = "B";
	String c = "C";
	
	System.out.println("Entering Queue");
	testQueue.addBack(a);
	testQueue.addBack(b);
	testQueue.addBack(c);
	
	System.out.println("Testing Output");
	
	String x = (String) testQueue.removeFront();
	String y = (String) testQueue.removeFront();
	String z = (String) testQueue.removeFront();
	Object o = testQueue.removeFront();
	
	System.out.println("Should be A: " + x);
	System.out.println("Should be B: " + y);
	System.out.println("Should be C: " + z);
	System.out.println("Should be null: " + (o==null));
	
}
}
