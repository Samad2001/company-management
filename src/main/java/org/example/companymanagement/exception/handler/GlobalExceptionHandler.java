//package org.example.companymanagement.exception.handler;
//
//import org.example.companymanagement.exception.CommonException;
//import org.example.companymanagement.exception.ErrorDetails;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(CommonException.class)
//    public ResponseEntity<ErrorDetails> handleUserNotExistException(CommonException exception) {
//
//        ErrorDetails errorDetails =  new ErrorDetails(exception.getCode(), exception.getDescription());
//        return ResponseEntity
//                .status(exception.getHttpStatus())
//                .body(errorDetails);
//    }
//
//}
