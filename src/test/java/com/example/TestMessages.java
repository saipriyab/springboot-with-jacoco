package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootWithJacocoApplication.class)
public class TestMessages {

	@Test
	public void testMessage()
	{
		Messages obj=new Messages();
		Assertions.assertEquals("hello saipriyadarshini bandi",obj.getMessage("hello saipriyadarshini bandi"));
	}
}
