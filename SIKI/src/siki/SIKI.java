package siki;

import java.sql.SQLException;

/**
 *
 * @author briandparmana 2201010659
 * TGL: 2024-06-15
 */
public class SIKI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        jFormObat jf = new jFormObat();
        jf.setResizable(false);
        jf.setAlwaysOnTop(true);
        jf.setVisible(true);
    }
    
}
