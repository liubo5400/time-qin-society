package com.lbo.code.timeqinsociety.web;

import com.lbo.code.timeqinsociety.web.dto.rsp.base.ErrorCode;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.ErrorRspDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import javax.validation.ConstraintViolationException;

@Slf4j
@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler({
            Exception.class
    })
    public final ErrorRspDto handleException(Exception ex, WebRequest request) {
        if (!(ex instanceof RestException)) {
            log.error("系统异常", ex);
        } else {
            RestException re = (RestException) ex;
            if (re.getErrorCode() == ErrorCode.SYSTEM_ERROR.getCode()) {
                log.error("系统异常", ex);
            }
        }

        ErrorRspDto erb = null;
        if (ex instanceof HttpRequestMethodNotSupportedException) {
            erb = new ErrorRspDto(ErrorCode.ERROR_METHOD);

        } else if (ex instanceof HttpMediaTypeNotSupportedException) {
            erb = new ErrorRspDto(ErrorCode.SYSTEM_ERROR);

        } else if (ex instanceof HttpMediaTypeNotAcceptableException) {
            erb = new ErrorRspDto(ErrorCode.SYSTEM_ERROR);

        } else if (ex instanceof MissingServletRequestParameterException) {
            erb = new ErrorRspDto(ErrorCode.PARAMS_LOST);

        } else if (ex instanceof ServletRequestBindingException) {
            erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);

        } else if (ex instanceof ConversionNotSupportedException) {
            erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);

        } else if (ex instanceof TypeMismatchException) {
            erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);

        } else if (ex instanceof HttpMessageNotReadableException) {
            erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);

        } else if (ex instanceof HttpMessageNotWritableException) {
            erb = new ErrorRspDto(ErrorCode.SYSTEM_ERROR);

        } else if (ex instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException e = (MethodArgumentNotValidException) ex;
            BindingResult bindingResult = e.getBindingResult();

            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                String code = fieldError.getCode();
                if ("NotBlank".equals(code) ||
                        "NotNull".equals(code)) {
                    erb = new ErrorRspDto(ErrorCode.PARAMS_LOST);
                    break;
                } else if ("Pattern".equals(code)) {
                    erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);
                    break;
                } else if ("Length".equals(code)) {
                    erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);
                    break;
                } else if ("Max".equals(code)) {
                    erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);
                    break;
                } else if ("Min".equals(code)) {
                    erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);
                    break;
                } else if ("Phone".equals(code)) {
                    erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);
                    break;
                }
            }

        } else if (ex instanceof MissingServletRequestPartException) {
            erb = new ErrorRspDto(ErrorCode.SYSTEM_ERROR);

        } else if (ex instanceof BindException) {
            erb = new ErrorRspDto(ErrorCode.PARAMS_NOT_VALID);

        } else if (ex instanceof ConstraintViolationException) {
            erb = new ErrorRspDto(ErrorCode.SYSTEM_ERROR);

        } else if (ex instanceof RestException) {
            RestException e = (RestException) ex;

            erb = new ErrorRspDto(e.getErrorCode(), e.getErrorMsg());
        } else {
            erb = new ErrorRspDto(ErrorCode.SYSTEM_ERROR);
        }
        return erb;
    }

}
