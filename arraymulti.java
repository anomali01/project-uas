public class arraymulti {
    public static void main(String[] args) {
        int[] a = {4,99,-83};
        for (int i = 0; i < a.length; i++) {
            System.out.printf(
                "a[%d] = %d\n",
                i, a[i]
            );
        for (int i : a) {
            System.out.println(i);
            
        }
        }
        int[][] b = new int[3][4];
        int[][] c = {
            {1,2,3,4},
            {5,6,7,8},
            {9,0,1,2},
        };

        int val = c[2][3];
        int[] row1 = c[0];

        int[][] d = new int[3][];
        d[0] = new int[4];
        d[1] = new int[]{1,2};
        d[2] =  new int[100];

        for(int i = 0; i < c.length;i++){
            
        }
        
        int[][][] e = new int[4][6][2];
    }
}
