/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planerevservation;

import java.util.Map;

/**
 *
 * @author moayy
 */
public class FlightPlane {
        private Integer id;
    private Integer flightId;
    private Map<Integer, ChairKind> chairs;
    private Map<Integer, Boolean> chairStatus;

    public FlightPlane() {
    }

    public FlightPlane(Integer id, Integer flightId, Map<Integer, ChairKind> chairs, Map<Integer, Boolean> chairStatus) {
        this.id = id;
        this.flightId = flightId;
        this.chairs = chairs;
        this.chairStatus = chairStatus;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlightId() {
        return this.flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Map<Integer, ChairKind> getChairs() {
        return this.chairs;
    }

    public void setChairs(Map<Integer, ChairKind> chairs) {
        this.chairs = chairs;
    }

    public Map<Integer, Boolean> getChairStatus() {
        return this.chairStatus;
    }

    public void setChairStatus(Map<Integer, Boolean> chairStatus) {
        this.chairStatus = chairStatus;
    }
}
