public class Task3 extends Employee {    
    public Task3(String x, int y) {
        super(x, y);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {        
            
        //Initialize array
        Employee [] arr = new Employee [5];

        arr[0] = new Employee("Martin", 0);
        arr[1] = new Employee("Jason", 1);
        arr[2] = new Employee("Elsa", 8);
        arr[3] = new Employee("Anna", 5);
        arr[4] = new Employee("Mark", 3);

    
        String temp = "";    
            
        //Displaying elements of original array    
        System.out.println("Elements of original employee array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i].getName() + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i].workExperience > arr[j].workExperience) {    
                   temp = arr[i].name;    
                   arr[i].name = arr[j].name;    
                   arr[j].name = temp;    
               }     
            }     
        }    
            
        System.out.println();

        //Displaying elements of array after sorting    
        System.out.println("Employee array sorted based on years of experience: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i].getName()    + " ");    
        }    
    }    
}   