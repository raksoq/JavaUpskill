package Intro;

import java.util.Scanner;

public class StaticBlock {

    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag = true;

    static{
        System.out.println("Inside static");
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args){
        System.out.println("Inside main");
        if(flag){
            int area=B*H;
            System.out.print("Area of parallelogram: " +area);
        }

    }//end of main
}
