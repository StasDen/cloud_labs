package ua.lviv.iot.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
@Getter
@Setter
@EqualsAndHashCode
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "first_name")
    private String firstName;

    @Basic
    @Column(name = "second_name")
    private String secondName;

    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;

    @Basic
    @Column(name = "client_card_id")
    private Integer clientCardId;

    @ManyToMany
    @JoinTable(name = "client_ordering", schema = "my_library", joinColumns = @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "ordering_id", referencedColumnName = "id", nullable = false))
    private Set<Ordering> orderings;
}
