package br.com.ccrocia.domain;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="AutoParts")
public class AutoParts {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_autoParts")
	@SequenceGenerator(name = "seq_autoParts", sequenceName = "seq_autoParts", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "description", length = 40, nullable = false, unique = false)
	private String description;
	
	@ManyToMany(mappedBy = "autoParts")
	private List<Car> carList;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
}
