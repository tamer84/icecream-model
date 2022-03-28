package com.tamer84.tango.icecream.domain;

import com.tamer84.tango.model.Market;
import com.tamer84.tango.model.ProductType;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class ValidatableEventTest {

    @Test
    public void testProductType() {
        var event = new ValidatableEvent(
                UUID.randomUUID(),
                "saga",
                "source",
                IceCreamDomain.MEDIA,
                Market.DE,
                System.currentTimeMillis()
        );

        assertEquals(IceCreamDomain.MEDIA, event.getDomain());
        assertEquals(ProductType.ICE_CREAM, event.getProductType());
    }
}
