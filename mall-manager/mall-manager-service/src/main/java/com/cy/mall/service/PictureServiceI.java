package com.cy.mall.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by cy on 2016/5/4.
 */
public interface PictureServiceI {
	Map uploadPicture(MultipartFile uploadFile);
}
