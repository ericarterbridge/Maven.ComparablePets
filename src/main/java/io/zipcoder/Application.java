package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner petCount = new Scanner(System.in);
        Scanner petType = new Scanner(System.in);
        Scanner petName = new Scanner(System.in);
//        ArrayList<String> petTypeList = new ArrayList<String>();
//        ArrayList<String> petNameList = new ArrayList<String>();
        ArrayList<Pet> petObject = new ArrayList<>();
//        Pet[] petObjectArr = new Pet[petObject.size()];
//        petObjectArr = petObject.toArray(petObjectArr);
//        Arrays.sort(petObjectArr);

        System.out.println("How many pets do you have?");
        int petCountInt = petCount.nextInt();
        for (int i = petCountInt; i > 0; i--) {
            System.out.println("What kind of pet do you have?");
            String petTypeIn = petType.nextLine();
            System.out.println("What is that pet's name?");
            String petNameIn = petName.nextLine();
            if (petTypeIn.equalsIgnoreCase("dog")){
                petObject.add(new Dog(petNameIn));
            } else if (petTypeIn.equalsIgnoreCase("cat")){
                petObject.add(new Cat(petNameIn));
            } else if (petTypeIn.equalsIgnoreCase("bird")){
                petObject.add(new Bird(petNameIn));
            } else {
                petObject.add(new Pet(petNameIn));
            }
        }

        Pet[] petObjectArr = new Pet[petObject.size()];
        petObjectArr = petObject.toArray(petObjectArr);
        Arrays.sort(petObjectArr, Comparator.comparing(Pet::getName));
        for (int i = 0; i<petObject.size(); i++){
            //System.out.println(petObject.get(i).getName() + " says " + petObject.get(i).speak());
            System.out.println(petObjectArr[i].getName() + " says " + petObjectArr[i].speak());
        }
    }
}
