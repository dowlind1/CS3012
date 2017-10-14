import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	//	Prior to starting my code I am going to want to test all expected areas. 
	//	Need to test the LCA for two given nodes
	//	
	//	Visualizing a Binary Tree like so:
	//	
	//	    ______3______
	//     /             \
	//   __5__          __1__
	//  /     \        /     \
	// 6       2      0       8
	//        / \
	//       7   4


	LCA tree = new LCA();

	@Test
	public void testTree() {

		// here I am building a tree with values
		tree.root = new Node(3);
		tree.root.left = new Node(5);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(2);
		tree.root.right.left = new Node(0);
		tree.root.right.right = new Node(8);
		tree.root.left.right.left = new Node(7);
		tree.root.left.right.right = new Node(4);

		//testing that the LCA function is working when I implement it, order should not matter
		assertEquals(3 ,tree.findLCA(1, 5));
		assertEquals(3 ,tree.findLCA(5, 1));//order changed
		assertEquals(3 ,tree.findLCA(3, 5));//checked that LCA can still be parent
		assertEquals(3 ,tree.findLCA(1, 3));

		//widening the parameters
		assertEquals(3 ,tree.findLCA(6, 1));
		assertEquals(2 ,tree.findLCA(7, 4));
		assertEquals(1 ,tree.findLCA(0, 8));
	}

	@Test
	public void testConstructor() {

		Node rootNode = new Node(3);//only the root node 
		assertEquals(null ,rootNode.left);
		asserEquals(null ,rootNode.right);
		assertEquals(3 ,rootNode.value);
	}

	@Test
	public void testNullTree() {
		assertNull(tree.root.value);
	}

	@Test
	public void testSmallTree() {
		//create a new small tree
		tree.root = new Node(3);
		tree.root.left = new Node(5);
		
		assertEquals(3 ,tree.findLCA(3, 5));
		assertEquals(3 ,tree.findLCA(5, 3));
		assertEquals(5 ,tree.root.left.value);
		assertNull(tree.root.right.value);
		//assertEquals(null ,tree.root.right.value);
		assertEquals(3 ,tree.root.value);
	}
	
	@Test
	public void testNonExistingNodes(){
		
		tree.root = new Node(3);
		tree.root.left = new Node(5);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(2);
		tree.root.right.left = new Node(0);
		tree.root.right.right = new Node(8);
		tree.root.left.right.left = new Node(7);
		tree.root.left.right.right = new Node(4);
		
		//one element doesn't exist
		assertEquals("Will equal to -1 if does not exist",-1 ,tree.findLCA(1, 23));
		//neither elements exist
		assertNotEquals("Will equal to -2 if neither exist",-2,tree.findLCA(9,10));
	}
	
	

}