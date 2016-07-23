package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	/*java.util.Queue<String>queue=new java.util.LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        while (queue.size()>0)
            System.out.println(queue.remove()+"");*/

        Deque<String>stack=new ArrayDeque<>();

        Deque<String>queue=new ArrayDeque<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while(!stack.isEmpty())
            System.out.println(stack.pop()+"");

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        while(!queue.isEmpty())
            System.out.println(queue.remove()+"");

    }
}
