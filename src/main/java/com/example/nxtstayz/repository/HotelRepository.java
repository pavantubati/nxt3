/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.Hotel;
import java.util.ArrayList;

public interface HotelRepository {

    ArrayList<Hotel> getHotels();
}