package com.github.swapnil.LabFolderProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.github.swapnil.LabFolderProject.**")
public class LabFolderProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabFolderProjectApplication.class, args);
	}

}
