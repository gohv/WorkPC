public class scrabble {
	private String mHand;

	public scrabble() {
		mHand = "";
	}

	public String getHand() {
		return mHand;
	}

	public void addTile(char tile) {
		// Adds the tile to the hand of the player
		mHand += tile;
	}

	public boolean hasTile(char tile) {
		return mHand.indexOf(tile) > -1;
	}

	public char getTileCount() {
		char hand = '-';
		for(char count : mHand.toCharArray()){
			char display = '-';
			if(mHand.indexOf(count) >= 0){
				display = count;
			}
			count += display;			
		}
		return hand;
	}
		
	}
