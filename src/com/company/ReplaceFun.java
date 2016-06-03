package com.company;

/**
 * Created by admin on 03.06.2016.
 */
public final class ReplaceFun {

    /**
     * replaceFun("test", "te", "wa") = "wasw"  (t -> w, e -> a)
     * @param input
     * @param replaceStr
     * @param subStr
     * @return
     */
    public static String execute(String input,String replaceStr, String subStr){
        char [] charArray = input.toCharArray();
        for (int i =0; i < charArray.length; i++) {
            int index = replaceStr.indexOf(charArray[i]);
            if(index > -1 && index < subStr.length()){
                charArray[i] = subStr.charAt(index);
            }
        }
        return new String(charArray);
    }
}
