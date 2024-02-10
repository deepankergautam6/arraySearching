import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = {78,90,34,6,8,23};
        System.out.println("array searching");
        System.out.println("please enter a number");
        int num = input.nextInt();
        boolean isfound = isFound(myArr,num);
        if(isfound){
            System.out.println("mil gya");
        }else {
            System.out.println("nhi mila");
        }
    }
    public static  boolean isFound(int[] myArr, int num ) {
        int index = 0;
        while (index < myArr.length) {
            if (myArr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
        //  System.out.println("you number is not found");
    }



}




