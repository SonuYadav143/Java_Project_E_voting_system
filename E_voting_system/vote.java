package E_voting_system;
import  java.util.Scanner;
public class vote {
    float c;
    float cpp;
    float Java;
    float Python;

    // make  function to calculate result
    static  void result(int TotalVoters,int[]arr){
        vote v = new vote();
        float percent = 100/TotalVoters;
        v.c = v.cpp = v.Java = v.Python =0;  //object call
        for (int i=0; i<TotalVoters; i++){
            switch (arr[i]){
                case 1:
                    (v.c)++;
                    break;
                case 2:
                    (v.cpp)++;
                    break;
                case 3:
                    (v.Java)++;
                    break;
                case 4:
                    (v.Python)++;
                    break;
            }
        }
        System.out.println("\n\n");
        System.out.println("\tResult\n");
        System.out.println("C Language \t"+(v.c)*percent+"%");
        System.out.println("Cpp Language \t"+(v.cpp)*percent+"%");
        System.out.println("Java Language \t"+(v.Java)*percent+"%");
        System.out.println("Python Language \t"+(v.Python)*percent+"%");
        System.out.println("\n\n");
    }
    public static void main(String[] args) {

        System.out.println("Voting System");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of voters");
        int TotalVoters = sc.nextInt();
        int arr[] = new int[TotalVoters];  //store result of selected option
        for(int i = 0; i < TotalVoters; i++){

            System.out.println("\n");
            System.out.println("select any one options");
            System.out.println("1.C Language");
            System.out.println("2.Cpp Language");
            System.out.println("3.Java Language");
            System.out.println("4.Python Language");
            arr[i] =sc.nextInt();
        }
        // cell function
        result(TotalVoters,arr);
    }
}
