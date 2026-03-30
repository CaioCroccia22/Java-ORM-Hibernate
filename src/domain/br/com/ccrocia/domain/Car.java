package br.com.ccrocia.domain;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Car")
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_car")
	@SequenceGenerator(name="seq_car", sequenceName="seq_car", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name="License_Plate_ds", length=10, nullable = false, unique = true)
	private String licensePlate;
	
	@Column(name="Year_nr", length=4, nullable = false, unique = false)
	private int year;
	
	
	@OneToOne
	@JoinColumn(name = "Brand_id" ,
	foreignKey = @ForeignKey(name = "fk_brand_car"),
	referencedColumnName = "id")
	private Brand brand;
	
	
	@ManyToMany
	@JoinColumn(name = "Auto Part id" ,
	foreignKey = @ForeignKey(name = "fk_auto_parts_car"),
	referencedColumnName = "id")
	private List<AutoParts> autoParts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public List<AutoParts> getAutoParts() {
		return autoParts;
	}

	public void setAutoParts(List<AutoParts> autoParts) {
		this.autoParts = autoParts;
	}
	
	
}
