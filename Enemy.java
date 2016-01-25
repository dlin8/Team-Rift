public class Enemy extends Combatant{
    public int experienceDrop;
    protected Item itemDrop;
    
    public Enemy(int hard, int nxcor, int nycor){
        setXYcor(nxcor, nycor);
        health = 7 * hard;
        mana = 4 * hard;
        attack = 2 * hard;
        defense = 2 * hard;
        accuracy = 1000;
        name = "Skeleton";
        experienceDrop = 5;
        itemDrop = new Consumable(10, 10);
        icon = "[S]";
    }
}