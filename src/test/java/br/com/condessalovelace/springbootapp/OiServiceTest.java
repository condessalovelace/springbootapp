package br.com.condessalovelace.springbootapp;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {RestTemplate.class})
public class OiServiceTest {
	@Autowired
	private RestTemplate restTemplate;
	
	@Before
	public void setUp() throws IOException {
		SpringbootappApplication.main(new String[] {});
	}

	@After
	public void tearDown() {
		SpringbootappApplication.shutDown();
	}

	@Test
	public void testOiServiceSucesso() {
		ResponseEntity<String> resposta = restTemplate.exchange("http://localhost:8080/oi/giuliana", HttpMethod.GET, null, String.class);
		assertEquals("Oi, giuliana!\n", resposta.getBody());
	}
}
