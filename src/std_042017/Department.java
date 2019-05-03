package std_042017;


import java.util.LinkedList;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	int counter=0;
	public StringQueue getQueue() {
		return queue;
	}
	public abstract String getName();
	public void addMessage(String msg) {
		counter++;
		queue.enqueue(msg);
	}
	public String nextMessage() {
		String nxtMsg="";
		
		try {
			nxtMsg= queue.peek();
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nxtMsg;
		
	}
	//implement
}