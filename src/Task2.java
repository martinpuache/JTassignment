import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        String input = myObj.nextLine();

        char[] charArray = input.toCharArray();
        boolean isThereSpace = true;

        for(int i = 0; i < charArray.length; i++){
            if(Character.isLetter(charArray[i])){
                if(isThereSpace){
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    isThereSpace = false;
                }
            }
            else{
                isThereSpace = true;
            }
        }

        String output = String.valueOf(charArray);

        System.out.println(output);

   
    }
}
