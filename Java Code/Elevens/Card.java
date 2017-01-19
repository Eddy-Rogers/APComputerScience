public class Card {

	private String suit;

	private String rank;

	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}

	public String suit() {
		return suit;
   }

	public String rank() {
		return rank;
	}

	public int pointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		return suit.equals(otherCard.suit());
	}
	static void sort(int[] nums){
		int minIndex;
		for(int psn = 0; psn < nums.length - 1; psn++){
			minIndex = psn;
			for(int search = psn; search < nums.length; search++){
				if(nums[search] < nums[minIndex]){
					minIndex = search;
				}
				int temp = nums[psn];
				nums[psn] = nums[minIndex];
				nums[minIndex] = temp;
			}
		}
	}

	@Override
	public String toString() {
		return rank + " of " + suit + " (pointValue = " + pointValue
				+ ")";
	}
}
