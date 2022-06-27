package com.example.letsLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@SpringBootApplication
public class LetsLearnApplication {

	public static void main(String[] args) throws IOException {

		ClassLoader classLoader =  LetsLearnApplication.class.getClassLoader();
		File file = new File(Objects.requireNonNull(classLoader.getResource("serviceAccountKey.json")).getFile());
		System.out.println(file);
		FileInputStream serviceAccount = new FileInputStream(file.getAbsolutePath());
		
		FirebaseOptions options = new FirebaseOptions.Builder()
		  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
		  .build();

		FirebaseApp.initializeApp(options);
		
		SpringApplication.run(LetsLearnApplication.class, args);
	}

}
