package com.happinessIndexbackend.happinessIndex.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="https://localhost:4200")
public class RatingController {

    @GetMapping("/ratings")
    public Integer getCompanyRating(@RequestParam String ratings) {

        Integer sum=0;
        String rats= ratings.substring(1,ratings.length()-1);
        String [] arr= rats.split(",");
        Integer ratingsLen= arr.length;
        Integer avg=0;
        for(String r:arr){
            Integer i= Integer.parseInt(r);
            sum = sum+i;
        }

        if(ratingsLen>0){
    avg= sum/ratingsLen;
}

return avg;
    }
    }

