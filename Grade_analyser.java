
import java.util.Scanner;

public class Grade_analyser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int totalStudent= sc.nextInt();
        String[] Name= new String[totalStudent];
        int[] Reg = new int[totalStudent];

        String[] subject = {"Maths","Science","English","Social","Tamil"};
        int[] marks = new int[subject.length];


        for(int i=0; i<totalStudent;i++){
            System.out.print("Enter Student name "+(i+1)+": ");
            Name[i]=sc.next();
            System.out.print("Enter reg.no for student "+Name[i]+": ");
            Reg[i] = sc.nextInt();
            System.out.println("Student "+Name[i]+" marks: ");
            for(int j=0;j<5;j++){
                System.out.print("    Enter Subject "+subject[j]+" marks: ");
                marks[j]=sc.nextInt();
            }
            System.out.println("\n");
            int total =0;
            for(int k=0;k<5;k++){
                total= total+marks[k];
            }
            double average = total/5.0;
            System.out.println("Total marks for Student "+Name[i]+":"+total);
            System.out.println("Average of Student "+Name[i]+":"+average+"\n");
            if(average>80 && average<=100){
                System.out.println("Student "+Name[i]+" got Grade A.");
            }
            else if (average>60 && average<=80) {
                System.out.println("Student "+Name[i]+" got Grade B.");
            }
            else{
                System.out.println("Student "+Name[i]+" got Grade c.\n");
            }

            for(int m=0;m<5;m++){
                if (marks[m]<35) {
                    System.out.println("Student "+Name[i]+" in subject "+subject[m]+" is Failed.\n");
                }
                else{
                    System.out.println("Student "+Name[i]+" in subject "+subject[m]+" is Passed.\n");
                }
            }
        }
        sc.close();
    }
}