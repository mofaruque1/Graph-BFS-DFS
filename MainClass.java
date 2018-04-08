package test2;

public class MainClass {
	
	public static void main(String[] args) {
		Graph theGraph = new Graph();
		theGraph.addVertex('A'); // 0 (start for dfs)
		theGraph.addVertex('B'); // 1
		theGraph.addVertex('S'); // 2
		theGraph.addVertex('C'); // 3
		theGraph.addVertex('G'); // 4
		theGraph.addVertex('D'); // 5
		theGraph.addVertex('E'); // 6
		theGraph.addVertex('F'); // 7
		theGraph.addVertex('H'); // 8
		
		theGraph.addEdge(0, 1); // AB
		theGraph.addEdge(0, 2); // AS
		theGraph.addEdge(2, 3); // SC
		theGraph.addEdge(2, 4); // SG
		theGraph.addEdge(3, 5); // CD
		theGraph.addEdge(3, 7); // CE
		theGraph.addEdge(3, 6); // CF
		theGraph.addEdge(4, 6); // GF
		theGraph.addEdge(4, 8); // GH
		theGraph.addEdge(7, 8); // EH
		
		
		System.out.print("Visits: ");
		theGraph.dfs(); // depth-first search
		System.out.println();
		
		System.out.print("Visits: ");
		theGraph.bfs(); // bredth-first search
		System.out.println();
	}

}
