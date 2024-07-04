/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queuelinkedlist;

/**
 *
 * @author naufal
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int menu;
        Scanner input = new Scanner(System.in);
        Linkedlist LL = new Linkedlist();

        System.out.println("==========================");
        System.out.println("Selamat Datang Di LAB UMG");
        System.out.println("UNIVERSITAS NUHAMMADIYAH GRESIK");
        System.out.println("==========================");

        do {
            System.out.println(" WELCOME ");
            System.out.println("Mohon Untuk Di isi");
            System.out.println("1. Masuk Lab ");
            System.out.println("2. Keluar Lab ");
            System.out.println("3. Data pengguna Lab ");
            System.out.println("4. Quit ");
            System.out.print("Masukan pilihan anda : ");
            menu = input.nextInt();
            if (menu == 1) {
                LL.enqueue();
            } else if (menu == 2) {
                LL.dequeue();
            } else if (menu == 3) {
                LL.view();
            } else if (menu == 4) {
                System.out.println("TERIMAKASIH");
            }else{
                System.out.println("Thomas Slebew");

            }

        }while(menu!=4);
         }
    }

