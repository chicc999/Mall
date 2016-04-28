package com.cy.mall.common.utils;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by cy on 2016/4/28.
 */
public class FileUtilsTest {

	@Test
	public void testFtp() throws Exception {
		FileInputStream fin =  new FileInputStream(new File("pom.xml"));
		boolean success = FtpUtil.uploadFile("10.9.3.59",21,"xdfs","xdfs","/home/xdfs","aac.xml",fin);
		System.out.println(success);

		FtpUtil.downloadFile("10.9.3.59",21,"xdfs","xdfs","/home/xdfs","Test.java","aaa");
	}

	}
