package io.pelat1.jt.spring6;

import io.pelat1.jt.spring6.controller.FauxController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class spring6AssignmentsApplicationTests {
	@Autowired
	FauxController fauxController;

	@Test
	void fauxDatasource() {
		System.out.println(fauxController.getFauxDatasource());
	}
}
