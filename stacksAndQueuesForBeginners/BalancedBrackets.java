package stacksAndQueuesForBeginners;

// [(a + b) + {(c + d) * (e / f)}]
import java.util.*;
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                if(s.charAt(i)=='(')
                     st.push(')');
             if(s.charAt(i)=='{')
                     st.push('}');
            if(s.charAt(i)=='[')
                     st.push(']');
            }
            else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                if(st.size()!=0 && st.peek()==s.charAt(i)){
                    st.pop();      
                }else{
                    // System.out.println(s.charAt(i));
                    
                    System.out.println("false");
                    return;   
                }
            }
            else{
                continue;
            }
        }
        if(st.size()!=0){
            System.out.println("false");
            return;   
        }else{
            System.out.println("true");
            return;

        }
        
    }
}
