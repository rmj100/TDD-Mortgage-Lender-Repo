package com.rj.mortgageLender;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.rj.peopleObj.lender;

class mortgageLenderTest {
	static lender Lender;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Lender = new lender();
	}

	@Test
	void testCheckLenderBalance() {
		Lender.setBalance(1000.00);
		assertTrue (Lender.getBalance() == 1000.00);
	}

}
