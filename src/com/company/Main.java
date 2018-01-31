package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk skaiciu: ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("lyginis");
        }
        else {
            System.out.println("nelyginis");
        }
    }
}
