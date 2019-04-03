/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entitites.Flight;
import views.CCTAirView;

/**
 *
 * @author hal-9000
 */
public class CCTAirPresenter {

    private CCTAirView view;

    public void inject(CCTAirView view) {
        this.view = view;
    }

    public void schedule(Flight flight) {
        flight.schedule("12:00", "18:20");
        view.onScheduleSuccess(flight);
    }

    public void scheduleByArrivalTime(Flight flight) {
        flight.schedule("11:00");
        view.onScheduleSuccess(flight);
    }

}
