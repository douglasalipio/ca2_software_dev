/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entitites.Flight;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.DataSet;

/**
 *
 * @author hal-9000
 */
public class UserUI {

    private List<Flight> flights = new ArrayList();
    private Scanner keyboard = new Scanner(System.in);

    public void inputFlights() {
        String dateFlight;
        String departureFrom;

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Date Flight: ");
//            dateFlight = keyboard.nextLine();
//            System.out.println("Departure From: ");
//            departureFrom = keyboard.nextLine();
//            flights.add(new Flight(dateFlight, departureFrom));
//        }
        List<Flight> dataset = DataSet.getInstance().getFlights();
        for (int i = 0; i < dataset.size(); i++) {
            System.out.println(dataset.get(i).toString());
        }
    }
}
