package com.xyz.oops.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		
		//Storage tech is FIFO
		Queue<Integer> priorityQueue = new PriorityQueue();
		priorityQueue.add(10);
		priorityQueue.add(20);
		priorityQueue.add(30);
		priorityQueue.add(40);
	
	
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		
		
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		arrayDeque.add(10);
		arrayDeque.add(20);
		
		System.out.println(arrayDeque);//10 20
		
		arrayDeque.addFirst(1);
		System.out.println(arrayDeque);
		arrayDeque.addLast(30);
		System.out.println(arrayDeque);
		
		System.out.println(arrayDeque.poll());
		System.out.println(arrayDeque);
	}
}
