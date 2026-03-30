package br.com.ccrocia.domain;

import javax.persistence.*;

@Entity
@Table(name="Brand")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_brand")
	@SequenceGenerator(name = "seq_brand", sequenceName = "seq_brand", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "Name", length = 40, nullable = false, unique = false)
	private String name;
	
	@Column(name = "Value", length = 30, nullable = false, unique = false)
	private int value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
