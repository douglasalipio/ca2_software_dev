/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

/**
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

    public Flight(String dateFlight, String departureFrom) {
        this.dateFlight = dateFlight;
        this.departureFrom = departureFrom;
        this.id = System.currentTimeMillis();
    }

    public Flight(String dateFlight, String departureFrom, String arrivalTo) {
        this.dateFlight = dateFlight;
        this.departureFrom = departureFrom;
        this.id = System.currentTimeMillis();
        this.arrivalTo = arrivalTo;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDateFlight() {
        return dateFlight;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDateFlight(String dateFlight) {
        this.dateFlight = dateFlight;
    }

    public void assignAircraft(AirPlane airPlane) {
        this.airPlane = airPlane;
    }

    public void setArrivalTo(String arrivalTo) {
        this.arrivalTo = arrivalTo;
    }

    public String getArrivalTo() {
        return this.arrivalTo;
    }

    public AirPlane getAirPlane() {
        return this.airPlane;
    }

    public void schedule(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void schedule(String arrivalTime, String departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public long getId() {
        return this.id;
    }

    public boolean isClose() {
        return close;
    }

    public boolean isNotClose() {
        return !isClose();
    }

    public void setClose(boolean isClose) {
        this.close = isClose;
    }

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
