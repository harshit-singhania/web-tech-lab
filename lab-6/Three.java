// WAP in java to count number of objects created in a program using static data member and member function 
// and use a constructor to increase the count value when obj is created 

public class Three { 
    static int count=0;  
    public static void main(String args[])  {  
        Three c1=new Three();   
        c1.count();  
        Three c2=new Three();  
        c2.count();  
        Three c3=new Three();   
        c3.count();  
        System.out.println("Total Number of Objects: "+count);  
    }  
        //function counts the number of objects  
    static void count()  
    {  
        count++;  
    }  
}  
