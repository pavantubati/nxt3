package com.example.nxtstayz.service;

import com.example.nxtstayz.model.Hotel;
import com.example.nxtstayz.repository.HotelJpaRepository;
import com.example.nxtstayz.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.List;

@Service
public class HotelJpaService implements HotelRepository {
    @Autowired
    private HotelJpaRepository hotelJpaRepository;

    @Override
    public ArrayList<Hotel> getHotels() {
        List<Hotel> hotelsList = hotelJpaRepository.findAll();
        ArrayList<Hotel> hotels = new ArrayList<>(hotelsList);
        return hotels;
    }
}