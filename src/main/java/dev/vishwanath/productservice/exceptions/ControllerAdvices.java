package dev.vishwanath.productservice.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvices {

    @ExceptionHandler(NotFoundException.class)
    private ResponseEntity<ExceptionDto> handlerNotFoundException(){
///      System.out.println("Not Found Exception happened");
        return new ResponseEntity(
                new ExceptionDto(HttpStatus.NOT_FOUND,"Hi"),
                HttpStatus.NOT_FOUND
        );
    }

}
