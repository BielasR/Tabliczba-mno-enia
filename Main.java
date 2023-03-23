class Main {
  public static void main(String[] args) 
{
    int a = 0;
   
    

    for(int j=0; j<10; j++)
   {
       a++; 
       int b = 1;
    
    for(int i=0; i<10; i++)
      {
        int c = a*b;
        System.out.println(a + "*" + b + "=" + c);
        b++; 
      }
       System.out.println("");
   }
}
}