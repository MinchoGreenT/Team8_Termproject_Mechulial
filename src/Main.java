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
		//���Ͽ��� ������ ���� �������� �ҷ���
		//���� ������ ����
		//�ؽøʿ� ���� <int, Node>
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
		//�׷��� ����
		
		
		
		//��ȣ���� �󵵸� �޴�... ������ �ڵ�... �Ƹ� �ֵ�׼Ǹ����ʸ� ���� �ް���?
		int S = input.nextInt();
		dijkstra(S);
		//�ִܰŸ� ���, ���� ��ȣ�� �� �Ÿ� ��� ��� �Ϸ�
		//������Ʈ ����
		//�Ĵ� ������ .dat ���Ϸ� ���� ���⼭ �о���� ������Ʈ �迭�� ����
		RestNode[] rest = new RestNode[50];
		//�� ������Ʈ�� setScore ����
		//������Ʈ �迭 ����
		//���� n�� ��� ���(GUI)
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
