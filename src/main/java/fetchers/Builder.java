package fetchers;

import fetchers.Url.UrlBuilder;

public interface Builder {
	public UrlBuilder setCountry(String country);
	
	public UrlBuilder setYearStart(int yearStart);
	
	public UrlBuilder setYearEnd(int yearEnd);
	
	public UrlBuilder setanalysisMode(String analysisMode);

}
