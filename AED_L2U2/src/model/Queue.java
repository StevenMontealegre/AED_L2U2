package model;

import java.util.ArrayList;

public class Queue<String> {
	
	private ArrayList<String> queue;
	
	public Queue()
	{
		queue = new ArrayList<String>();
	}
	
	public String dequeue()
	{
		String last = queue.get(size()-1);
		queue.remove(size()-1);
		return last;
	}
	
	public void enqueue(String element)
	{
		
		queue.add(0, element);
	}
	
	public String last()
	{
		return queue.get(size()-1);
	}
	
	public int size()
	{
		return queue.size();
	}

	
	
}
