public class Unit{

    // Attributes
    protected String dialog;
    protected int xcor;
    protected int ycor;

    // Constructor
    public Unit(){	
	this(-1, -1);
    }
    public Unit(int newXcor, int newYcor){
	dialog = "Hello!";
	xcor = newXcor;
	ycor = newYcor;
    }
      
    // Method

    // Accessors
    public int getXcor(){
	return xcor;
    }
    public int getYcor(){
	return ycor;
    }
    public String getDialog(){
	return dialog;
    }

    // Mutators
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
    public void setDialog(String newDialog){
	dialog = newDialog;
    }

    public void quickDialog(String newDialog){
	this.setDialog(newDialog);
	System.out.println(dialog);
    }

    // DEBUG
    public static void main(String[] args){
	Unit Bob = new Unit();
	System.out.println(Bob.getDialog());
	String dialog = "I am standing on (" + Bob.getXcor() + ", " + Bob.getYcor() + ").";
	Bob.setDialog(dialog);
	System.out.println(Bob.getDialog());
	dialog = "Moving diagonally down two.";
	Bob.setDialog(dialog);
	System.out.println(Bob.getDialog());
	Bob.setXcor(Bob.xcor + 1);
	Bob.setYcor(Bob.ycor + 1);
	Bob.setXYcor(Bob.xcor + 1, Bob.ycor+1);
	dialog = "I am standing on (" + Bob.getXcor() + ", " + Bob.getYcor() + ").";
	Bob.setDialog(dialog);
	System.out.println(Bob.getDialog());
	Bob.quickDialog("Testing quickDialog().");
	System.out.println(Bob.getDialog());
    }

}