public class TowerOfHanoi {
    public int towerOfHanoi(int n){
        int s = 0;
        if(n == 1){
            return 1;
        }
        return s + towerOfHanoi(n-1) + 1 + towerOfHanoi(n-1);
    }
    public void movesForTowerOfHanoi(int n ,char SourceT ,char Aux ,char DestT){
        if(n > 0){
            movesForTowerOfHanoi(n-1,SourceT,DestT,Aux);
            System.out.println(SourceT + " to " + DestT);
            movesForTowerOfHanoi(n-1,Aux,SourceT,DestT);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi t1 = new TowerOfHanoi();
        System.out.println(t1.towerOfHanoi(4));
        t1.movesForTowerOfHanoi(3,'A','B','C');
    }
}
