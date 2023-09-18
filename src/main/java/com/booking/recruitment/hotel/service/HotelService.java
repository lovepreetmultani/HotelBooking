package com.booking.recruitment.hotel.service;

import com.booking.recruitment.hotel.model.Hotel;
import com.sun.el.stream.Optional;

import java.util.List;

public interface HotelService {
  List<Hotel> getAllHotels();

  List<Hotel> getHotelsByCity(Long cityId);

  Hotel createNewHotel(Hotel hotel);

  Hotel findById(Integer id);
}
