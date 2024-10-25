package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Scanner;

public class UseJoiners1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        LispList<Integer> ls1,ls2,ls3;
        System.out.print("Enter a list (of integers): ");
        String str = in.nextLine();
        ls1 = parseIntLispList(str);
        System.out.print("Enter another list (of integers): ");
        str = in.nextLine();
        ls2 = parseIntLispList(str);
        Joiner<Integer> adder = new JoinByAdding();
        ls3 = Joiners.zipLists(adder,ls1,ls2);
        System.out.println("Adding corresponding integers in the lists gives:\n"+ls3);


        // probando la implementación de zipArrayLists

        System.out.println("Now with ArrayList");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter a list (of integers): ");
        str = in.nextLine();
        list1 = parseIntArrayList(str);

        System.out.print("Enter a list (of integers): ");
        str = in.nextLine();
        list2 = parseIntArrayList(str);

        ArrayList<Integer> result = Joiners.zipArrayLists(adder, list1, list2);

        System.out.println("Adding corresponding integers in the lists gives:\n" + result);


    }

    public static LispList<Integer> parseIntLispList(String str)
    {
        String line = str.trim();
        String contents = line.substring(1,line.length()-1).trim();
        if(contents.length()==0)
            return LispList.empty();
        String[] nums = contents.split(",");
        LispList<Integer> list = LispList.empty();
        for(int i=nums.length-1; i>=0; i--)
        {
            String num = nums[i].trim();
            list = list.cons(Integer.parseInt(num));
        }
        return list;
    }

    public static ArrayList<Integer> parseIntArrayList(String str) {
        // Remove leading and trailing whitespace from string
        String line = str.trim();

        // Remove leading and trailing brackets
        String contents = line.substring(1, line.length() - 1).trim();

        // Create an empty ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // If content is empty, return empty list
        if (contents.length() == 0) {
            return list;
        }

        // Split the string by commas to get the numbers
        String[] nums = contents.split(",");

        // Add the numbers to the ArrayList
        for (String num : nums) {
            list.add(Integer.parseInt(num.trim()));
        }

        return list;
    }

}
