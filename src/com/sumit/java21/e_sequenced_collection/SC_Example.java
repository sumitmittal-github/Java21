package com.sumit.java21.e_sequenced_collection;

import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.SequencedMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class SC_Example {
    
    public static void main(String[] args) {
        System.out.println("SequencedCollection");
        seqColl();

        System.out.println("SequencedSet");
        seqSet();

        System.out.println("SequencedMap");
        seqMap();
    }
    public static void seqColl(){
        // A sequenced collection is a Collection whose elements have a defined encounter order.
        SequencedCollection<String> seqColl = new ArrayList<>();

        seqColl.addFirst("A");			                            // A
        seqColl.addFirst("B");			                            // B, A
        seqColl.addLast("C");			                            // B, A, C
        seqColl.addLast("D");			                            // B, A, C, D
        seqColl.addLast("D");			                            // B, A, C, D, D
        System.out.println(seqColl);  	                                // B, A, C, D, D
        System.out.println("getFirst() : "+seqColl.getFirst());  		// B
        System.out.println("getLast() : "+seqColl.getLast());  			// D
        System.out.println("removeFirst() : "+seqColl.removeFirst());  	// B - [A, C, D, D]
        System.out.println("removeLast() : "+seqColl.removeLast());  	// D - [A, C, D]
        System.out.println(seqColl);  	                                // A, C, D

        // front to last
        System.out.println("Forwards...");  	                        // A, C, D
        for(String s:seqColl){
            System.out.println(s);
        }
        // reverse order
        System.out.println("Backwards...");  	                        // D, C, A
        for(String s:seqColl.reversed()){
            System.out.println(s);
        }

    }
    public static void seqSet(){
        // A sequenced set is a SequencedCollection with no duplicate elements.
        SequencedSet<String> seqSet = new LinkedHashSet<>();
        seqSet.addFirst("A");			                            // A
        seqSet.addFirst("B");			                            // B, A
        seqSet.addLast("C");			                                // B, A, C
        seqSet.addLast("D");			                                // B, A, C, D
        seqSet.addLast("D");			                                // B, A, C, D
        System.out.println(seqSet);  	                                // B, A, C, D
        System.out.println("getFirst() : "+seqSet.getFirst());  	    // B
        System.out.println("getLast() : "+seqSet.getLast());  		    // D
        System.out.println("removeFirst() : "+seqSet.removeFirst());    // B - [A, C, D]
        System.out.println("removeLast() : "+seqSet.removeLast());      // D - [A, C]
        System.out.println(seqSet);  	                                // A, C

        // front to last
        System.out.println("Forwards...");  	                        // A, C
        for(String s:seqSet){
            System.out.println(s);
        }
        // reverse order
        System.out.println("Backwards...");  	                        // C, A
        for(String s:seqSet.reversed()){
            System.out.println(s);
        }
    }
    public static void seqMap() {
        // A sequenced map is a Map whose entries have a defined encounter order.
        SequencedMap<Integer, String> seqMap = new LinkedHashMap<>();

        seqMap.putFirst(1, "Lokesh");                                     // 1=Lokesh
        seqMap.putFirst(2, "Sumit");                                      // 2=Sumit, 1=Lokesh
        seqMap.putLast(3, "Janvi");                                       // 2=Sumit, 1=Lokesh, 3=Janvi
        seqMap.putLast(4, "Aarvi");                                       // 2=Sumit, 1=Lokesh, 3=Janvi, 4=Aarvi
        System.out.println(seqMap);                                             // {2=Sumit, 1=Lokesh, 3=Janvi, 4=Aarvi}
        System.out.println("firstEntry() : " + seqMap.firstEntry());            // 2=Sumit
        System.out.println("lastEntry() : " + seqMap.lastEntry());              // 4=Aarvi
        System.out.println("pollFirstEntry() : " + seqMap.pollFirstEntry());    // 2=Sumit
        System.out.println("pollLastEntry() :" + seqMap.pollLastEntry());       // 4=Aarvi
        System.out.println(seqMap);                                             // {1=Lokesh, 3=Janvi}

        // front to last
        System.out.println("Forwards...");                                      // {1=Lokesh, 3=Janvi}
        for (Map.Entry<Integer, String> entry : seqMap.entrySet()) {
            System.out.println(entry.getKey() + "; " + entry.getValue());
        }
        // reverse order
        System.out.println("Backwards...");                                     // 3=Janvi, 1=Lokesh
        for (Map.Entry<Integer, String> entry : seqMap.reversed().entrySet()) {
            System.out.println(entry.getKey() + "; " + entry.getValue());
        }
    }

}