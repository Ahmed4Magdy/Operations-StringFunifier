import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the boring string:");
        String boringString = scanner.nextLine();

        System.out.println("Enter the number of ranges:");
        int numRanges = scanner.nextInt();

        List<Integer> startIndexes = new ArrayList<>();
        List<Integer> endIndexes = new ArrayList<>();
        List<String> funOperations = new ArrayList<>();

        System.out.println("Enter start indexes:");
        for (int i = 0; i < numRanges; i++) {
            startIndexes.add(scanner.nextInt());
        }

        System.out.println("Enter end indexes:");
        for (int i = 0; i < numRanges; i++) {
            endIndexes.add(scanner.nextInt());
        }

        System.out.println("enter  numberofranges ");
         int numofranges = scanner.nextInt();
        System.out.println("Enter fun operations (REVERSE, UPPERCASE, LOWERCASE, SORT, COMPRESSION):");
        for (int i = 0; i < numofranges; i++) {
            funOperations.add(scanner.next().toUpperCase());
        }

        StringFunifier funifier = new StringFunifier(boringString, startIndexes, endIndexes, funOperations);
        System.out.println(funifier.getFunnyString());
    }


}

//        System.out.println("getFunRanges() => " +funifier.getFun());




