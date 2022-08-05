package com.sapient.mock.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.naveen.beans.Trainer;
import com.naveen.interfaces.ITrainerDAO;
import com.naveen.interfaces.ITrainerService;
import com.sapient.junit.works.ITestingSampleCode;



@ExtendWith(MockitoExtension.class)
class MockitoTestEx02 {
	@Mock
	ITestingSampleCode mockTSC;
	
	@Mock
	ITrainerDAO mockTrainerDao; 
	
	@InjectMocks
	ITrainerService trainerService; 

	@Test
	void mockintTestForGettingNamesSize() {

		// stub
		List<String> list = List.of("Harry", "Peter", "Becky");

		when(mockTSC.getNames()).thenReturn(list);

		assertEquals(3, mockTSC.getNames().size());

	}
	
	
	@Test
	@DisplayName("inserting the trainer in the database mocking")
	void mockInsertTrainer() {
		Trainer trainer = new Trainer("Naveen", "naveen@probits.inc", "keepguessing"); 
		Trainer retTrainer = new Trainer("Naveen", "naveen@probits.inc", "keepguessing");
		retTrainer.setTrainerId(101);
		
		when(mockTrainerDao.insertTrainer(trainer)).thenReturn(retTrainer); 
		assertEquals(101, mockTrainerDao.insertTrainer(trainer).getTrainerId());
	}
	
	

}
