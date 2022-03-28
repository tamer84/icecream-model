package com.tamer84.tango.icecream.domain.media.model;


import lombok.*;

import java.net.URL;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@Builder(builderClassName = "builder")
public class Image {

    private String altText;

    /**
     * i.e. thumbnail, gallery, product_small
     */
    private String format;

    private String headline;

    private String imageType;

    private URL url;

    private URL youtubeVideoUrl;
}
