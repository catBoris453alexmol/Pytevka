package ru.sapteh.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table()
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NonNull
    private String firstName;

    @Column
    @NonNull
    private String lastName;

    @Column
    @NonNull
    private String patronymic;

    @Column
    @NonNull
    private String address;

    @Column
    @NonNull
    private int phone;

    @OneToMany(mappedBy = "Client", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Putevka putevka;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "route_id")
    private Set<Route> routes;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", putevka=" + putevka +
                '}';
    }
}
