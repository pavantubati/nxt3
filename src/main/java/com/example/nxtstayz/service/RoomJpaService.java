package com.example.nxtstayz.service;

import com.example.nxtstayz.model.*;
import com.example.nxtstayz.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoomJpaService implements RoomRepository {

    @Autowired
    private RoomJpaRepository roomJpaRepository;

    @Autowired
    private HotelJpaService hotelJpaService;

    @Override
    public ArrayList<Room> getRooms() {
        List<Room> roomsList = roomJpaRepository.findAll();
        ArrayList<Room> rooms = new ArrayList<>(roomsList);
        return rooms;
    }
}