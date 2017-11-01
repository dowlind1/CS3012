# Lowest Common Ancestor

### Explanation of the LCA
The lowest common ancestor (LCA) of two nodes v and w in a tree is the lowest node that has both v and w as descendants

Some of the tests I am going to be looking for:

### Tests
1. Check for the Lowest Common Ancestory

2. Test the constructor

3. Test a null tree

4. Test a small tree(at least 2 nodes - including root)

3. Test same node/elements for LCA

5. Test for non existing nodes in tree

The tests have been built and time to construct the code to implement the LCA

## Adding the Lowest Common Ancestor in a Directed Acyclic Graph

### Explanation of a DAG
The directed graph will have nodes pointing to one and other similar to the binary tree above except they will be joining other nodes from different branches at an early or later stage. Not all nodes have edges(connections) leading into them(known as indegree) and not all have edges leading out of them(known as outdegree). A directed acyclic graph will be the same except once a node/vertex is visited, there should be no ability to return to this node(ie there is no cycle within the graph). There must be atleast one vertex/node that has 0 indegrees. 

### Some Changes
As my previous design with the LCA is set up for a binary tree, I will be using the DAG branch to write a totally different approach to the problem. I will be using BFS method to traverse through the graph

### Tests

#### DAG class
Test for the following:
1. Constructor

2. Joining two verrtices together to form and edge

3. The in and out - degree of a vertex

4. To see if there is a cycle with in the graph(Looking for an acyclic graph)

5. LCA test

The class DAG produced, I feel will have a high run time. I felt the code cover done in the testing stage was suffice for the code produced. I can look to improve this at a later stage and maybe include generic types.

