/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hal-9000
 */
public class StringUtils {

    private StringUtils() {

    }

    public static boolean validateDate(String date) {
        boolean res = false;
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);
        try {
            format.parse(date);
            res = true;
        } catch (ParseException e) {
            res = false;
        }
        return res;

    }

    public static void clean() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException ex) {
            Logger.getLogger(StringUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(StringUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
