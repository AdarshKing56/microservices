package com.lcwd.hotel.HotelService.entites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String location;
    private String about;
}
