/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2_software_dev;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

/**
 *
 * @author hal-9000
 */
public class DataSet {

    public List<Flight> getFlights() {
        List<Flight> containerFlights = new ArrayList();
        Random random = new Random();
        String[] departureFromMocks = {"Recife", "Sao Paulo", "Rio Janeiro", "Dublin", "Morrocos"};
        String[] arrivalToMocks = {"Hong Kong", "Haway", "London", "Krakow", "Caracas"};
        String[] departureTimeMocks = {"4:20", "6:40", "8:30", "12:45", "17:40"};
        String[] arrivalTimeMocks = {"8:00", "11:00", "16:00", "18:00", "19:15", "22:00"};

        List<Date> dateFlightMocks = getMockDates();

        for (int i = 0; i < 30; i++) {

            int departureFromIndex = random.nextInt(departureFromMocks.length);
            int arrivalToIndex = random.nextInt(arrivalToMocks.length);
            int arrivalTimeIndex = random.nextInt(arrivalTimeMocks.length);
            int departureTimeIndex = random.nextInt(departureTimeMocks.length);

            Flight flight = new Flight(formatData(dateFlightMocks.get(i)),
                    departureFromMocks[departureFromIndex]);
            flight.setArrivalTo(arrivalToMocks[arrivalToIndex]);
            flight.setDepartureTime(departureTimeMocks[departureTimeIndex]);
            flight.setArrivalTime(arrivalTimeMocks[arrivalTimeIndex]);

            containerFlights.add(flight);
        }

        return containerFlights;

    }

    private List<Date> getMockDates() {
        List<Date> containerDates = new ArrayList();
        int[] months = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] days = new int[]{2, 5, 6, 9, 8, 7, 12, 15, 23, 30, 1, 11, 14};
        int defaultYear = 2019;
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int daysIndex = random.nextInt(13);
            int monthsIndex = random.nextInt(12);
            Date mockDate = new GregorianCalendar(defaultYear,
                    months[monthsIndex],
                    days[daysIndex]).getTime();
            containerDates.add(mockDate);
        }

        return containerDates;
    }

    private AirPlane getMockAirplane() {
        String[] make = {"Boeing Business Jets",
            "Bombardier Aerospace",
            "Dassault Falcon",
            "Gulfstream Aerospace",
            "Textron Aviation",
            "Pilatus Business Aircraft"};
        
        String[] models = {"Boing 747", "Airbus A320 family","Antonov An‑140","A300B4", "Airbus A3240", "Antonov An‑200"};
        String[] Capacity ={"300", "400", "370", "472", "270", "550"};
        return null;

    }

    private String formatData(Date date) {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}
