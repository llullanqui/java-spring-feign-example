package com.ChapterDesarrollo.FeignClient.controller;

import com.ChapterDesarrollo.FeignClient.dto.berry.Berry;
import com.ChapterDesarrollo.FeignClient.dto.berry.BerryListItem;
import com.ChapterDesarrollo.FeignClient.service.BerriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("berry")
@RequiredArgsConstructor
public class BerriesController {

    @Autowired
    @Qualifier("BerriesService")
    private BerriesService berriesService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<BerryListItem>> getBerriesNamesAndUrls(@RequestParam(defaultValue = "1") int page) {
        return new ResponseEntity<>(berriesService.getBerryList(page), HttpStatus.OK);
    }

    @GetMapping(value = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Berry> getBerryByName(@PathVariable String name) {
        return new ResponseEntity<>(berriesService.getBerryByName(name), HttpStatus.OK);
    }

}
