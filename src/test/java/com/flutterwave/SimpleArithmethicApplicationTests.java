package com.flutterwave;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.flutterwave.arithmethic.ArithmethicDemo;


@SpringBootTest
public class SimpleArithmethicApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	public SimpleArithmethicApplicationTests() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void giving_values_a_n_b_calculate_sum() {
		final double DELTA = 1e-15;
		double actualArea = ArithmethicDemo.sum(1, 7);
		double expectedArea = 8;
		assertEquals(expectedArea, actualArea,DELTA);
	}

}
