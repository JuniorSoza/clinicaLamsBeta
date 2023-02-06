package procesos;
import java.sql.*;        
public class conectaDB {
    public static Connection conectaDB(){
    
        try {           
           Class.forName("org.postgresql.Driver");
          Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/LamsClinica","postgres","Joelisrael19");
           System.out.printf("coneccion exitosa");
           return con;
        } 
        
           catch (Exception e) {
           System.out.println(e.getMessage());
           return null;
        }
    }
}
