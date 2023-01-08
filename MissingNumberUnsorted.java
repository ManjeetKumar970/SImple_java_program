package Number_sets;
//Program to find smallers psotive Number
public class MissingNumberUnsorted {
    public static void main(String[] args) {
        int array[]={1,2,3,5};
        
       
        System.out.println(MissingNumber(array,0));
        for(int i=0;i<array.length;i++){
          System.out.println(array[i]);
        }
    }
    static int MissingNumber(int array[], int n) {
        {
        int sum=0;
        int sum1 =0;
        int j;
          for(int i=0;i<array.length;i++){
            sum +=array[i];
           
          }
          for(int i=1;i<=5;i++){
            sum1 +=i;
          }
          int to = sum1-sum;
          for( j=0;j<array.length;j++){
            if(to<array[j]){
              int temp =to;
              array[j]=to;
              temp =array[j];
              return array[j];
            }  //4<3
          }
          
          return 0;
    
    }
}
}
