import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Combatant{
    //Attributes
    /* class Player inherits
       protected String icon;
       protected String dialog;
       protected int xcor;
       protected int ycor;
       protected int realm;
       protected int health;
       protected int mana;
       protected int attack;
       protected int defense;
       protected int magicAttack;
       protected int magicDefense;
       protected int accuracy;
       protected int dodge;
       protected int speed;
       protected int critRate;
       protected int critChance;
    */
    
    protected int maxHealth;
    protected int experience;
    protected int level;
    //protected ArrayList<Item> inventory;
    //protected ArrayList<Equipment> equip;
    protected int recent; //0,1,2,3; up,down,left,right respectively.
    protected boolean prompt;
    protected boolean interact;
    protected boolean quit;

    //Methods

    public Player(){
		ArrayList<String>  spellbook = new ArrayList<String>();
		interact = false;
		prompt = false;
		quit = false;
		recent = 0;
		experience = 0;
		level = 1;
		maxHealth = 10;
		health = 10;
		mana = 10;
		attack = 6;
		defense = 6;
		magicAttack = 4;
		magicDefense = 4;
		accuracy = 5;
		dodge = 5;
		critRate = 2;
		critChance = 10;
		this.updateIcon();
		xcor = 0;
		ycor = 0;
		dialogue = "";
    }
    
    //Accessors
    public int getExperience(){
		return experience;
    }
    public int getLevel(){
		return level;
    }
    public boolean getInteract(){
    	return interact;
    }
    public boolean getQuit(){
    	return quit;
    }
    public int getMaxHealth(){
    	return maxHealth;
    }
    /*
    public ArrayList<Item> getInventory(){
		return inventory;
    }
    */

    //Mutators
    public void setMaxHealth(int newMaxHealth){
    	maxHealth = newMaxHealth;
    }
    public void addExperience(int addExperience){
		experience += addExperience;
    }
    public boolean canLevel(){
		return experience > ((10 * level)) * ((level / 2)+1);
    }
    public void levelUp(){
		level++;
		health += Math.random() * 3 + 1;
		mana += Math.random() * 3 + 1;
		attack += Math.random() * 3 + 1;
		defense += Math.random() * 3 + 1;
		magicAttack += Math.random() * 3 + 1;
		magicDefense += Math.random() * 3 + 1;
		accuracy += Math.random() * 3 + 1;
		dodge += Math.random() * 3 + 1;
		speed += Math.random() * 3 + 1;
		System.out.println("Level Up!");
    }
    public void setInteract(boolean tv){
    	interact = tv;
    }
    public void setQuit(boolean tv){
    	quit = tv;
    }
    
    public void input(){
    	prompt = true;
		while(prompt){
			Scanner scan = new Scanner(System.in);
		    System.out.println("Move");
	    	String input = scan.next();
	    	
	    	if(input.equals("w")){
	    		if(ycor - 1 >= 0){
	    			setXYcor(xcor, ycor-1);
	    			System.out.println ("You walked North.");
	    		}
		    	recent = 0;
		    	this.updateIcon();
			}
			else if(input.equals("a")){
				if(xcor - 1 >= 0){
	    			setXYcor(xcor-1, ycor);
	    			System.out.println ("You walked West.");
	    		}
			    recent = 2;
			    this.updateIcon();
			}
			else if(input.equals("s")){
				if(ycor + 1 <= realm.eMap.size() - 1){
	    			setXYcor(xcor, ycor+1);
	    			System.out.println ("You walked South.");
	    		}
			    recent = 1;
			    this.updateIcon();
			}
			else if(input.equals("d")){
				if(xcor + 1 <= realm.eMap.size() - 1){
	    			setXYcor(xcor+1, ycor);
	    			System.out.println ("You walked East.");
	    		}
			    recent = 3;
			    this.updateIcon();
			}
			
			else if(input.equals("h")){
				System.out.println("HELP");
				System.out.println();
				System.out.println("\"WASD\" to walk.");
				System.out.println("\"P\" to quit.");
			}
			else if(input.equals("e")){
				setInteract(true);
			}
			/*
			else if(input.equals("o")){
				System.out.println("Overwrite previous save?");
			}
			*/
			else if(input.equals("p")){
				System.out.println("Quit? y/n");
				String quit = scan.next();
				if(quit.equals("y")){
					System.out.println("Quitting...");
					setQuit(true);
				}
			}
			else{
			    System.out.println ("Utilise the WASD keys");
			}
	    	prompt = false;
		}
    }
    public int fists(){
    	int counter = 3;
    	boolean pass = false;
    	double interval = Math.random() + Math.random();
    	long start = System.currentTimeMillis();
    	long press = 0;
    	double score = 0;
    	while(!pass){
    		if(System.currentTimeMillis() > start + (1000 * interval) && counter == 3){
    			System.out.println("3");
    			counter -=1;
    		}
    		if(System.currentTimeMillis() > start + (2000 * interval) && counter == 2){
    			System.out.println("2");
    			counter -=1;
    		}
    		if(System.currentTimeMillis() > start + (3000 * interval) && counter == 1){
    			System.out.println("1");
    			counter-=1;
    		}
    		if(System.currentTimeMillis() > start + (4000 * interval) && counter == 0){
    			System.out.println("X");
    			counter -=1;
    		}
    		if(counter < -0){
    			pass = true;
    		}
    	}
    	Scanner scan = new Scanner(System.in);
    	String input = scan.next();
    	if(input.equals("punch")){
    		press = System.currentTimeMillis();
    	}
    	else{
    		press = System.currentTimeMillis() + 10000;
    	}
    	score = ((start + (8000 * interval)) - press);
    	if(score > 1000 || score < -1000){
    		score = 0;
    	}
    	else if(score > 500 || score < -500){
    		score = 1;
    	}
    	else if(score > 300 || score < -300){
    		score = 2;
    	}
    	else if(score > 100 || score < -100){
    		score = 3;
    	}
    	else{
    		score = 4;
    	}
    	System.out.println(score);
    	return (int)score;
    }
    
    public void updateIcon(){
		if(recent == 0){
		    icon = "[^]";
		}
		if(recent == 1){
	    	icon = "[v]";
		}
		if(recent == 2){
		    icon = "[<]";
		}
		if(recent == 3){
	    	icon = "[>]";
		}
    }
    /*
    public void displayInventory(){
	System.out.println("INVENTORY");
	for(int i = 1; i < inventory.size() + 1; i++){
	    System.out.println(i + ". " + inventory.get(i-1));
	}
    }
    */
    public static void main(String[] args){
		Player hero = new Player();
		for(int i = 0; i < 10; i++){	    
		    hero.input();
		}
    }
}
