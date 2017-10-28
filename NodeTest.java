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
  
  }
  
  /**
   * Removing a connection from 'i' and 'j'
   * Once done the indegree for 'j' and the outdegree for 'i' will decrease given 'i' is before 'j'
   */
  @Test
  public void removeEdgeTest(){
  
  }
  
  //Still thinking of further tests to put in. 
  //At the moment I am happy that these will suffice for the Node class
}
