
import java.util.Scanner;

class HelloWorld {
  static void st(String str, char ch){
       boolean x = false;
       String res = new String("");
          for (int i = 0; i < str.length(); i++) {
            if(x == true  ){
                res += str.charAt(i); 
            }else if(str.charAt(i) == ch){
                x = true;
            }else if(x == false || str.charAt(i) != ch){
            x = false;
            }
        }
     
     if(x == false){
        res = "Not Found";
     }
        System.out.print("RESULT : "+res);
        
    }
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        
        st(str,ch);

    }
}