package _02_Rainbow_Zombie_Conga_Line;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class RainbowZombieCongaLine {
    
    /*
     * You are hosting a rainbow zombie conga dance party! Zombies are not very
     * smart(maybe that's why they crave brains) and need your help to direct
     * them through the choreography.
     * 
     * Each method is a dance move you will need to implement.
     * 
     * When you think you've gotten your zombies trained well enough you can
     * start the party by running the main method in RainbowZombieDanceParty and
     * typing how many rounds you want in the console to see if they followed
     * your choreography correctly.
     * 
     * Note: The party will always start with a rainbow brains and every 5
     * rounds the head and tail of the dance line will be removed.
     */

    private LinkedList<Zombie> congaLine;
    private ZombieHatColor[] zombieHats;

    public RainbowZombieCongaLine() {

        congaLine = new LinkedList<Zombie>();
        zombieHats = ZombieHatColor.values();

    }

    // Make the passed in zombie the first Zombie in the conga line!
    public void engine(Zombie dancer) {
    	//Node<Zombie> dan = dancer;
    	congaLine.setHead(new Node<Zombie>(dancer));
    }

    // Make the passed in zombie the last Zombie in the conga line!
    public void caboose(Zombie dancer) {
    	congaLine.setTail(new Node<Zombie>(dancer));
    }

    // Place the zombie at the designated position in the conga line!
    public void jumpInTheLine(Zombie dancer, int position) {
    	Node<Zombie> temp = congaLine.getHead();
    	for(int i=0;i<position;i++) {
    		temp = temp.getNext();
    	}
    	temp.setValue(dancer);
    }

    /*
     * Remove all zombies with the same hat color as the passed in zombie from
     * the conga line!
     */
    public void everyoneOut(Zombie dancer) {
    	ZombieHatColor bad = dancer.getZombieHatColor();
    	Node<Zombie> temp = congaLine.getHead();
    	for(int i=0;i<congaLine.size();i++) {
    		if(temp.getValue().getZombieHatColor() == bad) {
    			congaLine.remove(i);
    			i--;
    		}
    	}
    }

    /*
     * Remove the first zombie with the same hat color as the passed in zombie
     * from the conga line!
     */
    public void youAreDone(Zombie dancer) {
    	ZombieHatColor bad = dancer.getZombieHatColor();
    	Node<Zombie> temp = congaLine.getHead();
    	for(int i=0;i<congaLine.size();i++) {
    		if(temp.getValue().getZombieHatColor() == bad) {
    			congaLine.remove(i);
    			break;
    		}
    	}
    }

    /*
     * Make two more zombies with the same hat color as the passed in zombie and
     * add one to the front, one to the end and one in the middle.
     */
    public void brains(Zombie dancer) {
    	ZombieHatColor bad = dancer.getZombieHatColor();
    	Node<Zombie> temp = congaLine.getHead();
    	
    	congaLine.setHead(new Node<Zombie>(dancer));
    	congaLine.setTail(new Node<Zombie>(dancer));
    	
    	for(int i=0;i<congaLine.size()/2;i++) {
    		temp = temp.getNext();
    	}
    	temp.setValue(dancer);
    }

    /*
     * Add the passed in zombie to the front and then add one zombie of each hat
     * color to the end of the line.
     */
    public void rainbowBrains(Zombie dancer) {
    	congaLine.setHead(new Node<Zombie>(dancer));
    	
    	for(int i=0;i<zombieHats.length;i++) {
    		Zombie temp = new Zombie(zombieHats[i]);
    		congaLine.add(temp);
    	}
    }

    public LinkedList<Zombie> getCongaLine() {
        return congaLine;
    }
}
