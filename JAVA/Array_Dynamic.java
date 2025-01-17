import java.util.Arrays;
public class Array_Dynamic{
    public static void main(String[] args){
        // System.out.println();
       Dynamic_IntArray arr=new Dynamic_IntArray(56,79);
       System.out.println("Arrays :"+Arrays.toString(arr.getArray()));
       arr.InsertLast(10);
       arr.InsertLast(50);
       arr.InsertLast(20);
       arr.InsertLast(70);
       arr.InsertLast(5);
       System.out.println("Arrays :"+Arrays.toString(arr.getArray()));
    //    arr.InsertFirst(100);
    //    arr.InsertLast(100);
    //    arr.InsertMiddle(100,100);
       arr.DeleteIndex(10);
    //    arr.Remove(0);
    //    arr.RemoveAll(0);
    //    arr.Replace(0,100);
    //    arr.ReplaceAll(0,100);
    //    arr.Reverse();
    //    arr.Sort();
    //    arr.SortReverse();
       System.out.println("Arrays :"+Arrays.toString(arr.getArray()));
    
    }
}
class Dynamic_IntArray{
    // final private int capacity=15;
    private int arr[];
    // constractors
    Dynamic_IntArray(int... value){
        arr=new int[0];
        for(int i=0;i<value.length;i++){
            InsertLast(value[i]);
        }
   
    }
    Dynamic_IntArray(){
        arr=new int[0];
    }

  //    ----------------------------------------- 
   private void ShortArray(){
    int short_Array[]=new int[this.arr.length-1];
    for(int i=0;i<short_Array.length;i++){
        short_Array[i]=arr[i];
    }
    this.arr=Arrays.copyOf(short_Array,short_Array.length);
   }
//    -----------------------------------------   
   private void ExtendArray(){
    // int[] new_Array=new int[(this.arr).length+1];
    this.arr=Arrays.copyOf(this.arr,(this.arr.length)+1);
   }
// --------------------------------
    int[] getArray(){
        return this.arr;
    }
     //    -----------------------------------------  
   int getLength(){
    return this.arr.length;
   }
    //    -----------------------------------------
    void InsertFirst(int value){        
        ExtendArray();
        for(int i=arr.length-2;i>=0;i--){         
           arr[i+1]=arr[i];
        }
        arr[0]=value;
    }
        //    -----------------------------------------
   void InsertLast(int value){
     ExtendArray();
     this.arr[this.arr.length-1]=value;
   }
    //    -----------------------------------------
   void InsertMiddle(int value, int index){
    int run=(index-this.arr.length);
    if(this.arr.length<=index){
       for(int i=0;i<=run;i++){
         
             ExtendArray();
         }
    }
    else{
    ExtendArray();
    for(int i=this.arr.length-2;i>=index;i--){
        arr[i+1]=arr[i];
    }
    }

    arr[index]=value;
    
   }
    //    -----------------------------------------  
   void DeleteIndex(int index){
    if(arr.length<=index){
     throw new ArrayIndexOutOfBoundsException("\nError : Index Invailed "+index+" Your Arrays Total Length is "+this.arr.length);
    }
    else{

       for(int i=index;i<arr.length-1;i++){
        arr[i]=arr[i+1];
       }
       ShortArray();
   }
    }
   //    -----------------------------------------
   void Remove(int value){ 
      for(int a=0;a<this.arr.length;a++){
        if(this.arr[a]==value){
            DeleteIndex(a);
            break;
        }
      }
   }
   //    -----------------------------------------
   void RemoveAll(int value){
       int new_Array[]=new int[this.arr.length];  
       int count=0;
       int len=0;
        for(int i=0;i<this.arr.length;i++){
        if(this.arr[i]==value){
            count+=1;  
        }
       else{
          new_Array[len]=this.arr[i];
          len+=1;
       }
    
      }
   
       this.arr=Arrays.copyOf(new_Array,new_Array.length-count);
   }
    //    -----------------------------------------
void Replace(int original,int replace){
    for(int i=0;i<this.arr.length;i++){
        if(this.arr[i]==original){
            arr[i]=replace;
            break;
        }
    }
}

 //    -----------------------------------------  
 void ReplaceAll(int original,int replace){
    for(int i=0;i<this.arr.length;i++){
        if(this.arr[i]==original){
            arr[i]=replace;
        }
    }
 }
//    -----------------------------------------   
   void Reverse(){
    int temp=0;
    int reverse[]=Arrays.copyOf(this.arr,this.arr.length);
    for(int i=reverse.length-1;i>=0;i--){
        this.arr[temp++]=reverse[i]; 
    }
   }
//    -----------------------------------------
   void Sort(){
    int temp;
    for(int i=0;i<this.arr.length;i++){
        for(int j=i+1;j<this.arr.length;j++){
            if(this.arr[i]>this.arr[j]){
                temp=this.arr[i];
                this.arr[i]=this.arr[j];
               this.arr[j]=temp;
            }
        }
    }
   }
//    ----------------------------------------
 void SortReverse(){
    int temp;
    for(int i=0;i<this.arr.length;i++){
        for(int j=i+1;j<this.arr.length;j++){
            if(this.arr[i]<this.arr[j]){
                temp=this.arr[i];
                this.arr[i]=this.arr[j];
               this.arr[j]=temp;
            }
        }
    }
   }

//    ----------------------------------------
int Min(){
    int min=this.arr[0];
    for(int i=1;i<this.arr.length;i++){
     if(arr[i]<min){
        min=arr[i];
     }   
    }
    return min;
}
// --------------------------------------------
int Max(){
    int max=this.arr[0];
    for(int i=1;i<this.arr.length;i++){
     if(arr[i]>max){
        max=arr[i];
     }   
    }
    return max;
}
// --------------------------------------------
}
