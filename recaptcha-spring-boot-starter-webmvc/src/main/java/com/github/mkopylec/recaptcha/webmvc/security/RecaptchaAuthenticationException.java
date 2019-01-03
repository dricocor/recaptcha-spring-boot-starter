package com.github.mkopylec.recaptcha.webmvc.security;

import com.github.mkopylec.recaptcha.commons.validation.ErrorCode;
import org.springframework.security.core.AuthenticationException;

import java.util.List;

import static java.util.Collections.unmodifiableList;

public class RecaptchaAuthenticationException extends AuthenticationException {

    private final List<ErrorCode> errorCodes;

    public RecaptchaAuthenticationException(List<ErrorCode> errorCodes) {
        super("reCAPTCHA authentication error: " + errorCodes);
        this.errorCodes = errorCodes;
    }

    public List<ErrorCode> getErrorCodes() {
        return unmodifiableList(errorCodes);
    }
}
