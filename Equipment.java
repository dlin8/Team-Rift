public class Equipment extends Item{
    //Attributes
    /* class Equipment inherits
       protected int cost;
       protected String name;
       protected String description;
    */
    protected int slot;
    protected int equipHealth;
    protected int equipMana;
    protected int durability;
    protected int equipAttack;
    protected int equipDefense;
    protected int equipMagicAttack;
    protected int equipMagicDefense;
    protected int equipAccuracy;
    protected int equipDodge;
    protected int equipSpeed;
    protected int equipCritRate;
    protected int equipCritChance;
    
    public Equipment(){
        super();
        slot = 1;
    }
    public Equipment(int slot, int newCost, String newName, String newDescription){
        slot = 1;
        cost = newCost;
        name = newName;
        description = newDescription;
    }
    
    //Accessors
    public int getSlot(){
        return slot;
    }
    public int getDurability(){
        return durability;
    }
    public int getEquipHealth(){
        return equipHealth;
    }
    public int getEquipMana(){
        return equipMana;
    }
    public int getEquipAttack(){
        return equipAttack;
    }
    public int getEquipDefense(){
        return equipDefense;
    }
    public int getEquipMagicAttack(){
        return equipMagicAttack;
    }
    public int getEquipMagicDefense(){
        return equipMagicDefense;
    }
    public int getEquipAccuracy(){
        return equipAccuracy;
    }
    public int getEquipDodge(){
        return equipDodge;
    }
    public int getEquipSpeed(){
        return equipSpeed;
    }
    public int getEquipCritRate(){
        return equipCritRate;
    }
    public int getEquipCritChance(){
        return equipCritChance;
    }
    
    
    //Mutators
    public void setSlot(int newSlot){
        slot = newSlot;
    }
    public void getDurability(int newDurability){
        durability = newDurability;
    }
    public void getEquipHealth(int newEquipHealth){
        equipHealth = newEquipHealth;
    }
    public void getEquipMana(int newEquipMana){
        equipMana = newEquipMana;
    }
    public void getEquipAttack(int newEquipAttack){
        equipAttack = newEquipAttack;
    }
    public void getEquipDefense(int newEquipDefense){
        equipDefense = newEquipDefense;
    }
    public void getEquipMagicAttack(int newEquipMagicAttack){
        equipMagicAttack = newEquipMagicAttack;
    }
    public void getEquipMagicDefense(int newEquipMagicDefense){
        equipMagicDefense = newEquipMagicDefense;
    }
    public void getEquipAccuracy(int newEquipAccuracy){
        equipAccuracy = newEquipAccuracy;
    }
    public void getEquipDodge(int newEquipDodge){
        equipDodge = newEquipDodge;
    }
    public void getEquipSpeed(int newEquipSpeed){
        equipSpeed = newEquipSpeed;
    }
    public void getEquipCritRate(int newEquipCritRate){
        equipCritRate = newEquipCritRate;
    }
    
    public void getEquipCritChance(int newEquipCritChance){
        equipCritChance = newEquipCritChance;
    }
}