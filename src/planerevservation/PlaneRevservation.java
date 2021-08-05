/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planerevservation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import serves.IBaseReservation;
import serves.PegasusReservation;

/**
 *
 * @author moayy
 */
public class PlaneRevservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Müşteri Oluşturuldu
        Customer customer = new Customer();
        customer.setId(1);
        customer.setEmail("codeunlu@gmail.com");
        customer.setName("Mustafa");
        customer.setSurname("ÜNLÜ");

        // Uçuş Oluşturuldu
        Flight flight = new Flight();
        flight.setId(1);
        flight.setFlightChairCount(15);
        flight.setFlightChairBusinessCount(5);
        flight.setCompany(Company.Pegasus);
        flight.setFlightTimeStart(new Date(2021,7,16));
        flight.setFlightTimeEnd(new Date(2021,7,16));
        
        // the plane was related to flying was created 
        FlightPlane flightPlane = new FlightPlane();
        flightPlane.setId(1);
        flightPlane.setFlightId(1);
     
        Map<Integer,Boolean> flightMap = new HashMap<>();
        Map<Integer, ChairKind> flightKindTypeMap = new HashMap<>();
        
        for (Integer i = 1; i<=flight.getFlightChairCount(); i++)
        {
            flightMap.put(i,true);  
            if(i <= flight.getFlightChairBusinessCount()){
                flightKindTypeMap.put(i,ChairKind.Business);
            }else{
                flightKindTypeMap.put(i,ChairKind.Econoy);
            }
        }
       
        flightPlane.setChairStatus(flightMap);
        flightPlane.setChairs(flightKindTypeMap);

        //create the ticket of plane 
        IBaseReservation baseReservation = new PegasusReservation();
        Flight[] flights =  {
                flight
        };
        FlightPlane[] flightPlanes = {
                flightPlane
        };
        baseReservation.createReservation(flights,flightPlanes,customer);
        System.out.println(flightMap);
    }
    
}
