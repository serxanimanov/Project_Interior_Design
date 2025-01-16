package ecommerce_design_interior.exceptions;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {


//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleException(Exception ex) {
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                .body("An error occurred: " + ex.getMessage());
//    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleIllegalArgumentException(IllegalArgumentException ex, HttpServletRequest request) {
        return buildProblemDetailResponse(HttpStatus.BAD_REQUEST, "Geçersiz İstek", ex.getMessage(), request);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRuntimeException(RuntimeException ex, HttpServletRequest request) {
        return buildProblemDetailResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Sunucu Hatası", ex.getMessage(), request);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGeneralException(Exception ex, HttpServletRequest request) {
        return buildProblemDetailResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Beklenmeyen Hata", ex.getMessage(), request);
    }

    private ResponseEntity<Object> buildProblemDetailResponse(HttpStatus status, String title, String detail, HttpServletRequest request) {
        Map<String, Object> problemDetails = new HashMap<>();
        problemDetails.put("type", "https://example.com/probs/" + title.toLowerCase().replace(" ", "-"));
        problemDetails.put("title", title);
        problemDetails.put("status", status.value());
        problemDetails.put("detail", detail);
        problemDetails.put("instance", request.getRequestURI());

        return ResponseEntity.status(status).body(problemDetails);
    }
}
