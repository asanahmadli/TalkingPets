package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();
        System.out.println("How many pets do you have?");
        int petCount = scanner.nextInt();

        int i = 0;
        while (i < petCount) {
            System.out.println("What kind of pet is?");
            String petKind = scanner.next();
            System.out.println("What is the pet name?");
            String petName = scanner.next();
            switch (petKind) {
                case "dog":
                    pets.add(new Dog(petName));
                    break;
                case "cat":
                    pets.add(new Cat(petName));
                    break;
                case "bird":
                    pets.add(new Bird(petName));
                    break;
                default:
                    System.out.println("Please enter dog, cat or bird type");
                    break;
            }
            i++;
        }

        //print pets names
        for(int j = 0; j<petCount;j++){
            System.out.println(pets.get(j).getName()+" " + pets.get(j).speak());
        }
    }
}
