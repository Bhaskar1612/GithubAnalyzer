package com.bhaskar.githubanalyzer.controller;
import com.bhaskar.githubanalyzer.model.GithubRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/github")
public class GithubController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/user/{username}")
    public String getGithubUser(@PathVariable("username") String username) {
        String apiUrl = "https://api.github.com/users/" + username;
        return restTemplate.getForObject(apiUrl, String.class);
    }

    @GetMapping("/user/{username}/repos")
    public List<GithubRepository> getGithubUserRepos(@PathVariable("username") String username) {
        String apiUrl = "https://api.github.com/users/" + username + "/repos";
        GithubRepository[] repos = restTemplate.getForObject(apiUrl, GithubRepository[].class);
        return Arrays.asList(repos);
    }
}
