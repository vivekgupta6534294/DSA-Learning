package stacksAndQueuesForBeginners;

// Remove Bracket which are needless 
// (a + b) + ((c + d)) true
// ((a+b)) false needless is there 

import java.util.*;
public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=')'){
                st.push(s.charAt(i));
            }else{
                if(st.peek()=='('){
                    System.out.println("true");
                    return;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        System.out.println("false");
    }
}
