package com.test.map.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class IterateOverLinkedHashMapExample {
    public static void main(String[] args) {
        
    	// create a linkedhashmap
        LinkedHashMap<Integer, Integer> lhm
            = new LinkedHashMap<>();
  
        // add mappings
        lhm.put(2, 6);
        lhm.put(3, 4);
        lhm.put(6, 8);
        lhm.put(4, 10);
        lhm.put(5, 6);
  
        // create an entryset
        Set s = lhm.entrySet();
  
        // create an iterator
        Iterator it = s.iterator();
  
        // iterate an print the mappings
        System.out.println("key=Value");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }	    	
    }

