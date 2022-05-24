  
public class Week3 {
  public static void main(String[] args) {

     
   //Task1
    int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};

    int subtraction = ages[ages.length - 1] - ages[0];
    System.out.println("First result: " + subtraction);
    
    int[] ages2 = new int[] {11, 70, 30, 53};
    
    subtraction = ages2[ages2.length - 1] - ages2[0];
    System.out.println("Second result: " + subtraction);
    
    int sum = 0;
    for (int i = 0; i < ages.length; i++)
    {
      sum += ages[i];
    }
    double average = sum / ages.length;
    
    System.out.println("Average ages: " + average);
    
    System.out.println("---");
    
   //Task2
    String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    double nameSum = 0;
    for (int i = 0; i < names.length; i++)
    {
      nameSum += names[i].length();
    }
    average = nameSum / names.length;
    
    System.out.println("Average number of letters: " + average);
    
    String concat = "";
    for (int i = 0; i < names.length; i++)
    {
      concat += names[i];
      concat += " ";
    }
    System.out.println("Concatenated string: " + concat);
    
    //Task5, Task6
    int[] nameLengths = new int[6];
    for (int i = 0; i < names.length; i++)
    {
      nameLengths[i] = names[i].length();
    }
    sum = 0;
    for (int i = 0; i < nameLengths.length; i++)
    {
      sum += nameLengths[i];
    }
    System.out.println("Sum of name lengths: " + sum);

    System.out.println("---");
    
    // Task7
    String concatTest = ConcatNTimes("Hello", 7);
    System.out.println(concatTest);
    
    System.out.println("---");
    
    // Task8
    String createdName = CreateName("John", "Smith");
    System.out.println(createdName);
    System.out.println("---");
    
    // Task10
    double[] grades = new double[5];
    grades[0] = 89.6;
    grades[1] = 90.2;
    grades[2] = 100.0;
    grades[0] = 89.6;
    grades[0] = 79.4;
    System.out.println("The average of all the elements in the array: " + calculateAvarage(grades));
    
    
    System.out.println("---");
    
    //Task11
    boolean testArrays;
    double[] d1 = new double[] {3, 4, 5, 6, 7};
    double[] d2 = new double[] {7, 8, 9};
    testArrays = CompareArrays(d1, d2);
    System.out.println("Test Arrays: " + testArrays);
    
    System.out.println("---");
    //Task12
    boolean testBuyDrink = WillBuyDrink(true, 6);
    System.out.println("Test buy drink: " + testBuyDrink);
    
    
    
  }
  
  public static String ConcatNTimes(String word, int n)
  {
    String res = "";
    for (int i = 0; i < n; i++)
    {
      res += word;
    }
    return res;
  }
  
  public static String CreateName(String name1, String name2)
  {
    return name1 + " " + name2;
  }
  
  
 public static int sumArray(int[] numbers) {
   int[] myArray = new int[3];
   myArray[0] = 10;
   myArray[1] = 50;
   myArray[2] = 0;
   System.out.println("Sum of array is " + sumArray(myArray));  
   
   
   int sum = 0;
     for (int number : numbers) {
       sum += number;
     }
     return sum;
   
 }
  
  
public static double calculateAvarage(double[] numbers) {
  double sum = 0;
  for(double number : numbers) {
    sum +=number;
  }
  return sum / numbers.length;
}
 
 
 
  public static boolean CompareArrays(double[] arr1, double[] arr2)
  {
    double average1;
    double average2;
    
    //find average of arr1, arr2 - find each average and divide by Array.1engh
    double sum1 = 0;
    double sum2 = 0;
    
    for (int i = 0; i < arr1.length; i++)
    {
      sum1 += arr1[i];
    }
    average1 = sum1 / arr1.length;
    
    for (int i = 0; i < arr2.length; i++)
    {
      sum2 += arr2[i];
    }
    average2 = sum2 / arr2.length;
    
    return average1 > average2;
    
        
    
  }
  
  public static boolean WillBuyDrink (boolean isHotOutside, double moneyInPocket) {
    return isHotOutside && moneyInPocket > 10.5;
  }

  //Task13 Find the smallest number among three numbers
  
//  Scanner in = new Scanner(System.in);
//  System.out.print("Input the first number: ");
//  double x = in.nextDouble();
//  System.out.print("Input the Second number: ");
//  double y = in.nextDouble();
//  System.out.print("Input the third number: ");
//  double z = in.nextDouble();
//  System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
//
//
//public static double smallest(double x, double y, double z)
//{
//  return Math.min(Math.min(x, y), z);
//} 
  
  
  
}
