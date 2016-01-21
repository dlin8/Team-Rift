public class Map{
    String[][] map;
    public Map(){
	map = new String[9][9];
	for(int i = 0; i < 9; i++){
	    for(int j = 0; j < 9; j++){
		map[i][j] = "[ ]";
	    }
	}
    }
    /*
    public void updateMap(int tlx, int tly, int blx, int bly){
	for(int i = 0; i < blx - tlx + 1; i++){
	    for(int 
	}
    }
    public void displayRow(){
	System.out.println(map
    }
    */
    public void displayMap(){
	for(int i = 0; i < map.length-1; i++){
	    for(int j = 0; j < map[i].length - 1; j++){
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
    public static void main(String[] args){
        Map town = new Map();
	town.displayMap();
    }
}