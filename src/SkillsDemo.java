  
//A variable is a piece of memory that contains a data variables, such as 
//setting int a = 10 so when a is the input 10 is the output  
//Data types: int = integer / double = decimal / boolean = true or false / 
// char = character  
//String = sequence of characters / float = type of double ending with f 
// (or d if double) /   
import java.util.HashMap;
import java.util.Map.Entry;
   
public class SkillsDemo {  
  // hashDemo();
  public void hashDemo() {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(1, "Rent");
    map.put(2, "Electricity");
    map.put(3, "Phone Bill");
    map.put(5, "Insurance");
    map.put(6, "Cable");
    map.put(7, "Car");
    map.put(8, "Student Loans");
    map.put(9, "Debt");
    map.put(10, "Misc Spending");
    System.out.println();
    System.out.println(" I will be asking you for these expenses:");

    for (Entry<Integer, String> entry : map.entrySet()) {
      int key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + ":" + value);
    }

  }// End hashDemo
}// end main   