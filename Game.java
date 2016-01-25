import java.util.ArrayList;
import java.util.Scanner;

public class Game{
    private boolean quit;
    private boolean battle;
    private ArrayList<Entity> entities;
    private ArrayList<Entity> priorities;
    private int progress;
    public Game(){
        quit = false;
        battle = false;
        progress = 0;
    }    
    
    public static void main(String[] args){
    	Game game = new Game();
    	ArrayList<Entity> entities = new ArrayList<Entity>();
        ArrayList<Entity> priorities = new ArrayList<Entity>();
    	Player hero = new Player();
    	hero.setXYcor(2, 2);
        entities.add(0, hero);
        priorities.add(0, hero);
        Enemy mb = new Enemy(hero.level, 5, 5);
        Enemy enemy = mb;
        entities.add(1, mb);
        priorities.add(1, mb);
        Map dungeon = new Map(15);
        hero.setRealm(dungeon);
        mb.setRealm(dungeon);
        while(!game.quit){
            hero.input();
            dungeon.updateEMap(entities);
            dungeon.updateIMap(priorities);
            dungeon.displayIMap(hero);
            int xc = hero.getXcor();
            int yc = hero.getYcor();
            if(enemy.getXcor() == xc && enemy.getYcor() == yc){
                System.out.println("Battle!");
                game.battle = true;
                System.out.println("You encounter a " + enemy.getName());
                System.out.println("STAT COMPARISON");
                System.out.println("Health: " + hero.getHealth() + " vs " + enemy.getHealth());
                System.out.println("Attack: " + hero.getAttack() + " vs " + enemy.getAttack());
                System.out.println("Defense: " + hero.getDefense() + " vs " + enemy.getDefense());
            }
            while(game.battle){
                System.out.println("Pick!");
                System.out.println("1: Standard Attack");
                System.out.println("2: Debugger's Attack");
                System.out.println("3: Man Mode!");
                Scanner scan = new Scanner(System.in);
	    	    String input = scan.next();
	    	    if(input.equals("1")){
	    	        System.out.println("You dealt " + hero.damage(enemy) + " damage!");
	    	    }
	    	    else if (input.equals("2")){
	    	        int counter = 0;
	    	        for(int i = 0; i < 99; i++){
	    	            counter += hero.damage(enemy);
	    	        }
	    	        System.out.println("You dealt " + counter + " damage!");
	    	    }
	    	    else if (input.equals("3")){
	    	        int multi = hero.fists();
	    	        int counter = 0;
	    	        for(int i = 0; i < multi; i++){
	    	            counter += hero.damage(enemy);
	    	        }
	    	        System.out.println("You dealt " + counter + " damage!");
	    	    }
	    	    if(!enemy.alive()){
	    	        System.out.println("Victory!");
	    	        hero.addExperience(enemy.experienceDrop);
	    	        if(hero.canLevel()){
	    	            hero.levelUp();
	    	        }
	    	        entities.remove(1);
	    	        priorities.remove(1);
	    	        enemy = null;
	    	        game.battle = false;
	    	        hero.setHealth(hero.getMaxHealth());
	    	        Enemy mob = new Enemy(hero.level, (int)(Math.random() * dungeon.eMap.size()), (int)(Math.random() * dungeon.eMap.size()));
	    	        enemy = mob;
	    	        entities.add(1, enemy);
	    	        priorities.add(1, enemy);
	    	    }
	    	    System.out.println("You are hit for " + enemy.damage(hero) + " damage.");
	    	    if(!hero.alive()){
	    	        System.out.println("GAME OVER");
	    	        hero.quit = true;
	    	        game.battle = false;
	    	    }
            }
            
	    	if(hero.quit){
	    	    game.quit = true;
	    	}
		}
    }
}