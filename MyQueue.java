package com.entech.challenge.queueUsingStack;
 
public class MyQueue implements Queue {
	private MyStack myStack = new MyStack();
      // Your implementation here
	public Object removeFront(){
		if (!myStack.isEmpty()) {
		MyStack flippedStack = this.flipStack(myStack);
		Object front = flippedStack.pop();
		myStack = this.flipStack(flippedStack);
		return front;
		} else {
			return null;
		}
	}
	
	public void addBack(Object o ){
		myStack.push(o);
	}
	
	/**
	 * 
	 * @return MyStack flipped
	 */
	private MyStack flipStack(MyStack inStack){
		MyStack outStack = new MyStack();
		while (!inStack.isEmpty()){
			outStack.push(inStack.pop());
		}
		return outStack;
	}
}