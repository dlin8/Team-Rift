public class Consumable extends Item{
    //Attributes
    /* class Equipment inherits
       protected int cost;
       protected String name;
       protected String description;
    */
    
    protected int stack;
    protected int useHealth;
    protected int useMana;
    
    
    public Consumable(){
        this(10, 10);
        
    }
    public Consumable(int newUseHealth, int newUseMana){
        stack = 1;
        cost = 25;
        name = "elixer";
        description = "restores both health and mana.";
        useHealth = newUseHealth;
        useMana = newUseMana;
    }
    
    //Accesors
    public int getStack(){
        return stack;
    }
    public int getUseHealth(){
        return useHealth;
    }
    public int getUseMana(){
        return useMana;
    }
    
    //Mutators
    public void setStack(int newStack){
        stack = newStack;
    }
    public void setUseHealth(int newUseHealth){
        useHealth = newUseHealth;
    }
    public void setUseMana(int newUseMana){
        useMana = newUseMana;
    }
}