class Array2 {
    public int getMedian(int A[], int B[], int n, int m) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        if ((m + n) % 2 == 1) {
            for (count = 0;
                 count <= (n + m) / 2;
                 count++) {
                if (i != n && j != m) {
                    m1 = (A[i] > B[j]) ?
                            B[j++] : A[i++];
                } else if (i < n) {
                    m1 = A[i++];
                } else {
                    m1 = B[j++];
                }
            }
            return m1;
        } else {
            for (count = 0;
                 count <= (n + m) / 2;
                 count++) {
                m2 = m1;
                if (i != n && j != m) {
                    m1 = (A[i] > B[j]) ?
                            B[j++] : A[i++];
                } else if (i < n) {
                    m1 = A[i++];
                } else {
                    m1 = B[j++];
                }
            }
            return (m1 + m2) / 2;
        }
    }

    public static void main(String[] args) {
        Array2 a2=new Array2();
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int []A=new int[m];
        for(int i=0;i<A.length;i++){
            A[i]=s.nextInt();
        }
        int n=s.nextInt();
        int[]B=new int[n];
        for(int i=0;i<B.length;i++){
            B[i]=s.nextInt();
        }
        System.out.println(a2.getMedian(A,B,m,n));

    }
}
