package _05_14_Lesson7.task3;

import java.util.Scanner;

public class VetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalInput animalInput = new AnimalInput(scanner);

        System.out.println("Enter info about animal");

        String type = animalInput.inputText("Enter type of animal");
        String breed = animalInput.inputText("Enter breed");
        String name = animalInput.inputText("Enter name");
        int age = animalInput.inputInt("Enter age");

        Animal animal = new Animal(type,breed,name,age);

        scanner.close();

        System.out.println(animal);


    }
}
