public class rightskewedtree {
    Node root;
    static class Node{
        Node right;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public void rightskewed(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        rightskewed(root.right);
    }

    public static void main(String[] args) {
        rightskewedtree rst=new rightskewedtree();
        Node n1=new Node(10);
        Node n2=new Node(9);
        Node n3=new Node(8);
        Node n4=new Node(7);
        rst.root=n1;
        n1.right=n2;
        n2.right=n3;
        n3.right=n4;
        rst.rightskewed(n1);

    }
}
