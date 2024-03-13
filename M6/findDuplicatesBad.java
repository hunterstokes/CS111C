// import java.util.*;
// public static ArrayList<Integer> findDuplicatesBad(ArrayList<Integer> numberList) {
//     ArrayList<Integer> duplicateList = new ArrayList<Integer>();
         
//     // loop a: this loop is O(n)- it iterates over the whole list
//     for(int i=0; i<numberList.size(); i++) {
//        int numberEvaluating = numberList.get(i);
//        boolean duplicateFound = false;
             
//        // loop b: this loop starts at i+1 and goes to the end of the list OR until a duplicate is found
//        for(int j=i+1; j<numberList.size() && !duplicateFound; j++) {
//           int numberChecking = numbnumberListrs.get(j);
                 
//           // we have found a duplicate that hasn't yet been put on the duplicateList
//           if(numberEvaluating==numberChecking && !duplicateList.contains(numberEvaluating)) {
//              duplicateFound = true; 
                     
//              // loop c: after a duplicate is found, we won't return to loop b
//              // instead, loop c finishes checking the rest of the list and puts all copies of 
//              // of the current duplicate on the duplicateList
//              for(int k=j; k<numberList.size(); k++) {
//                 if(numberChecking==Integer.valueOf(numberList.get(k))) {
//                    duplicateList.add(numberChecking);
//                 }
//              }
//           }
//        }
//     }
//     return duplicateList;
//  }