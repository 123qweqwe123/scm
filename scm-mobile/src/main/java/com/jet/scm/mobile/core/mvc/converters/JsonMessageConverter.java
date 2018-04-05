package com.jet.scm.mobile.core.mvc.converters;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/23 下午4:28
 */
public class JsonMessageConverter extends AbstractHttpMessageConverter<String> {

    private List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();

    public JsonMessageConverter() {
        this.supportedMediaTypes.add(MediaType.ALL);

        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
        stringHttpMessageConverter.setWriteAcceptCharset(false);

    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    protected boolean canWrite(MediaType mediaType) {
        return super.canWrite(mediaType);
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return false;
    }

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return true;
    }

    @Override
    protected boolean canRead(MediaType mediaType) {
        return true;
    }

    @Override
    protected String readInternal(Class<? extends String> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected void writeInternal(String s, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

    }
}
