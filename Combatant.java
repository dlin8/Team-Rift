public class Combatant extends Entity{
    //Attributes
    /* class Combatant inherits
       protected String icon;
       protected String name;
       protected String dialog;
       protected int xcor;
       protected int ycor;
       protected int realm;
    */
    protected int health;
    protected int mana;
    protected int attack;
    protected int defense;
    protected int magicAttack;
    protected int magicDefense;
    protected int accuracy; //determines how likely the combatant will hit the target.
    protected int dodge; //determines how likely the combatant will avoid an attack.
    protected int speed; //determines which combatant will move first.
    protected int critRate; //determines the damage multiplier of a critical attack.
    protected int critChance; //determins the chance that the combatant will do a critical attack.

    //Constructor
    public Combatant(){
	super();
	health = 1;
	mana = 0;
	attack = 0;
	defense = 0;
	magicAttack = 0;
	magicDefense = 0;
	accuracy = 0;
	dodge = 0;
	speed = 0;
	critRate = 0;
	critChance = 0;
    }

    //Methods
    
    //Accessors
    public int getHealth(){
	    return health;
    }
    public int getMana(){
	    return mana;
    }
    public int getAttack(){
	    return attack;
    }
    public int getDefense(){
	    return defense;
    }
    public int getMagicAttack(){
	    return magicAttack;
    }
    public int getMagicDefense(){
	    return magicDefense;
    }
    public int getAccuracy(){
	    return accuracy;
    }
    public int getDodge(){
	    return dodge;
    }
    public int getSpeed(){
	    return speed;
    }
    public int getCritRate(){
	    return critRate;
    }
    public int getCritChance(){
	    return critChance;
    }

    //Mutators
    public void setHealth(int newHealth){
	    health = newHealth;
    }
    public void setMana(int newMana){
	    mana = newMana;
    }
    public void setAttack(int newAttack){
	    attack = newAttack;
    }
    public void setDefense(int newDefense){
	    defense = newDefense;
    }
    public void setMagicAttack(int newMagicAttack){
	    magicAttack = newMagicAttack;
    }
    public void setMagicDefense(int newMagicDefense){
	    magicDefense = newMagicDefense;
    }
    public void setAccuracy(int newAccuracy){
	    accuracy = newAccuracy;
    }
    public void setDodge(int newDodge){
	    dodge = newDodge;
    }
    public void setSpeed(int newSpeed){
	    speed = newSpeed;
    }
    public void setCritRate(int newCritRate){
	    critRate = newCritRate;
    }
    public void setCritChance(int newCritChance){
	    critChance = newCritChance;
    }

    //Methods
    public boolean alive(){
	    return health > 0;
    }
    public int damage(Combatant other){
	    int modifiedDamage = attack;
	    if( (Math.random() * 100 + 1) > critChance ){
	        modifiedDamage += critRate;
	    }
	    if( accuracy < other.getDodge() ){
	        if( (Math.random() * 100 + 1) > other.getDodge() - accuracy){
		    modifiedDamage = 0;
	        }
	    }
	    other.setHealth(other.getHealth() - modifiedDamage);
	    return modifiedDamage;
    }

    public static void main(String[] args){
    	Combatant Guy = new Combatant();
    }
}
