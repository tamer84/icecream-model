package com.tamer84.tango.icecream.domain.pricing.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tamer84.tango.icecream.domain.IceCreamDomain;
import com.tamer84.tango.icecream.domain.IceCreamEvent;
import com.tamer84.tango.model.Market;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
@Getter
@ToString(callSuper = true)
@Builder(builderClassName = "builder")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PricingValidatedEvent extends IceCreamEvent {

    public PricingValidatedEvent(final UUID productId, final String sagaId, final String source,
                                 final Market market, final long timestamp) {
        super(productId, sagaId, source, IceCreamDomain.PRICE, market, timestamp);
    }
}
