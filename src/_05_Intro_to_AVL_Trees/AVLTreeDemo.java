package _05_Intro_to_AVL_Trees;

import _03_Intro_to_Binary_Trees.BinaryTree;

public class AVLTreeDemo {

    /*
     * An AVLTree is a special BinaryTree that is capable of balancing itself.
     * With a regular binary tree, depending on the elements inserted, you might
     * have a root with one very long right branch and one very long left branch
     * with nothing else in between.
     * 
     * 1.) Read through the AVLNode and AVLTree. Notice that the methods are
     * similar to those in BinaryTree with two important distinctions:
     * 
     * a) Each Node has a balance factor that keeps track of how many levels
     * "down" it is relative to the rest of the tree.
     * 
     * b) There are "rotate" helper methods used when a given node gets too
     * unbalanced(> 1 level out of sync with the rest of the tree) to rotate
     * branches back into place.
     * 
     * 2.) Create a BinaryTree and an AVLTree.
     * 
     * 3.) Insert the same values into both trees and observe how they differ
     * using the print method. Make sure the values you pick unbalance the
     * binary tree.
     * 
     * 4.) Try removing elements from both and see how they change using one of
     * the print methods.
     */

    public static void main(String[] args) {
    	
    	BinaryTree<Integer> ch1129 = new BinaryTree<Integer>();
    	AVLTree<Integer> ch1130 = new AVLTree<Integer>();
    	AVLTree<String> ch99 = new AVLTree<String>();
    	
    	int[] numb = {1129, 200, 201, 1, 1121};
    	int[] numb2 = {5, 3, 4, 7, 1, 9, -1, 11, 1130, -200};
    	String[] gaming = {"f","o","r","t","n","o"};
    	String[] gaming3 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    	String[] gaming4 = {"f","o","r","t","f","o","r","t","n","i","t","e","g","a","m","i","n","g","","","","","","","",""};
    	for(int i=0;i<gaming.length;i++) {
    		ch1129.insert(numb2[i]);
    		ch1130.insert(numb2[i]);
    		//ch99.insert(gaming[i]);
    	}
    	for(int i=0;i<gaming4.length;i++) {
    		ch99.insert(gaming4[i]);
    		//ch99.insert("a");
    	}
    	
//    	ch1129.delete(5);
//    	ch1130.delete(5);
//    	ch1129.delete(7);
//    	ch1130.delete(7);
    	//
    	
    	int[] remove = {};
    	for(int i=0;i<remove.length;i++) {
    		ch1129.delete(remove[i]);
    		ch1130.delete(remove[i]);
    	}
    	
    	ch1129.printHorizontal();
    	ch1130.printHorizontal();
    	ch99.printHorizontal();
    	
    }

}
