public class rotate90 {
    public static void main(String[] args)
    {
        int arr[][]={{0, 1, 2},{3, 4, 5},{6, 7, 8}};
        int m=arr.length,n=arr[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0,k=m-1;j<k;j++,k--)
            {
                int temp=arr[j][i];
                arr[j][i]=arr[i][k];
                arr[i][k]=temp;
            }
        }
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
