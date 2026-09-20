
import java.util.*;

public class Dijkstra{
	    static class Pair {
	        int node;
	        int cost;

	        Pair(int node, int cost) {
	            this.node = node;
	            this.cost = cost;
	        }
	    }
	    public static void dijkstra(List<List<Pair>> graph, int start, int[] dist) {
	        int n = graph.size();
	        boolean[] visited = new boolean[n];
	        Arrays.fill(dist, Integer.MAX_VALUE);
	        dist[start] = 0;

	        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.cost));
	        pq.add(new Pair(start, 0));

	        System.out.println("Starting Dijkstra from node " + start);
	        while (!pq.isEmpty()) {
	            Pair current = pq.poll();
	            int u = current.node;

	            if (visited[u]) continue;
	            	visited[u] = true;

                System.out.println("Visiting node: " + u + " with current distance: " + dist[u]);

	            for (Pair neighbor : graph.get(u)) {
	                int v = neighbor.node;
	                int weight = neighbor.cost;

	                if (dist[u] + weight < dist[v]) {
	                    dist[v] = dist[u] + weight;
	                    pq.add(new Pair(v, dist[v]));
	                    
	                  System.out.println("  -> Updated distance of node " + v + " to " + dist[v]);
	                }
	            }
	            
	         // Print current state of distance array
	            System.out.print("Current distance array: ");
	            for (int d : dist) {
	                System.out.print((d == Integer.MAX_VALUE ? "∞" : d) + " ");
	            }
	            System.out.println("\n");
	        }
	    }

	    public static void main(String[] args) {
	        int n = 6; 
	        List<List<Pair>> graph = new ArrayList<>();
	        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

	        // Add edges: graph[from].add(new Pair(to, cost));
	        graph.get(0).add(new Pair(1, 5));
	        graph.get(0).add(new Pair(2, 1));
	        graph.get(1).add(new Pair(2, 2));
	        graph.get(1).add(new Pair(3, 3));
	        graph.get(1).add(new Pair(4, 20));
	        graph.get(2).add(new Pair(1, 3));
	        graph.get(2).add(new Pair(4, 12));
	        graph.get(3).add(new Pair(4, 2));
	        graph.get(3).add(new Pair(5, 6));
	        graph.get(3).add(new Pair(2, 3));
	        graph.get(4).add(new Pair(5, 1));
	        
	        int[] dist = new int[n];
	        dijkstra(graph, 0, dist);

	        System.out.println("Shortest distances from node 0:");
	        for (int i = 0; i < n; i++) {
	            System.out.println("To node " + i + " = " + dist[i]);
	        }
	    }
	}
    

