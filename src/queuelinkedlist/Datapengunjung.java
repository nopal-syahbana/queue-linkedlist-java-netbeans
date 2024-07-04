/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuelinkedlist;

/**
 *
 * @author naufal
 */
import java.util.Scanner;

public class Datapengunjung {
    public int nim;
    public String nama,alamat;
    public Datapengunjung next;

    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input(){
        System.out.println();
        System.out.print("Masukkan NIM : ");
        nim = in.nextInt();
        System.out.print("Masukkan Nama : ");
        nama = str.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = str.nextLine();
        next=null;

    }
    public void read(){

        System.out.println("|| "+nim+"|| "+nama+"|| "+alamat+" ");

    }


}
