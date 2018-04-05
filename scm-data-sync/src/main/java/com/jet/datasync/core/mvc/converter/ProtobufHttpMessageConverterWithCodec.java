package com.jet.datasync.core.mvc.converter;

import com.google.protobuf.Message;
import com.jet.datasync.core.util.CryptoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;

/**
 * Description:
 * <pre>
 *  对使用 protobuf 序列化的数据进一步使用 des 加密
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/11 上午10:55
 */
public class ProtobufHttpMessageConverterWithCodec extends ProtobufHttpMessageConverter {

    Logger logger = LoggerFactory.getLogger(ProtobufHttpMessageConverterWithCodec.class);

    private Environment env;

    public ProtobufHttpMessageConverterWithCodec(Environment env) {
        this.env = env;
    }

    @Override
    protected void writeInternal(Message message, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        MediaType contentType = outputMessage.getHeaders().getContentType();
        if (contentType == null) {
            contentType = getDefaultContentType(message);
        }
        if (PROTOBUF.isCompatibleWith(contentType)) {
            setProtoHeader(outputMessage, message);
            try {
                // 字节流超级大，加密出现堆溢出，暂时取消
                if (message.toByteArray().length > 50 * 1024 * 1024) {
                    FileCopyUtils.copy(message.toByteArray(), outputMessage.getBody());
                } else {
                    FileCopyUtils.copy(CryptoUtil.encrypt(env.getProperty("protobuf.encrypt.key"), message.toByteArray()), outputMessage.getBody());
                }
            } catch (Exception e) {
                logger.error("字节流加密输出异常", e);
                e.printStackTrace();
            }
        } else {
            super.writeInternal(message, outputMessage);
        }
    }

    private void setProtoHeader(HttpOutputMessage response, Message message) {
        response.getHeaders().set(X_PROTOBUF_SCHEMA_HEADER, message.getDescriptorForType().getFile().getName());
        response.getHeaders().set(X_PROTOBUF_MESSAGE_HEADER, message.getDescriptorForType().getFullName());
    }
}
