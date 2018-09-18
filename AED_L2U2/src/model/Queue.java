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
		System.out.println("size"+size());
		T last = queue.get(size()-1);
		queue.remove(size()-1);
		System.out.println("size"+size());

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
