package com.xyz.oops.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<Integer> priorityQueue = new PriorityQueue();
		priorityQueue.add(10);
		priorityQueue.add(20);
		priorityQueue.add(30);
		priorityQueue.add(40);
		
		
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue);
	}
}
