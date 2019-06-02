package simple;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
   public static void main(String[] args) {
       Locale locale = new Locale("es");
       ResourceBundle rb = ResourceBundle.getBundle("mensajes",locale);

       System.out.println(rb.getString("saludo"));
   }
}
