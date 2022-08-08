package com.ChapterDesarrollo.FeignClient.dto.berry;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Berry {

    private long id;

    private String name;

    private int growthTime;

    private int maxHarvest;

    private int naturalGiftPower;

    private int size;

    private int smoothness;

    private int soilDryness;

}
