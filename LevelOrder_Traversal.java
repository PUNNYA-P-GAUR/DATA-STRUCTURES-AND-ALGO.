import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    Node root;
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    public void LevelorderT(Node root){
        if(root==null)
            return;
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node t=q.poll();
            System.out.println(t.data);
            if(t.left!=null){
                q.offer(t.left);
            }
            if(t.right!=null){
                q.offer(t.right);
            }

        }
    }

    public static void main(String[] args) {
        LevelOrder LO=new LevelOrder();
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        LO.root=n1;
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        LO.LevelorderT(n1);
    }
}
