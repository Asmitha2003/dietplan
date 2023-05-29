package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="diet")
public class dp {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	public dp() 
	{
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	public String getTraining() {
		return training;
	}
	public void setTraining(String training) {
		this.training = training;
	}
	public String getTrainingtime() {
		return trainingtime;
	}
	public void setTrainingtime(String trainingtime) {
		this.trainingtime = trainingtime;
	}
	public String getConsultation() {
		return consultation;
	}
	public void setConsultation(String consultation) {
		this.consultation = consultation;
	}
	private String trainername;
	private String training;
	private String trainingtime;
private String consultation;
	@Override
	public String toString() {
		return "dp [id=" + id + ", trainername=" + trainername + ", training=" + training + ", trainingtime="
				+ trainingtime + ", consultation=" + consultation + "]";
	}
	
	

}
