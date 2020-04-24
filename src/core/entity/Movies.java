package core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movies implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String company;
	
	@Column(name = "plat_form")
	private String platform;
	
	@Column
	private String classification;
	
	@Column
	private double price;
	
	@Column(name = "stock_number")
	private int stockNumber;
	
	@Column
	private int duration;
	
	@Column(name = "special_features")
	private String specialFeatures;

	
	public Movies() {
		// no-args constructor
	}

	
	public Movies(int id, String title, String description, String company, String platform, String classification,
			double price, int stockNumber, int duration, String specialFeatures) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.company = company;
		this.platform = platform;
		this.classification = classification;
		this.price = price;
		this.stockNumber = stockNumber;
		this.duration = duration;
		this.specialFeatures = specialFeatures;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
}
