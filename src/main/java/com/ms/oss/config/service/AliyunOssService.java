package com.ms.oss.config.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.Map;

public interface AliyunOssService {
    Map<String, Object> upload(MultipartFile file, String fileName);
}
