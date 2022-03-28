package com.tamer84.tango.icecream.domain;

import com.tamer84.tango.model.Market;
import com.tamer84.tango.model.ProductType;
import com.tamer84.tango.model.event.TangoEvent;

import java.util.UUID;

public abstract class IceCreamEvent extends TangoEvent {

    private IceCreamDomain domain;

    protected IceCreamEvent() { super(); }

    public IceCreamEvent(final UUID productId, final String sagaId, final String source,
                        final IceCreamDomain domain, final Market market, final long timestamp) {
        super(productId, sagaId, source, ProductType.ICE_CREAM, market, timestamp);
        this.domain = domain;
    }

    public IceCreamDomain getDomain() {
        return domain;
    }
}
