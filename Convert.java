import java.util.Scanner;

public class Convert {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 0;

            display();

            System.out.println("Enter your desired conversion number! (enter 5 to exit conversion program)");
            i = scanner.nextInt();

            if(i > 4) {
                i = 5;
            }

                switch(i) {
                    case 1:
                        System.out.println("Enter the weight (in pounds) you would like to convert into kilograms.");
                        int pounds = scanner.nextInt();

                        convertPounds(pounds);

                        System.out.println("Would you like to continue? (1 = Yes; 2 = No)");
                        int j = scanner.nextInt();

                        if(j == 1) {
                            for(int k = 1; k < 100;) {
                                System.out.println("Enter the weight (in pounds) you would like to convert into kilograms.");
                                pounds = scanner.nextInt();
            
                                convertPounds(pounds);
                                System.out.println("Would you like to continue? (1 = Yes; 2 = No)");
                                int l = scanner.nextInt();
                                
                                if(l == 2) {
                                    k = k + 900;
                                }
                            }
                        }
                        else {
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("Enter the weight (in grams) you would like to convert into ounces.");
                        int grams = scanner.nextInt();

                        convertGrams(grams);

                        System.out.println("Would you like to continue? (1 = Yes; 2 = No)");
                        int w = scanner.nextInt();

                        if(w == 1) {
                            for(int k = 1; k < 100;) {
                                System.out.println("Enter the weight (in grams) you would like to convert into ounces.");
                                grams = scanner.nextInt();
            
                                convertGrams(grams);
                                System.out.println("Would you like to continue? (1 = Yes; 2 = No)");
                                int l = scanner.nextInt();
                                
                                if(l == 2) {
                                    k = k + 900;
                                }
                            }
                        }
                        else {
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("Enter the length (in feet) you would like to convert into meters.");
                        int feet = scanner.nextInt();

                        convertFeet(feet);

                        System.out.println("Would you like to continue? (1 = Yes; 2 = No)");
                        int x = scanner.nextInt();

                        if(x == 1) {
                            for(int k = 1; k < 100;) {
                                System.out.println("Enter the length (in feet) you would like to convert into meters.");
                                feet = scanner.nextInt();
            
                                convertFeet(feet);
                                System.out.println("Would you like to continue? (1 = Yes; 2 = No)");
                                int l = scanner.nextInt();
                                
                                if(l == 2) {
                                    k = k + 900;
                                }
                            }
                        }
                        else {
                            break;
                        }
                        break;
                    case 4:
                        System.out.println("Enter the length (in inches) you would like to convert into centimeters.");
                        int inches = scanner.nextInt();

                        convertInches(inches);

                        System.out.println("Would you like to continue? (1 = Yes; 2 = No)");
                        int y = scanner.nextInt();

                        if(y == 1) {
                            for(int k = 1; k < 100;) {
                                System.out.println("Enter the length (in inches) you would like to convert into centimeters.");
                                inches = scanner.nextInt();
            
                                convertInches(inches);
                                System.out.println("Would you like to continue? (1 = Yes; 2 = No)");
                                int l = scanner.nextInt();
                                
                                if(l == 2) {
                                    k = k + 900;
                                }
                            }
                        }
                        else {
                            break;
                        }
                        break;

                    case 5:
                        break;
                    
                }
        }
    }

    public static void convertPounds(int pounds) {
        double kg;
        kg = (pounds * .4536);

        System.out.println(pounds + " pounds is equal to " + kg + " kilograms!");
    }

    public static void convertGrams(int grams) {
        double oz;
        oz = (grams * .03527);

        System.out.println(grams + " grams is equal to " + oz + " ounces!");
    }

    public static void convertFeet(int feet) {
        double meters;
        meters = (feet * .3048);

        System.out.println(feet + " feet is equal to " + meters + " feet!");
    }

    public static void convertInches(int inches) {
        double cm;
        cm = (inches * 2.54);

        System.out.println(inches + " inches is equal to " + cm + " centimeters!");
    }

    public static void display() {
        System.out.println("Hello! Welcome to my conversion program!");
        System.out.println("This program allows you to do four types of conversions!");
        System.out.println("Conversion 1: pounds to kilograms");
        System.out.println("Conversion 2: grams to ounces");
        System.out.println("Conversion 3: feet to meters");
        System.out.println("Conversion 4: inches to centimeters");
        System.out.println(" ");
    }
}
