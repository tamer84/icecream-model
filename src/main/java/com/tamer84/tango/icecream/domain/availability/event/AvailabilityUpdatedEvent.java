package com.tamer84.tango.icecream.domain.availability.event;

import com.tamer84.tango.icecream.domain.IceCreamDomain;
import com.tamer84.tango.icecream.domain.IceCreamEvent;
import com.tamer84.tango.icecream.domain.availability.model.AvailabilityStatus;
import com.tamer84.tango.model.Market;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
@Getter
@ToString(callSuper = true)
@Builder(builderClassName = "builder")
public class AvailabilityUpdatedEvent extends IceCreamEvent {

    private AvailabilityStatus status;

    public AvailabilityUpdatedEvent(final UUID productId, final String sagaId, final String source,
                                    final Market market, final long timestamp) {
        super(productId, sagaId, source, IceCreamDomain.AVAILABILITY, market, timestamp);
    }
}
