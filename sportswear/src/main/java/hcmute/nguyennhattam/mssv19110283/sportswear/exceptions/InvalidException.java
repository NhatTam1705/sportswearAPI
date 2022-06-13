package hcmute.nguyennhattam.mssv19110283.sportswear.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Wed, 6/1/2022
 * Time     : 10:44 AM
 * Filename : InvalidException
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidException extends RuntimeException{
    public InvalidException() {
    }

    public InvalidException(String message) {
        super(message);
    }
}