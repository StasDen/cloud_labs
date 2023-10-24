package ua.lviv.iot.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "party_animator")
@Getter
@Setter
@EqualsAndHashCode
public class PartyAnimator {
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
    @Column(name = "phone_number")
    private String phoneNumber;

    @Basic
    @Column(name = "unique_performance")
    private String uniquePerformance;

    @Basic
    @Column(name = "work_experience_in_years")
    private Integer workExperienceInYears;

    @Basic
    @Column(name = "order_id")
    private Integer orderId;
}
