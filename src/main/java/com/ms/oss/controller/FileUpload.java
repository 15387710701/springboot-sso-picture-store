package com.ms.oss.controller;

import com.ms.oss.config.service.AliyunOssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("oss")
public class FileUpload {

    @Autowired
    private AliyunOssService aliyunOssServiceImpl;

    @RequestMapping(value = "fileoss", method = RequestMethod.POST)
    public Map<String, Object> uploadOssFile(MultipartFile file, String fileName){
        return this.aliyunOssServiceImpl.upload(file, fileName);

    }
}
