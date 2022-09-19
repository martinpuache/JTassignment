public class Assignment1_1_1{    

    static int counter = 1;

    public static String reduceDuplicate(String input){
        if(input.length() <= 1){
            return input + counter;
        }
        if(input.charAt(0) == input.charAt(1)){
            counter++;
            return reduceDuplicate(input.substring(1));
        }
        else{
            System.out.print(input.charAt(0));
            System.out.print(counter);
            counter = 1;
            return reduceDuplicate(input.substring(1));
        }
    }

    public static void main(String[] args) {  
        String s1 = "aaabbbccdddd";      
        System.out.println(reduceDuplicate(s1));
    }    
}   