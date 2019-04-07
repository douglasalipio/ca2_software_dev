/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import data.DataSet;
import entitites.AirPlane;
import entitites.Flight;
import entitites.Pilot;
import java.util.ArrayList;
import java.util.List;
import views.CCTAirView;

/**
 *
 * @author hal-9000
 */
public class CCTAirPresenter {

    private CCTAirView view;

    /**
     * Dependency injection
     *
     * @param view
     */
    public void inject(CCTAirView view) {
        this.view = view;
    }

    /**
     * Getting all flight created by default.
     */
    public void listAllFlights() {
        List<Flight> flights = DataSet.getInstance().getFlights();
        view.showAllFlights(flights);
    }

    /**
     *
     * @param departureFrom
     * @param dateFlight
     * @param arrivalTo
     */
    public void createFlight(String departureFrom, String dateFlight, String arrivalTo) {
        Flight newFlight = new Flight(dateFlight, departureFrom, arrivalTo);
        List<AirPlane> airPlanes = DataSet.getInstance().getMockAirplane();
        List<Pilot> pilotes = DataSet.getInstance().getMockPilots();
        view.onSuccessFlight(newFlight, airPlanes, pilotes);
    }

    /**
     * Submit a flight to the data set.
     *
     * @param flight
     */
    public void submitFlight(Flight flight) {
        DataSet.getInstance().setFlight(flight);
    }

    /**
     * Submit arrival time to a flight.
     */
    public void submitArrivalTime() {
        List<Flight> allFlights = DataSet.getInstance().getFlights();
        List<Flight> userFlights = new ArrayList();
        for (Flight flight : allFlights) {
            if (flight.isNotClose()) {
                userFlights.add(flight);
            }
        }
        view.prepareScheduleArrival(userFlights);
    }

    /**
     * Submit destiny time to a flight.
     */
    public void submitDestinyTime() {
        List<Flight> allFlights = DataSet.getInstance().getFlights();
        List<Flight> userFlights = new ArrayList();
        for (Flight flight : allFlights) {
            if (flight.isNotClose()) {
                userFlights.add(flight);
            }
        }
        view.prepareScheduleDestinyTime(userFlights);
    }

}
