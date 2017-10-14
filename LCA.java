import java.util.ArrayList;
import java.util.List;

public class LCA {

	//	Node root;//Calling in the node class
	//	
	//	public int findLCA(int v, int w){
	//		return -1;
	//	}
	//	
	/**
	 * I found a good solution online and will use this for my assignment. As recommended we try not to reinvent the wheel in our studies
	 * Name of website is GeeksforGeeks and the url is: http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/
	 * I will still need to mess around with the code to cover my tests
	 */
	Node root;
	private List<Integer> path1 = new ArrayList<>();
	private List<Integer> path2 = new ArrayList<>();

	int findLCA(int v, int w) {
		path1.clear();
		path2.clear();
		return findLCA(root, v, w);
	}

	private int findLCA(Node root, int v, int w) {
		if (!findPath(root, v, path1) || !findPath(root, w, path2)) {
			System.out.println((path1.size() > 0) ? "v is present" : "v is missing");
			System.out.println((path2.size() > 0) ? "w is present" : "w is missing");
			return -1;
		}
		int i;
		for (i = 0; i < path1.size() && i < path2.size(); i++) {
			//  System.out.println(path1.get(i) + " " + path2.get(i));
			if (!path1.get(i).equals(path2.get(i)))
				break;
		}
			return path1.get(i-1);
	}

	private boolean findPath(Node root, int n, List<Integer> path)
	{
		if(n<0){
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


	//	public static void main(String[] args) {
	//		// TODO Auto-generated method stub
	//
	//	}

}
