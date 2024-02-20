import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    //qustion2

//    public static void checkn(int num)throws Exception{
//         if(num==0){
//             throw new Exception("the result will always 0!");
//         }}

   //Qustion3

//    public static void checlr(double r)throws Exception{
//        if(r<0){
//            throw new Exception("the rduis can't be negative");
//        }
//    }



    //Qustion12

//public static void checkmin(int socend)throws Exception {
//
//       try {
//           if(socend<0)
//               throw new Exception("secound is only positive number");
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }}



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Qustion1


//        try {
//            System.out.print("Enter The number1: ");
//            int number1= input.nextInt();
//            System.out.print("Enter The number2: ");
//            int number2= input.nextInt();
//            System.out.println("The sum of "+number1+" and "+number2+"is: "+(number1+number2));
//            System.out.println("The multiply of "+number1+" and "+number2+"is: "+(number1*number2));
//            System.out.println("The subtract of "+number1+" and "+number2+"is: "+(number1-number2));
//            System.out.println("The divide of "+number1+" and "+number2+"is: "+(number1/number2));
//            System.out.println("The remaind of "+number1+" and "+number2+"is: "+(number1%number2));
//            }catch (ArithmeticException e2){
//                System.out.println(e2.getMessage());
//            } catch (InputMismatchException e1) {
//            System.out.println("Please enter only number.");
//            }


        //Qustion2:

//        System.out.print("Enter Number: ");
//        try {
//            int number = input.nextInt();
//            checkn(number);
//            int i = 0;
//            do {
//                System.out.println(i + " * " + number + "=" + (i * number));
//                i++;
//            } while (i <= 10);
//        }catch (InputMismatchException e2){
//            System.out.println("Please enter only number.");}
//    catch(Exception e){
//        System.out.println(e.getMessage());}

        //qustion3

//       try {
//           System.out.print("Enter the radus: ");
//           double raduis = input.nextDouble();
//          checlr(raduis);
//           double perimter = 2 * raduis * Math.PI;
//           double area = Math.pow(raduis, 2) * Math.PI;
//           System.out.println("perimte= " + perimter);
//           System.out.println("area= " + area);
//       }catch (InputMismatchException e3){
//           System.out.println("please enter only number");
//       }catch (Exception e){
//           System.out.printf(e.getMessage());
//       }


        //qustion4

//        try {
//            System.out.print("Enter The count of number: ");
//            double numbers = input.nextDouble();
//            int store = 0;
//            for (int i = 1; i <= numbers; i++) {
//                System.out.println("Enter an integer: ");
//                int number = input.nextInt();
//                store = store + number;
//            }
//            System.out.print("The avrege is " + (store / numbers));
//        }catch (InputMismatchException e4){
//            System.out.println("please enter only number");
//        }


        //Qustion5

//        try {
//            System.out.print("Enter first integer: ");
//            int num1 = input.nextInt();
//            System.out.print("Enter secoun integer: ");
//            int num2 = input.nextInt();
//            System.out.print("Enter third integer: ");
//            int num3 = input.nextInt();
//            int sum = num1 + num2;
//            boolean comper=num3 == sum;
//        if (comper) {
//            System.out.println(comper);
//        }else
//            System.out.println(comper);
//        }catch (InputMismatchException e5){
//            System.out.println("Please enter only number");
//        }


        //Qustion6

        //String there is no Excepstion in this qustion.

        //Qustion7
//     try {
//         System.out.print("Enter number:");
//         int number1 = input.nextInt();
//         if (number1 % 2 == 0) {
//             System.out.print("The number is Even");
//         } else {
//             System.out.print("The number is Odd");
//         }
//     }catch (InputMismatchException e7){
//         System.out.println("Please Enter only number");
//     }


        //Qustion8

//     try {
//         System.out.print("Enter tempreture in Cantigrade: ");
//         int C = input.nextInt();
//         double convert=(C*1.8)+32;
//         System.out.print("Temprture in Fehrnheit= "+convert);
//     }catch (InputMismatchException e7){
//         System.out.println("Please Enter only number");
//     }

        //Qustion9

//        System.out.print("Enter String: ");
//        String string = input.nextLine();
//        try {
//            System.out.print("Enter number: ");
//            int number= input.nextInt();
//            System.out.println(string.charAt(number));
//        }catch (InputMismatchException e9){
//            System.out.println("Please Enter only number");
//        }catch (StringIndexOutOfBoundsException e72){
//            System.out.println("number is out of the boundry");
//        }

        //Quastion10


//      try {
//          System.out.print("Enter width: ");
//          double width = input.nextDouble();
//          System.out.print("Enter Hieght ");
//          double Hieght= input.nextDouble();
//          double area=width*Hieght;
//          double perimetr =(Hieght+width)*2;
//          System.out.println("Area is " +area);
//          System.out.println("Perimetr is "+perimetr);
//      }catch (InputMismatchException e8){
//          System.out.println("Please Enter only number");
//      }


        //Qustion11

//     try {
//         System.out.print("Input first integer: ");
//         int num1 = input.nextInt();
//         System.out.print("Input secoun integer: ");
//         int num2 = input.nextInt();
//         if (num1 == num2) {
//             System.out.print(num1 + "=" + num2);
//             ;
//         } else if (num1 <= num2) {
//             System.out.print(num1 + "!=" + num2);
//             System.out.print(num1 + "<" + num2);
//         } else if (num1 >= num2) {
//             System.out.print(num1 + "!=" + num2);
//             System.out.print(num1 + ">=" + num2);
//         }
//     }catch (InputMismatchException e8){
//         System.out.println("Please Enter only number");
//     }

        //Qustion12


//        try {
//            System.out.print("Enter socend: ");
//            int socend = input.nextInt();
//            int rem = socend % 60;
//            int hour = socend / 60;
//            int mintus = hour % 60;
//            hour = hour / 60;
//            checkmin(socend);
//        }catch (InputMismatchException e12){
//            System.out.println("Please Enter only number");
//        }catch(Exception e){
//        System.out.println(e.getMessage());
//        }

        //Qustion13

//        int num1=0;
//        int num2=0;
//        int num3=0;
//        try {
//            for(int i=0;i<=3;i++){
//                if(i==1) {
//                    System.out.print("Enter first number: ");
//                    num1= input.nextInt();
//                } else if (i==2) {
//                    System.out.print("Enter second number: ");
//                    num2= input.nextInt();
//                }else if(i==3) {
//                    System.out.print("Enter Third number: ");
//                    num3 = input.nextInt();
//                }}
//            if(num1==num2&&num3==num1&&num2==num3){
//                System.out.println("Numbers are equal");
//            }else {
//                System.out.println("Numbers are not equal");
//            }
//        }catch (InputMismatchException e13){
//            System.out.println("Please Enter only number");
//        }

        //qustion14

//        try {
//            System.out.print("Enter number: ");
//            int number = input.nextInt();
//            if (number == 0) {
//                System.out.print("Number is Zero");
//            } else if (number > 0) {
//                System.out.print("Number is Postive");
//            } else if (number < 0) {
//                System.out.print("Number is Negtive");
//            }
//        }catch (InputMismatchException e14){
//            System.out.println("Please Enter only number");
//        }


        //qustion15

//     try {
//         System.out.println("Enter number");
//         int nums = 0;
//         int cheack0 = 0;
//         int cheackpls = 0;
//         int cheackneg = 0;
//         while (nums != -1) {
//             nums = input.nextInt();
//             if (nums == -1)
//                 break;
//             else if (nums > 0)
//                 cheackpls++;
//             else if (nums < 0)
//                 cheackneg++;
//             else
//                 cheack0++;
//         }
//         System.out.println(cheack0 + " Number is Zero");
//         System.out.println(cheackpls + " Number is Postive");
//         System.out.println(cheackneg + " Number is Negtive");
//     }catch (InputMismatchException e15){
//            System.out.println("Please Enter only number");
//     }


        //qustion16


//     try {
//         System.out.println("Please Enter only integer number");
//         int number= input.nextInt();
//         int revers=0;
//         while(number!=0){
//             int x= number%10;
//             revers=revers*10+x;
//             number/=10;
//         } System.out.print(revers);
//     }catch (InputMismatchException e16) {
//         System.out.println("Please Enter only integer number");
//     }


        //qustion17

//        int number;
//        int larg = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
//        try {
//        do {
//            System.out.print("Enter the Number :");
//                number = input.nextInt();
//
//                if (number > larg) {
//                    larg = number;
//                }
//                if (number < small) {
//                    small = number;
//                }
//       } while (number!=-1);
//            System.out.println("Largest Number : " + larg);
//            System.out.println("Smallest Number : " + small);
//        }catch (InputMismatchException e17) {
//            System.out.println("Please enter only number");
//        }


        //qustion18

        //there is no Exception in this qustion.
}
}

