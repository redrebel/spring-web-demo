package cjred.tutorial.fileuploaddemo;

import cjred.tutorial.fileuploaddemo.property.FileUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileUploadProperties.class
})
public class FileUploadDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadDemoApplication.class, args);
    }

}
