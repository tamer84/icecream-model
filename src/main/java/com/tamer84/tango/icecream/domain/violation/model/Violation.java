package com.tamer84.tango.icecream.domain.violation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tamer84.tango.icecream.domain.IceCreamDomain;
import lombok.*;

import static org.apache.commons.lang3.Validate.notNull;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Violation {

    private IceCreamDomain domain;

    private String code;

    public Violation(final ViolationErrorCode errorCode) {
        notNull(errorCode, "errorCode is required");
        this.domain = errorCode.getDomain();
        this.code = errorCode.code();
    }
}
