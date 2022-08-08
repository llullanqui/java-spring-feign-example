package com.ChapterDesarrollo.FeignClient.client;

import com.ChapterDesarrollo.FeignClient.configuration.FeignClientsFullConfiguration;
import com.ChapterDesarrollo.FeignClient.dto.berry.Berry;
import com.ChapterDesarrollo.FeignClient.dto.berry.BerryList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "berries", url = "https://pokeapi.co/api/v2", configuration = FeignClientsFullConfiguration.class)
public interface BerryClient {

    @GetMapping(value = "/berry/{name}")
    Berry findByName(@PathVariable("name") String name);

    @GetMapping(value = "/berry", params = {"offset", "limit"})
    BerryList getBerries(@RequestParam("offset") int offset, @RequestParam("limit") int limit);

}


