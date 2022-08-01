package com.naveen.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.naveen.beans.Trainer1;
import com.naveen.contract.ITrainer;
import com.naveen.exception.IncomeTooLessException;
import com.naveen.exception.NameTooSmallException;
import com.naveen.util.DBConnection;
import com.naveen.util.Util;

public class Trainer1Dao implements ITrainer {

	@Override
	public Trainer1 insertTrainer(Trainer1 trainer) 
			throws IncomeTooLessException, NameTooSmallException {
		
		
		checkIncome(trainer.getTrainerIncome());

		if (trainer.getTrainerName().length() < 4) {
			throw new NameTooSmallException("Sorry Name Too Small : " + trainer.getTrainerName());
		}

		// actual business logic goes here
		String sql = "insert into trainer  values (?,?,?,?)";
		try {
			PreparedStatement ps = DBConnection.getMysqlConnection().prepareStatement(sql);
			ps.setInt(1, trainer.getTrainerId());
			ps.setString(2, trainer.getTrainerName());
			ps.setString(3, trainer.getTrainerEmail());
			ps.setDouble(4, trainer.getTrainerIncome());

			return ps.executeUpdate() > 0 ? trainer : null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}


	private void checkIncome(double income) throws IncomeTooLessException {
		if (income < 3000) {
			throw new IncomeTooLessException("Sorry Income very low: " +income);
		}
	}
 
	
	@Override
	public boolean deleteTrainer(int trainerId) {
		String sql ="delete from trainer where tid =?";
		try {
			PreparedStatement ps = DBConnection.getMysqlConnection().prepareStatement(sql);
			ps.setInt(1, trainerId);
			
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	





	@Override
	public Trainer1 getTrainer(int trainerId) {
		String sql ="select  tid, tname, temail, tincome  from trainer where tid = ?"; 
		try {
			PreparedStatement ps = DBConnection.getMysqlConnection().prepareStatement(sql);
			ps.setInt(1, trainerId);
			
			ResultSet resultSet = ps.executeQuery();
			
			if(resultSet.next()) {
				Trainer1 t = new Trainer1(); 
				t.setTrainerId(trainerId);
				t.setTrainerName(resultSet.getString("tname"));
				t.setTrainerEmail(resultSet.getString(3));
				t.setTrainerIncome(resultSet.getDouble(4));
				
				return t; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Trainer1> getAllTrainers() {
		String sql ="select  tid, tname, temail, tincome  from trainer"; 
		List<Trainer1> list = new ArrayList<Trainer1>(); 
		
		
		try {
			PreparedStatement ps = DBConnection.getMysqlConnection().prepareStatement(sql); 
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Trainer1 t = new Trainer1(); 
				t.setTrainerId(resultSet.getInt(1));
				t.setTrainerName(resultSet.getString("tname"));
				t.setTrainerEmail(resultSet.getString(3));
				t.setTrainerIncome(resultSet.getDouble(4));
				
				list.add(t); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list; 
	}


	
	
	
	@Override
	public boolean updateIncome(int trainerId, double newIncome) {
		String sql = "update trainer set tincome = ? where tid = ?";
		
		try {
			checkIncome(newIncome);
		} catch (IncomeTooLessException e1) {
			e1.printStackTrace();
		}
		try {
			PreparedStatement ps = DBConnection.getMysqlConnection().prepareStatement(sql);
			ps.setDouble(1, newIncome);
			ps.setInt(2, trainerId);
			
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return false; 
	}

}
