package com.egoncalves.projeto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.egoncalves.projeto.ProjetoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProjetoApplication.class)
@WebAppConfiguration
public class ProjetoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
