
 class Calculation2 {
     void sum(int a, int b)
     {
         System.out.println(a+b);
     }
     void sum(double a, double b)
     {
         System.out.println(a+b);
     }
     public static void main(String[] args) {
        Calculation2 obj= new Calculation2();
        obj.sum(10, 10);
        obj.sum(10.2, 1.5);
     }
}
