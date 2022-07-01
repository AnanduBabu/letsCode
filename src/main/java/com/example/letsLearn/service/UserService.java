package com.example.letsLearn.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.letsLearn.dto.requestDTO.UserRequestDTO;
import com.example.letsLearn.entity.User;
//import com.google.api.core.ApiFuture;
//import com.google.cloud.firestore.DocumentReference;
//import com.google.cloud.firestore.DocumentSnapshot;
//import com.google.cloud.firestore.Firestore;
//import com.google.firebase.cloud.FirestoreClient;
import com.example.letsLearn.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User getUsers(String documentId) throws InterruptedException, ExecutionException {
//		Firestore dbFireStore = FirestoreClient.getFirestore();
//		DocumentReference documentReference = dbFireStore.collection("users").document(documentId);
//		ApiFuture<DocumentSnapshot> future = documentReference.get();
//		DocumentSnapshot document = future.get();
//		User user;
//		if(document.exists()) {
//			user=document.toObject(User.class);
//			return user;
//		}
		return null;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User addUser(UserRequestDTO request) {
		User user = new User();
		user.setEmail(request.getEmail());
		user.setName(request.getName());
		user.setPhone_number(request.getPhone_number());
		
		return userRepository.save(user);
	}

	

}
