package com.sapient.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.naveen.beans.Trainer1;
import com.naveen.contract.ITrainer;
import com.naveen.dao.Trainer1Dao;
import com.naveen.exception.IncomeTooLessException;
import com.naveen.exception.NameTooSmallException;

/**
 * 
 * @author naveenkumar
 *
 */
public class TrainerTest {
	private ITrainer trainerDao = null;
	
	@Before
	public void setUp() {
		 trainerDao = new Trainer1Dao();
	}
	
	@Test
	@Ignore
	public void trainerInsertTest() throws IncomeTooLessException, NameTooSmallException {
		 Trainer1 trainer = new Trainer1(105, "Mayank", "mayank@ps.in", 6000.0);
		 Trainer1 retTrauner =  trainerDao.insertTrainer(trainer); 
		 assertEquals("Mayank", retTrauner.getTrainerName());
	}

	@Test
	public void getTrainerTest() {
		assertNotNull(trainerDao.getTrainer(104));
	}
	
}
