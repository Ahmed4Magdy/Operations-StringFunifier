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
//        List<String> funOperations = new ArrayList<>();

        System.out.println("Enter start indexes:");
        for (int i = 0; i < numRanges; i++) {
            startIndexes.add(scanner.nextInt());
        }

        System.out.println("Enter end indexes:");
        for (int i = 0; i < numRanges; i++) {
            endIndexes.add(scanner.nextInt());
        }


//    StringFunifier funifier = new StringFunifier(boringString, startIndexes, endIndexes, funOperations);
//        System.out.println(funifier.getFunnyString());

        StringFunifier funifier = new StringFunifier(boringString, startIndexes, endIndexes);
        System.out.println(funifier.getFunnyString());
    }

}

//        System.out.println("getFunRanges() => " +funifier.getFun());




