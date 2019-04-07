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

    public void showAllFlights(List<Flight> flights);

    public void onSuccessFlight(Flight flight,
            List<AirPlane> airplanes,
            List<Pilot> pilots);

    public void prepareScheduleArrival(List<Flight> userFlights);

    public void prepareScheduleDestinyTime(List<Flight> userFlights);
}
