import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.management.remote.JMXAddressable;

import java.io.*;

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
	
	public static void setStart(int S) {
		Main.S = S;
	}

	static int[] preference = new int[6];
	static int[] frequency = new int[6];
	static int[] dist = new int[300];
	static int outputNum;
	static RestNode[] rest;
	
	static ArrayList<ArrayList<Road>> graph = new ArrayList<ArrayList<Road>>();
	static int V, E, S;
	
	public static void main(String[] args) throws IOException
	{   
		rest = new RestNode[20];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
				new File("C:/Users/dldms/eclipse-workspace/Cloud/src/textdata/list.txt")), "UTF-8"));
        String fstr;
        
        // �Ĵ� ���� �Է�
        while((fstr = br.readLine()) != null)
        {
        	String[] str = fstr.split(",");
        	int id = Integer.parseInt(str[0]);
        	String name = str[1];
        	int type = Integer.parseInt(str[2]);
        	String main = str[3];
        	String link = str[4];
        	String img = str[5];
        	rest[id] = new RestNode(id, name, main, type, link, img, preference[type], frequency[type], dist[id]);
        }
		// �׷��� ���� �ҷ�����
		Scanner input = new Scanner(new File("C:/Users/dldms/eclipse-workspace/Cloud/src/textdata/graph.txt"));
		
		V = input.nextInt(); 
		E = input.nextInt();
		
		for(int i=0; i<V+1; i++) 
		{ 
			graph.add(new ArrayList<Road>()); 
		}
		
		for(int i=0; i<E; i++) { 
			int a = input.nextInt(); 
			int b = input.nextInt();
			int c = input.nextInt();
		  
			graph.get(a).add(new Road(b, c)); 
		} //�׷��� ����
		
//		dijkstra(S);
//
//		try {
//			setResult();
//		}
//		catch(IOException e) {
//			System.out.println("Errororroror");
//		}
		new Start();
		//���� n�� ��� ���(GUI) - Result���� ����
	}
	
	// ������Ʈ�� �����ϰ� ������ �޾� ����ϴ� �޼���, Result���� �θ� ����
	public static void setResult() throws IOException
	{
        // �Ÿ� ���� ����
        int max = 0;
        for(int i=0; i<V; i++)
        {
        	if(max < dist[i])
        		max = dist[i];
        }
        
        for(int i=0; i<V; i++)
        {
        	if (dist[i] <= max / 5)
        		rest[i].setDistance(5);
        	else if (dist[i] <= max / 5 * 2)
        		rest[i].setDistance(4);
        	else if (dist[i] <= max / 5 * 3)
        		rest[i].setDistance(3);
        	else if (dist[i] <= max / 5 * 4)
        		rest[i].setDistance(2);
        	else 
        		rest[i].setDistance(1);
        }
        
        // ���� ���
        for(int i=0; i<3; i++)
        {
        	if(rest[i] == null)
        		continue;
        	else {
				rest[i].setScore(preference[rest[i].getFoodType()] + frequency[rest[i].getFoodType()] + rest[i].getDistance());
			}
        }
        
        // ����
        Arrays.sort(rest);
        
        for(RestNode i : rest)
        {
        	System.out.println(i.getId() + " : " + i.getScore() + " / " + i.getName());
        }
	}
	
	public static void dijkstra(int startId)
	{
		for(int i=0; i<V+1; i++)
		{
			dist[i] = 2000000000;
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
