package com.uregina.app;

import com.uregina.exceptions.*;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Class Ticket, a List of Flights in ordered sequences
 *
 */
public class Ticket
{
	
	private static final String [] SchengenAirportsCode = new String[] { "VIE","BRU","PRG","CPH","TLL","HEL","CDG","FRA","MUC","ATH","BUD","KEF","CIA","RIX","VNO","LUX","MLA","AMS","OSL","WAW","LIS","LJU","KSC","MAD","ARN","BRN"};
	/**
	 * The function checks the validaity of a ticket
	 * It checks
	 *		1. airports code are in IATA format (any three uppercases letters)
  	 *      2. maximum flights Count >= number of flights in the ticket
     *      3. maximum flight time >= Total flight times ( sum of flight time of each flight)
     *      4. maximum layover time >= Total layover times ( sum of layover time between each two consecutive flight)
	 *		5. no flight between two airports in the Schengen area unless the passenger has a valid SchengenVisa
	 *		6. no cyclic trip
	 *		7. The sequence of flights in correct ( the arrival airport of a flight is the departure airport of the next flight)
	 * 		8. any other logical constraints 
	 * @param	ticket				List of ordered sequences of flights
	 * @param	maxFlightsCount		Maximum number of flights in the ticket
	 * @param	maxFlightTime		Maximum allowable total flight times in minutes
	 * @param	maxLayoverTime		Maximum allowable total layover times in minutes
	 * @param	hasSchengenVisa		to indicate if the passenger has a valid Schengen Visa or not
	 * @return	true if the ticket is valid, false otherwise
	 * usefeul functions that you may use
	 * 		(class: Flight , method: getArrivalAirport)
	 * 		(class: Flight , method: getDepatureAirport)
	 * 		(class: Flight , method: calculateFlightTime)
	 * 		(class: Flight , method: calculateLayoverTime)
	 * 		(class: ticket , method: hasCyclicTrip)
	*/
	public static boolean checkTicket( ArrayList<Flight> ticket, int maxFlightsCount, int maxFlightTime, int maxLayoverTime, boolean hasSchengenVisa)
	{
		/*/Todo: add your code here
		//Number of flights
		if(maxFlightsCount < ticket.size())
		return(false);

		//Time of flight
		int flightTime = 0;
		for(int i = 0; i < ticket.size(); i++){
			flightTime = flightTime + ticket.get(i).calculateFlightTime;
		}
		if(maxFlightTime < flightTime)
		return false;

		//Time of layover
		int layoverTime = 0;
		for(int j = 0; j < ticket.size()-1; j++){
			layoverTime = layovertTime + Flight.calculateLayoverTime(ticket.get(j), ticket.get(j+1));
		}
		if(maxLayoverTime < layoverTime)
		return false;

		//Schengen visa
		if(hasSchengenVisa == false){
			for(int k = 0; k < ticket.size(); k++){
				for(int l = 0; l < SchengenAirportsCode.length; l++){
					if(ticket.get(k).getDepatureAirport().equals(SchengenAirport[l])){
						return false;
					}
				}
			}
		}

		//Check Airport Code
		for(int code = 0; code < ticket.size(); code ++){
			if(ticket.get(i).length() != 3)
			return false;
			if(ticket.get(i).departureAirport.charAt(0) < 65 || ticket.get(i).departureAirport.charAt(0) > 90)
			return false;
			if(ticket.get(i).departureAirport.charAt(1) < 65 || ticket.get(i).departureAirport.charAt(1) > 90)
			return false;
			if(ticket.get(i).departureAirport.charAt(2) < 65 || ticket.get(i).departureAirport.charAt(2) > 90)
			return false;
		}

		//check cyclic trip
		if(Ticket.hasCyclicTrip(ticket))
			return false;*/
		

		//end of your code
		return true;
	}
		/**
	 * The function checks if the ticket has a cyclic trip
	 * (that is, no passenger can arrive at the same airport more than once within the same ticket)
	 * @param	ticket				List of ordered sequences of flights
	 * @return	true if the ticket has a cyclic trip, false otherwise
	 * usefeul functions that you may use
	 * 		(class: Flight , method: getArrivalAirport)
	 * 		(class: Flight , method: getDepatureAirport)
	*/
	public static boolean hasCyclicTrip(ArrayList<Flight> ticket)
	{
		//Todo : add your code here
		

		//Todo : end of your code
		return false;
	}
}