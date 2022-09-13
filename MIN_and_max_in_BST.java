class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node==null){
            return -1;
        }
        Node temp=node;
        while(temp.left!=null){
            temp=temp.left;
        }
        return(temp.data);
    }
}
