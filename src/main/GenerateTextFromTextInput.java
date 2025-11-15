import com.google.genai.Client;
import com.google.genai.types.HttpOptions;
import com.google.genai.types.GenerateContentResponse;

public class GenerateTextFromTextInput {
    public static void main(String[] args) {
        // Use Builder class for instantiation. Explicitly set the API key to use Gemini
        // Developer backend.

        Client client = Client.builder().apiKey("AIzaSyAHsCuodQdMyMBPJQejYwXQc9ue9d5rYoM")
            .httpOptions(HttpOptions.builder().apiVersion("v1alpha")).build();
        
            GenerateContentResponse response = client.models.generatContent("gemini-2.5-flash-lite", "Tell me today's date", null);

            System.out.println(response.text());
    }
}