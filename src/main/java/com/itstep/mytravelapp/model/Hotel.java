package com.itstep.mytravelapp.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Hotel")
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int id;

}
