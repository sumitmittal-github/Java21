package com.sumit.java8.e_collection;

import com.sumit.java8.Book;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection3_PriorityQueue {

    public static void main(String[] args) {

        // Priority is Title of the books
        Comparator<Book> comparator1 = Comparator.comparing(book -> book.getTitle());

        Queue<Book> priorityQueue1 = new PriorityQueue<>(comparator1);
        priorityQueue1.offer(new Book("Java",   55.0));
        priorityQueue1.offer(new Book("Python", 23.0));
        priorityQueue1.offer(new Book("C++",    99.0));

        Iterator<Book> it1 = priorityQueue1.iterator();
        while(it1.hasNext())
            System.out.println(priorityQueue1.poll());

        System.out.println("==================================================");



        // Priority is Title of the books in reverse order
        Comparator<Book> comparator2 = Comparator.comparing(Book::getTitle).reversed();

        Queue<Book> priorityQueue2 = new PriorityQueue<>(comparator2);
        priorityQueue2.offer(new Book("Java",   55.0));
        priorityQueue2.offer(new Book("Python", 23.0));
        priorityQueue2.offer(new Book("C++",    99.0));

        Iterator<Book> it2 = priorityQueue2.iterator();
        while(it2.hasNext())
            System.out.println(priorityQueue2.poll());



        System.out.println("==================================================");



        // Priority is Price of the books
        Comparator<Book> comparator3 = Comparator.comparing(book -> book.getPrice());

        Queue<Book> priorityQueue3 = new PriorityQueue<>(comparator3);
        priorityQueue3.offer(new Book("Java",   55.0));
        priorityQueue3.offer(new Book("Python", 23.0));
        priorityQueue3.offer(new Book("C++",    99.0));

        Iterator<Book> it3 = priorityQueue3.iterator();
        while(it3.hasNext())
            System.out.println(priorityQueue3.poll());


    }

}