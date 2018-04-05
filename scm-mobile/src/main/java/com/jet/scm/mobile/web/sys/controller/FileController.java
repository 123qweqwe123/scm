package com.jet.scm.mobile.web.sys.controller;

import com.google.common.collect.Maps;
import com.jet.scm.mobile.thirdservice.fdfs.FileService;
import org.apache.commons.lang3.StringUtils;
import org.csource.common.NameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/8/1 下午1:29
 */
@RestController
public class FileController {


    @Autowired
    private FileService fileService;

    /**
     * 上传文件
     *
     * @param file
     * @return 文件的 ID
     */
    @PostMapping("/files")
    public Map<String, Object> upload(@RequestParam("file") MultipartFile file) {
        String fileName = file.getOriginalFilename();
        String extName = StringUtils.substringAfterLast(fileName, ".");
        Map<String, Object> result = Maps.newHashMap();
        try {
            NameValuePair[] pairs = new NameValuePair[1];
            pairs[0] = new NameValuePair("name", fileName);
            String fileId = fileService.uploadFile(file.getBytes(), extName, pairs);
            result.put("fileId", fileId);
            result.put("isSuccess", true);
        } catch (IOException e) {
            e.printStackTrace();
            result.put("isSuccess", false);
            result.put("errMsg", "上传失败");
        }
        return result;
    }

    @GetMapping("/files")
    public ResponseEntity<Resource> download(String fileId) {
        Map<String, Object> fileWithMetaData = fileService.downloadFileWithMetaData(fileId);
        byte[] fileByteArr = (byte[]) fileWithMetaData.get("body");
        ByteArrayResource resource = new ByteArrayResource(fileByteArr);
        NameValuePair[] metaData = (NameValuePair[]) fileWithMetaData.get("meta");
        String fileName = "";
        if (metaData != null) {
            for (NameValuePair pair : metaData) {
                if ("name".equals(pair.getName())) {
                    fileName = pair.getValue();
                    break;
                }
            }
        }
        return ResponseEntity.ok()
                .header("Content-Disposition", "attachment; filename=\"" + fileName + "\"")
                .contentType(MediaType.IMAGE_JPEG)
                .contentLength(fileByteArr.length)
                .body(resource);
    }
}