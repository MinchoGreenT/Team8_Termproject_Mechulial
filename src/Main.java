import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static int[] getPreference() {
		return preference;
	}

	public static void setPreference(int[] preference) {
		Main.preference = preference;
	}

	public static int getFrequency(int type) {
		return frequency[type];
	}

	public static void setFrequency(int type, int value) {
		frequency[type] = value;
	}

	public static int getOutputNum() {
		return outputNum;
	}

	public static void setOutputNum(int outputNum) {
		Main.outputNum = outputNum;
	}

	static int[] preference = new int[6];
	static int[] frequency = new int[6];
	static int[] dist = new int[300];
	static int outputNum;
	static RestNode[] rest;
	
	static ArrayList<ArrayList<Road>> graph = new ArrayList<ArrayList<Road>>();
	static int V, E;
	
	public static void main(String[] args)
	{
		rest = new RestNode[100];
		for(int i=1; i<=5; i++)
		{
			preference[i] = 0;
			frequency[i] = 0;
		}
		//파일에서 정점에 대한 정보들을 불러옴
		//정점 정보를 저장
		//해시맵에 저장 <int, Node>
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * V = input.nextInt(); E = input.nextInt();
		 * 
		 * for(int i=0; i<V+1; i++) { graph.add(new ArrayList<Road>()); }
		 * 
		 * for(int i=0; i<E; i++) { int a = input.nextInt(); int b = input.nextInt();
		 * int c = input.nextInt();
		 * 
		 * graph.get(a).add(new Road(b, c)); } //그래프 구성
		 * 
		 * 
		 * int S = input.nextInt(); dijkstra(S);
		 */
		new Start();
		//각 오브젝트는 setScore 실행
		//오브젝트 배열 정렬
		//상위 n개 결과 출력(GUI)
	}
	
	public static void dijkstra(int startId)
	{
		for(int i=0; i<V+1; i++)
		{
			dist[i] = Integer.MAX_VALUE;
		}
		dist[startId] = 0;
		
		PriorityQueue<Road> q = new PriorityQueue<Road>((o1, o2) -> Integer.compare(o1.weight, o2.weight));
		q.offer(new Road(startId, 0));
		while(!q.isEmpty()) {
			Road curNode = q.poll();
			if(dist[curNode.endID] < curNode.weight)
				continue;
			
			for(Road i : graph.get(curNode.endID))
			{
				if(dist[i.endID] > curNode.weight + i.weight) {
					dist[i.endID] = curNode.weight + i.weight;
					q.offer(new Road(i.endID, dist[i.endID]));
				}
			}
		}
	}
}
