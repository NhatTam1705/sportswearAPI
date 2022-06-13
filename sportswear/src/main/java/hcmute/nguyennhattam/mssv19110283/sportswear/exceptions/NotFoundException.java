package hcmute.nguyennhattam.mssv19110283.sportswear.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Fri, 4/29/2022
 * Time     : 10:22 AM
 * Filename : NotFoundException
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    public NotFoundException(){

    }

    public NotFoundException(String message, Throwable cause){super(message,cause);}

    public NotFoundException(String message) {
        super(message);
    }
}
