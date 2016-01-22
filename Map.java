public class Map{
    Entity[][] eMap; //entity Map
    String[][] iMap; //icon Map
    public Map(){
	iMap = new String[9][9];
	for(int i = 0; i < 9; i++){
	    for(int j = 0; j < 9; j++){
		iMap[i][j] = "[ ]";
	    }
	}
    }
    /*
    public void updateMap(Player hero, Entity[] ){
	for(int i = 0; i < blx - tlx + 1; i++){
	    for(int 
	}
    }
    */
    public void displayIMap(){
	System.out.println("GAME NAME!");
	System.out.println("type \"h\" for help.");
	System.out.println();
	for(int i = 0; i < iMap.length-1; i++){
	    for(int j = 0; j < iMap[i].length - 1; j++){
		System.out.print(map[i][j]);
	    }
	    System.out.println();
	}
	/*
	int topLeftXcor = hero.getXcor() - 4;
	int topLeftYcor = hero.getYcor() - 4;
	int botRightXcor = hero.getXcor() + 4;
	int botLeftYcor = hero.getYcor() + 4;	
	*/
    }
    public void getEMap(){
    }
    public static void main(String[] args){
        Map town = new Map();
	town.displayIMap();
    }
}