package com.example._376231mz130.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
    @Autowired
    private RestTemplate restTemplate;

    private final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJNYXBDbGFpbXMiOnsiYXVkIjoiaHR0cDovLzIwLjI0NC41Ni4xNDQvZXZhbHVhdGlvbi1zZXJ2aWNlIiwiZW1haWwiOiJwcmFuYXYubXoyM0BiaXRzYXRoeS5hYy5pbiIsImV4cCI6MTc3ODIzMzAzNCwiaWF0IjoxNzc4MjMyMTM0LCJpc3MiOiJBZmZvcmQgTWVkaWNhbCBUZWNobm9sb2dpZXMgUHJpdmF0ZSBMaW1pdGVkIiwianRpIjoiMzZjYTA3ZTMtNjY5NS00YmFhLTgxYzgtMmQ5ZTk1Y2Q1MDBiIiwibG9jYWxlIjoiZW4tSU4iLCJuYW1lIjoicHJhbmF2IHkiLCJzdWIiOiJjMjY3NWE2Ni02ZjU4LTRmNDEtYjEzNC02ZjhhOWU3ZDcyNmUifSwiZW1haWwiOiJwcmFuYXYubXoyM0BiaXRzYXRoeS5hYy5pbiIsIm5hbWUiOiJwcmFuYXYgeSIsInJvbGxObyI6IjczNzYyMzFtejEzMCIsImFjY2Vzc0NvZGUiOiJ1S2FKZm0iLCJjbGllbnRJRCI6ImMyNjc1YTY2LTZmNTgtNGY0MS1iMTM0LTZmOGE5ZTdkNzI2ZSIsImNsaWVudFNlY3JldCI6IkNUalZ0ZkN4ek5DdGFBR3YifQ.pp7Cv2EIrLJdiOuQtqpDUDtdzbinGTdVJdx0U4Rk_UE";
    private final String API_URL = "http://4.224.186.213/evaluation-service/depots";

    public String fetchData() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + TOKEN);
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                API_URL,
                HttpMethod.GET,
                entity,
                String.class
        );

        return response.getBody();
    }


}
