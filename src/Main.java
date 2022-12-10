import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
		rest = new RestNode[32];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
				new File("src/textdata/list.txt")), "UTF-8"));
        String fstr;
        
        // 식당 정보 입력
        while((fstr = br.readLine()) != null)
        {
        	String[] str = fstr.split(",");
        	int id = Integer.parseInt(str[0]);
        	String name = str[1];
        	int type = Integer.parseInt(str[2]);
        	String main = str[3];
        	String link = str[4];
        	String img = "";
        	rest[id - 24] = new RestNode(id, name, main, type, link, img, preference[type], frequency[type], dist[id]);
        }
		// 그래프 파일 불러오기
		Scanner input = new Scanner(new File("C:/Users/dldms/eclipse-workspace/Cloud/src/textdata/graph.txt"));
		
		V = input.nextInt(); 
		E = input.nextInt();
		
		for(int i=0; i<300; i++) 
		{ 
			graph.add(new ArrayList<Road>()); 
		}
		
		for(int i=0; i<E; i++) { 
			int a = input.nextInt(); 
			int b = input.nextInt();
			int c = input.nextInt();
		  
			graph.get(a).add(new Road(b, c));
			graph.get(b).add(new Road(a, c));
		} //그래프 구성
		
		new Start();
	}
	
	// 오브젝트를 생성하고 점수를 받아 계산하는 메서드, Result에서 부를 예정
	public static void setResult() throws IOException
	{
        // 거리 점수 조정
        int max = 0;
        for(int i=24; i<V; i++)
        {
        	if(max < dist[i])
        		max = dist[i];
        }
        
        for(int i=0; i<V; i++)
        {
        	if (dist[i + 24] <= max / 10)
        		rest[i].setDistance(10);
        	else if (dist[i + 24] <= max / 10 * 2)
        		rest[i].setDistance(9);
        	else if (dist[i + 24] <= max / 10 * 3)
        		rest[i].setDistance(8);
        	else if (dist[i + 24] <= max / 10 * 4)
        		rest[i].setDistance(7);
        	else if (dist[i + 24] <= max / 10 * 5)
        		rest[i].setDistance(6);
        	else if (dist[i + 24] <= max / 10 * 6)
        		rest[i].setDistance(5);
        	else if (dist[i + 24] <= max / 10 * 7)
        		rest[i].setDistance(4);
        	else if (dist[i + 24] <= max / 10 * 8)
        		rest[i].setDistance(3);
        	else if (dist[i + 24] <= max / 10 * 9)
        		rest[i].setDistance(2);
        	else 
        		rest[i].setDistance(1);
        	
        	rest[i].setPerference(preference[rest[i].getFoodType()]);
        	rest[i].setFrequency(frequency[rest[i].getFoodType()]);
        }
        
        // 점수 계산
        for(int i=0; i<V; i++)
        {
        	if(rest[i] == null)
        		continue;
        	else {
				rest[i].setScore(preference[rest[i].getFoodType()] + frequency[rest[i].getFoodType()] + rest[i].getDistance());
			}
        }
        
        // 정렬
        Arrays.sort(rest);
        
        // 만약 같은 점수를 가졌는데 짤렸다면 선호도가 높은 종류가 먼저 오도록 설정
        if(rest[getOutputNum() - 1].getScore() == rest[getOutputNum()].getScore())
        {
        	int idx = 5;
        	while(rest[idx].getScore() == rest[idx+1].getScore())
        		idx++;
        	int endIdx = idx;
        	idx = 5;
        	while(idx > 0 && rest[idx].getScore() == rest[idx-1].getScore())
        		idx--;
        	int startIdx = idx;
        	
        	Arrays.sort(rest, startIdx, endIdx + 1, new Comparator<RestNode>() {
				@Override
				public int compare(RestNode o1, RestNode o2) {
					if(o1.getPreference() < ((RestNode)o2).getPreference())
			            return 1;
			        return -1;
				}
			});
        	
            System.out.println(startIdx + " " + endIdx);
        }
        
        for(RestNode i : rest)
        {
        	System.out.println(i.getId() + " : " + i.getScore() + " / " + i.getName() + " / " + dist[i.getId()] + " / " + preference[i.getFoodType()]);
        } 
        
	}
	
	public static void dijkstra(int startId)
	{
		for(int i=0; i<300; i++)
		{
			dist[i] = 2000000000;
		}
		dist[startId] = 0;
		
		PriorityQueue<Road> q = new PriorityQueue<Road>((o1, o2) -> Integer.compare(o1.weight, o2.weight));
		q.offer(new Road(startId, 0));
		while(!q.isEmpty()) {
			Road curNode = q.poll();
			System.out.println(curNode.endID);
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
		
		for(int i=0; i<=55; i++)
		{
			System.out.println(i + " : " + dist[i]);
		}
	}
}
