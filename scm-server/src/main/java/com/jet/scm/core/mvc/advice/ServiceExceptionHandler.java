package com.jet.scm.core.mvc.advice;

import com.jet.scm.core.exception.ServiceException;
import com.jet.scm.core.exception.ValidatorException;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * Description:
 * <pre>
 *     异常增强
 *     统一处理所有的异常，无需在 controller 里面显式的抛出
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/18 下午4:07
 */
@RestControllerAdvice
public class ServiceExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(ServiceException.class);

    private final Environment env;

    @Autowired
    public ServiceExceptionHandler(Environment env) {
        this.env = env;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handlerError(Exception ex, WebRequest request) {
        Map<String, Object> resp = Maps.newHashMap();
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        String url = ((ServletWebRequest) request).getRequest().getRequestURI();    // 当前请求url
        String msg = env.getProperty("err.default");
        if (ex instanceof UncategorizedSQLException) {
            // sql 异常
            msg = env.getProperty("err.sql");
        } else if (ex instanceof ValidatorException) {
            // 表单校验异常
            msg = ex.getMessage();
            status = HttpStatus.BAD_REQUEST;
        } else if (ex instanceof HttpMediaTypeNotSupportedException) {
            // 媒体类型不被支持
        } else {
            msg = ex.getMessage();
        }
        ex.printStackTrace();
        resp.put("message", msg);
        logger.error("url:{},error:{}", url, ex.getMessage());
        return ResponseEntity.status(status).body(resp);
    }
}
