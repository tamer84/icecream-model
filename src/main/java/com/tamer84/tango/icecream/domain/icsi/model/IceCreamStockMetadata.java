package com.tamer84.tango.icecream.domain.icsi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tamer84.tango.model.Market;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class IceCreamStockMetadata {

    private Market market;

    private String sourceSystem;

}
