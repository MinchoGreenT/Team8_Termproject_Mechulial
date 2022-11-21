
public class RestNode extends Node {
	private String name;
	private String main;
	private int foodType;
	private int perference;
	private int frequency;
	private int distance;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public int getFoodType() {
		return foodType;
	}
	public void setFoodType(int foodType) {
		this.foodType = foodType;
	}
	public int getPerference() {
		return perference;
	}
	public void setPerference(int perference) {
		this.perference = perference;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public RestNode(int id, String name, String main, int foodType, int perference, int frequency, int distance) {
		super(id);
		this.name = name;
		this.main = main;
		this.foodType = foodType;
		this.perference = perference;
		this.frequency = frequency;
		this.distance = distance;
	}
}
