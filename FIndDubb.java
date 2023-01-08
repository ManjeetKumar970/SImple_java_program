package Maths;

public class FIndDubb {
    public static void main(String[] args) {
        int arry[]=new int[]{1,2,2,5,56,56,9,9};
        

        for(int i=0;i<arry.length;i++){
            for(int j=i+1;j<arry.length;j++){
                if(arry[i]==arry[j]){
                    System.out.print(arry[j]);

                }
            }

        }
    }
    
}
