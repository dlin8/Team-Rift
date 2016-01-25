public class Entity{

    // Attributes
    protected String icon;
    protected String name;
    protected String dialogue;
    protected int xcor;
    protected int ycor;
    protected Map realm;

    // Constructor
    public Entity(){	
	    this(0, 0);
    }
    public Entity(int newXcor, int newYcor){
    	icon = "[ ]";
    	name = "Nothing";
    	dialogue = "There's nothing here.";
    	xcor = newXcor;
    	ycor = newYcor;
    }
      
    // Method

    // Accessors
    public String getIcon(){
	    return icon;
    }
    public int getXcor(){
	    return xcor;
    }
    public int getYcor(){
	    return ycor;
    }
    public String getName(){
        return name;
    }
    public String getDialogue(){
	    return dialogue;
    }
    public Map getRealm(){
	    return realm;
    }

    // Mutators
    public void setIcon(String newIcon){
	    icon = newIcon;
    }
    public void setXcor(int newXcor){
	    xcor = newXcor;
    }
    public void setYcor(int newYcor){
	    ycor = newYcor;
    }
    public void setXYcor(int newXcor, int newYcor){
	    xcor = newXcor;
	    ycor = newYcor;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setDialogue(String newDialogue){
	    dialogue = newDialogue;
    }
    public void setRealm(Map newRealm){
	    realm = newRealm;
    }
    public void quickDialogue(String newDialogue){
	    this.setDialogue(newDialogue);
	    System.out.println(dialogue);
    }
}
