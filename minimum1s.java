public class minimum1s
{
    public static void main(String[] args)
    {
        int arr[][]={{1, 1, 1, 1}, {1, 1, 0, 0}, {0, 0, 1, 1}, {1, 1, 1, 1}};
        int m= arr.length,n=arr[0].length;
        int min=Integer.MAX_VALUE,ans=0;
        for(int i=0;i<m;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                {
                    count++;
                }
            }
              if(count<min)
                {
                    min=count;
                    ans=i;
                }
        }
        System.out.println(ans+1);
    }
}
