import java.io.*;
import java.util.*;

public class Main {

  public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public StackToQueueAdapter() {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }

    int size() {
        // write your code here
         return mainS.size();
      }
  
      void add(int val) {
        // write your code here
        mainS.push(val);
      }
  
      int remove() {
        // write your code here
        if(this.size()==0) {
          System.out.println("Queue underflow");
          return -1;
        }
        int sz = mainS.size();
        for(int i=0;i<sz-1;i++){
          helperS.push(mainS.pop());
        }
        int remove=mainS.pop();
        int hz = helperS.size();
        for(int i=0;i<hz;i++){
          mainS.push(helperS.pop());
        }
        return remove;
      }
  
      int peek() {
        // write your code here
        if(this.size()==0) {
          System.out.println("Queue underflow");
          return -1;
        }
        int sz = mainS.size();
        for(int i=0;i<sz-1;i++){
          helperS.push(mainS.pop());
        }
        int remove=mainS.pop();
        helperS.push(remove);
        int hz = helperS.size();  //yha size update ho rha tha..isliye size ko var me store krane ke baad loop chlana tha
       
        for(int i=0;i<hz;i++){
          mainS.push(helperS.pop());
        }
        return remove;
      }
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StackToQueueAdapter qu = new StackToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}