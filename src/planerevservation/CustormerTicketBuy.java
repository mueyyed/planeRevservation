/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planerevservation;

import java.time.LocalDateTime;
import java.util.Map;

/**
 *
 * @author moayy
 */
public class CustormerTicketBuy {
 private Integer id;
    private Integer customerId;
    private Integer flightId;
    private Map<Integer, ChairKind> flightPlane;
    private LocalDateTime purchaseDate;

    public CustormerTicketBuy() {
    }

    public CustormerTicketBuy(Integer id, Integer customerId, Integer flightId, Map<Integer, ChairKind> flightPlane, LocalDateTime purchaseDate) {
        this.id = id;
        this.customerId = customerId;
        this.flightId = flightId;
        this.flightPlane = flightPlane;
        this.purchaseDate = purchaseDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getFlightId() {
        return this.flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Map<Integer, ChairKind> getFlightPlane() {
        return this.flightPlane;
    }

    public void setFlightPlane(Map<Integer, ChairKind> flightPlane) {
        this.flightPlane = flightPlane;
    }

    public LocalDateTime getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }   
    
    
    
}
