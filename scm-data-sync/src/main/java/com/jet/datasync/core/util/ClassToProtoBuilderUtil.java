package com.jet.datasync.core.util;

import com.google.protobuf.AbstractMessage.Builder;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Description:
 * <p>
 * Author: huangchengzhi
 * Create: 2017/7/14
 */
public class ClassToProtoBuilderUtil {

    public static Builder getProtoBuilder(Object model, Builder builder) {
        // 获取实体类的所有属性(包含父类属性)
        ReflectionUtils.doWithFields(model.getClass(), field -> {
            try {
                // 获取属性的名字
                String name = field.getName();
                // 将属性的首字符大写，方便构造get，set方法
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
                // 获取get方法
                Method m = model.getClass().getMethod("get" + name);
                // 获取属性的类型
                String typeName = field.getType().getTypeName();
                if ("java.lang.String".equals(typeName)) {
                    // 调用get方法
                    String value = (String) m.invoke(model);
                    if (value != null) {
                        // 将java对象的值 添加到Builder
                        Method buildMethod = builder.getClass().getMethod("set" + name, String.class);
                        buildMethod.invoke(builder, value);
                    }
                } else if ("java.lang.Integer".equals(typeName)) {
                    // 调用get方法
                    Integer value = (Integer) m.invoke(model);
                    if (value != null) {
                        // 将java对象的值 添加到Builder
                        Method buildMethod = builder.getClass().getMethod("set" + name, int.class);
                        buildMethod.invoke(builder, value);
                    }
                } else if ("java.lang.Short".equals(typeName)) {
                    // 调用get方法
                    Short value = (Short) m.invoke(model);
                    if (value != null) {
                        // 将java对象的值 添加到Builder
                        Method buildMethod = builder.getClass().getMethod("set" + name, int.class);
                        buildMethod.invoke(builder, value);
                    }
                } else if ("java.lang.Long".equals(typeName)) {
                    // 调用get方法
                    Long value = (Long) m.invoke(model);
                    if (value != null) {
                        // 将java对象的值 添加到Builder
                        Method buildMethod = builder.getClass().getMethod("set" + name, long.class);
                        buildMethod.invoke(builder, value);
                    }
                } else if ("java.lang.Boolean".equals(typeName)) {
                    // 调用get方法
                    Boolean value = (Boolean) m.invoke(model);
                    if (value != null) {
                        // 将java对象的值 添加到Builder
                        Method buildMethod = builder.getClass().getMethod("set" + name, boolean.class);
                        buildMethod.invoke(builder, value);
                    }
                } else if ("java.util.Date".equals(typeName)) {
                    // 调用get方法
                    Date value = (Date) m.invoke(model);
                    if (value != null) {
                        // 将java对象的值 添加到Builder
                        Method buildMethod = builder.getClass().getMethod("set" + name, long.class);
                        buildMethod.invoke(builder, value.getTime());
                    }
                } else if ("int".equals(typeName)) {
                    // 调用get方法
                    int value = (int) m.invoke(model);
                    // 将java对象的值 添加到Builder
                    Method buildMethod = builder.getClass().getMethod("set" + name, int.class);
                    buildMethod.invoke(builder, value);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        return builder;
    }
}
