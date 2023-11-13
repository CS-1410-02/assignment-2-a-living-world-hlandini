import Java.util.Scanner;

public class Main {
    public int yearCount;

    public static void main(String[] args) {
        //Remember to make sure they input a number lol
        Scanner input = new Scanner();
        System.out.println("Spawn Rate? 1-100%");
        private int spawn = input.Next();
        System.out.println("Reproduction Rate 1-100%");
        private int reproduction = input.Next();
        System.out.println("Death Rate? 1-100%");
        private int die = input.Next();
        setRates(spawn, reproduction, die);
        System.out.println("How many years do you want to pass?");
        repeat = input.Next();
        for (int i = 0; i < repeat; i++) {
            yearCount++;
            yearPass();
        }
    }
}