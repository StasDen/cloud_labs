package ua.lviv.iot.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "event")
@Getter
@Setter
@EqualsAndHashCode
public class Event {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "animators_num")
    private Integer animatorsNum;

    @Basic
    @Column(name = "visitors_num")
    private Integer visitorsNum;

    @Basic
    @Column(name = "date")
    private String date;

    @Basic
    @Column(name = "address")
    private String address;

    @Basic
    @Column(name = "duration_in_hours")
    private Integer durationInHours;

    @Basic
    @Column(name = "city_id")
    private Integer cityId;
}
