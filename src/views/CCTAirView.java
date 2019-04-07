/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entitites.AirPlane;
import entitites.Flight;
import entitites.Pilot;
import java.util.List;

/**
 *
 * @author hal-9000
 */
public interface CCTAirView {

    /**
     * Show all flights in a view.
     *
     * @param flights
     */
    public void showAllFlights(List<Flight> flights);

    /**
     * Flight created with success.
     *
     * @param flight
     * @param airplanes
     * @param pilots
     */
    public void onSuccessFlight(Flight flight,
            List<AirPlane> airplanes,
            List<Pilot> pilots);

    /**
     * Ready to schedule arrival time
     *
     * @param userFlights
     */
    public void prepareScheduleArrival(List<Flight> userFlights);

    /**
     * Ready to schedule arrival/departure time.
     *
     * @param userFlights
     */
    public void prepareScheduleDestinyTime(List<Flight> userFlights);
}
