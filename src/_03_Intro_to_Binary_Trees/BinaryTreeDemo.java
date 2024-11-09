package _03_Intro_to_Binary_Trees;

public class BinaryTreeDemo {

    /*
     * A Binary Tree is a data structure that makes use of nodes and references
     * like a LinkedList, but instead of the nodes pointing to a previous node
     * or next node in an unorderd list they each points to two child nodes that
     * are below them in the hierarchy.
     * 
     * Some important properties of BinaryTree are:
     * 
     * -The left node is always a smaller value than its parent and the right
     * node is always a larger value. This is a property you have seen in some
     * form already via Binary Search.
     * 
     * -Empty nodes are null references.
     * 
     * -The parent node at the very top of the tree is called the root.
     * 
     * 1. Read through the BinaryTree and Node classes.
     * 
     * 2. Create a BinaryTree of any type you like.
     * 
     * 3. Try using some BinaryTree methods to insert, search for, delete and
     * print elements.
     * 
     * 4. Save the root into a Node Object and use references to traverse
     * through the BinaryTree and perform an operation on every element(You may
     * choose to do this recursively or iteratively). Then print it out to see
     * if it worked.
     * 
     * 
     */

    public static void main(String[] args) {
    	BinaryTree<Integer> ch1129 = new BinaryTree<Integer>();
    	
    	int[] numb = {1129, 200, 201, 1, 1121};
    	int[] numb2 = {5, 4, 6, 7, 3, 8, 2};
    	for(int i=0;i<numb2.length;i++) {
    		ch1129.insert(numb2[i]);
    	}
    	ch1129.insert(1129);
    	ch1129.delete(5);
    	
    	ch1129.printVertical();
    	//ch1129.printHorizontal();
    	
    	Node<Integer> nah = ch1129.search(1129);
    	ch1129.search(1130);
    	
//    	Node<Integer> root = ch1129.getRoot();
//    	root.setValue(root.getValue()*2);
//    	for(int i=0;i<ch1129.maxLevel(root);i++) {
//    		Node<Integer> lef = root.getLeft();
//    		Node<Integer> righ = root.getRight();
//    		lef.setValue(lef.getValue()*2);
//    		righ.setValue(righ.getValue()*2);
//    		root.setLeft(lef);
//    		root.setRight(righ);
//    		lef = lef.getLeft(); //nowork
//    		righ = righ.getRight();
//    		//root = root.getLeft();
//    		System.out.println(i);
//    	}
    	
    	Node<Integer> root = ch1129.getRoot();
    	for(int i=0;i<0;i++) {
    		
    	}
    	
    	ch1129.printVertical();
    	
    }

}
