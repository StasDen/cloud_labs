package ua.lviv.iot.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "party_animator_copy")
@Getter
@Setter
@EqualsAndHashCode
public class PartyAnimatorCopy {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "first_name")
    private String firstName;

    @Basic
    @Column(name = "last_name")
    private String lastName;

    @Basic
    @Column(name = "phone_number_old")
    private String phoneNumberOld;

    @Basic
    @Column(name = "phone_number_updated")
    private String phoneNumberUpd;

    @Basic
    @Column(name = "unique_performance")
    private String uniquePerformance;

    @Basic
    @Column(name = "work_experience_in_years")
    private Integer workExperienceInYears;

    @Basic
    @Column(name = "order_id")
    private Integer orderId;

    @Basic
    @Column(name = "action")
    private String action;

    @Basic
    @Column(name = "time_stamp")
    private Date timeStamp;

    @Basic
    @Column(name = "user")
    private String user;
}
