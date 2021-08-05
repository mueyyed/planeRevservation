/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serves;

import planerevservation.Customer;
import planerevservation.Flight;
import planerevservation.FlightPlane;


public interface IBaseReservation {
    void createReservation(Flight[] flight, FlightPlane[] flightPlane, Customer customer);
}