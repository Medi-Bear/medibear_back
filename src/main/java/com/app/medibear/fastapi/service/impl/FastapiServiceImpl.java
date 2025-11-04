package com.app.medibear.fastapi.service.impl;

import com.app.medibear.fastapi.dto.PredictDto;
import com.app.medibear.fastapi.service.face.FastapiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class FastapiServiceImpl implements FastapiService {

  private final WebClient webClient;

  @Override
  public String getPrediction() {
    // FastAPI 서버에 GET 요청
    PredictDto response = webClient.get()
      .uri("/predict") // FastAPI의 실제 경로: /predict/
      .retrieve()
      .bodyToMono(PredictDto.class)
      .block();

    if (response == null) {
      throw new IllegalStateException("FastAPI 서버로부터 응답이 없습니다.");
    }

    return response.getResult();
  }
}
