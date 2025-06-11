//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        Practical Example
        //Print all even numbers between 1 and 20



        for (int i = 1; i <= 20; i++){

        if (i % 2 == 0){
            System.out.println(i);
        }
        }
        //Calculate the factorial of a given number
        int number = 10;
        int factorial = 1;
        for (int k = 1; k <= number; k++){
            factorial *= k;
        }
        System.out.println("Faktorial dari " + number + " adalah: " + factorial);



//    for (int i = 1; i <= 10; i++){
//        // to see how IntelliJ IDEA suggests fixing it.
//     if(i <= 3){
//         System.out.println(i + " Ini Dibawah 4");
//     }else if(i <= 6){
//         System.out.println(i + " Ini Dibawah 7");
//     }else if(i < 10){
//        System.out.println(i + " Ini Dibawah 10");
//     }else{
//         System.out.println(i + " Ini adalah 10");
//     }
//        }
//
//    for (int j = 1; j <= 3;j++){
//
//     String angka;
//     switch (j){
//         case 1: angka = "satu"; break;
//         case 2: angka = "dua"; break;
//         case 3: angka = "tiga"; break;
//         default: angka = "invalid name"; break;
//     }
//     System.out.println(angka);
//    }

//        While LOOP
//        int i = 1;
//        while(i < 10){
//            System.out.println("Ha");
//            i++;
//        };
//
//        do{
//            System.out.println("Haha");
//            i++;
//        }while (i > 15);

    }
}