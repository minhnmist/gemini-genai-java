import com.google.genai.Client;
import com.google.genai.types.HttpOptions;
import com.google.genai.types.ClientOptions;
import com.google.genai.types.GenerateContentResponse;

public class GenerateTextFromTextInput {
    public GenerateTextFromTextInput() {
        // Use Builder class for instantiation. Explicitly set the API key to use Gemini
        // Developer backend.

        HttpOptions httpOptions = HttpOptions.builder()
            .apiVersion("v1alpha")
            .build();

        // Client client = Client.builder()
        //     .apiKey("YOUR_API_KEY") // You need to uncomment and replace this with your actual key
        //     .clientOptions(ClientOptions.builder()
        //         .httpOptions(httpOptions).build())
        //     .build(); // <--- This line is essential

        Client client = Client.builder()
            .apiKey("AIzaSyAHsCuodQdMyMBPJQejYwXQc9ue9d5rYoM")
            .build();
        //     .httpOptions(httpOptions);
        
        GenerateContentResponse response = client.models.generateContent(
            "gemini-2.5-flash-lite", "Tell me today's date", null);

        System.out.println(response.text());
    }
}