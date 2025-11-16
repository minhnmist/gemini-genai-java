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
        response = client.models.generateContent(
            "gemini-2.5-flash-lite", i, null);
        
        return response.text();
    }
}