/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entitites.Flight;
import java.util.List;
import java.util.Scanner;
import models.CCTAirPresenter;
import entitites.AirPlane;
import entitites.Pilot;

/**
 * UI class responsable to show all information to the user.
 *
 * @author hal-9000
 */
public class CCTAirUI implements CCTAirView {

    private final Scanner reader = new Scanner(System.in);
    private final CCTAirPresenter presenter = new CCTAirPresenter();

    /**
     * Inject the view to the presenter.
     */
    public CCTAirUI() {
        presenter.inject(this);
    }

    /**
     * Input a new flight.
     */
    private void inputFlight() {
        System.out.println("Departure from:");
        String departureFrom = reader.next();

        System.out.println("Arrival to:");
        String arrivalTo = reader.next();

        System.out.println("Date flight (DD-MM-YYYY): ");
        String dateFlight = reader.next();

        presenter.createFlight(departureFrom, dateFlight, arrivalTo);
    }

    /**
     * Main menu of CCTAir
     */
    public void showMainMenu() {
        System.out.println("**-----------Welcome to CCTAir------------**");
        System.out.println("1 - List all flights");
        System.out.println("2 - Insert flight ");
        System.out.println("3 - Schedule arrival time ");
        System.out.println("4 - Schedule arrival/departure time");
        System.out.println("0 - Close app");

        int option = reader.nextInt();
        switch (option) {

            case 1:
                presenter.listAllFlights();
                break;
            case 2:
                inputFlight();
                break;
            case 3:
                presenter.submitArrivalTime();
                break;
            case 4:
                presenter.submitDestinyTime();
                break;
        }

    }

    /**
     * Showing all flights.
     *
     * @param flights
     */
    @Override
    public void showAllFlights(List<Flight> flights) {
        flights.forEach((flight) -> {
            System.out.println(flight.toString());
        });
        System.out.println("1 - Back to MENU");
        System.out.println("0 - Close app");
        int option = reader.nextInt();
        if (option == 1) {
            showMainMenu();
        }
    }

    /**
     * Callback to create a flight
     *
     * @param flight
     * @param airplanes
     * @param pilotes
     */
    @Override
    public void onSuccessFlight(Flight flight, List<AirPlane> airplanes, List<Pilot> pilotes) {
        AirPlane airplane = chooseAirplane(airplanes);
        airplane.assignPilot(choosePilot(pilotes));
        flight.assignAircraft(airplane);
        System.out.println("Flight created with success.");
        presenter.submitFlight(flight);
        showMainMenu();
    }

    /**
     * Printing airplane options.
     *
     * @param airplanes
     * @return
     */
    private AirPlane chooseAirplane(List<AirPlane> airplanes) {
        AirPlane airplaneSelected = null;
        System.out.println("\nPick up an airplane:");
        printAirplanes(airplanes);
        int airPlaneOption = reader.nextInt();

        if (airPlaneOption >= 0 && airPlaneOption <= airplanes.size() - 1) {
            airplaneSelected = airplanes.get(airPlaneOption);
        } else {
            System.out.println("Invalid option. Please try again.");
            System.out.println("\nPick up an airplane:");
            printAirplanes(airplanes);
        }
        return airplaneSelected;
    }

    /**
     * Printing pilots options.
     *
     * @param pilots
     * @return
     */
    private Pilot choosePilot(List<Pilot> pilots) {
        Pilot pilotSelected = null;
        System.out.println("\nPick up a pilot:");
        printPilotes(pilots);
        int pilotOption = reader.nextInt();
        if (pilotOption >= 0 && pilotOption <= pilots.size() - 1) {
            pilotSelected = pilots.get(pilotOption);
        } else {
            System.out.println("Invalid option. Please try again.");
            System.out.println("\nPick up a pilot:");
            printPilotes(pilots);
        }
        return pilotSelected;
    }

    /**
     * Showing available airplanes
     *
     * @param airplanes
     */
    private void printAirplanes(List<AirPlane> airplanes) {
        for (int i = 0; i < airplanes.size(); i++) {
            System.out.println(" " + i + " - " + airplanes.get(i).toString());
        }
    }

    /**
     * Showing available pilots
     *
     * @param pilots
     */
    private void printPilotes(List<Pilot> pilotes) {
        for (int i = 0; i < pilotes.size(); i++) {
            System.out.println(" " + i + " - " + pilotes.get(i).toString());
        }
    }

    private void printUserFlights(List<Flight> userFlights) {
        for (int i = 0; i < userFlights.size(); i++) {
            System.out.println("SCHEDULE ARRIVAL TIME");
            System.out.println("" + i + " - " + userFlights.get(i).toString());
        }
    }

    @Override
    public void prepareScheduleArrival(List<Flight> userFlights) {
        Flight flightSelected = null;
        printUserFlights(userFlights);
        int flightOption = reader.nextInt();
        if (flightOption >= 0 && flightOption <= 4) {
            flightSelected = userFlights.get(flightOption);
            System.out.println("Schedule arrival time (HH:MM): ");
            String arrivalTime = reader.next();
            flightSelected.schedule(arrivalTime);
            presenter.submitFlight(flightSelected);
            System.out.println("Schedule with success.");
            showMainMenu();
        } else {
            System.out.println("Invalid option, please try again.");
            printUserFlights(userFlights);
            System.out.println("1 - Back to MENU");
            System.out.println("0 - Close app");
        }
    }

    @Override
    public void prepareScheduleDestinyTime(List<Flight> userFlights) {
        Flight flightSelected = null;
        printUserFlights(userFlights);
        int flightOption = reader.nextInt();
        if (flightOption >= 0 && flightOption <= 4) {
            flightSelected = userFlights.get(flightOption);
            System.out.println("Schedule arrival time (HH:MM): ");
            String arrivalTime = reader.next();
            System.out.println("Schedule departure time (HH:MM): ");
            String departureTime = reader.next();
            flightSelected.schedule(arrivalTime, departureTime);
            presenter.submitFlight(flightSelected);
            System.out.println("Schedule with success.");
            showMainMenu();
        } else {
            System.out.println("Invalid option, please try again.");
            printUserFlights(userFlights);
            System.out.println("1 - Back to MENU");
            System.out.println("0 - Close app");
        }
    }
}
