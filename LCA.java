import java.util.ArrayList;
import java.util.List;

public class LCA {

	/**
	 * I found a good solution online and will use this for my assignment. As recommended we try not to reinvent the wheel in our studies
	 * Name of website is GeeksforGeeks and the url is: http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/
	 * I will still need to mess around with the code to cover my tests
	 */
	Node root;
	private List<Integer> path1 = new ArrayList<>();
	private List<Integer> path2 = new ArrayList<>();

	public int findLCA(int v, int w) {
		path1.clear();
		path2.clear();
		return findLCA(root, v, w);
	}

	private int findLCA(Node root, int v, int w) {
		if (!findPath(root, v, path1) || !findPath(root, w, path2)) {
			return -1;
		}
		int i;
		for (i = 0; i < path1.size() && i < path2.size(); i++) {
			if (!path1.get(i).equals(path2.get(i)))
				break;
		}
		return path1.get(i-1);
	}

	private boolean findPath(Node root, int n, List<Integer> path)
	{
		if(n<0){//will not allow negative numbers in BT
			return false;
		}
		if (root == null) {
			return false;
		}
		path.add(root.value);
		if (root.value == n) {
			return true;
		}
		if (root.left != null && findPath(root.left, n, path)) {
			return true;
		}
		if (root.right != null && findPath(root.right, n, path)) {
			return true;
		}
		path.remove(path.size()-1);
		return false;
	}


	public static void main(String[] args) {
		LCA tree = new LCA();
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
