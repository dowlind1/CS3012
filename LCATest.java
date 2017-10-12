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
	public void test() {
		
        tree.root = new Node(3);
        tree.root.left = new Node(5);
        tree.root.right = new Node(1);
        tree.root.left.left = new Node(6);
        tree.root.left.right = new Node(2);
        tree.root.right.left = new Node(0);
        tree.root.right.right = new Node(8);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(4);
	}

}
