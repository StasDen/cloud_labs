package ua.lviv.iot.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "entertainment_agency")
@Getter
@Setter
@EqualsAndHashCode
public class EntertainmentAgency {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "contact_number")
    private String contactNumber;

    @Basic
    @Column(name = "address")
    private String address;

    @Basic
    @Column(name = "animator_id")
    private Integer animatorId;

    @Basic
    @Column(name = "city_id")
    private Integer cityId;
}
