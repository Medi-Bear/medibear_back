package com.app.medibear.exercise.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/exercise")
public class exerciseController {

    @PostMapping("/analyze")
    public ResponseEntity<Map> analyze(@RequestBody Map<String,Object> body){

        RestTemplate rest  = new RestTemplate();

        System.out.println("ui에서 받은 데이터"+body);
        ResponseEntity<Map> result = rest.postForEntity("http://localhost:8080/exercise/analyze", body, Map.class);

        // fastapi 응답 데이터
        System.out.println("fastapi응답 데이터:"+result.getBody());

        return ResponseEntity.ok(result.getBody());

    }

}
