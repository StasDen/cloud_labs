package ua.lviv.iot.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ledger")
@Getter
@Setter
@EqualsAndHashCode
public class Ledger {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "client")
    private String client;

    @Basic
    @Column(name = "ordering")
    private String ordering;

    @Basic
    @Column(name = "action")
    private String action;

    @Basic
    @Column(name = "time")
    private Date time;

    @Basic
    @Column(name = "user")
    private String user;
}
