public class matrixsearch
{
       public static void main(String[] args)
    {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=23;
        int m=arr.length;
        int n=arr[0].length;
        int l=0;
        int r=m*n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            int x=arr[mid/n][mid%n];
            if(x==target)
            {
                System.out.println(mid/n +" "+ mid%n);
                break;
            }
            if(x<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
    }
    }
}
