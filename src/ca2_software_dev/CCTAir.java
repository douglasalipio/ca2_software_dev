/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2_software_dev;

import com.sun.tools.javac.Main;
import java.util.List;

/**
 *
 * @author hal-9000
 */
public class CCTAir {

    public static void main(String[] args) {

        DataSet dataSet = new DataSet();
        List<Flight> flights = dataSet.getFlights();
        for (int k = 0; k < 30; k++) {
            System.out.println(flights.get(k).toString());
        }

    }
}
