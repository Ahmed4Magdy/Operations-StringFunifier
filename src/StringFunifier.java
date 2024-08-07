import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringFunifier {
    private String boringString;
    private List<Integer> startIndexes;
    private List<Integer> endIndexes;
//    private List<String> funOperations;
// add list for Funoperation
    public StringFunifier(String boringString, List<Integer> startIndexes, List<Integer> endIndexes ) {
        this.boringString = boringString;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
//        this.funOperations = funOperations;
    }

    public String getFunnyString() {
        StringBuilder funnyString = new StringBuilder();
        int currentIndex = 0;

        for (int i = 0; i < startIndexes.size(); i++) {
            int startIndex = startIndexes.get(i);
            int endIndex = endIndexes.get(i);
//            String operation = funOperations.get(i);


            // Append the substring before the current range
            funnyString.append(boringString, currentIndex, startIndex);
            //  Append the reversed substring of the current range
            funnyString.append("(").append(new StringBuilder(boringString.substring(startIndex, endIndex + 1)).reverse()).append(")");
            //   Append the substring before the current range
            funnyString.append(boringString, currentIndex, startIndex);

            // Apply the operation to the current range
//            String substring = boringString.substring(startIndex, endIndex + 1);
//            String transformedSubstring = transformSubstring(substring, operation);
//            funnyString.append("(").append(transformedSubstring).append(")");

            // Update the current index
            currentIndex = endIndex + 1;
        }

        // Append the remaining substring (if any)
        funnyString.append(boringString, currentIndex, boringString.length());

        return funnyString.toString();
    }
}































// previous task ;
//    public String getFun() {
//        StringBuilder funnyString = new StringBuilder();
//        int currentIndex = 0;
//
//        for (int i = 0; i < startIndexes.size(); i++) {
//            int startIndex = startIndexes.get(i);
//            int endIndex = endIndexes.get(i);
//
//            // Append the substring before the current range
//            funnyString.append(boringString, currentIndex, startIndex);
//
//            // Append the reversed substring of the current range
//            funnyString.append("(")
//                    .append(new StringBuilder(boringString.substring(startIndex,endIndex+1)))
//                    .append(")");
//
//            // Update the current index
//            currentIndex = endIndex + 1;
//        }
//
//        // Append the remaining substring (if any)
//        funnyString.append(boringString, currentIndex, boringString.length());
//
//        return funnyString.toString();
//    }





