package com.example.nxtstayz.controller;

import com.example.nxtstayz.model.*;
import com.example.nxtstayz.service.RoomJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class RoomController {
    @Autowired
    private RoomJpaService roomJpaService;

    @GetMapping("/hotels/rooms")
    public ArrayList<Room> getRooms() {
        return roomJpaService.getRooms();
    }
}