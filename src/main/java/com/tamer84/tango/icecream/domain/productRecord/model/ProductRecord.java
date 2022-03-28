package com.tamer84.tango.icecream.domain.productRecord.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder(builderClassName = "builder")
public class ProductRecord {

    private String code;

    private String productName;

    private String coneType;

    private String flavour;

    private String topping;

    private String shortDescription;

}
