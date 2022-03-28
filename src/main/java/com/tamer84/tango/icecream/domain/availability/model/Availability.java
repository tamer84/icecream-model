package com.tamer84.tango.icecream.domain.availability.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tamer84.tango.icecream.domain.availability.event.AvailabilityUpdatedEvent;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Availability {

    private AvailabilityStatus status;

    public void on(final AvailabilityUpdatedEvent event) {
        if (event.getStatus() != null) {
            this.status = event.getStatus();
        }
    }
}
