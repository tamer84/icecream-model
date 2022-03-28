package com.tamer84.tango.icecream.domain.pricing.model;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@Builder(builderClassName = "builder")
public class Pricing {

    private Price price;

}
