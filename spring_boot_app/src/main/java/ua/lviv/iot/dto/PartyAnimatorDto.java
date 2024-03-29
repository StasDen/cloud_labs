package ua.lviv.iot.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Builder
@Getter
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(itemRelation = "partyAnimator", collectionRelation = "partyAnimators")
public class PartyAnimatorDto extends RepresentationModel<PartyAnimatorDto> {
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String uniquePerformance;
    private final Integer workExperienceInYears;
    private final Integer orderId;
}
