//Test class for the whole program

import static org.junit.Assert.*;

import org.junit.Test;

public class DAGTest {
	
	DAG acyclic =new DAG(10);//create a acyclic graph
	DAG cycle = new DAG(9);//create a cycle graph
	
	//testing the set up of the constructor
	@Test(expected = IllegalArgumentException.class)//must be non-negative
	public void testDAG() {
		DAG negativeTest = new DAG(-2);//will throw IllegalException if out of bounds
	}
	
	//Test the indegree of a vertex in the graph
	@Test(expected = IllegalArgumentException.class)
	public void testIndegree(){
		
	}
	
	//Test the outdegree of a vertex in the graph
	@Test(expected = IllegalArgumentException.class)
	public void testOutdegree(){
		
	}
	
	//Test the adjacency array
	@Test(expected = IllegalArgumentException.class)
	public void testAdj(){
		
	}
	
	//test the amount of edges with in a graph
	@Test
	public void testE(){
		acyclicGraph();
		cycleGraph();
		assertEquals("Number of edges within the graph should be 9", 9, acyclic.E());
		assertEquals("Number of edges within the graph should be 9", 9, cycle.E());
	}
	
	//test the number of vertices within a graph
	@Test
	public void testV(){
		acyclicGraph();
		cycleGraph();
		assertEquals("Number of vertices within the graph should be 9", 10, acyclic.V());
		assertEquals("Number of vertices within the graph should be 9", 9, cycle.V());
	}
	
	//test that the vertex passed through is valid for the graph(Nonnegative
	@Test(expected = IllegalArgumentException.class)
	public void testValidVertex(){
		DAG validTest = new DAG(3);
		//try add negative values, will throw exception
		validTest.addEdge(-1, 2);
		validTest.addEdge(1, -2);
		validTest.addEdge(-1, -2);
		assertEquals("Should contain no edges", 0, validTest.E());
		//will not throw exception, but let it pass through
		validTest.addEdge(1, 2);
		assertEquals("Should contain 1 edge", 1, validTest.E());
	}
	
	//test that adding an edge between two vertices crates a connection
	@Test(expected = IllegalArgumentException.class)
	public void testAddEdge(){
		
	}
	
	//test that the graph is acyclic, if there is a cycle the method will throw true that there is a cycle
	//with in the graph
	@Test
	public void testCycle(){
		
	}
	
	//test DFS 
	@Test(expected = IllegalArgumentException.class)
	public void testDFS(){
		
	}
  //Testing the LCA method, will test for various problems that may arise
	@Test(expected = IllegalArgumentException.class) 
	public void testLCA(){
		
	}
	
	//function to create an acyclic graph that I will use in the tests
	public void acylcicGraph(){
		acyclic.addEdge(0, 1);
		acyclic.addEdge(0, 5);
		acyclic.addEdge(1, 2);
		acyclic.addEdge(1, 4);
		acyclic.addEdge(5, 3);
		acyclic.addEdge(3, 6);
		acyclic.addEdge(6, 7);
		acyclic.addEdge(6, 8);
		acyclic.addEdge(7, 8);
	}
	
	//function to create an graph(that cycles) that I will use in the tests
	public void cycleGraph(){
		cycle.addEdge(0, 1);
		cycle.addEdge(0, 2);
		cycle.addEdge(1, 2);
		cycle.addEdge(2, 4);
		cycle.addEdge(4, 3);
		cycle.addEdge(3, 1);
		cycle.addEdge(3, 6);
		cycle.addEdge(6, 8);
		cycle.addEdge(7, 8);
	}	
}
