import java.util.Arrays;
import java.util.Scanner;


class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[]  = new int[]{0,1,2,3,4,5,6,7,8,9};
        String p;
        String q;
        int p1;
        int q1;
        int b;
        while (true) {
            p = scan.nextLine();
            if(p.equals("")){
                break;
            }
            q = scan.nextLine();
            p1 = Integer.parseInt(p);
            q1 = Integer.parseInt(q);
            for (int i = 0; i < a.length; i++) {
                if (a[p1] != a[q1]){
                    b = a[p1];
                    for (int j = 0; j < a.length; j++) {
                        if(a[j] == b){
                            a[j]=a[q1];
                        }
                    }
                }
                System.out.println(Arrays.toString(a));
            }
        }
        System.out.println(Arrays.toString(a));
    }/* 3,4
        4,9
        8,0
        2,3
        5,6
        2,9
        5,9
        7,3
        4,8
        0,2
        6,1*/
}