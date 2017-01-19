
public class Pigeon {
	private String sound;
	private int numLegs;
	public boolean hasWings;
	
	Pigeon(){
		sound = "coo";
		hasWings = true;
		numLegs = 2;
	}
	Pigeon(String inputSound, int inputLegs, boolean inputWings){
		sound = inputSound;
		numLegs = inputLegs;
		hasWings = inputWings;
	}
	public String getSound(){
		return sound;
	}
	public void setSound(String inputSound){
		sound = inputSound;
	}
	public void setLegs(int inputLegs){
		numLegs = inputLegs;
	}
	public void setWings(boolean inputWings){
		hasWings = inputWings;
	}
	public String toString(){
		return "Hey man, the sound is " + sound +
				" and the number of legs is " + numLegs +
				"and does it have wings?" + hasWings;
	}
}
