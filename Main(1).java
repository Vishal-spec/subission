/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
   public static void main(String[] args) 
   {
       TreeMap<String,TreeMap<String,List<String>>> dxnry= new TreeMap<>();
       TreeMap<String,List<String>> t1 = new TreeMap<>();
       List<String> l1 = new ArrayList<>();
       l1.add("Abdominal pain, right upper quadrant");
       l1.add("Abdominal pain, right lower quadrant");
       l1.add("Abdominal pain, left upper quadrant");
       l1.add("Abdominal pain, right upper quadrant");
       t1.put("location",l1);
       List<String> l2 = new ArrayList<>();
       l2.add("Abdominal pain, mild");
       l2.add("Abdominal pain, moderate");
       l2.add("Abdominal pain, severe");
       t1.put("severity",l2);
       dxnry.put("Abdominal pain",t1);
       TreeMap<String,List<String>> t2 = new TreeMap<>();
       List<String> l3 = new ArrayList<>();
       l3.add("Chest pain, left side");
       l3.add("Chest pain, right side");
       t2.put("location",l3);
       List<String> l4 = new ArrayList<>();
       l4.add("Chest pain, mild");
       l4.add("Chest pain, moderate");
       l4.add("Chest pain, severe");
       t2.put("severity",l4);
       dxnry.put("Chest pain",t2);
       System.out.println("Root");
       for(String i: dxnry.keySet())
       {
           System.out.print("symptom->");
           System.out.println(i);
           TreeMap<String,List<String>> x = dxnry.get(i);
           for(String j:x.keySet())
           {
               List<String> temp = x.get(j);
               for(int k=0;k<temp.size();k++)
                {
                System.out.println(" ->"+j+"->"+temp.get(k));
                }
            }
       }
       Scanner sc = new Scanner(System.in);
       String string = sc.nextLine();
       if(dxnry.containsKey(string))
       {
           for(String i: dxnry.keySet())
           {
                if(!string.equals(i)) System.out.println(i);
           }
       }
       else
       {
           String str1[] = string.split(",");
           String s = str1[0];
           TreeMap<String,List<String>> x = dxnry.get(s);
           for(String a:x.keySet())
           {
               List<String> temp = x.get(a);
               for(int b=0;b<temp.size();b++)
               {
                    if(!temp.get(b).equals(string)) System.out.println(temp.get(b));
               }
            }
       }
   }
}

