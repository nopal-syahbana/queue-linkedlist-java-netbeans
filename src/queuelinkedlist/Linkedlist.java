/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuelinkedlist;

/**
 *
 * @author naufal
 */
public class Linkedlist {

    public Datapengunjung head, tail;

    public Linkedlist() {
        head = null;
        tail = null;

    }

    public void enqueue() {
        Datapengunjung dt = new Datapengunjung();
        dt.input();
        if (head == null)
            head = dt;
        else
            tail.next = dt;
        tail = dt;
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Data kosong");
        } else {
            System.out.println("mahasiswa dengan NIM : " +head.nim+ "atas nama : " +head.nama);
            head = head.next;
        }

    }

    public void view() {
        if (head == null) {
            System.out.println("data kosong");
        } else {
            System.out.println("===============");
            System.out.println("|| NIM || Nama || Alamat ||");
            for (Datapengunjung a = head; a != null; a = a.next){a.read();
                System.out.println("===============");
            }
        }
    }
}