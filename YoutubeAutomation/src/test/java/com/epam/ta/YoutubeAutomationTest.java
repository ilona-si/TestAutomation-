package com.epam.ta;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.epam.ta.steps.Steps;

public class YoutubeAutomationTest
{
	private Steps steps;
	private final String USERNAME = "sirotininailona@gmail.com";
	private final String PASSWORD = "17070711sergei";

	@BeforeMethod(description = "Init browser")
	public void setUp()
	{
		steps = new Steps();
		steps.initBrowser();
	}




	@Test
	public void loginTest() throws InterruptedException {
		steps.loginYoutube(USERNAME, PASSWORD);
	}

	@Test
	public void likeTest() throws InterruptedException {
		steps.loginYoutube(USERNAME, PASSWORD);
		Assert.assertTrue(steps.checkLoggedIn());
		steps.like();
	}

	@Test
	public void dislikeTest() throws InterruptedException {
		steps.loginYoutube(USERNAME, PASSWORD);
		Assert.assertTrue(steps.checkLoggedIn());
		steps.dislike();
	}

	@Test
	public void subscribeTest() throws InterruptedException {
		steps.loginYoutube(USERNAME, PASSWORD);
		Assert.assertTrue(steps.checkLoggedIn());
		steps.subscribe();
	}

	@Test
	public void unSubscribeTest() throws InterruptedException {
		steps.loginYoutube(USERNAME, PASSWORD);
		Assert.assertTrue(steps.checkLoggedIn());
		steps.unSubscribe();
	}


	@AfterMethod(description = "Stop Browser")
	public void stopBrowser()
	{
		steps.closeDriver();
	}

}
