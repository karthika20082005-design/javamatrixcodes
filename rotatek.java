public class rotatek {
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int k=2;
        int m=arr.length,n=arr[0].length;
        int res[][]=new int[m][n];
        k=k%n;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=arr[i][(j+k)%n];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
