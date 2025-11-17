import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class GenerateTextFromTextInput {
    private Client client;
    private GenerateContentResponse response;

    public GenerateTextFromTextInput() {
        // Use Builder class for instantiation. Explicitly set the API key to use Gemini
        // Developer backend.

        client = Client.builder()
            .apiKey("AIzaSyAHsCuodQdMyMBPJQejYwXQc9ue9d5rYoM").build();
    }

    public String getResponse(String i) {
        String input = i.toLowerCase();
        if (input.contains("movie") || input.contains("movies") || input.contains("film") || input.contains("films")) {
            response = client.models.generateContent(
                "gemini-2.5-flash-lite", input + "; suggest variety of films with brief reasons, no spoilers; only respond with list, no responses similar to \"here's a list\"", null);
            return input.toUpperCase() + "\n\n" + response.text();
        }
        else {
            return "ENTER A PROMPT IN THE BOX FOR FILM RECOMMENDATIONS." + getSuggestions();
        }
    }

    public String getSuggestions() {
        response = client.models.generateContent(
                "gemini-2.5-flash-lite",
                "Examples of prompts for movie suggestions (such as \"a movie with\", \"movies about\", \"films like\"); use words like \"movie\" and \"films\" in the response; only respond with list; at most five examples",
                null);
        return "\n\nPROMPT IDEAS:\n" + response.text();
    }
}