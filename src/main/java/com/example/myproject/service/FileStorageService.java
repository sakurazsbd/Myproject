package com.example.myproject.service;

import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @Author: lixl
 * @Date: 2021/11/6 19:03
 * @Descrption
 */
public interface FileStorageService {
    public void init();

    public void save(MultipartFile file);

//    public Resource load(String fileName);
//
//    public void deleteAll();
//
//    public Stream<Path> loadAll();
}
