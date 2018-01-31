package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Parašyti programą,
         * kuri leistų vartotojui įvesti norimą skaičių
         * ir po to parašytų ar šis skaičius yra lyginis ar ne lyginis.
         * Užuomina panaudokite % operatoriu.
         * */
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
