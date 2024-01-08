import java.util.*;

public class patterns{
    public static void main(String [] args){
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(4);
        pattern6(4);
        pattern7(4);
        pattern8(4);
        pattern9(4);
        pattern10(4);
        pattern11(4);
        pattern12(4);
        pattern13(4);
        pattern14(4);
        pattern15(4);
        pattern16(4);
        pattern17(4);
        pattern18(4);
        pattern19(4);
        pattern20(4);
        pattern21(4);
        pattern22(4);
    }
    

    // pattern 1 
    // * * * * 
    // * * * * 
    // * * * * 
    // * * * * 
    public static void pattern1(int n){
        System.out.println("\n\npattern 1 ");
        for(int i=0; i<n ;i++){
            for(int j=0; j<n ;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    // pattern 2 
    // * 
    // * * 
    // * * * 
    // * * * * 
    public static void pattern2(int n){
        System.out.println("\n\npattern 2 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    // pattern 3 
    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4 
    public static void pattern3(int n){
        System.out.println("\n\npattern 3 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    // pattern 4 
    // 1
    // 22
    // 333
    // 4444
    public static void pattern4(int n){
        System.out.println("\n\npattern 4 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    // pattern 5 
    // ****
    // ***
    // **
    // *
    public static void pattern5(int n){
        System.out.println("\n\npattern 5 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    // pattern 6 
    // 1 2 3 4 
    // 1 2 3 
    // 1 2 
    // 1 
    public static void pattern6(int n){
        System.out.println("\n\npattern 6 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(j+1+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
/*
pattern 7 
   *   
  ***  
 ***** 
*******
*/
    public static void pattern7(int n){
        System.out.println("\n\npattern 7 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<((2*i)+1);k++){
                System.out.print("*");
            }
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    
    public static void pattern8(int n) {
        System.out.println("\n\npattern 8 ");

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<=(((n*2)-2)-i*2); j++) {
                System.out.print("*");    
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern9(int n) {
        System.out.println("\n\npattern 9 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<((2*i)+1);k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<=(((n*2)-2)-i*2); j++) {
                System.out.print("*");    
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void printDiamond(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<n-i; j++) {
                System.out.print("* ");    
            }
            System.out.print("\n");
        }
    }
    public static void pattern10(int n) {
        System.out.println("\n\npattern 10 ");        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <(n-1)-i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void pattern11(int n) {
        System.out.println("pattern 11:");
        int s=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                s=1;
            }else{
                s=0;   
            }
            for(int j=0;j<=i;j++){
                System.out.print(s+" ");
                s=1-s;
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern12(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            for (int j = 0; j < (n*3+1)-(4*i); j++) {
                System.out.print(" ");
            }
            for (int j = i+1; j>0; j--) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    public static void pattern13(int n) {
        int c=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println("");
        }
    }
    public static void pattern14(int n) {
        int c;
        for (int i = 0; i < n; i++) {
            c=65;
            for (int j = 0; j <=i; j++) {
                System.out.print((char)c);
                c++;
            }
            System.out.println("");
        }
        
    }
    public static void pattern15(int n) {
        int c;
        for (int i = 0; i < n; i++) {
            c=65;
            for(int j=0;j<(n-i);j++){
                System.out.print((char)c);
                c++;
            }
            System.out.println("");
            
        }
    }
    public static void pattern16(int n) {
        int c=65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((char)c);
            }
            c++;
            System.out.println("");
        }
        
    }
    public static void pattern17(int n) {
        int c,a,cn;
        for (int i = 0; i <n; i++) {
            c=65;
            for (int j = 0; j < (n-1)-i; j++) {
                System.out.print(" ");
            }
            cn=0;
            for (int j = 0; j < ((2*i)+1); j++) {
                a=(2*i)/2+1;                
                System.out.print((char)c);
                cn++;
                if(cn<a){
                    c++;
                }else{
                    c--;
                }
            }
            System.out.println("");
        }        
    }
    public static void pattern18(int n) {
        int c;
        for (int i = 0; i <=n; i++) {
            c=65+n-1;
            for (int j = 0; j <i; j++) {
                System.out.print((char)c+" ");
                c--;
            }
            System.out.println("");
        }
    }

    public static void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <(n*2-2-2*i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <(n*2-2-2*i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <2+i*2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern20_1(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            if (i==0 || i==n-1) {
                for (int j = 0; j <n; j++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
            else{
                for (int j = 1; j <2; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <n-1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <2; j++) {
                    System.out.print("*");
                }
                System.out.print("\n\n");
            }
            
        }
    }
    public static void pattern22(int n) {
        // int c=n;   
        // for (int i = 0; i < n*2-1; i++) {
        //     for (int j = 0; j < n*2-1; j++) {
        //         if(i==0 || i==(n*2-1)-1 || j==0 || j==(n*2-1)-1){
        //             System.out.print(n);
        //         }else{
        //             c--;
        //             pattern22(c);
        //             System.out.print(" ");
                    
        //         }
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i <= 2*n-1; i++) {
            for (int j = 0; j <= 2*n-1; j++) {
                // Math.min()
                int top=i;
                int left=j;
                int right=(2*n-1) - j;
                int bottom = (2*n-1)-i;
                int m=n-Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
