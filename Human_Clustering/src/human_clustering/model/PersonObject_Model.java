package human_clustering.model;

public class PersonObject_Model {
	private String name;
	private Integer sports;
	private Integer music;
	private Integer entertainmentNews;
	private Integer science;
	public PersonObject_Model(String name,Integer sports, Integer music, Integer entertainmentNews, Integer science) {
		this.name = name;
		this.sports = sports;
		this.music = music;
		this.entertainmentNews = entertainmentNews;
		this.science = science;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSports() {
		return sports;
	}
	public void setSports(Integer sports) {
		this.sports = sports;
	}
	public Integer getMusic() {
		return music;
	}
	public void setMusic(Integer music) {
		this.music = music;
	}
	public Integer getEntertainmentNews() {
		return entertainmentNews;
	}
	public void setEntertainmentNews(Integer entertainmentNews) {
		this.entertainmentNews = entertainmentNews;
	}
	public Integer getScience() {
		return science;
	}
	public void setScience(Integer science) {
		this.science = science;
	}

}
