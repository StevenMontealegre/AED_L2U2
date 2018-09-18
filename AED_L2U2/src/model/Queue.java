package model;

import java.util.ArrayList;

public class Queue<T> {
	
	private ArrayList<T> queue;
	
	public Queue()
	{
		queue = new ArrayList<T>();
	}
	
	public T dequeue()
	{
		T last = queue.get(queue.size()-1);
		return last;
	}
	
	public void enqueue(T element)
	{
		queue.add(0, element);
	}
	
	public int size()
	{
		return queue.size();
	}

	
	
}
