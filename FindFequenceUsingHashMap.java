import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class FindFequenceUsingHashMap{
  static void FindFequenceInNumberArray(int arr[]){
    HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
    for(int i=0;i<arr.length;i++){
       if(hm.containsKey(arr[i])){
        hm.put(arr[i], hm.get(arr[i])+1);

        }else{
          hm.put(arr[i], 1);
        }

       }
       for(Map.Entry entry :hm.entrySet()){
        System.out.println(entry.getKey()+"    "+entry.getValue());
       }

  }


 static void findSequencOfString(char str[]){
  HashMap <Character,Integer> hm = new HashMap<Character,Integer>();
  for(int i=0;i<str.length;i++){
    if(hm.containsKey(str[i])){
     hm.put(str[i], hm.get(str[i])+1);

     }else{
       hm.put(str[i], 1);
     }

    }
    for(Map.Entry entry :hm.entrySet()){
     System.out.println(entry.getKey()+"    "+entry.getValue());
    }


  
 }
  
 
  public static void main(String[] args) {
    int arr[] ={1,2,2,3,4,4,5,5};
    //FindFequenceInNumberArray(arr);
    String str1 ="manjeetkumarhbdjhvbd";
    char ch[] =new char[str1.length()];
    for(int i=0 ;i<str1.length();i++){
       ch[i]=str1.charAt(i);
    }
   
    findSequencOfString(ch);


    }
    
  }
