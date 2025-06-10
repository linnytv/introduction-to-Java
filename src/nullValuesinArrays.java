import java.util.Arrays;

public class nullValuesinArrays {
    public static void main(String[] args){
        //Array null values
        int [] numbers = new int[3];
        Arrays.fill(numbers, -1);
        numbers[0]=2;
        System.out.println(Arrays.toString(numbers));
        String [] names= new String[3];
        names[1]="Jeff";
        System.out.println(Arrays.toString(names));
    }
}
