package com.tamer84.tango.icecream.domain.icsi.event;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tamer84.tango.icecream.domain.IceCreamEvent;
import com.tamer84.tango.icecream.domain.availability.model.Availability;
import com.tamer84.tango.icecream.domain.icsi.model.IceCreamStockMetadata;
import com.tamer84.tango.icecream.domain.IceCreamDomain;
import com.tamer84.tango.icecream.domain.media.model.Media;
import com.tamer84.tango.icecream.domain.pricing.model.Pricing;
import com.tamer84.tango.icecream.domain.productRecord.model.ProductRecord;
import com.tamer84.tango.model.Market;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
@Getter
@ToString(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IceCreamStockItemUpdatedEvent extends IceCreamEvent {

    private Availability availability;
    private Media media;
    private Pricing pricing;
    private String id;
    private IceCreamStockMetadata metadata;
    private ProductRecord productRecord;

    public IceCreamStockItemUpdatedEvent(final UUID productId,
                                         final String sagaId,
                                         final String source,
                                         final Market market,
                                         final long timestamp) {
        super(productId, sagaId, source, IceCreamDomain.ICECREAM_STOCK_ITEM, market, timestamp);
    }

    public IceCreamStockItemUpdatedEvent withAvailability(final Availability availability) {
        this.availability = availability;
        return this;
    }
    public IceCreamStockItemUpdatedEvent withMedia(final Media media) {
        this.media = media;
        return this;
    }
    public IceCreamStockItemUpdatedEvent withMetadata(final IceCreamStockMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public IceCreamStockItemUpdatedEvent withPricing(final Pricing pricing) {
        this.pricing = pricing;
        return this;
    }
    public IceCreamStockItemUpdatedEvent withProductRecord(final ProductRecord productRecord) {
        this.productRecord = productRecord;
        return this;
    }

}
