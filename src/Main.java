import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int[] preference = new int[5];
	static int[] frequency = new int[5];
	static int[] dist = new int[300];
	static int outputNum;
	
	static ArrayList<ArrayList<Road>> graph = new ArrayList<ArrayList<Road>>();
	static int V, E;
	
	public static void main(String[] args)
	{
		//파일에서 정점에 대한 정보들을 불러옴
		//정점 정보를 저장
		//해시맵에 저장 <int, Node>
		Scanner input = new Scanner(System.in);
		
		V = input.nextInt();
		E = input.nextInt();
		
		for(int i=0; i<V+1; i++) {
			graph.add(new ArrayList<Road>());
		}
		
		for(int i=0; i<E; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			graph.get(a).add(new Road(b, c));
		}
		//그래프 구성
		
		
		
		//선호도와 빈도를 받는... 무언가의 코드... 아마 애드액션리스너를 통해 받겠죠?
		int S = input.nextInt();
		dijkstra(S);
		//최단거리 계산, 현재 선호도 빈도 거리 모두 계산 완료
		//오브젝트 생성
		//식당 정보를 .dat 파일로 만들어서 여기서 읽어오고 오브젝트 배열에 저장
		RestNode[] rest = new RestNode[50];
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
