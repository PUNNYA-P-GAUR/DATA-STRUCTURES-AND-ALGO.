static class Node
{
	int data;
	Node left, right;
	boolean rightThread;
}


// Utility function to find leftmost node in a tree rooted
// with n
Node leftMost(Node n)
{
	if (n == null)
		return null;

	while (n.left != null)
		n = n.left;

	return n;
}

// C code to do inorder traversal in a threaded binary tree
static void inOrder(Node root)
{
	Node cur = leftMost(root);
	while (cur != null) {
		System.out.printf("%d ", cur.data);

		// If this node is a thread node, then go to
		// inorder successor
		if (cur.rightThread)
			cur = cur.right;
		else // Else go to the leftmost child in right
			// subtree
			cur = leftmost(cur.right);
	}
}


