import java.util.Scanner;

public class integerToRoman {

    static String roman(int x){
        int[] num={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb= new StringBuilder();
        for (int i=0;i<num.length;i++){
            while (x>=num[i]){
                sb.append(str[i]);
                x=x-num[i];
            }
        }return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the nunmber: ");
        int x=sc.nextInt();
        System.out.println("Roman for "+x+" is: "+roman(x));
    }
}

