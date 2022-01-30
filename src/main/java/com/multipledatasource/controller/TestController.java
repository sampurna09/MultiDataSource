package com.multipledatasource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multipledatasource.book.repository.BookRepository;
import com.multipledatasource.model.book.Book;
import com.multipledatasource.model.user.User;
import com.multipledatasource.output.OutPut;
import com.multipledatasource.user.repository.UserRepository;

import lombok.Getter;

@RestController
public class TestController {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/addUser")
	public OutPut addUser(@RequestBody User user) {
		userRepository.save(user);
		OutPut outPut = new OutPut();
		outPut.setId(user.getId());
		outPut.setName(user.getName());
		outPut.setSuccess("true");
		return outPut;
	}
	
	@PostMapping("/addUserQ")
	public OutPut addUserQ(@RequestBody User user) {
		int id=user.getId();
		String name= user.getName();
		userRepository.saveQ(id,name);
		OutPut outPut = new OutPut();
		outPut.setId(user.getId());
		outPut.setName(user.getName());
		outPut.setSuccess("true");
		return outPut;
	}

	@PostMapping("/addBook")
	public OutPut addBook(@RequestBody Book book) {
		bookRepository.save(book);
		OutPut outPut = new OutPut();
		outPut.setId(book.getId());
		outPut.setName(book.getName());
		outPut.setSuccess("true");
		return outPut;
	}

	@GetMapping("/getUsers1")
	public List<User> getUsers() {
		List<User> userList = userRepository.findAllUsers();
		return userList;
	}

	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		List<Book> bookList = bookRepository.findAll();
		return bookList;
	}

}
