package com.sep4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sep4")
public class MController {
	@Autowired
	MessagesService service;

	@GetMapping("/getMessages")
	public ResponseEntity<List<Messages>> getCustomerBy() {
		List<Messages> messagesList = service.findAll();
		System.out.println("done");

		return new ResponseEntity<List<Messages>>(messagesList, HttpStatus.OK);

	}
	
	@PostMapping("/postMessage")
	public String postCustomerById2(@RequestBody Messages message) {
		Messages msg = new Messages(message.getSender(), message.getReciever(), message.getBody());
		service.postMessage(message);
		return "Done";
	}
}
