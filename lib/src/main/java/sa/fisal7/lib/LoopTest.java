package sa.fisal7.lib;

 class LoopTest {
//     public static void main(String[ ] args) {
//                 int x = 0;
//                 while (x < 5) {
//                         System.out.print(x + " ");
//                     }
//
//             }


     interface Calculations {
         int calculation(int a, int b);
     }

     public static int performCalculation(int a, int b, Calculations calc) {
         return calc.calculation(a, b);
     }

     public static void main (String[ ] args ) {
         Calculations multiplication = (int a, int b) -> a * b;
         Calculations subtraction = (int a, int b) -> a - b;
         System.out.println(performCalculation(5, 3, multiplication) + "\n" + performCalculation(5, 3, subtraction));
     }
 }
