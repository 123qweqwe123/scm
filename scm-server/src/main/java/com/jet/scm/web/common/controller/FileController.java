package com.jet.scm.web.common.controller;

import com.jet.scm.web.common.service.CommonService;
import org.csource.common.NameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Description:
 * <pre>
 *     统一文件管理 上传/下载
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/27 下午3:19
 */
@RestController
@RequestMapping("/common/file")
public class FileController {

    @Autowired
    private CommonService commonService;

    /**
     * 上传文件
     *
     * @param file
     * @return 文件的 ID
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        return commonService.upload(file);
    }


    @GetMapping("/preview")
    public ResponseEntity<Resource> preview(String fileId) {
        byte[] fileByteArr = commonService.download(fileId);
        ByteArrayResource resource = new ByteArrayResource(fileByteArr);
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .contentLength(fileByteArr.length)
                .body(resource);
    }


    @GetMapping("/download")
    public ResponseEntity<Resource> download(String fileId) {
        Map<String, Object> fileWithMetaData = commonService.downloadWithMetaData(fileId);
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
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .contentLength(fileByteArr.length)
                .body(resource);
    }
}
