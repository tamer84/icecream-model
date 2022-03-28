package com.tamer84.tango.icecream.domain.pricing.model;


import lombok.*;

import java.math.BigDecimal;
import java.util.Currency;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@Builder(builderClassName = "builder")
public class Price {

    private Currency currency;

    private BigDecimal value;


}
