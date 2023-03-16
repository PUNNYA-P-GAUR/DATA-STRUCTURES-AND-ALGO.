import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    private HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    public Graph(int v){
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noofEdge(){
        int edge=0;
        for(int key: map.keySet()){
            edge+=map.get(key).size();
        }
        return edge/2;
    }

    public void removeEdge(int v1,int v2){
        if(ContainsEdge(v1,v2)){
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }
    public void removeVertex(int v1){
        for(int key: map.get(v1).keySet()){
            map.get(key).remove(v1);
        }
    }
    public boolean haspath(int src, int des, HashSet<Integer> visited){
        if(src==des){
            return true;
        }
        visited.add(src);
        for(int nbr: map.get(src).keySet()){
            if(!visited.contains(nbr)){
                boolean ans=haspath(nbr,des,visited);
                if(ans) return ans;
            }
        }
        visited.remove(src);
        return false;
    }
    public void display(){
        for(int key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
    public static void main(String[] args) {
        Graph g=new Graph(7);
        g.AddEdge(1,4,6);
        g.AddEdge(1,2,10);
        g.AddEdge(2,3,7);
        g.AddEdge(3,4,5);
        g.AddEdge(6,7,3);
        g.display();
        System.out.println(g.haspath(1,6,new HashSet<>()));
    }
}
