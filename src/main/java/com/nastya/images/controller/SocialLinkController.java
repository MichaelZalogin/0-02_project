package com.nastya.images.controller;


import com.nastya.images.entity.SocialLinks;
import com.nastya.images.service.WorkService;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/social")
@RequiredArgsConstructor
public class SocialLinkController {

    private WorkService mainService;

    @GetMapping()
    public List<SocialLinks> getSocialContacts() {
        return mainService.getSocialContacts();
    }

    @PostMapping()
    public SocialLinks changeSocialLink(@RequestBody SocialLinks link){
        return mainService.changeSocialLink(link);
    }

    @DeleteMapping()
    public String deleteSocialLink(@RequestParam @NotBlank String socialLinkId){
        return mainService.deleteSocialLink(socialLinkId);
    }

}
