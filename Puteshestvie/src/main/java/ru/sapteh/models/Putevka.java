package ru.sapteh.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table()
public class Putevka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NonNull
    private Date startDate;

    @Column
    @NonNull
    private int quantity;

    @Column
    @NonNull
    private int discount;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "route_id")
    private Set<Route> routes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Set<Client> clients;

    @Override
    public String toString() {
        return "Putevka{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", quantity=" + quantity +
                ", discount=" + discount +
                '}';
    }
}
