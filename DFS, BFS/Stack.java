
public class Stack{
	private final int size = 20;
	private int[] st;
	private int top;
	
	public Stack(){
		st = new int[size];
		top = -1;
	}
	
	public void push(int i){
		st[++top] = i;
	}
	
	public int pop(){
		return st[top--];
	}
	
	public int peek(){
		return st[top];
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
}