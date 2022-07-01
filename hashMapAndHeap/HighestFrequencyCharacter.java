package hashMapAndHeap;

import java.io.*;
import java.util.*;

public class HighestFrequencyCharacter {
    public static char maxFreqCh(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int idx = 0 ; idx < str.length() ; idx++){
            char ch = str.charAt(idx);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1); //  update
            }else{
                hm.put(ch, 1); // add
            }
        }

        int maxFreq = 0;
        char mfch = ' ';
        for(Character ch : hm.keySet()){
            if(maxFreq < hm.get(ch)){
                maxFreq = hm.get(ch);
                mfch = ch;
            }
        }
        return mfch;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char ch = maxFreqCh(str);
        System.out.println(ch);
    }

}