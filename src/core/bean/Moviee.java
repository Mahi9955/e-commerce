package core.bean;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import core.ejb.controller.DataLocalImpl;
import core.ejb.controller.RemoteData;

/**
 * @author mahi
 *
 */
//@ManagedBean
//@RequestScoped
public class Moviee {
	
	RemoteData remoteData;
	private String title;
	private String description;
	private String company;
	private String platform;
	private String classification;
	private double price;
	private int stockNumber;
	private int duration;
	private String specialFeatures;
	private String result;
	
	public Moviee() {
		//no-args constructor
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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

	public String save() {
		Moviee movie = new Moviee();
		movie.setTitle(title);
		movie.setDescription(description);
		movie.setCompany(company);
		movie.setPlatform(platform);
		movie.setClassification(classification);
		movie.setPrice(price);
		movie.setStockNumber(stockNumber);
		movie.setDuration(duration);
		movie.setSpecialFeatures(specialFeatures);
		result = remoteData.save(movie);
		return result;
	}
}
