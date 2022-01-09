package com.example.springdrinks.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.springdrinks.domain.Drink;
import com.example.springdrinks.repo.DrinkRepo;

// @RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class DrinkServiceUnitTest {
	// injecting mocks into service class
	// @InjectMocks
	@Autowired
	private DrinkService service;
	
	// @Mock
	@MockBean
	private DrinkRepo repo;
	
	@Test
	public void createTest() {
		Drink input = new Drink("Stella Artois","Lager", 5, 40000, 14);
		Drink output = new Drink(1L, "Stella Artois","Lager", 5, 40000, 14);
		
		Mockito.when(this.repo.save(input)).thenReturn(output);
		assertEquals(output, this.service.create(input)); 
		Mockito.verify(this.repo,Mockito.times(1)).save(input);
	}

}
