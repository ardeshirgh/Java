package ca.ardeshir.main;

import java.awt.*;
import java.rmi.activation.ActivationGroup_Stub;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Execptions.exeptions();

        //Account Code Start
//        Account acc = new Account("john", 100, 200);
//        System.out.println(acc.toString());

//        acc.transferMoney(Account.type.checking, Account.type.saving, 100);
//        System.out.println(acc.toString());
        //Account code Finished

        //for rectangle and circle and shape and Square

//        Rectangle rec = new Rectangle(50d, 100d);
//        System.out.println(rec.getName());
//
//        Box aBox = new Box("metal", 9d);
//        System.out.println(aBox.area());
//
//
//        Shape[] shapeArr = new Shape[]{
//                new Circle(2.5),
//                new Rectangle(5.4, 9.3),
//                new Square(4.5)
//        };
//
//        Scanner sn = new Scanner(System.in);
//        System.out.println("provide a index 0 1 or 2");
//        int indexNum = sn.nextInt();
//
//        if (indexNum == 0) {
//
//            System.out.println("radius?");
//            double r = sn.nextDouble();
//            ((Circle) shapeArr[indexNum]).setRadius(r);
//            System.out.println("length modified to " + r);
//            System.out.println("the area of square is");
//            System.out.println(((Circle) shapeArr[indexNum]).area());
//
//        } else if (indexNum == 1) {
//
//            System.out.println("height?");
//            double h = sn.nextDouble();
//            System.out.println("width?");
//            double w = sn.nextDouble();
//            ((Rectangle) shapeArr[1]).setHeight(h);
//            ((Rectangle) shapeArr[1]).setWidth(w);
//
//            System.out.println("height modified to " + h);
//            System.out.println("weight modified to " + w);
//            System.out.println("the area of square is");
//            System.out.println(((Rectangle) shapeArr[indexNum]).area());
//
//        } else if (indexNum == 2) {
//            System.out.println("length?");
//            double l = sn.nextDouble();
//            ((Square) shapeArr[indexNum]).setLenght(l);
//
//            System.out.println("length modified to " + l);
//            System.out.println("the area of square is");
//            System.out.println(((Square) shapeArr[indexNum]).area());
//        }

//        int[] array = {1, 2, 3, 5, 6};
//
//        List<Integer> arrayList = new ArrayList<>();// flexible size
//        List<Integer> linkedList = new LinkedList<>();// flexible size
//
//        System.out.println("this is array list");
//        arrayList.add(100);
//        arrayList.add(101);
//        arrayList.add(102);
//        arrayList.add(103);
//        arrayList.add(104);
//        arrayList.add(105);
//
//        arrayList.set(2, 103);
//
//        for (Integer i : arrayList) {
//            System.out.println(i);
//        }
//
//        System.out.println("arrayList.get(0)" + arrayList.get(0));
//        System.out.println(arrayList.contains(5));//false
//        System.out.println(arrayList.contains(105));//true
//
//
//        System.out.println("this is linked list");
//        linkedList.add(100);
//        linkedList.add(101);
//        linkedList.add(102);
//        linkedList.add(103);
//        linkedList.add(104);
//        linkedList.add(105);
//
//        linkedList.set(2, 103);
//
//        for (Integer i : linkedList) {
//            System.out.println(i);
//        }
//
//        System.out.println("arrayList.get(0)" + linkedList.get(0));
//        System.out.println(linkedList.contains(5));//false
//        System.out.println(linkedList.contains(105));//true
//
//
//        List<Shape> shapesList = new LinkedList<>();
//        shapesList.add(new Box());
//        shapesList.add(new Square());
//        shapesList.add(new Circle());
//        shapesList.add(new Rectangle());
//
//        for (Shape s : shapesList){
//            System.out.println(s.getName());
//        }

        //for rectangle and circle and shape and Square End


        // PET, ANIMAL, DOG, CAT START
//        Pet[] pets = new Pet[2];
//
//        pets[0] = new Cat();
//        pets[1] = new Dog();
//
//       for (Object i : pets){
//
//           if (i instanceof Cat) {
//               ((Cat)i).move();
//           }
//       if (i instanceof Dog) {
//           ((Dog)i).move();
//       }
//
//       }
//
//       Toy atoy = new Toy("ball","purple nad white");
//
//       Cat tweety = new Cat(atoy);
//       tweety.getToy().getColor();
//
//       List<Toy> lotsOfToys = new ArrayList<>();
//       lotsOfToys.add(new Toy("ball","black and white"));
//        lotsOfToys.add(new Toy("chewing bone","brown"));
//        lotsOfToys.add(new Toy("GIJO","green"));
//        lotsOfToys.add(new Toy("stick","blue"));
//
//        Dog fluffy = new Dog(lotsOfToys);
//
//        for (Toy k : fluffy.getToys()){
//            System.out.println(k.getName() + "-" + k.getColor());
//        }

        // PET, ANIMAL, DOG, CAT FINISH


    }

}
