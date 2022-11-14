public class homework9 {
    public static void main(String[] args) {

        /* 17
        int n=5;
        for( int i=1;i<=n;i++){
            for(int h=1;h<i;h++)System.out.print(" ");
            for (int j=i;j<=n;j++) System.out.print(j);
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int h=i;h>1;h--)System.out.print(" ");
            for (int j=i;j<=n;j++) System.out.print(j);
            System.out.println();
        }
         */
/*
5
4 5 4
3 4 5 4 3
2 3 4 5 4 3 2
1 2 3 4 5 4 3 2 1

2 3 4 5 4 3 2
3 4 5 4 3
4 5 4
5
 */
        int n=5;

        for (int i = n; i >= 1; i--)
        {
            for (int j = i; j <= n; j++)
            {
                System.out.print(j + " ");
            }

            for (int k = n-1; k >= i; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();


        }
    }


}
