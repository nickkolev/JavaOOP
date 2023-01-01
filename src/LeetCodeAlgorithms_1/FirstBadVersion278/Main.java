package LeetCodeAlgorithms_1.FirstBadVersion278;

import java.util.Scanner;

public class Main extends VersionControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        System.out.println(firstBadVersion(input));
    }

    public static int firstBadVersion(int n) {
        int l=1;
        while(l<=n){
            int m=l+(n-l)/2;
            if(isBadVersion(m)){
                n=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}
