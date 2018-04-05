package com.jet.scm.mobile.core.mvc.filter.domain;

import com.google.common.collect.Maps;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/8/1 下午6:34
 */
public class UrlDecodeHttpRequest extends HttpServletRequestWrapper {

    private static ThreadLocal<Map<String, String[]>> parameters = new ThreadLocal<>();
    public static final String encodeParamKey = "value";

    public UrlDecodeHttpRequest(HttpServletRequest request) {
        super(request);
    }


    @Override
    public String[] getParameterValues(String name) {
        String[] id = super.getParameterValues("id");
        String[] names = super.getParameterValues("name");
        if(parameters.get() == null) {
            decodeRequestParameter(getParameter(encodeParamKey));
        }
        return parameters.get().get(name);
    }

    private void decodeRequestParameter(String sourceValue) {
        Map<String,String[]> params = Maps.newHashMap();
        parameters.set(params);
    }

}
