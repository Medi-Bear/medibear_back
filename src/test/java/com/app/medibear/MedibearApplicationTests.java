package com.app.medibear;

import com.app.medibear.fastapi.service.impl.FastapiServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MedibearApplicationTests {

  @Autowired
  private FastapiServiceImpl fastapiServiceImpl;

  @Test
  void contextLoads() {
  }

  @Test
  public void testFastapiPrediction() {
    String predict = fastapiServiceImpl.getPrediction();
    System.out.println(predict);
  }

}
