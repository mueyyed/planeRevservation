/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serves;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import planerevservation.ChairKind;
import planerevservation.Customer;
import planerevservation.CustormerTicketBuy;
import planerevservation.Flight;
import planerevservation.FlightPlane;

public class THYReservation implements IBaseReservation{

    @Override
    public void createReservation(Flight[] flights, FlightPlane[] flightPlanes, Customer customer) {
        Scanner ticketSelect = new Scanner(System.in);

        // Seçilen Uçuş Koltukları
        Map<Integer, ChairKind> flightPlaneIdSelect = new HashMap<>();

        //Uçuş Listeleme
        System.out.println("Lütfen Listede Yer alan Uçuşlardan birini seçiniz?");
        for (Flight flight: flights) {
            System.out.println(
                    flight.getId() + " " + flight.getCompany() + " Kalkış Saati:" + flight.getFlightTimeStart()
                            + "  İniş Zamanı:"
                            + flight.getFlightTimeEnd()
            );
        }
        int flightID = ticketSelect.nextInt();

        // Koltuk Listeleme
        System.out.println("Müsait olan koltuklar true olarak belirtilmiştir. Koltuğunuzu seçiniz?");
        for (FlightPlane flightPlane: flightPlanes) {
            System.out.println(
                    flightPlane.getChairStatus() + " \n" + flightPlane.getChairs()
            );
        }
        int flightPlaneID = ticketSelect.nextInt();

        for (FlightPlane flightPlane: flightPlanes) {
            flightPlane.getChairStatus().put(flightPlaneID,false);
            flightPlaneIdSelect.put(flightPlaneID,flightPlane.getChairs().get(flightPlaneID));
        }

        CustormerTicketBuy customerTicketBuy = new CustormerTicketBuy();
        customerTicketBuy.setId(1);
        customerTicketBuy.setCustomerId(1);
        customerTicketBuy.setFlightId(flightID);

        // Uçuş Koltuğu
        customerTicketBuy.setFlightPlane(flightPlaneIdSelect);

        customerTicketBuy.setPurchaseDate(LocalDateTime.now());

        System.out.println("Sayın, " + customer.getName() + " " + customer.getSurname()
                + " uçuş biletiniz oluşturuldu.");
        System.out.println("Bilet bilgileriniz; " + customerTicketBuy.getFlightPlane()
                + " \n" + customerTicketBuy.getPurchaseDate()
        );
    }

}