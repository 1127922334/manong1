package com.manong.controller;

import fastdfs.FastDFSClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class FileController {
    @RequestMapping(value = "/uploadfile",method = RequestMethod.POST)
    @ResponseBody
    public  String fileupload(@RequestParam MultipartFile uploadfile) throws IOException {
       String fileID= FastDFSClient.uploadFile(uploadfile.getInputStream() , uploadfile.getOriginalFilename());
       if (fileID!=null){
           System.out.println("上传成功");
       }
        return fileID+"-----"+uploadfile.getOriginalFilename();
    }

}
