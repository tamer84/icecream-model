package com.tamer84.tango.icecream.domain;

import com.tamer84.tango.model.Market;

import java.util.UUID;

public class ValidatableEvent extends IceCreamEvent {

    protected ValidatableEvent() {}

    public ValidatableEvent(final UUID productId,
                            final String sagaId,
                            final String source,
                            final IceCreamDomain domain,
                            final Market market,
                            final long timestamp) {
        super(productId, sagaId, source, domain, market, timestamp);
    }
}
