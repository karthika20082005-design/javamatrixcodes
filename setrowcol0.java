public class setrowcol0 {
    public static void main(String[] args)
    {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        int m=arr.length,n=arr[0].length;
        boolean r0=false,c0=false;
        for(int i=0;i<m;i++){if(arr[i][0]==0) r0=true;}
        for(int j=0;j<n;j++){if(arr[0][j]==0) c0=true;}
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }  
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][0]==0||arr[0][j]==0)
                {
                    arr[i][j]=0;
                }
            }  
        }
        for(int i=0;i<m;i++){if(r0){arr[i][0]=0;}}
        for(int j=0;j<n;j++){if(c0) {arr[0][j]=0;}}
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
