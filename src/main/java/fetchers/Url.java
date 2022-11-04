package fetchers;

public class Url {

	private String country;
	private int yearStart;
	private int yearEnd;
	private String analysisMode;
	
	public String getCountry() {
		return this.country;
	}
	
	public int yearStart() {
		return this.yearStart;
	}
	
	public int yearEnd() {
		return this.yearEnd;
	}
	
	public String analysisMode() {
		return this.analysisMode;
	}
	
	private Url(UrlBuilder builder) {
		this.country = builder.country;
		this.yearStart = builder.yearStart;
		this.yearEnd = builder.yearEnd;
		this.analysisMode = builder.analysisMode;
		
	}
	
	@Override
	public String toString() {
		return String.format("http://api.worldbank.org/v2/country/%s/indicator/" + this.analysisMode + "?date=%d:%d&format=json", this.country, this.yearStart, this.yearEnd);
	}
	
	public static class UrlBuilder {

		String country;
		int yearStart;
		int yearEnd;
		String analysisMode;
		
		
		public UrlBuilder setCountry(String country) {
			this.country = country;
			return this;
		}
		
		public UrlBuilder setYearStart(int yearStart) {
			this.yearStart = yearStart;
			return this;
		}
		
		public UrlBuilder setYearEnd(int yearEnd) {
			this.yearEnd = yearEnd;
			return this;
		}
		
		public UrlBuilder setanalysisMode(String analysisMode) {
			this.analysisMode = analysisMode;
			return this;
		}
		
		public Url build() {
			return new Url(this);
		}
	}
}
