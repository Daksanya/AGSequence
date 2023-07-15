import java.util.Scanner;

public class AGSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(agSequence(string));
    }
    static int agSequence(String string){
        int result=0,countA=0;
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)=='A'){
                countA++;
            }
            else if(string.charAt(i) =='G'){
                result+=countA;
            }
        }
        return result;

    }
}