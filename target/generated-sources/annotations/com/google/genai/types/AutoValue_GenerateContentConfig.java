package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerateContentConfig extends GenerateContentConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Boolean> shouldReturnHttpResponse;

  private final Optional<Content> systemInstruction;

  private final Optional<Float> temperature;

  private final Optional<Float> topP;

  private final Optional<Float> topK;

  private final Optional<Integer> candidateCount;

  private final Optional<Integer> maxOutputTokens;

  private final Optional<List<String>> stopSequences;

  private final Optional<Boolean> responseLogprobs;

  private final Optional<Integer> logprobs;

  private final Optional<Float> presencePenalty;

  private final Optional<Float> frequencyPenalty;

  private final Optional<Integer> seed;

  private final Optional<String> responseMimeType;

  private final Optional<Schema> responseSchema;

  private final Optional<Object> responseJsonSchema;

  private final Optional<GenerationConfigRoutingConfig> routingConfig;

  private final Optional<ModelSelectionConfig> modelSelectionConfig;

  private final Optional<List<SafetySetting>> safetySettings;

  private final Optional<List<Tool>> tools;

  private final Optional<ToolConfig> toolConfig;

  private final Optional<Map<String, String>> labels;

  private final Optional<String> cachedContent;

  private final Optional<List<String>> responseModalities;

  private final Optional<MediaResolution> mediaResolution;

  private final Optional<SpeechConfig> speechConfig;

  private final Optional<Boolean> audioTimestamp;

  private final Optional<AutomaticFunctionCallingConfig> automaticFunctionCalling;

  private final Optional<ThinkingConfig> thinkingConfig;

  private final Optional<ImageConfig> imageConfig;

  private AutoValue_GenerateContentConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Boolean> shouldReturnHttpResponse,
      Optional<Content> systemInstruction,
      Optional<Float> temperature,
      Optional<Float> topP,
      Optional<Float> topK,
      Optional<Integer> candidateCount,
      Optional<Integer> maxOutputTokens,
      Optional<List<String>> stopSequences,
      Optional<Boolean> responseLogprobs,
      Optional<Integer> logprobs,
      Optional<Float> presencePenalty,
      Optional<Float> frequencyPenalty,
      Optional<Integer> seed,
      Optional<String> responseMimeType,
      Optional<Schema> responseSchema,
      Optional<Object> responseJsonSchema,
      Optional<GenerationConfigRoutingConfig> routingConfig,
      Optional<ModelSelectionConfig> modelSelectionConfig,
      Optional<List<SafetySetting>> safetySettings,
      Optional<List<Tool>> tools,
      Optional<ToolConfig> toolConfig,
      Optional<Map<String, String>> labels,
      Optional<String> cachedContent,
      Optional<List<String>> responseModalities,
      Optional<MediaResolution> mediaResolution,
      Optional<SpeechConfig> speechConfig,
      Optional<Boolean> audioTimestamp,
      Optional<AutomaticFunctionCallingConfig> automaticFunctionCalling,
      Optional<ThinkingConfig> thinkingConfig,
      Optional<ImageConfig> imageConfig) {
    this.httpOptions = httpOptions;
    this.shouldReturnHttpResponse = shouldReturnHttpResponse;
    this.systemInstruction = systemInstruction;
    this.temperature = temperature;
    this.topP = topP;
    this.topK = topK;
    this.candidateCount = candidateCount;
    this.maxOutputTokens = maxOutputTokens;
    this.stopSequences = stopSequences;
    this.responseLogprobs = responseLogprobs;
    this.logprobs = logprobs;
    this.presencePenalty = presencePenalty;
    this.frequencyPenalty = frequencyPenalty;
    this.seed = seed;
    this.responseMimeType = responseMimeType;
    this.responseSchema = responseSchema;
    this.responseJsonSchema = responseJsonSchema;
    this.routingConfig = routingConfig;
    this.modelSelectionConfig = modelSelectionConfig;
    this.safetySettings = safetySettings;
    this.tools = tools;
    this.toolConfig = toolConfig;
    this.labels = labels;
    this.cachedContent = cachedContent;
    this.responseModalities = responseModalities;
    this.mediaResolution = mediaResolution;
    this.speechConfig = speechConfig;
    this.audioTimestamp = audioTimestamp;
    this.automaticFunctionCalling = automaticFunctionCalling;
    this.thinkingConfig = thinkingConfig;
    this.imageConfig = imageConfig;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("shouldReturnHttpResponse")
  @Override
  public Optional<Boolean> shouldReturnHttpResponse() {
    return shouldReturnHttpResponse;
  }

  @JsonProperty("systemInstruction")
  @Override
  public Optional<Content> systemInstruction() {
    return systemInstruction;
  }

  @JsonProperty("temperature")
  @Override
  public Optional<Float> temperature() {
    return temperature;
  }

  @JsonProperty("topP")
  @Override
  public Optional<Float> topP() {
    return topP;
  }

  @JsonProperty("topK")
  @Override
  public Optional<Float> topK() {
    return topK;
  }

  @JsonProperty("candidateCount")
  @Override
  public Optional<Integer> candidateCount() {
    return candidateCount;
  }

  @JsonProperty("maxOutputTokens")
  @Override
  public Optional<Integer> maxOutputTokens() {
    return maxOutputTokens;
  }

  @JsonProperty("stopSequences")
  @Override
  public Optional<List<String>> stopSequences() {
    return stopSequences;
  }

  @JsonProperty("responseLogprobs")
  @Override
  public Optional<Boolean> responseLogprobs() {
    return responseLogprobs;
  }

  @JsonProperty("logprobs")
  @Override
  public Optional<Integer> logprobs() {
    return logprobs;
  }

  @JsonProperty("presencePenalty")
  @Override
  public Optional<Float> presencePenalty() {
    return presencePenalty;
  }

  @JsonProperty("frequencyPenalty")
  @Override
  public Optional<Float> frequencyPenalty() {
    return frequencyPenalty;
  }

  @JsonProperty("seed")
  @Override
  public Optional<Integer> seed() {
    return seed;
  }

  @JsonProperty("responseMimeType")
  @Override
  public Optional<String> responseMimeType() {
    return responseMimeType;
  }

  @JsonProperty("responseSchema")
  @Override
  public Optional<Schema> responseSchema() {
    return responseSchema;
  }

  @JsonProperty("responseJsonSchema")
  @Override
  public Optional<Object> responseJsonSchema() {
    return responseJsonSchema;
  }

  @JsonProperty("routingConfig")
  @Override
  public Optional<GenerationConfigRoutingConfig> routingConfig() {
    return routingConfig;
  }

  @JsonProperty("modelSelectionConfig")
  @Override
  public Optional<ModelSelectionConfig> modelSelectionConfig() {
    return modelSelectionConfig;
  }

  @JsonProperty("safetySettings")
  @Override
  public Optional<List<SafetySetting>> safetySettings() {
    return safetySettings;
  }

  @JsonProperty("tools")
  @Override
  public Optional<List<Tool>> tools() {
    return tools;
  }

  @JsonProperty("toolConfig")
  @Override
  public Optional<ToolConfig> toolConfig() {
    return toolConfig;
  }

  @JsonProperty("labels")
  @Override
  public Optional<Map<String, String>> labels() {
    return labels;
  }

  @JsonProperty("cachedContent")
  @Override
  public Optional<String> cachedContent() {
    return cachedContent;
  }

  @JsonProperty("responseModalities")
  @Override
  public Optional<List<String>> responseModalities() {
    return responseModalities;
  }

  @JsonProperty("mediaResolution")
  @Override
  public Optional<MediaResolution> mediaResolution() {
    return mediaResolution;
  }

  @JsonProperty("speechConfig")
  @Override
  public Optional<SpeechConfig> speechConfig() {
    return speechConfig;
  }

  @JsonProperty("audioTimestamp")
  @Override
  public Optional<Boolean> audioTimestamp() {
    return audioTimestamp;
  }

  @JsonProperty("automaticFunctionCalling")
  @Override
  public Optional<AutomaticFunctionCallingConfig> automaticFunctionCalling() {
    return automaticFunctionCalling;
  }

  @JsonProperty("thinkingConfig")
  @Override
  public Optional<ThinkingConfig> thinkingConfig() {
    return thinkingConfig;
  }

  @JsonProperty("imageConfig")
  @Override
  public Optional<ImageConfig> imageConfig() {
    return imageConfig;
  }

  @Override
  public String toString() {
    return "GenerateContentConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "shouldReturnHttpResponse=" + shouldReturnHttpResponse + ", "
        + "systemInstruction=" + systemInstruction + ", "
        + "temperature=" + temperature + ", "
        + "topP=" + topP + ", "
        + "topK=" + topK + ", "
        + "candidateCount=" + candidateCount + ", "
        + "maxOutputTokens=" + maxOutputTokens + ", "
        + "stopSequences=" + stopSequences + ", "
        + "responseLogprobs=" + responseLogprobs + ", "
        + "logprobs=" + logprobs + ", "
        + "presencePenalty=" + presencePenalty + ", "
        + "frequencyPenalty=" + frequencyPenalty + ", "
        + "seed=" + seed + ", "
        + "responseMimeType=" + responseMimeType + ", "
        + "responseSchema=" + responseSchema + ", "
        + "responseJsonSchema=" + responseJsonSchema + ", "
        + "routingConfig=" + routingConfig + ", "
        + "modelSelectionConfig=" + modelSelectionConfig + ", "
        + "safetySettings=" + safetySettings + ", "
        + "tools=" + tools + ", "
        + "toolConfig=" + toolConfig + ", "
        + "labels=" + labels + ", "
        + "cachedContent=" + cachedContent + ", "
        + "responseModalities=" + responseModalities + ", "
        + "mediaResolution=" + mediaResolution + ", "
        + "speechConfig=" + speechConfig + ", "
        + "audioTimestamp=" + audioTimestamp + ", "
        + "automaticFunctionCalling=" + automaticFunctionCalling + ", "
        + "thinkingConfig=" + thinkingConfig + ", "
        + "imageConfig=" + imageConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerateContentConfig) {
      GenerateContentConfig that = (GenerateContentConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.shouldReturnHttpResponse.equals(that.shouldReturnHttpResponse())
          && this.systemInstruction.equals(that.systemInstruction())
          && this.temperature.equals(that.temperature())
          && this.topP.equals(that.topP())
          && this.topK.equals(that.topK())
          && this.candidateCount.equals(that.candidateCount())
          && this.maxOutputTokens.equals(that.maxOutputTokens())
          && this.stopSequences.equals(that.stopSequences())
          && this.responseLogprobs.equals(that.responseLogprobs())
          && this.logprobs.equals(that.logprobs())
          && this.presencePenalty.equals(that.presencePenalty())
          && this.frequencyPenalty.equals(that.frequencyPenalty())
          && this.seed.equals(that.seed())
          && this.responseMimeType.equals(that.responseMimeType())
          && this.responseSchema.equals(that.responseSchema())
          && this.responseJsonSchema.equals(that.responseJsonSchema())
          && this.routingConfig.equals(that.routingConfig())
          && this.modelSelectionConfig.equals(that.modelSelectionConfig())
          && this.safetySettings.equals(that.safetySettings())
          && this.tools.equals(that.tools())
          && this.toolConfig.equals(that.toolConfig())
          && this.labels.equals(that.labels())
          && this.cachedContent.equals(that.cachedContent())
          && this.responseModalities.equals(that.responseModalities())
          && this.mediaResolution.equals(that.mediaResolution())
          && this.speechConfig.equals(that.speechConfig())
          && this.audioTimestamp.equals(that.audioTimestamp())
          && this.automaticFunctionCalling.equals(that.automaticFunctionCalling())
          && this.thinkingConfig.equals(that.thinkingConfig())
          && this.imageConfig.equals(that.imageConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= shouldReturnHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= systemInstruction.hashCode();
    h$ *= 1000003;
    h$ ^= temperature.hashCode();
    h$ *= 1000003;
    h$ ^= topP.hashCode();
    h$ *= 1000003;
    h$ ^= topK.hashCode();
    h$ *= 1000003;
    h$ ^= candidateCount.hashCode();
    h$ *= 1000003;
    h$ ^= maxOutputTokens.hashCode();
    h$ *= 1000003;
    h$ ^= stopSequences.hashCode();
    h$ *= 1000003;
    h$ ^= responseLogprobs.hashCode();
    h$ *= 1000003;
    h$ ^= logprobs.hashCode();
    h$ *= 1000003;
    h$ ^= presencePenalty.hashCode();
    h$ *= 1000003;
    h$ ^= frequencyPenalty.hashCode();
    h$ *= 1000003;
    h$ ^= seed.hashCode();
    h$ *= 1000003;
    h$ ^= responseMimeType.hashCode();
    h$ *= 1000003;
    h$ ^= responseSchema.hashCode();
    h$ *= 1000003;
    h$ ^= responseJsonSchema.hashCode();
    h$ *= 1000003;
    h$ ^= routingConfig.hashCode();
    h$ *= 1000003;
    h$ ^= modelSelectionConfig.hashCode();
    h$ *= 1000003;
    h$ ^= safetySettings.hashCode();
    h$ *= 1000003;
    h$ ^= tools.hashCode();
    h$ *= 1000003;
    h$ ^= toolConfig.hashCode();
    h$ *= 1000003;
    h$ ^= labels.hashCode();
    h$ *= 1000003;
    h$ ^= cachedContent.hashCode();
    h$ *= 1000003;
    h$ ^= responseModalities.hashCode();
    h$ *= 1000003;
    h$ ^= mediaResolution.hashCode();
    h$ *= 1000003;
    h$ ^= speechConfig.hashCode();
    h$ *= 1000003;
    h$ ^= audioTimestamp.hashCode();
    h$ *= 1000003;
    h$ ^= automaticFunctionCalling.hashCode();
    h$ *= 1000003;
    h$ ^= thinkingConfig.hashCode();
    h$ *= 1000003;
    h$ ^= imageConfig.hashCode();
    return h$;
  }

  @Override
  public GenerateContentConfig.Builder toBuilder() {
    return new AutoValue_GenerateContentConfig.Builder(this);
  }

  static final class Builder extends GenerateContentConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Boolean> shouldReturnHttpResponse = Optional.empty();
    private Optional<Content> systemInstruction = Optional.empty();
    private Optional<Float> temperature = Optional.empty();
    private Optional<Float> topP = Optional.empty();
    private Optional<Float> topK = Optional.empty();
    private Optional<Integer> candidateCount = Optional.empty();
    private Optional<Integer> maxOutputTokens = Optional.empty();
    private Optional<List<String>> stopSequences = Optional.empty();
    private Optional<Boolean> responseLogprobs = Optional.empty();
    private Optional<Integer> logprobs = Optional.empty();
    private Optional<Float> presencePenalty = Optional.empty();
    private Optional<Float> frequencyPenalty = Optional.empty();
    private Optional<Integer> seed = Optional.empty();
    private Optional<String> responseMimeType = Optional.empty();
    private Optional<Schema> responseSchema = Optional.empty();
    private Optional<Object> responseJsonSchema = Optional.empty();
    private Optional<GenerationConfigRoutingConfig> routingConfig = Optional.empty();
    private Optional<ModelSelectionConfig> modelSelectionConfig = Optional.empty();
    private Optional<List<SafetySetting>> safetySettings = Optional.empty();
    private Optional<List<Tool>> tools = Optional.empty();
    private Optional<ToolConfig> toolConfig = Optional.empty();
    private Optional<Map<String, String>> labels = Optional.empty();
    private Optional<String> cachedContent = Optional.empty();
    private Optional<List<String>> responseModalities = Optional.empty();
    private Optional<MediaResolution> mediaResolution = Optional.empty();
    private Optional<SpeechConfig> speechConfig = Optional.empty();
    private Optional<Boolean> audioTimestamp = Optional.empty();
    private Optional<AutomaticFunctionCallingConfig> automaticFunctionCalling = Optional.empty();
    private Optional<ThinkingConfig> thinkingConfig = Optional.empty();
    private Optional<ImageConfig> imageConfig = Optional.empty();
    Builder() {
    }
    Builder(GenerateContentConfig source) {
      this.httpOptions = source.httpOptions();
      this.shouldReturnHttpResponse = source.shouldReturnHttpResponse();
      this.systemInstruction = source.systemInstruction();
      this.temperature = source.temperature();
      this.topP = source.topP();
      this.topK = source.topK();
      this.candidateCount = source.candidateCount();
      this.maxOutputTokens = source.maxOutputTokens();
      this.stopSequences = source.stopSequences();
      this.responseLogprobs = source.responseLogprobs();
      this.logprobs = source.logprobs();
      this.presencePenalty = source.presencePenalty();
      this.frequencyPenalty = source.frequencyPenalty();
      this.seed = source.seed();
      this.responseMimeType = source.responseMimeType();
      this.responseSchema = source.responseSchema();
      this.responseJsonSchema = source.responseJsonSchema();
      this.routingConfig = source.routingConfig();
      this.modelSelectionConfig = source.modelSelectionConfig();
      this.safetySettings = source.safetySettings();
      this.tools = source.tools();
      this.toolConfig = source.toolConfig();
      this.labels = source.labels();
      this.cachedContent = source.cachedContent();
      this.responseModalities = source.responseModalities();
      this.mediaResolution = source.mediaResolution();
      this.speechConfig = source.speechConfig();
      this.audioTimestamp = source.audioTimestamp();
      this.automaticFunctionCalling = source.automaticFunctionCalling();
      this.thinkingConfig = source.thinkingConfig();
      this.imageConfig = source.imageConfig();
    }
    @Override
    public GenerateContentConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    GenerateContentConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder shouldReturnHttpResponse(boolean shouldReturnHttpResponse) {
      this.shouldReturnHttpResponse = Optional.of(shouldReturnHttpResponse);
      return this;
    }
    @Override
    GenerateContentConfig.Builder shouldReturnHttpResponse(Optional<Boolean> shouldReturnHttpResponse) {
      if (shouldReturnHttpResponse == null) {
        throw new NullPointerException("Null shouldReturnHttpResponse");
      }
      this.shouldReturnHttpResponse = shouldReturnHttpResponse;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder systemInstruction(Content systemInstruction) {
      this.systemInstruction = Optional.of(systemInstruction);
      return this;
    }
    @Override
    GenerateContentConfig.Builder systemInstruction(Optional<Content> systemInstruction) {
      if (systemInstruction == null) {
        throw new NullPointerException("Null systemInstruction");
      }
      this.systemInstruction = systemInstruction;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder temperature(Float temperature) {
      this.temperature = Optional.of(temperature);
      return this;
    }
    @Override
    GenerateContentConfig.Builder temperature(Optional<Float> temperature) {
      if (temperature == null) {
        throw new NullPointerException("Null temperature");
      }
      this.temperature = temperature;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder topP(Float topP) {
      this.topP = Optional.of(topP);
      return this;
    }
    @Override
    GenerateContentConfig.Builder topP(Optional<Float> topP) {
      if (topP == null) {
        throw new NullPointerException("Null topP");
      }
      this.topP = topP;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder topK(Float topK) {
      this.topK = Optional.of(topK);
      return this;
    }
    @Override
    GenerateContentConfig.Builder topK(Optional<Float> topK) {
      if (topK == null) {
        throw new NullPointerException("Null topK");
      }
      this.topK = topK;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder candidateCount(Integer candidateCount) {
      this.candidateCount = Optional.of(candidateCount);
      return this;
    }
    @Override
    GenerateContentConfig.Builder candidateCount(Optional<Integer> candidateCount) {
      if (candidateCount == null) {
        throw new NullPointerException("Null candidateCount");
      }
      this.candidateCount = candidateCount;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder maxOutputTokens(Integer maxOutputTokens) {
      this.maxOutputTokens = Optional.of(maxOutputTokens);
      return this;
    }
    @Override
    GenerateContentConfig.Builder maxOutputTokens(Optional<Integer> maxOutputTokens) {
      if (maxOutputTokens == null) {
        throw new NullPointerException("Null maxOutputTokens");
      }
      this.maxOutputTokens = maxOutputTokens;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder stopSequences(List<String> stopSequences) {
      this.stopSequences = Optional.of(stopSequences);
      return this;
    }
    @Override
    GenerateContentConfig.Builder stopSequences(Optional<List<String>> stopSequences) {
      if (stopSequences == null) {
        throw new NullPointerException("Null stopSequences");
      }
      this.stopSequences = stopSequences;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder responseLogprobs(boolean responseLogprobs) {
      this.responseLogprobs = Optional.of(responseLogprobs);
      return this;
    }
    @Override
    GenerateContentConfig.Builder responseLogprobs(Optional<Boolean> responseLogprobs) {
      if (responseLogprobs == null) {
        throw new NullPointerException("Null responseLogprobs");
      }
      this.responseLogprobs = responseLogprobs;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder logprobs(Integer logprobs) {
      this.logprobs = Optional.of(logprobs);
      return this;
    }
    @Override
    GenerateContentConfig.Builder logprobs(Optional<Integer> logprobs) {
      if (logprobs == null) {
        throw new NullPointerException("Null logprobs");
      }
      this.logprobs = logprobs;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder presencePenalty(Float presencePenalty) {
      this.presencePenalty = Optional.of(presencePenalty);
      return this;
    }
    @Override
    GenerateContentConfig.Builder presencePenalty(Optional<Float> presencePenalty) {
      if (presencePenalty == null) {
        throw new NullPointerException("Null presencePenalty");
      }
      this.presencePenalty = presencePenalty;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder frequencyPenalty(Float frequencyPenalty) {
      this.frequencyPenalty = Optional.of(frequencyPenalty);
      return this;
    }
    @Override
    GenerateContentConfig.Builder frequencyPenalty(Optional<Float> frequencyPenalty) {
      if (frequencyPenalty == null) {
        throw new NullPointerException("Null frequencyPenalty");
      }
      this.frequencyPenalty = frequencyPenalty;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder seed(Integer seed) {
      this.seed = Optional.of(seed);
      return this;
    }
    @Override
    GenerateContentConfig.Builder seed(Optional<Integer> seed) {
      if (seed == null) {
        throw new NullPointerException("Null seed");
      }
      this.seed = seed;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder responseMimeType(String responseMimeType) {
      this.responseMimeType = Optional.of(responseMimeType);
      return this;
    }
    @Override
    GenerateContentConfig.Builder responseMimeType(Optional<String> responseMimeType) {
      if (responseMimeType == null) {
        throw new NullPointerException("Null responseMimeType");
      }
      this.responseMimeType = responseMimeType;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder responseSchema(Schema responseSchema) {
      this.responseSchema = Optional.of(responseSchema);
      return this;
    }
    @Override
    GenerateContentConfig.Builder responseSchema(Optional<Schema> responseSchema) {
      if (responseSchema == null) {
        throw new NullPointerException("Null responseSchema");
      }
      this.responseSchema = responseSchema;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder responseJsonSchema(Object responseJsonSchema) {
      this.responseJsonSchema = Optional.of(responseJsonSchema);
      return this;
    }
    @Override
    GenerateContentConfig.Builder responseJsonSchema(Optional<Object> responseJsonSchema) {
      if (responseJsonSchema == null) {
        throw new NullPointerException("Null responseJsonSchema");
      }
      this.responseJsonSchema = responseJsonSchema;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder routingConfig(GenerationConfigRoutingConfig routingConfig) {
      this.routingConfig = Optional.of(routingConfig);
      return this;
    }
    @Override
    GenerateContentConfig.Builder routingConfig(Optional<GenerationConfigRoutingConfig> routingConfig) {
      if (routingConfig == null) {
        throw new NullPointerException("Null routingConfig");
      }
      this.routingConfig = routingConfig;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder modelSelectionConfig(ModelSelectionConfig modelSelectionConfig) {
      this.modelSelectionConfig = Optional.of(modelSelectionConfig);
      return this;
    }
    @Override
    GenerateContentConfig.Builder modelSelectionConfig(Optional<ModelSelectionConfig> modelSelectionConfig) {
      if (modelSelectionConfig == null) {
        throw new NullPointerException("Null modelSelectionConfig");
      }
      this.modelSelectionConfig = modelSelectionConfig;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder safetySettings(List<SafetySetting> safetySettings) {
      this.safetySettings = Optional.of(safetySettings);
      return this;
    }
    @Override
    GenerateContentConfig.Builder safetySettings(Optional<List<SafetySetting>> safetySettings) {
      if (safetySettings == null) {
        throw new NullPointerException("Null safetySettings");
      }
      this.safetySettings = safetySettings;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder tools(List<Tool> tools) {
      this.tools = Optional.of(tools);
      return this;
    }
    @Override
    GenerateContentConfig.Builder tools(Optional<List<Tool>> tools) {
      if (tools == null) {
        throw new NullPointerException("Null tools");
      }
      this.tools = tools;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder toolConfig(ToolConfig toolConfig) {
      this.toolConfig = Optional.of(toolConfig);
      return this;
    }
    @Override
    GenerateContentConfig.Builder toolConfig(Optional<ToolConfig> toolConfig) {
      if (toolConfig == null) {
        throw new NullPointerException("Null toolConfig");
      }
      this.toolConfig = toolConfig;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder labels(Map<String, String> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    GenerateContentConfig.Builder labels(Optional<Map<String, String>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder cachedContent(String cachedContent) {
      this.cachedContent = Optional.of(cachedContent);
      return this;
    }
    @Override
    GenerateContentConfig.Builder cachedContent(Optional<String> cachedContent) {
      if (cachedContent == null) {
        throw new NullPointerException("Null cachedContent");
      }
      this.cachedContent = cachedContent;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder responseModalities(List<String> responseModalities) {
      this.responseModalities = Optional.of(responseModalities);
      return this;
    }
    @Override
    GenerateContentConfig.Builder responseModalities(Optional<List<String>> responseModalities) {
      if (responseModalities == null) {
        throw new NullPointerException("Null responseModalities");
      }
      this.responseModalities = responseModalities;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder mediaResolution(MediaResolution mediaResolution) {
      this.mediaResolution = Optional.of(mediaResolution);
      return this;
    }
    @Override
    GenerateContentConfig.Builder mediaResolution(Optional<MediaResolution> mediaResolution) {
      if (mediaResolution == null) {
        throw new NullPointerException("Null mediaResolution");
      }
      this.mediaResolution = mediaResolution;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder speechConfig(SpeechConfig speechConfig) {
      this.speechConfig = Optional.of(speechConfig);
      return this;
    }
    @Override
    GenerateContentConfig.Builder speechConfig(Optional<SpeechConfig> speechConfig) {
      if (speechConfig == null) {
        throw new NullPointerException("Null speechConfig");
      }
      this.speechConfig = speechConfig;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder audioTimestamp(boolean audioTimestamp) {
      this.audioTimestamp = Optional.of(audioTimestamp);
      return this;
    }
    @Override
    GenerateContentConfig.Builder audioTimestamp(Optional<Boolean> audioTimestamp) {
      if (audioTimestamp == null) {
        throw new NullPointerException("Null audioTimestamp");
      }
      this.audioTimestamp = audioTimestamp;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder automaticFunctionCalling(AutomaticFunctionCallingConfig automaticFunctionCalling) {
      this.automaticFunctionCalling = Optional.of(automaticFunctionCalling);
      return this;
    }
    @Override
    GenerateContentConfig.Builder automaticFunctionCalling(Optional<AutomaticFunctionCallingConfig> automaticFunctionCalling) {
      if (automaticFunctionCalling == null) {
        throw new NullPointerException("Null automaticFunctionCalling");
      }
      this.automaticFunctionCalling = automaticFunctionCalling;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder thinkingConfig(ThinkingConfig thinkingConfig) {
      this.thinkingConfig = Optional.of(thinkingConfig);
      return this;
    }
    @Override
    GenerateContentConfig.Builder thinkingConfig(Optional<ThinkingConfig> thinkingConfig) {
      if (thinkingConfig == null) {
        throw new NullPointerException("Null thinkingConfig");
      }
      this.thinkingConfig = thinkingConfig;
      return this;
    }
    @Override
    public GenerateContentConfig.Builder imageConfig(ImageConfig imageConfig) {
      this.imageConfig = Optional.of(imageConfig);
      return this;
    }
    @Override
    GenerateContentConfig.Builder imageConfig(Optional<ImageConfig> imageConfig) {
      if (imageConfig == null) {
        throw new NullPointerException("Null imageConfig");
      }
      this.imageConfig = imageConfig;
      return this;
    }
    @Override
    public GenerateContentConfig build() {
      return new AutoValue_GenerateContentConfig(
          this.httpOptions,
          this.shouldReturnHttpResponse,
          this.systemInstruction,
          this.temperature,
          this.topP,
          this.topK,
          this.candidateCount,
          this.maxOutputTokens,
          this.stopSequences,
          this.responseLogprobs,
          this.logprobs,
          this.presencePenalty,
          this.frequencyPenalty,
          this.seed,
          this.responseMimeType,
          this.responseSchema,
          this.responseJsonSchema,
          this.routingConfig,
          this.modelSelectionConfig,
          this.safetySettings,
          this.tools,
          this.toolConfig,
          this.labels,
          this.cachedContent,
          this.responseModalities,
          this.mediaResolution,
          this.speechConfig,
          this.audioTimestamp,
          this.automaticFunctionCalling,
          this.thinkingConfig,
          this.imageConfig);
    }
  }

}
