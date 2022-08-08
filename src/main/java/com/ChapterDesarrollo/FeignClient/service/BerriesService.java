package com.ChapterDesarrollo.FeignClient.service;

import com.ChapterDesarrollo.FeignClient.dto.berry.Berry;
import com.ChapterDesarrollo.FeignClient.dto.berry.BerryListItem;

import java.util.List;

public interface BerriesService {

    List<BerryListItem> getBerryList(int page);

    Berry getBerryByName(String name);

}
