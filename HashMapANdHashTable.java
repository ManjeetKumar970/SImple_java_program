package CollectionFreamWorkEx;

import java.util.HashMap;
import java.security.KeyStore.Entry;
import java.util.*;

public class HashMapANdHashTable {

    // Hash Map Delecrtion
   public static void main(String[] args) {
    HashMap<Integer,String> hm = new HashMap<>();
    hm.put(1, "Manjeet");
    hm.put(2, "Shekhar");
    hm.put(4, "govind");
    hm.put(3, "Amar");
    hm.put(5, "Chandan");
    hm.put(6, null);
    hm.put(7, "rk");



    for(Map.Entry<Integer,String>e : hm.entrySet()){
        System.out.println(e.getKey()+ "  "+ e.getValue());

    }

   }
    
}
