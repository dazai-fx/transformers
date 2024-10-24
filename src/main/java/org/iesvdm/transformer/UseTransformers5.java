package org.iesvdm.transformer;

import java.util.Scanner;

import static org.iesvdm.transformer.Transformers.transformList;

public class UseTransformers5 {

    public static void main(String[] args) {

        // probando el metodo transformList de transformers para transformar listas de tipo LispList
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of integers with this format example: [1, 2, 3, ... ]: ");
        String line = input.nextLine();

        LispList<Integer> ls1;

        ls1 = parseIntLispList(line);

        Transformer<Integer> tenTimesTransformer = new TenTimes();

        LispList<Integer> lsResult = transformList(tenTimesTransformer,ls1);

        System.out.println(lsResult);

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

}
