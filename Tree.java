import jdk.swing.interop.SwingInterOpUtils;

class BinaryTree {
    Node root;

   static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    void preOrder(Node root) {                      //RECURSIVE CALL METHOD
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);                         //RECURSIVE CALL
        preOrder(root.right);                        //RECURSIVE CALL
    }
    void postOrder(Node root){                      //RECURSIVE CALL METHOD
       if(root==null)
           return;
       postOrder(root.left);                       //RECURSIVE CALL
       postOrder(root.right);                      //RECURSIVE CALL
       System.out.print(root.data+" ");

    }
    void inOrder(Node root){                             //RECURSIVE CALL METHOD
       if(root==null)
           return;
       inOrder(root.left);                               //RECURSIVE CALL
       System.out.print(root.data+" ");
       inOrder(root.right);                              //RECURSIVE CALL
    }

    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree();
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(80);
        Node n5 = new Node(40);
        Node n6 = new Node(50);
        Node n7=new Node(60);
        Node n8 =new Node(90);
        Node n9=new Node(100);
        b1.root = n1;
        n1.left = n2;
        n1.right=n5;
        n2.left=n3;
        n3.right=n4;
        n5.left=n6;
        n5.right=n7;
        n6.right=n8;
        n8.left=n9;
        System.out.print("PREORDER ---> ");
        b1.preOrder(b1.root);
        System.out.println();
        System.out.print("POSTORDER ---> ");
       b1.postOrder(b1.root);
        System.out.println();
       System.out.print("INORDER ---> ");
       b1.inOrder(b1.root);

    }
}
