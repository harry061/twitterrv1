package com.twiterr.app.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twiterr.app.model.Greeting;

@RestController
public class DemoController {

	private final AtomicInteger counter = new AtomicInteger();

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public Greeting greet(@RequestParam(value = "name", defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), String.format("Hello %s", name));
	}

}
