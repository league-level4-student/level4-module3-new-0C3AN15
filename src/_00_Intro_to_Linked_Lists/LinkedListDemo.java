package _00_Intro_to_Linked_Lists;

public class LinkedListDemo {

    public static void main(String[] args) {

        /*
         * A LinkedList is a linear data structure, but unlike an ArrayList or
         * Array the data is not stored in contiguous memory locations.
         * 
         * Instead, each data node contains a reference that says where the next
         * node can be found.
         * 
         * Note: In the Node example provided there is also reference that
         * points back to the previous node. This is a referred to as a
         * doubly-linked list.
         * 
         * 1. Read through the LinkedList and Node classes.
         * 
         * 2. Create a LinkedList of any type you like.
         * 
         * 3. Try using some LinkedList methods to add, remove and print a few
         * elements.
         * 
         * 4. Save the head or tail reference into a Node Object and use
         * references to traverse through the list and perform an operation on
         * every element then print the list to see if it worked.
         * 
         * e.g. Multiply every element by something in a LinkedList containing
         * Integer nodes or make word upper case in a LinkedList containing
         * String nodes.
         * 
         */

    	LinkedList<Integer> surge = new LinkedList<Integer>();
    	surge.add(200);
    	surge.add(250);
    	surge.remove(1);
    	surge.add(201);
    	surge.add(100);
    	surge.print();
    	
    	Node<Integer> gam = surge.getHead();
    	for(int i=0;i<surge.size();i++) {
    		gam.setValue(gam.getValue()*2);
    		gam = gam.getNext();
    	}
    	surge.print();
    	
    	int[] gamin = {0,0,1,0};
    	for(int i=0;i<4;i++) {
    		if(gamin[i] == 1) {
    			break;
    		}
    		System.out.println(gamin[i]);
    	}
    	
    }

}
