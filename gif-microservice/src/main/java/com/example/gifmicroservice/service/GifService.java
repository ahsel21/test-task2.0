package com.example.gifmicroservice.service;

import com.example.gifmicroservice.DTO.GifDTO;
import com.example.gifmicroservice.feing.GifClient;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@RefreshScope
public class GifService {
    private final GifClient gifClient;

    @Value("${giphy.api_key}")
    private String api_key;


    public GifDTO getGifDTO(String tag) {
        // get link
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(gifClient.get(api_key, tag), JsonObject.class);
        String gifLink = jsonObject
                .getAsJsonObject("data")
                .getAsJsonObject("images")
                .getAsJsonObject("downsized")
                .get("url")
                .getAsString();
        return new GifDTO(tag, gifLink);
    }


}