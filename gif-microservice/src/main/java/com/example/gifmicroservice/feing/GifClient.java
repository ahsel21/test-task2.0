package com.example.gifmicroservice.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "gefService", url = "${giphy.url}")
public interface GifClient {
    @RequestMapping(method = RequestMethod.GET)
    String get(@RequestParam String api_key, @RequestParam String tag);
}

