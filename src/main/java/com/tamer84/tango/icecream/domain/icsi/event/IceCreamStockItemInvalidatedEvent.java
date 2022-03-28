package com.tamer84.tango.icecream.domain.icsi.event;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tamer84.tango.icecream.domain.IceCreamDomain;
import com.tamer84.tango.icecream.domain.IceCreamEvent;
import com.tamer84.tango.icecream.domain.violation.model.Violation;
import com.tamer84.tango.model.Market;
import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
@Getter
@ToString(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IceCreamStockItemInvalidatedEvent extends IceCreamEvent {

    private List<Violation> violations;

    public IceCreamStockItemInvalidatedEvent(final UUID productId,
                                             final String sagaId,
                                             final String source,
                                             final IceCreamDomain domain,
                                             final Market market,
                                             final long timestamp) {
        super(productId, sagaId, source, domain, market, timestamp);
    }

    public IceCreamStockItemInvalidatedEvent withViolations(final List<Violation> violations) {
        this.violations = violations;
        return this;
    }
}
