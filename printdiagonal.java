public class printdiagonal {
    public static void main(String[] args)
    {
        int arr[][]={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int n= arr.length;
        int res[]=new int[n*n];
        int idx=0;
        for(int d=0;d<2*n-1;d++)
        {
            int r=(d<n)?d:n-1;
            int c=d-r;
            if (d % 2 == 0) {   
                while (r >= 0 && c < n) {
                    res[idx++] = arr[r--][c++];
                }
            } else {            
                int rr = c;
                int cc = r;
                while (rr <= r && cc >= 0) {
                    res[idx++] = arr[rr++][cc--];
                }
            }
        }
        for(int i:res)
        {
             System.out.print(i+" ");
        }
    }   
}
