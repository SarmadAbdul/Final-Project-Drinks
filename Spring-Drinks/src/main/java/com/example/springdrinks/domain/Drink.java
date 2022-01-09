package com.example.springdrinks.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity 
public class Drink {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
 // @Column(nullable = false)
	@NotNull(message = "The beer name")
	private String name;
	
	@Column
	private String type;
	
	@Column
	private long alcoholicPercentage;
	
	@Column
	private long calories;
	
	@Column
	private long carbohydrates;
	
	
	// Default constructor 
	public Drink() {
		
	}

// For testing 
	public Drink(long id, String name, String type, long alcoholicPercentage,
			long calories, long carbohydrates) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.alcoholicPercentage = alcoholicPercentage;
		this.calories = calories;
		this.carbohydrates = carbohydrates;
	}
	
// For creating 
	public Drink(String name, String type, long alcoholicPercentage,
			long calories, long carbohydrates) {
		super();
		this.name = name;
		this.type = type;
		this.alcoholicPercentage = alcoholicPercentage;
		this.calories = calories;
		this.carbohydrates = carbohydrates;
	}

// Getters and Setters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAlcoholicPercentage() {
		return alcoholicPercentage;
	}

	public void setAlcoholicPercentage(long alcoholicPercentage) {
		this.alcoholicPercentage = alcoholicPercentage;
	}

	public long getCalories() {
		return calories;
	}

	public void setCalories(long calories) {
		this.calories = calories;
	}

	public long getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(long carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
	

	@Override
	public String toString() {
		return "Drink [id=" + id + ", name=" + name + ", type=" + type + ", alcoholicPercentage=" + alcoholicPercentage
				+ ", calories=" + calories + ", carbohydrates=" + carbohydrates + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(alcoholicPercentage, calories, carbohydrates, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drink other = (Drink) obj;
		return alcoholicPercentage == other.alcoholicPercentage && calories == other.calories
				&& carbohydrates == other.carbohydrates && Objects.equals(name, other.name)
				&& Objects.equals(type, other.type);
	}

	
	

	

}