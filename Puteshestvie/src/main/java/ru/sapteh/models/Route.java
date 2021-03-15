package ru.sapteh.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table()
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NonNull
    private String climate;

    @Column
    @NonNull
    private String country;

    @Column
    @NonNull
    private Date duration;

    @Column
    @NonNull
    private String hotel;

    @Column
    @NonNull
    private int cost;

    @OneToMany(mappedBy = "Route", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Client client;

    @OneToMany(mappedBy = "Route", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Putevka putevka;

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", climate='" + climate + '\'' +
                ", country='" + country + '\'' +
                ", duration=" + duration +
                ", hotel='" + hotel + '\'' +
                ", cost=" + cost +
                ", client=" + client +
                ", putevka=" + putevka +
                '}';
    }
}
