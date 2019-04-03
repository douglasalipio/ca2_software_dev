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
import models.CCTAirPresenter;
import data.DataSet;

/**
 *
 * @author hal-9000
 */
public class UserUI implements CCTAirView {

    private List<Flight> flights = new ArrayList();
    private Scanner keyboard = new Scanner(System.in);
    private CCTAirPresenter presenter = new CCTAirPresenter();

    /**
     * Inject the view to the presenter.
     */
    public UserUI() {
        presenter.inject(this);
    }

    /**
     * Show options to the user to input data flights.
     */
    public void inputFlights() {
        String dateFlight;
        String departureFrom;
        for (int i = 0; i < 5; i++) {
            System.out.println("Date Flight: ");
            dateFlight = keyboard.nextLine();
            System.out.println("Departure From: ");
            departureFrom = keyboard.nextLine();
            flights.add(new Flight(dateFlight, departureFrom));
        }
    }

    /**
     * Get all flight created by default.
     */
    public void defaultFlights() {
        List<Flight> flights = DataSet.getInstance().getFlights();
        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights.get(i).toString());
        }
        Flight test = flights.get(flights.size() - 1);
        Flight test1 = flights.get(flights.size() - 2);

    }

    /**
     * Schedule a flight by arrival time.
     *
     * @param flight
     */
    public void scheduleDefaultFlightsByArrivalTime(Flight flight) {
        presenter.scheduleByArrivalTime(flight);
    }

    /**
     * Schedule a flight by arrival time and departure time.
     *
     * @param flight
     */
    public void scheduleDefaultFlight(Flight flight) {
        presenter.schedule(flight);
    }

    /**
     * Showing change to the user.
     *
     * @param flight
     */
    @Override
    public void onScheduleSuccess(Flight flight) {
        System.out.println("Flight changed to:" + flight.getArrivalTime());
    }

}
