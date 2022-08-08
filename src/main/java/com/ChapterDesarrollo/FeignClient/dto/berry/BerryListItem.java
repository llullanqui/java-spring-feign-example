package com.ChapterDesarrollo.FeignClient.dto.berry;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BerryListItem {

    @JsonProperty
    private String name;

    @JsonProperty
    private String url;

}
