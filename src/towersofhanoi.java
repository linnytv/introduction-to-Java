import java.util.Scanner;
public class towersofhanoi {
    static void hanoiTowers(int n, char fromRod, char toRod, char helperRod){
        if (n==1){
            System.out.println("Move disk 1 from rod " + fromRod + " to rod" + toRod);
            return;
        }
        hanoiTowers(n-1,fromRod, helperRod,toRod);
        System.out.println("Take disk "+ fromRod + " from rod " + fromRod + " to rod " + toRod);
        hanoiTowers(n-1,fromRod,toRod,helperRod);
    }
    public static void main(String[] args){
        System.out.println("Please enter number of disks: ");
        Scanner scanner = new Scanner(System.in);
        int disks= scanner.nextInt();
        hanoiTowers(disks,'A','B','C');
        scanner.close();
    }
}
