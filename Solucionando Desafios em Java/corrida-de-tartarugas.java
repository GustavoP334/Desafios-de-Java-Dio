import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import java.util.Locale;

public class Main {

public static void main(String[] args) {

Locale.setDefault(new Locale("en", "US"));

Scanner sc = new Scanner(System.in);

while(sc.hasNext()){

int t = Integer.parseInt(sc.nextLine());

List<Integer> tartaruga = new ArrayList<>();

String[] tt = new String[t];

String aux = sc.nextLine();

tt = aux.split(" ");

for(int i=0 ; i<t ; i++)

tartaruga.add(Integer.parseInt(tt[i]));

Collections.sort(tartaruga);

Collections.reverse(tartaruga);

//System.out.println(tartaruga);

//Nível 3: Se a velocidade é maior ou igual a 20 cm/h .

if(tartaruga.get(0)>=20) System.out.println("3");

//Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .

else if(tartaruga.get(0)<20 && tartaruga.get(0)>=10) System.out.println("2");

//Nível 1: Se a velocidade é menor que 10 cm/h .

else System.out.println("1");

}

sc.close();

}

}
