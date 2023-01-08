package Maths.Maths;

public class Patten {
    int n=10;
    void patten1(){   //10,11,13,16,20

       

        for(int i=0;i<n;i++){
            System.out.println((i*i+i)/2+n);
        }

    }
  
    //A to Z

    void charAndItn(){
        char A=65;
        for(int i=65,j=1;i<91;j++,i++){
            System.out.println((char)i+"\t->\t"+j+"= "+i);
        }

    }


    void patten2(){
        for(int i=1;i<n;i=i+2){
            for(int j=i;j<n;j++){
               if(j%2!=0){
                  System.out.println(j*i+(i/2-i));
               }
             
            }

        }
    }
    void pattenSU(){
   
        for(int i=1,n=10;i<n;i=i+2){
            System.out.print(i*(i-1)+(i-1)/2+",");
        }

    }

    
    public static void main(String[] args) {
    
        Patten p = new Patten();
        //p.charAndItn();
        //p.patten1();
        //p.patten2() ;
        p.pattenSU();
       
    }
    
}
