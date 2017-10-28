//Anyone reading this, can you enlighten if I will need another method to be tested

import static org.junit.Assert.*;

public class NodeTest{
  Node a = new Node("c");
  Node b = new Node("b");
  Node c = new Node("c");
  Node d = new Node("d");
  
  @Test
  public void constructorTest(){//test the constructor is being set up right
    //took two nodes to show no connection has been made
    //also that the constructor will set them up the way I expect to need them
	//outdegree should equal the size of the edgesTo array as each edge to another v will be stored in the initial nodes's array
    	assertEquals("Test the value in node a","a" ,a.value);
	assertEquals("Test the value in node b","b" ,b.value);
	assertEquals("Confirm a is not connected to anything yet",0 ,a.outdegree);
	assertEquals("Confirm b is not connected to anything yet",0 ,b.outdegree);
	assertEquals("Confirm a is not connected to anything yet",0 ,a.indegree);
	assertEquals("Confirm b is not connected to anything yet",0 ,b.indegree);
	assertEquals("Confirm a is not connected to anything yet",true ,a.edgesTo.isEmpty());
	assertEquals("Confirm b is not connected to anything yet",true ,b.edgesTo.isEmpty());
  }
  
  /**
   * Joing two nodes together, from 'i' to 'j'
   * Once done the indegree for 'j' and the outdegree for 'i' will increase given 'i' is before 'j'
   */
  @Test
  public void addEdgeTest(){
  	assertEquals("a should start off with 0, before adding and edge",0,a.edgesTo.size());
	a.addEdge(b);
	assertEquals("Test that null will not have an effect, should be 1",1,a.edgesTo.size());
	assertEquals("b should still be empty as no connections from b made, should be 0",0,b.edgesTo.size());
	b.addEdge(null);
	assertEquals("Test that null will not have an effect, should be 0",0,b.edgesTo.size());
	b.addEdge(a);
	assertTrue(b.edgesTo.size()==1);
	assertEquals("Test the size increase in a, should be 1",1,b.edgesTo.size());
	a.addEdge(c);
	assertEquals("Test the size increase in a, should be 2",2,a.edgesTo.size());
	a.addEdge(d);
	assertEquals("Test the size increase in a, should be 3",3,a.edgesTo.size());  
  }
  
  /**
   * Removing a connection from 'i' and 'j'
   * Once done the indegree for 'j' and the outdegree for 'i' will decrease given 'i' is before 'j'
   */
  @Test
  public void removeEdgeTest(){
  	a.addEdge(d);
	assertEquals("Size should be 1",1,a.edgesTo.size());
	b.addEdge(c);
	assertEquals("Size should be 1",1,b.edgesTo.size());
	a.addEdge(c);
	assertEquals("Size should be 2",2,a.edgesTo.size());
	d.removeEdge(d);
	assertEquals("Removing something a connection of itself, should 0 as there should be no loop",0,d.edgesTo.size());
	a.removeEdge(c);
	assertEquals("One removed, size should be 1",1,a.edgesTo.size());
	b.removeEdge(d);
	assertEquals("Removing something that does not exist, size not be affected and equal to with still having c",1,a.edgesTo.size());
	b.removeEdge(c);
	assertEquals("Last one removed",0,b.edgesTo.size());
	a.removeEdge(null);
	assertEquals("We saw that adding a null does nothing, removing one should be",1,a.edgesTo.size());
  }
  
  //Still thinking of further tests to put in. 
  //At the moment I am happy that these will suffice for the Node class
}
