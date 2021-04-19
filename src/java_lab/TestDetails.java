package java_lab;

import java.util.*;
class TestDetails
{
    float a[][]=new float[25][7];
    public void storeMarks(int stu_num, int[] arr) {
        int i;
        for(i=0;i<7;i++)
            a[stu_num][i] = arr[i];
    }
    public void display() {
        System.out.println("STUDENT DETAILS : ");
        for(int i=0;i<25;i++) {
            for(int j=0;j<7;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println(); }
    }
    public static void main(String []args) {
        int i,j;
        TestDetails obj =new TestDetails();
        int marks[]=new int[7];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<25;i++)
        {
            System.out.println("\nStudent "+(i)+" :"+"\nEnter the number of test :  ");
            int num=sc.nextInt();
            for(j=0;j<num;j++) {
                marks[j] = sc.nextInt();
            }
            if(num<7) {
                for(j=num;j<7;j++)
                    marks[j]=0;
            }
            obj.storeMarks(i,marks);
        }
        obj.display();
    }
}
class NoticePeriod extends TestDetails {
    public void printDetails() {
        int test_num=0,i,j; float sum=0; for(i=0;i<25;i++)
        {
            for(j=0;j<7;j++)

            {
                if(a[i][j]==0) {
                    test_num+=1;
                }

                sum=sum+a[i][j];

                if(sum>=50&&i==3)
                break;
            }
            if(sum<=50 || test_num<3 ) {
                System.out.println("Student benched ID number = " + i);
            }
            sum=0;
            test_num=0;
        }
    }
    public static void main(String args[]) {
        NoticePeriod obj=new NoticePeriod(); obj.printDetails();
    }
}