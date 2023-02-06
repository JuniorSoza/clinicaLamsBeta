package procesos;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

/**
 *
 * @author Junior
 */
public class fechas {
    
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYY");
    public String getFecha(JCalendar fecha){
        if (fecha.getDate() != null) {
            return formato.format(fecha.getDate());
        }else{
        return null;
        }            
    }          

    public String getFecha(JDateChooser DateChooserPrueba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
