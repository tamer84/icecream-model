package com.tamer84.tango.icecream.domain.productRecord.event;

import com.tamer84.tango.icecream.domain.IceCreamDomain;
import com.tamer84.tango.icecream.domain.IceCreamEvent;
import com.tamer84.tango.icecream.domain.productRecord.model.ProductRecord;
import com.tamer84.tango.model.Market;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
@Getter
@ToString(callSuper = true)
@Builder(builderClassName = "builder")
public class ProductRecordUpdatedEvent extends IceCreamEvent {

    private ProductRecord productRecord;

    public ProductRecordUpdatedEvent(final UUID productId, final String sagaId, final String source,
                                     final Market market, final long timestamp) {
        super(productId, sagaId, source, IceCreamDomain.PRODUCT_RECORD, market, timestamp);
    }

    public ProductRecordUpdatedEvent withProductRecord(final ProductRecord productRecord) {
        this.productRecord = productRecord;
        return this;
    }


}
