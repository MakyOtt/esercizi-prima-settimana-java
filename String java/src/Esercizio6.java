public class Esercizio6 {
    public static void main(String[] args){
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }
    //1: Create a String to hold some text, decide on the text you want it to hold and then name it appropriately
    // print out your string in upper case, and in lower case
    private static void exercise1(){
        System.out.println("Exercise1:");
        String favoriteFood= "Dmytro likes chicken!";
        System.out.println(favoriteFood.toUpperCase());
        System.out.println(favoriteFood.toLowerCase());
    }
    //2: Edit the code below, so it prints out the first name and last name in uppercase, and the
    //middle name in lower case
    private static void exercise2(){
        System.out.println("Esercise2:");

        String firsName= "Marika";
        String middleName= "Maky";
        String lastName= "Ottanà";

        System.out.println(firsName.toUpperCase() +" " + middleName.toLowerCase() + " " + lastName.toUpperCase()); //<--- edit this line
    }
    //3: Assign the value of 2 or more primitive types to our variable textFrom2Primitives
    //use the "+" operator
    //choose from these primitives : double, int, char, boolean
    //use primitive literals like : 1.5, 67, 'b' , true
    //+
    //Experiment with these different types, how do an int and a double behave when added?
    //What about a boolean and an int?
    // "" + 1.5
    private static void exercise3(){
        System.out.println("Exercise3:");

      String textFrom2Primitives= String.valueOf(1)+ String.valueOf(false);
        System.out.println(textFrom2Primitives);
    }
    /*4: Without editing the Strings below make the print statement print
      1 2 3 4 5 6 7 8 9 with the correct spacing in between all the numbers
      You will need to use .trim()
     */
    private static void exercise4() {
        System.out.println("Exercise 4:");
        String endNumbers = "7 8 9";
        String middleNumbers = "       4 5 6";
        String earlyNumbers = "1 2 3";

        System.out.println(earlyNumbers +" "+ middleNumbers.trim() +" "+ endNumbers);
    }
}
