package deze.practice.SpringJokes.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class GetJokeServiceImpl implements GetJokeService{

private final ChuckNorrisQuotes chuckNorrisQuotes;

    public GetJokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String sayJoke() {
     return chuckNorrisQuotes.getRandomQuote();
    }
}
