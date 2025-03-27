package com.bhaskar.githubanalyzer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubRepository {
    private String name;

    @JsonProperty("html_url")
    private String url;

    @JsonProperty("stargazers_count")
    private int stars;

    @JsonProperty("forks_count")
    private int forks;

    private String language;

    @JsonProperty("updated_at")
    private String lastUpdated;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public int getStars() { return stars; }
    public void setStars(int stars) { this.stars = stars; }

    public int getForks() { return forks; }
    public void setForks(int forks) { this.forks = forks; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(String lastUpdated) { this.lastUpdated = lastUpdated; }
}
