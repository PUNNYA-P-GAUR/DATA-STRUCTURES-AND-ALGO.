public class leftskewedtree {
    Node root;
    static  class Node {
        int data;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }
    void leftskewed(Node root){
        if(root==null){
            return;
        }
        else{
            System.out.println(root.data);
            leftskewed(root.left);
        }
    }
    public static void main(String[] args) {
        leftskewedtree lst=new leftskewedtree();
        Node n1=new Node(10);
        Node n2=new Node(9);
        Node n3=new Node(8);
        Node n4=new Node(7);
        lst.root=n1;
        n1.left=n2;
        n2.left=n3;
        n3.left=n4;
        lst.leftskewed(n1);
    }
}
