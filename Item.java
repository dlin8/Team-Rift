public class Item{
    protected int cost;
    protected String name;
    protected String description;
    
    public Item(){
        cost = 0;
        name = "A pebble";
        description = "A worthless pebble, not safe for consumption.";
    }


    //Accessors
    public int getCost(){
        return cost;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    
    //Mutators
    public void setCost(int newCost){
        cost = newCost;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setDescription(String newDescription){
        description = newDescription;
    }
}