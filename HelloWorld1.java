public class HelloWorld1 {

    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")){
          System.out.println("executando em DEV");   
        }else if (ambiente.equalsIgnoreCase("Test")){
         System.out.println("Ambiente de Test");  
        } else {
        System.out.println(ambiente);    
        }
       
 }
}