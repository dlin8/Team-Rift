import java.awt.event.KeyEvent;

public class Player extends Combatant{
    protected int experience;
    protected boolean up;
    protected boolean down;
    protected boolean left;
    protected boolean right;
    public void move(KeyEvent e){
	System.out.println(e.getKeyCode());
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT) left = true;
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) right = true;
        if(e.getKeyCode() == KeyEvent.VK_UP) up = true;
        if(e.getKeyCode() == KeyEvent.VK_DOWN) down = true;
        System.out.println("L:"+left+" R:"+right+" F:"+up+" B:"+down);
    }

    public static void main(String[] args){
	Player Bob = new Player();
    }
}