package java_lab.cat2;

import java.util.Scanner;

public class assessment4 {

    static class NoSuchElementException extends Exception {
        String str;

        NoSuchElementException(String s) {
            str = s;
        }

        public String toString() {
            return (str);
        }
    }



    public static void main(String args[]) {
        Registration obj = new Registration();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your registration number: ");
        String Reg_ID=sc.next();
        System.out.print("Enter your mobile number:  ");
        String mob=sc.next();
        obj.check_Reg_length(Reg_ID);
        obj.check_mobile_length(mob);
        obj.check_mob(mob);
        try
        {
            obj.chech_RegID(Reg_ID);
        }
        catch(NoSuchElementException e) {
            System.out.println("Caugth"+e);
        }

    }

}

class Registration {
    void check_Reg_length(String Reg_ID) {
            if (Reg_ID.length() != 9){
                System.out.println("INVALID !!!");
                throw new IllegalArgumentException("Registration no. does not contain exactly 9 chars !! please check....");
            }
    }

    void check_mobile_length(String mob) {
        if (mob.length() != 10){
            System.out.println("INVALID !!!");
            throw new IllegalArgumentException("Mobile no. does not contain exactly 10 chars !! please check....");
        }
    }

    void check_mob(String mob) {
        int i;
        for (i = 0; i < mob.length(); i++)
            if ("0123456789".indexOf(mob.charAt(i)) != -1) {
                System.out.println("Please check your mobile number.....");
                throw new NumberFormatException("Mobile no. cannot contain characters other than digits ..... ");
            }
    }

    void chech_RegID(String Reg_ID) throws assessment4.NoSuchElementException {
        int i, flag = 0;
        for (i = 0; i < Reg_ID.length(); i++)
            if ("!@#$%^&*()_+".indexOf(Reg_ID.charAt(i)) != -1) {
                flag = 1;
                throw new assessment4.NoSuchElementException("Special character found");
            }
        if (flag == 0)
            System.out.println("Entered registration number is valid !! ");
    }

}


