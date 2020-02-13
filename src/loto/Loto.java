package loto;

import java.util.*;

public class Loto {
    public static void main(String[] args) {
        int a=15; //cate numere posibile
        int b=5; //cate numere extrag
        int c=3; //cate numere trebuie sa nimeresc

        List<Integer> listaNumerePosibile=new ArrayList<>();
        adaugaNumere(listaNumerePosibile, a);
        System.out.println("Numerele posibile sunt: " + Arrays.toString(listaNumerePosibile.toArray()));
        System.out.println("------------------------");

        List<Integer> listaNrJucator=new ArrayList<>();
        System.out.println("Dati 5 numere pentru a juca");
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <b ; i++) {
            listaNrJucator.add(scanner.nextInt());
        }
        System.out.println("Numerele alese de jucator sunt: "+ Arrays.toString(listaNrJucator.toArray()));
        System.out.println("------------------------");

        List<Integer> listaNrExtrase=new ArrayList<>();
        extrageNumere(listaNrExtrase, b);
        System.out.println("Numerele extrase sunt: "+ Arrays.toString(listaNrExtrase.toArray()));
        System.out.println("------------------------");

        String amCastigat=oareAmCastigat(listaNrExtrase, listaNrJucator, c);
        System.out.println(amCastigat);
    }

    public static List<Integer> adaugaNumere(List<Integer> listaNr, int a) {
        for (int i = 0; i <a; i++) {
            listaNr.add(i, Integer.valueOf(i+1));
        }return listaNr;
    }

    public static List<Integer> extrageNumere(List<Integer> listaNrCastigatoare, int b){
        int i=0;
        Random rand = new Random();
        while (i<b){
            listaNrCastigatoare.add(i, rand.nextInt(b)+1);
            i++;
        }
        return listaNrCastigatoare;
    }

    public static String oareAmCastigat(List<Integer> listaNrExtrase, List<Integer> listaNrJucator, int c) {
        int x = 0;
        for (int i = 0; i < listaNrExtrase.size(); i++) {
            if (listaNrExtrase.contains(listaNrJucator.get(i))) {
            x++;}
        }

        if (x >=c) {
            return "Ai Castigat!!!";
        } else return ":( :( :( nu ai castigat nimic";
    }

}
