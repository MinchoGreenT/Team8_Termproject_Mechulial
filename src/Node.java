import java.util.ArrayList;

public class Node {
	private final int id;
	ArrayList<Road> adj;
	
	public Node(int id)
	{
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
