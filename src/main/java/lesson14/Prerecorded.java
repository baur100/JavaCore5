package lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Prerecorded {
    public static void main(String[] args) {
        var list = new ArrayList<String>();   //var  произвольная variable
        ArrayList<String> list1 = new ArrayList<String>();
        var map = new HashMap<String, String>();

        var List = new ArrayList<Persons>();
        List.add(new Persons(15, "John"));
        List.add(new Persons(20, "Nick"));
        List.add(new Persons(18, "Max"));
        List.add(new Persons(16, "Ilya"));
        List.add(new Persons(21, "Robert"));

        System.out.println("===============FOR==================");
        for (var i = 0; i < List.size(); i++) {
            Persons person = List.get(i);
            System.out.println(person.getName());
        }
        System.out.println("==============FOR EACH===================");
        for (Persons v : List) {
            System.out.println(v.getName());
        }
        System.out.println("==============ЛЯМДА, АНОНИМНАЯ ФУНКЦИЯ====================");
        //лямда
        List.forEach(x -> System.out.println(x.getName()));

        System.out.println("==============МЕТОДЫ ВЫБОРКИ ПО УСЛОВИЯМ====================");
        System.out.println("===============FOR==================");
        for (var i = 0; i < List.size(); i++) {
            Persons person = List.get(i);
            if (person.getAge() >= 18) {
                System.out.println(person.getName());
            }
        }
        System.out.println("==============FOR EACH===================");
        for (Persons v : List) {
            if (v.getAge() >= 18) {
                System.out.println(v.getName());
            }
        }
        System.out.println("==============STREAM API====================");
        List.stream()   //переводим в stream type
                .filter(person -> person.getAge() >= 18)  // фильтруем функциями of stream
                .collect(Collectors.toList())        //переходим из stream to list
                .forEach(person -> System.out.println(person.getName()));  //цикл forEach прогоняем по всему отфильтрованному листу

        //Правильно оформлять stream api в одну строку
        List.stream().filter(person -> person.getAge() >= 18).collect(Collectors.toList()).forEach(person -> System.out.println(person.getName()));
        var org = new PreOrganization("Super company", "1500s 20th Ave");

        org.addBranches(new PreBranch(7, "1919 Van Buren St"));
        org.addBranches(new PreBranch(2, "1"));
        org.addBranches(new PreBranch(3, "133 Men do Chino St"));
        org.addBranches(new PreBranch(1, "45413 A St"));
        org.addBranches(new PreBranch(4, "1"));
        org.addBranches(new PreBranch(6, "111 Bfgsav St"));
        org.addBranches(new PreBranch(5, "1"));

        List<PreBranch> br= org.getBranches();
        System.out.println("==============STREAM 1====================");
        List<String> addresses = br.stream()
                .map(xx -> xx.getAddress())
                .collect(Collectors.toList());
        addresses.forEach(ad -> System.out.println(ad));

        System.out.println("==============STREAM 2====================");
        List<String> adrs=br.stream()
                .map(yy->yy.getAddress())
                .filter(y->y=="1")
                .collect(Collectors.toList());
        adrs.forEach(a-> System.out.println(a));

        var r= br.stream()     .anyMatch(x->x.getNumber()==1);
        System.out.println(r);

boolean answer;
for(PreBranch z: br){
    if(z.getNumber()==7) {
        answer = true;
    }
    }
}


    }


