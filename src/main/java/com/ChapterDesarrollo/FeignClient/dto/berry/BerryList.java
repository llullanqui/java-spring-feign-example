package com.ChapterDesarrollo.FeignClient.dto.berry;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BerryList {

    private int count;

    private String next;

    private String previous;

    private List<BerryListItem> results;

}
