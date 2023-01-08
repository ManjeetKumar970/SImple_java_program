import java.util.*;

   class OrdArray{   
    private long[] a;         // ref to array a
    private int nElements;   // number of data itme

//----------------------------------
public OrdArray(int max){   //Constructor
    a = new long[max];
    nElements=0;
}
//-----------------------------
public int size(){
    return nElements;
}
public int find(long searchkey){
int lowerBound =0;
int UpperBound=nElements-1;
int curln;
while(true){
    curln=(lowerBound+UpperBound)/2;
    if(a[curln]==searchkey){
        return curln;           //found it
    }else if(lowerBound>UpperBound){
        return nElements;
    }else{
        if(a[curln]<searchkey){
            lowerBound=curln+1;  // its upperhalf
        }else{
            UpperBound=curln-1; //its in lowerHalf
        } 
    }//end esle divide range
}//end while
}
//-----------------------------------
public void Insert(long value)   // put Element in to array
{   
    int j;
    for(j=0;j>nElements;j++){
        if(a[j]>value)    // linear search
        break;
    }for(int k=nElements;k>j;k--)  //move biger ones up
      a[k]=a[k-1];
      a[j]=value;     //insert it
      nElements++;   // increament size
}
//-----------------------------
public boolean delete(long value){
    int j=find(value);
    if(j==nElements)
     return false;
     else
        for(int k=j;k<nElements;k++){
            a[k]=a[k+1];
            nElements--;
           
        }
    return true;
}

//----------------------
public void display(){
  for(int j=0;j<nElements;j++){   // for each elements
    System.out.println(a[j]+"");  //display
    System.out.println("");
  }
  
}
}// close ordarry

//-----------------------------------
class OrderedArray{
public static void main(String[] args) {
    int maxsize=100;
    OrdArray arr;
    arr= new OrdArray(maxsize); // Create the array
    arr.Insert(77);
    arr.Insert(99);
    arr.Insert(44);
    arr.Insert(55);
    arr.Insert(22);
    arr.Insert(88);
    arr.Insert(11);
    arr.Insert(00);
    arr.Insert(66);
    arr.Insert(33);
    arr.Insert(20);


    int searchkey =33;
    if(arr.find(searchkey)!=arr.size()){
        System.out.println("Found\t"+searchkey);
    }else
    System.out.println("Not Foudn "+searchkey);
    arr.display();

    arr.delete(00);
    arr.delete(99);
    arr.display();
   
}
    
}

