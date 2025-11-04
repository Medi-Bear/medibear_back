package com.app.medibear.fastapi.controller;

import com.app.medibear.fastapi.service.face.FastapiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fastapi")
@RequiredArgsConstructor
public class FastapiController {

  private final FastapiService fastapiService;

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public String test() {
    String data = fastapiService.getPrediction();
    return data;
  }

  @RequestMapping(value = "/react", method = RequestMethod.GET)
  public String react() {
    return "react data!";
  }

}
