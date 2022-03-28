package com.tamer84.tango.icecream.domain.icsi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tamer84.tango.icecream.domain.IceCreamDomain;
import com.tamer84.tango.icecream.domain.availability.model.Availability;
import com.tamer84.tango.icecream.domain.icsi.event.IceCreamStockItemInvalidatedEvent;
import com.tamer84.tango.icecream.domain.icsi.event.IceCreamStockItemUpdatedEvent;
import com.tamer84.tango.icecream.domain.media.model.Media;
import com.tamer84.tango.icecream.domain.pricing.model.Pricing;
import com.tamer84.tango.icecream.domain.productRecord.model.ProductRecord;
import com.tamer84.tango.icecream.domain.violation.model.Violation;
import com.tamer84.tango.model.util.MergeUtils;
import lombok.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@ToString
@Builder(builderClassName = "builder")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IceCreamStockItem {

    private String id;

    private Availability availability = new Availability();

    private IceCreamStockMetadata metadata = new IceCreamStockMetadata();

    private ProductRecord productRecord = new ProductRecord();

    private Media media = new Media();

    private Pricing pricing = new Pricing();

    private List<Violation> violations = new ArrayList<>();

    public IceCreamStockItem(final String id) {
        this.id = id;
    }

    public void on(final IceCreamStockItemUpdatedEvent event) {
        if(event == null) return;

        if(MergeUtils.isValueChanged(event.getAvailability(), this.availability)) {
            this.setAvailability(event.getAvailability());
        }

        if(MergeUtils.isValueChanged(event.getMedia(), this.media)) {
            this.setMedia(event.getMedia());
        }

        if(MergeUtils.isValueChanged(event.getPricing(), this.pricing)) {
            this.setPricing(event.getPricing());
        }


        if(MergeUtils.isValueChanged(event.getId(), this.id)){
            this.id = event.getId();
        }

        if(MergeUtils.isValueChanged(event.getMetadata(), this.metadata)) {
            this.metadata = event.getMetadata();
        }

        if(MergeUtils.isValueChanged(event.getProductRecord(), this.productRecord)){
            this.productRecord = event.getProductRecord();
        }

    }

    public void on(final IceCreamStockItemInvalidatedEvent event) {
        if(event.getViolations() == null) return;

        // clear domain specific violations before adding new ones
        this.updateViolations(event.getDomain());

        this.violations.addAll(event.getViolations());
    }

    private void updateViolations(final IceCreamDomain domain) {
        this.violations.removeIf(v -> domain == v.getDomain());
    }
}
