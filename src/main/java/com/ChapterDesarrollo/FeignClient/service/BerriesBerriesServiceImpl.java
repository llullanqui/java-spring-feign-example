package com.ChapterDesarrollo.FeignClient.service;

import com.ChapterDesarrollo.FeignClient.client.BerryClient;
import com.ChapterDesarrollo.FeignClient.dto.berry.Berry;
import com.ChapterDesarrollo.FeignClient.dto.berry.BerryListItem;
import com.ChapterDesarrollo.FeignClient.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BerriesService")
@RequiredArgsConstructor
public class BerriesBerriesServiceImpl implements BerriesService {

    private final BerryClient berryClient;

    @Override
    public List<BerryListItem> getBerryList(int page) {
        int offset = (page-1) * Constants.POKEAPIOFFSET;
        var response = berryClient.getBerries(offset, Constants.POKEAPILIMIT);
        return response.getResults();
    }

    @Override
    public Berry getBerryByName(String name) {
        // Añadir lógica adicional...
        return berryClient.findByName(name);
    }

}
