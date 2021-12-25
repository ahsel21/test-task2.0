package com.example.gifmicroservice.controllers;

import com.example.gifmicroservice.service.GifService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RefreshScope
public class gifController {

    private final GifService gifService;

    @RequestMapping("/")
    public String getGif(@RequestParam String tag) {
        return gifService.getGifDTO(tag).getGifLink();
    }
}
