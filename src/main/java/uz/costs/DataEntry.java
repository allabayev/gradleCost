package uz.costs;

import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
        System.out.println("Oylik maoshingizni kiriting");
        Scanner in = new Scanner(System.in);
        int getZarp = in.nextInt();
        System.out.println("Kunlik transport xarajatingizni kiriting");
        int getTransport = in.nextInt();
        System.out.println("Zavtrakga qancha xarajat qilasiz");
        int getZavtrak = in.nextInt();
        System.out.println("Obedga qancha sarflaysiz");
        int getObed = in.nextInt();
        System.out.println("Ujinga qancha sarflaysiz");
        int getUjin = in.nextInt();
        System.out.println("Qushimcha kunlik xarajatingiz qancha");
        int getKarmRasxod = in.nextInt();
        System.out.println("Xaftasiga praduktaga qancha sarflaysiz");
        int getProduktta = in.nextInt();
        System.out.println("Xaftasiga choyxonaga qancha sarflaysiz");
        int getChoyxona = in.nextInt();
        System.out.println("Oylik kamunal to'lovlaringiz qancha");
        int getKamunalka = in.nextInt();
        System.out.println("Oyiga kvartplataga qancha to'laysiz");
        int getKvartPlata = in.nextInt();
        System.out.println("Oyiga uqish uchun qancha xarajat qilasiz");
        int getUchyoba = in.nextInt();
        System.out.println("Odejdaga qancha sarflaysiz");
        int getOdejda = in.nextInt();

        int sum=getTransport*30+getZavtrak*30+getObed*30+getUjin*30+getKarmRasxod*30+
                (getProduktta/7)*30+(getChoyxona/7)*30+getKamunalka+getKvartPlata+getUchyoba+getOdejda;
        System.out.println("Oylik xarajatlaringiz " + sum);
        int xarDar=sum-getZarp;
        if (getZarp<sum) {
            System.out.println("Xarajat daromatdan oshib ketyapti " + xarDar + " sumga. Qushimcha daromadingiz bormi?");
        } else {
            System.out.println("Oyiga omonatga " + xarDar + " sum quysangiz bularkan");
        }

        System.out.println("Sizning oylik daromadingiz " + getZarp);
    }
}