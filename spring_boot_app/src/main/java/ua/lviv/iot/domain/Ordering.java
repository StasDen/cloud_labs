package ua.lviv.iot.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ordering")
@Getter
@Setter
@EqualsAndHashCode
public class Ordering {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "cost_in_usd")
    private Integer costInUsd;

    @Basic
    @Column(name = "event_id")
    private Integer eventId;

    @Basic
    @Column(name = "discount_id")
    private Integer discountId;

    @Basic
    @Column(name = "client_id")
    private Integer clientId;

    @Basic
    @Column(name = "entertainment_agency_id")
    private Integer entertainmentAgencyId;

    @ManyToMany(mappedBy = "orderings")
    private Set<Client> clients;
}
