package ves.com.villa1;

import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import ves.com.villa1.entity.Persona;
import ves.com.villa1.repository.PersonaRepository;

@WebMvcTest
@SpringBootTest
class Villa1ApplicationTests {

	@MockBean
	private PersonaRepository repository;

	@Autowired
	private MockMvc mockMvc;

	// @MockBean
	// private Villa1Application villa1Application;

	@Test
	void contextLoads() {
	}

	@Test
	public void shouldDoSomething(){
		var persona = new Persona();
		persona.setApellidoMaterno("Oliva");
		persona.setCelular("9000000");
		persona.setId(2);
		var persona2 = new Persona();
		persona2.setApellidoMaterno("Lizandro");
		persona2.setId(3);
		
		// TODO FALTA TERMINAR EL TEST, ESTA INCORRECTO 
		when(repository.findAll()).thenReturn(Arrays.asList(persona,persona2));
	}
}
