package com.example.demo.empolye;

import static org.hamcrest.CoreMatchers.containsString;
import org.hamcrest.MatcherAssert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.demo.helpers.Employe;

public class EmployeTest {

	Employe e = null;

	@Test
	public void check_not_null_for_myobject() {
		e = new Employe();
		e.setNom("ayoub");
		e.setSalaireM(30000);
		assertNotNull(e);
	}

	@Test
	public void check_null_for_myobject() {
		// Employe e=null;
		assertNull(e);
	}

	@Test
	public void when_call_get_name_expect_youness() {
		Employe em = new Employe("youness", 60000);
		String nom = em.getNom();
		assertThat(nom, containsString("youn"));
		MatcherAssert.assertThat(nom, containsString("youn"));
		assertTrue("verification de nom", nom.contains("ness"));

	}
}
