import java.util.ArrayList;

public class Map{
    public ArrayList<ArrayList<Entity>> eMap; //entity Map
    public ArrayList<ArrayList<String>> iMap; //icon Map
    private int size;
    
    public Map(int size){
    	eMap = new ArrayList<ArrayList<Entity>>();
    	for(int i = 0; i < size; i++){
    		eMap.add(i, new ArrayList<Entity>());
    		for(int j = 0; j < size; j++){
    			eMap.get(i).add(j, new Entity());
    		}
    	}
    	iMap = new ArrayList<ArrayList<String>>();
    	for(int k = 0; k < size; k++){
    		iMap.add(k, new ArrayList<String>());
    		for(int l = 0; l < size; l++){
    			iMap.get(k).add(l, (eMap.get(k).get(l).getIcon()) );
    		}
    	}
    }
    
    public void updateEMap(ArrayList<Entity> entities){
    	for(int j = 0; j < eMap.size(); j++){
    		for(int i = 0; i < eMap.size(); i++){
    			eMap.get(j).set(i, new Entity());
    		}
    	}
    	for(int i = 0; i < entities.size(); i++){
    		int xc = entities.get(i).getXcor();
    		int yc = entities.get(i).getYcor();
    		eMap.get(yc).set(xc, entities.get(i));
    	}
    }

	public void updateIMap(ArrayList<Entity> priority){
		for(int j = 0; j < eMap.size(); j++){
    		for(int i = 0; i < eMap.size(); i++){
    			iMap.get(j).set(i, eMap.get(j).get(i).getIcon());
    		}
    	}
    	for(int i = 0; i < priority.size(); i++){
    		int xc = priority.get(i).getXcor();
    		int yc = priority.get(i).getYcor();
    		String ic = priority.get(i).getIcon();
    		iMap.get(yc).set(xc, ic);
    	}
	}
	
    public void displayIMap(Player hero){
    	boolean checked = false;
		System.out.println("GAME NAME!");
		System.out.println("type \"h\" and hit enter for help.");
		System.out.println();
		int tlx = hero.getXcor() - 4;
		int tly = hero.getYcor() - 4;
		if(hero.getYcor() - 4 < 0){
			tly = 0;
		}
		if(hero.getXcor() - 4 < 0){
			tlx = 0;
		}
		if(hero.getYcor() + 4 > iMap.size() - 1){
			tly = iMap.size() - 9;
		}
		if(hero.getXcor() + 4 > iMap.size() - 1){
			tlx = iMap.size() - 9;
		}
		for(int yc = tly; yc < tly + 9; yc++){
			for(int xc = tlx; xc < tlx + 9; xc++){
				System.out.print(iMap.get(yc).get(xc));
			}
	    	System.out.println();
		}
	}
}