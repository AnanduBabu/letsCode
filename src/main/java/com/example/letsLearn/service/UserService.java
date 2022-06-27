package com.example.letsLearn.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.example.letsLearn.entity.User;
//import com.google.api.core.ApiFuture;
//import com.google.cloud.firestore.DocumentReference;
//import com.google.cloud.firestore.DocumentSnapshot;
//import com.google.cloud.firestore.Firestore;
//import com.google.firebase.cloud.FirestoreClient;

@Service
public class UserService {

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

	

}
