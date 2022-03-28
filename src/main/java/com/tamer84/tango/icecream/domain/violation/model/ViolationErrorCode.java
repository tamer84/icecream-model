package com.tamer84.tango.icecream.domain.violation.model;

import com.tamer84.tango.icecream.domain.IceCreamDomain;

public enum ViolationErrorCode {

    MEDIA_IMAGE_COUNT_TO0_LOW(IceCreamDomain.MEDIA),
    MEDIA_IMAGE_URL_INVALID(IceCreamDomain.MEDIA),
    PRICE_TOO_HIGH(IceCreamDomain.PRICE),
    PRICE_TOO_LOW(IceCreamDomain.PRICE),
    PRICE_RANGE_MISSING(IceCreamDomain.PRICE);

    private IceCreamDomain domain;

    ViolationErrorCode(IceCreamDomain domain) {
        this.domain = domain;
    }

    public IceCreamDomain getDomain() {
        return domain;
    }

    public String code() {
        return this.name().toLowerCase();
    }
}
