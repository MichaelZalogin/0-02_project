package com.nastya.images.controller;


import com.nastya.images.entity.Work;
import com.nastya.images.service.WorkService;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/works")
@RequiredArgsConstructor
public class WorkController {

    private WorkService mainService;


    @GetMapping()
    public List<Work> getWorks(@RequestParam(required = false) List<String> topicIds) {
        return mainService.getWorks(topicIds);
    }

    @PostMapping()
    public Work changeWork(@RequestBody Work image) {
        return mainService.changeWork(image);
    }

    @DeleteMapping()
    public Boolean changeWork(@RequestParam @NotBlank String workId,
                             @RequestParam(required = false) String imageId) {
        return mainService.deleteWorkOrImage(workId, imageId);
    }


}