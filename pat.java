public class pat {
    public static void main(String[] args) {
        int n=4;
        // this is butterfly pattern
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            //Spaces
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //lower part
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            //Spaces
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // this is solid rombus
        n=5;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<=n ; i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //palindromic pattern
        for(int i=1;i<=n;i++) {
            //spaces
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //diamond pattern
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}