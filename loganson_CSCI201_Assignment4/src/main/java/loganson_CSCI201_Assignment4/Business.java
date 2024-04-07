package loganson_CSCI201_Assignment4;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Business {
	private String id;
	private String alias;
	private String name;
	private String image_url;
	private Boolean isClosed;
	private String url;
	private Integer reviewCount;
	private List<Category> categories;
	private Double rating;
	private Coordinates coordinates;
	private List<String> transactions;
	private String price;
	private Location location;
	private String phone;
	private String display_phone;
	private Double distance;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImageUrl() {
		return image_url;
	}
	
	public void setImageUrl(String imageUrl) {
		this.image_url = imageUrl;
	}
	
	public Boolean getIsClosed() {
		return isClosed;
	}
	
	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Integer getReviewCount() {
		return reviewCount;
	}
	
	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}
	
	public List<Category> getCategories() {
		return categories;
	}
	
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	public Double getRating() {
		return rating;
	}
	
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	public Coordinates getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	public List<String> getTransactions() {
		return transactions;
	}
	
	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getDisplayPhone() {
		return display_phone;
	}
	
	public void setDisplayPhone(String displayPhone) {
		this.display_phone = displayPhone;
	}
	
	public Double getDistance() {
		return distance;
	}
	
	public void setDistance(Double distance) {
		this.distance = distance;
	}

}