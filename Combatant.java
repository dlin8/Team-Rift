public class Combatant extends Unit{

    //Attributes
    protected int level;
    protected int health;
    protected int healthRegen; //determines how much health the combatant  will regenerate.
    protected int mana;
    protected int manaRegen; //determines how much mana the combatant will regenerate.
    protected int attack;
    protected int magicAttack;
    protected int defense;
    protected int magicDefense;
    protected int fireRes; //determines how resistant the combatant is to attacks with a fire attribute.
    protected int waterRes; //determines how resistant the combatant is to attacks with a water attribute.
    protected int earthRes; //determines how resistant the combatant is to attacks with a earth attribute.
    protected int windRes; //determines how resistant the combatant is to attacks with a wind attribute.
    protected int holyRes; //determines how resistant the combatant is to attacks with a holy attribute.
    protected int voidRes; //determines how resistant the combatant is to attacks with a void attribute.
    protected int accuracy; //determines how likely the combatant will hit the target.
    protected int avoidability; //determines how likely the combatant will avoid an attack.
    protected int speed; //determines which combatant will move first.
    protected int critRate; //determines the damage multiplier of a critical attack.
    protected int critChance; //determins the chance that the combatant will do a critical attack.

    //Constructor
    public class Combatant(){
	level = 0;
	health = 1;
	healthRegen = 0;
	mana = 0;
	manaRegen = 0;
	attack = 0;
	magicAttack = 0;
	defense = 0;
	magicDefense = 0;
	fireRes = 0;
	waterRes = 0;
	earthRes = 0;
	windRes = 0;
	holyRes = 0;
	voidRes = 0;
	accuracy = 0;
	avoidability = 0;
	speed = 0;
	critRate = 0;
	critChance = 0;
    }

    //Methods
    
    //Accessors
    public int getLevel(){
	return level;
    }
    public int getHealth(){
	return health;
    }
    public int getHealthRegen(){
	return healthRegen;
    }
    public int getMana(){
	return mana;
    }
    public int getManaRegen(){
	return manaRegen;
    }
    public int getAttack(){
	return attack;
    }
    public int getMagicAttack(){
	return magicAttack;
    }
    public int getDefense(){
	return defense;
    }
    public int getMagicDefense(){
	return magicDefense;
    }
}