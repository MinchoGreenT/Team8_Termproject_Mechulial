
public class RestNode implements Comparable {
	private final int id;
	private final String name;
	private final String main;
	private final int foodType; 
	/*
	 1. 한식
	 2. 일식
	 3. 중식
	 4. 양식
	 5. 분식
	 */
	private final String link;
	private final String img;
	
	private int perference;
	private int frequency;
	private int distance;
	private int score;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMain() {
		return main;
	}
	public int getFoodType() {
		return foodType;
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
	
	public String getLink() {
		return link;
	}
	public String getImg() {
		return img;
	}
	
	public RestNode(int id, String name, String main, int foodType, String link, String img, int perference, int frequency, int distance) {
		this.id = id;
		this.name = name;
		this.main = main;
		this.foodType = foodType;
		this.link = link;
		this.img = img;
		this.perference = perference;
		this.frequency = frequency;
		this.distance = distance;
	}
	
	@Override
	public int compareTo(Object other){
        if(this.score < ((RestNode)other).score)
            return 1;
        return -1;
    }
}
