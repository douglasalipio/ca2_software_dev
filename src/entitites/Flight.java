/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

/**
 *
 * Class represent a flight.
 *
 * @author hal-9000
 */
public class Flight {

    private final long id;
    private AirPlane airPlane;
    private String departureFrom;
    private String arrivalTo;
    private String departureTime;
    private String arrivalTime;
    private String dateFlight;
    private boolean close;

    /**
     * Creating a flight object with date flight and departure city.
     *
     * @param dateFlight
     * @param departureFrom
     */
    public Flight(String dateFlight, String departureFrom) {
        this.dateFlight = dateFlight;
        this.departureFrom = departureFrom;
        this.id = System.currentTimeMillis();
    }

    /**
     * Creating a flight object with date flight, departure city and arrival
     * city.
     *
     * @param dateFlight
     * @param departureFrom
     * @param arrivalTo
     */
    public Flight(String dateFlight, String departureFrom, String arrivalTo) {
        this.dateFlight = dateFlight;
        this.departureFrom = departureFrom;
        this.id = System.currentTimeMillis();
        this.arrivalTo = arrivalTo;
    }

    /**
     * Getting departure city.
     *
     * @return
     */
    public String getDepartureFrom() {
        return departureFrom;
    }

    /**
     * Getting departure time.
     *
     * @return
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Getting arrival time.
     *
     * @return
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Getting date flight.
     *
     * @return
     */
    public String getDateFlight() {
        return dateFlight;
    }

    /**
     * Setting departure time.
     *
     * @param departureTime
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * Setting arrival time
     *
     * @param arrivalTime
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * Setting date flight.
     *
     * @param dateFlight
     */
    public void setDateFlight(String dateFlight) {
        this.dateFlight = dateFlight;
    }

    /**
     * Setting a airplane.
     *
     * @param airPlane
     */
    public void assignAircraft(AirPlane airPlane) {
        this.airPlane = airPlane;
    }

    /**
     * Setting arrival city.
     *
     * @param arrivalTo
     */
    public void setArrivalTo(String arrivalTo) {
        this.arrivalTo = arrivalTo;
    }

    /**
     * Getting arrival city.
     *
     * @return
     */
    public String getArrivalTo() {
        return this.arrivalTo;
    }

    /**
     * Getting an airplane.
     *
     * @return
     */
    public AirPlane getAirPlane() {
        return this.airPlane;
    }

    /**
     * Schedule arrival time.
     *
     * @param arrivalTime
     */
    public void schedule(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * Schedule arrival/departure time.
     *
     * @param arrivalTime
     * @param departureTime
     */
    public void schedule(String arrivalTime, String departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    /**
     * Flight id.
     *
     * @return
     */
    public long getId() {
        return this.id;
    }

    /**
     *
     * Check if the flight is closed.
     *
     * @return
     */
    public boolean isClose() {
        return close;
    }

    /**
     * Check if the flight is not created.
     *
     * @return
     */
    public boolean isNotClose() {
        return !isClose();
    }

    /**
     * set if the user can change a flight.
     *
     * @param isClose
     */
    public void setClose(boolean isClose) {
        this.close = isClose;
    }

    /**
     * Printing all attributes.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Flight: {" + "Date: " + dateFlight + ", From: " + departureFrom
                + ", To: " + arrivalTo + ", Departure time: " + departureTime
                + "\nArrival time: " + arrivalTime
                + "\nPlane information: " + "\nMake " + airPlane.getMake()
                + "\nModel: " + airPlane.getModel()
                + "\nCapacity:" + airPlane.getCapacity()
                + "\nPilot: " + airPlane.getPilot()
                + "}"
                + "\n\n-------------------------------------------------------------------";
    }
}
