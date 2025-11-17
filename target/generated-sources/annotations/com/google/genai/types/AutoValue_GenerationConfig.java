package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerationConfig extends GenerationConfig {

  private final Optional<ModelSelectionConfig> modelSelectionConfig;

  private final Optional<Object> responseJsonSchema;

  private final Optional<Boolean> audioTimestamp;

  private final Optional<Integer> candidateCount;

  private final Optional<Boolean> enableAffectiveDialog;

  private final Optional<Float> frequencyPenalty;

  private final Optional<Integer> logprobs;

  private final Optional<Integer> maxOutputTokens;

  private final Optional<MediaResolution> mediaResolution;

  private final Optional<Float> presencePenalty;

  private final Optional<Boolean> responseLogprobs;

  private final Optional<String> responseMimeType;

  private final Optional<List<Modality>> responseModalities;

  private final Optional<Schema> responseSchema;

  private final Optional<GenerationConfigRoutingConfig> routingConfig;

  private final Optional<Integer> seed;

  private final Optional<SpeechConfig> speechConfig;

  private final Optional<List<String>> stopSequences;

  private final Optional<Float> temperature;

  private final Optional<ThinkingConfig> thinkingConfig;

  private final Optional<Float> topK;

  private final Optional<Float> topP;

  private final Optional<Boolean> enableEnhancedCivicAnswers;

  private AutoValue_GenerationConfig(
      Optional<ModelSelectionConfig> modelSelectionConfig,
      Optional<Object> responseJsonSchema,
      Optional<Boolean> audioTimestamp,
      Optional<Integer> candidateCount,
      Optional<Boolean> enableAffectiveDialog,
      Optional<Float> frequencyPenalty,
      Optional<Integer> logprobs,
      Optional<Integer> maxOutputTokens,
      Optional<MediaResolution> mediaResolution,
      Optional<Float> presencePenalty,
      Optional<Boolean> responseLogprobs,
      Optional<String> responseMimeType,
      Optional<List<Modality>> responseModalities,
      Optional<Schema> responseSchema,
      Optional<GenerationConfigRoutingConfig> routingConfig,
      Optional<Integer> seed,
      Optional<SpeechConfig> speechConfig,
      Optional<List<String>> stopSequences,
      Optional<Float> temperature,
      Optional<ThinkingConfig> thinkingConfig,
      Optional<Float> topK,
      Optional<Float> topP,
      Optional<Boolean> enableEnhancedCivicAnswers) {
    this.modelSelectionConfig = modelSelectionConfig;
    this.responseJsonSchema = responseJsonSchema;
    this.audioTimestamp = audioTimestamp;
    this.candidateCount = candidateCount;
    this.enableAffectiveDialog = enableAffectiveDialog;
    this.frequencyPenalty = frequencyPenalty;
    this.logprobs = logprobs;
    this.maxOutputTokens = maxOutputTokens;
    this.mediaResolution = mediaResolution;
    this.presencePenalty = presencePenalty;
    this.responseLogprobs = responseLogprobs;
    this.responseMimeType = responseMimeType;
    this.responseModalities = responseModalities;
    this.responseSchema = responseSchema;
    this.routingConfig = routingConfig;
    this.seed = seed;
    this.speechConfig = speechConfig;
    this.stopSequences = stopSequences;
    this.temperature = temperature;
    this.thinkingConfig = thinkingConfig;
    this.topK = topK;
    this.topP = topP;
    this.enableEnhancedCivicAnswers = enableEnhancedCivicAnswers;
  }

  @JsonProperty("modelSelectionConfig")
  @Override
  public Optional<ModelSelectionConfig> modelSelectionConfig() {
    return modelSelectionConfig;
  }

  @JsonProperty("responseJsonSchema")
  @Override
  public Optional<Object> responseJsonSchema() {
    return responseJsonSchema;
  }

  @JsonProperty("audioTimestamp")
  @Override
  public Optional<Boolean> audioTimestamp() {
    return audioTimestamp;
  }

  @JsonProperty("candidateCount")
  @Override
  public Optional<Integer> candidateCount() {
    return candidateCount;
  }

  @JsonProperty("enableAffectiveDialog")
  @Override
  public Optional<Boolean> enableAffectiveDialog() {
    return enableAffectiveDialog;
  }

  @JsonProperty("frequencyPenalty")
  @Override
  public Optional<Float> frequencyPenalty() {
    return frequencyPenalty;
  }

  @JsonProperty("logprobs")
  @Override
  public Optional<Integer> logprobs() {
    return logprobs;
  }

  @JsonProperty("maxOutputTokens")
  @Override
  public Optional<Integer> maxOutputTokens() {
    return maxOutputTokens;
  }

  @JsonProperty("mediaResolution")
  @Override
  public Optional<MediaResolution> mediaResolution() {
    return mediaResolution;
  }

  @JsonProperty("presencePenalty")
  @Override
  public Optional<Float> presencePenalty() {
    return presencePenalty;
  }

  @JsonProperty("responseLogprobs")
  @Override
  public Optional<Boolean> responseLogprobs() {
    return responseLogprobs;
  }

  @JsonProperty("responseMimeType")
  @Override
  public Optional<String> responseMimeType() {
    return responseMimeType;
  }

  @JsonProperty("responseModalities")
  @Override
  public Optional<List<Modality>> responseModalities() {
    return responseModalities;
  }

  @JsonProperty("responseSchema")
  @Override
  public Optional<Schema> responseSchema() {
    return responseSchema;
  }

  @JsonProperty("routingConfig")
  @Override
  public Optional<GenerationConfigRoutingConfig> routingConfig() {
    return routingConfig;
  }

  @JsonProperty("seed")
  @Override
  public Optional<Integer> seed() {
    return seed;
  }

  @JsonProperty("speechConfig")
  @Override
  public Optional<SpeechConfig> speechConfig() {
    return speechConfig;
  }

  @JsonProperty("stopSequences")
  @Override
  public Optional<List<String>> stopSequences() {
    return stopSequences;
  }

  @JsonProperty("temperature")
  @Override
  public Optional<Float> temperature() {
    return temperature;
  }

  @JsonProperty("thinkingConfig")
  @Override
  public Optional<ThinkingConfig> thinkingConfig() {
    return thinkingConfig;
  }

  @JsonProperty("topK")
  @Override
  public Optional<Float> topK() {
    return topK;
  }

  @JsonProperty("topP")
  @Override
  public Optional<Float> topP() {
    return topP;
  }

  @JsonProperty("enableEnhancedCivicAnswers")
  @Override
  public Optional<Boolean> enableEnhancedCivicAnswers() {
    return enableEnhancedCivicAnswers;
  }

  @Override
  public String toString() {
    return "GenerationConfig{"
        + "modelSelectionConfig=" + modelSelectionConfig + ", "
        + "responseJsonSchema=" + responseJsonSchema + ", "
        + "audioTimestamp=" + audioTimestamp + ", "
        + "candidateCount=" + candidateCount + ", "
        + "enableAffectiveDialog=" + enableAffectiveDialog + ", "
        + "frequencyPenalty=" + frequencyPenalty + ", "
        + "logprobs=" + logprobs + ", "
        + "maxOutputTokens=" + maxOutputTokens + ", "
        + "mediaResolution=" + mediaResolution + ", "
        + "presencePenalty=" + presencePenalty + ", "
        + "responseLogprobs=" + responseLogprobs + ", "
        + "responseMimeType=" + responseMimeType + ", "
        + "responseModalities=" + responseModalities + ", "
        + "responseSchema=" + responseSchema + ", "
        + "routingConfig=" + routingConfig + ", "
        + "seed=" + seed + ", "
        + "speechConfig=" + speechConfig + ", "
        + "stopSequences=" + stopSequences + ", "
        + "temperature=" + temperature + ", "
        + "thinkingConfig=" + thinkingConfig + ", "
        + "topK=" + topK + ", "
        + "topP=" + topP + ", "
        + "enableEnhancedCivicAnswers=" + enableEnhancedCivicAnswers
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerationConfig) {
      GenerationConfig that = (GenerationConfig) o;
      return this.modelSelectionConfig.equals(that.modelSelectionConfig())
          && this.responseJsonSchema.equals(that.responseJsonSchema())
          && this.audioTimestamp.equals(that.audioTimestamp())
          && this.candidateCount.equals(that.candidateCount())
          && this.enableAffectiveDialog.equals(that.enableAffectiveDialog())
          && this.frequencyPenalty.equals(that.frequencyPenalty())
          && this.logprobs.equals(that.logprobs())
          && this.maxOutputTokens.equals(that.maxOutputTokens())
          && this.mediaResolution.equals(that.mediaResolution())
          && this.presencePenalty.equals(that.presencePenalty())
          && this.responseLogprobs.equals(that.responseLogprobs())
          && this.responseMimeType.equals(that.responseMimeType())
          && this.responseModalities.equals(that.responseModalities())
          && this.responseSchema.equals(that.responseSchema())
          && this.routingConfig.equals(that.routingConfig())
          && this.seed.equals(that.seed())
          && this.speechConfig.equals(that.speechConfig())
          && this.stopSequences.equals(that.stopSequences())
          && this.temperature.equals(that.temperature())
          && this.thinkingConfig.equals(that.thinkingConfig())
          && this.topK.equals(that.topK())
          && this.topP.equals(that.topP())
          && this.enableEnhancedCivicAnswers.equals(that.enableEnhancedCivicAnswers());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= modelSelectionConfig.hashCode();
    h$ *= 1000003;
    h$ ^= responseJsonSchema.hashCode();
    h$ *= 1000003;
    h$ ^= audioTimestamp.hashCode();
    h$ *= 1000003;
    h$ ^= candidateCount.hashCode();
    h$ *= 1000003;
    h$ ^= enableAffectiveDialog.hashCode();
    h$ *= 1000003;
    h$ ^= frequencyPenalty.hashCode();
    h$ *= 1000003;
    h$ ^= logprobs.hashCode();
    h$ *= 1000003;
    h$ ^= maxOutputTokens.hashCode();
    h$ *= 1000003;
    h$ ^= mediaResolution.hashCode();
    h$ *= 1000003;
    h$ ^= presencePenalty.hashCode();
    h$ *= 1000003;
    h$ ^= responseLogprobs.hashCode();
    h$ *= 1000003;
    h$ ^= responseMimeType.hashCode();
    h$ *= 1000003;
    h$ ^= responseModalities.hashCode();
    h$ *= 1000003;
    h$ ^= responseSchema.hashCode();
    h$ *= 1000003;
    h$ ^= routingConfig.hashCode();
    h$ *= 1000003;
    h$ ^= seed.hashCode();
    h$ *= 1000003;
    h$ ^= speechConfig.hashCode();
    h$ *= 1000003;
    h$ ^= stopSequences.hashCode();
    h$ *= 1000003;
    h$ ^= temperature.hashCode();
    h$ *= 1000003;
    h$ ^= thinkingConfig.hashCode();
    h$ *= 1000003;
    h$ ^= topK.hashCode();
    h$ *= 1000003;
    h$ ^= topP.hashCode();
    h$ *= 1000003;
    h$ ^= enableEnhancedCivicAnswers.hashCode();
    return h$;
  }

  @Override
  public GenerationConfig.Builder toBuilder() {
    return new AutoValue_GenerationConfig.Builder(this);
  }

  static final class Builder extends GenerationConfig.Builder {
    private Optional<ModelSelectionConfig> modelSelectionConfig = Optional.empty();
    private Optional<Object> responseJsonSchema = Optional.empty();
    private Optional<Boolean> audioTimestamp = Optional.empty();
    private Optional<Integer> candidateCount = Optional.empty();
    private Optional<Boolean> enableAffectiveDialog = Optional.empty();
    private Optional<Float> frequencyPenalty = Optional.empty();
    private Optional<Integer> logprobs = Optional.empty();
    private Optional<Integer> maxOutputTokens = Optional.empty();
    private Optional<MediaResolution> mediaResolution = Optional.empty();
    private Optional<Float> presencePenalty = Optional.empty();
    private Optional<Boolean> responseLogprobs = Optional.empty();
    private Optional<String> responseMimeType = Optional.empty();
    private Optional<List<Modality>> responseModalities = Optional.empty();
    private Optional<Schema> responseSchema = Optional.empty();
    private Optional<GenerationConfigRoutingConfig> routingConfig = Optional.empty();
    private Optional<Integer> seed = Optional.empty();
    private Optional<SpeechConfig> speechConfig = Optional.empty();
    private Optional<List<String>> stopSequences = Optional.empty();
    private Optional<Float> temperature = Optional.empty();
    private Optional<ThinkingConfig> thinkingConfig = Optional.empty();
    private Optional<Float> topK = Optional.empty();
    private Optional<Float> topP = Optional.empty();
    private Optional<Boolean> enableEnhancedCivicAnswers = Optional.empty();
    Builder() {
    }
    Builder(GenerationConfig source) {
      this.modelSelectionConfig = source.modelSelectionConfig();
      this.responseJsonSchema = source.responseJsonSchema();
      this.audioTimestamp = source.audioTimestamp();
      this.candidateCount = source.candidateCount();
      this.enableAffectiveDialog = source.enableAffectiveDialog();
      this.frequencyPenalty = source.frequencyPenalty();
      this.logprobs = source.logprobs();
      this.maxOutputTokens = source.maxOutputTokens();
      this.mediaResolution = source.mediaResolution();
      this.presencePenalty = source.presencePenalty();
      this.responseLogprobs = source.responseLogprobs();
      this.responseMimeType = source.responseMimeType();
      this.responseModalities = source.responseModalities();
      this.responseSchema = source.responseSchema();
      this.routingConfig = source.routingConfig();
      this.seed = source.seed();
      this.speechConfig = source.speechConfig();
      this.stopSequences = source.stopSequences();
      this.temperature = source.temperature();
      this.thinkingConfig = source.thinkingConfig();
      this.topK = source.topK();
      this.topP = source.topP();
      this.enableEnhancedCivicAnswers = source.enableEnhancedCivicAnswers();
    }
    @Override
    public GenerationConfig.Builder modelSelectionConfig(ModelSelectionConfig modelSelectionConfig) {
      this.modelSelectionConfig = Optional.of(modelSelectionConfig);
      return this;
    }
    @Override
    GenerationConfig.Builder modelSelectionConfig(Optional<ModelSelectionConfig> modelSelectionConfig) {
      if (modelSelectionConfig == null) {
        throw new NullPointerException("Null modelSelectionConfig");
      }
      this.modelSelectionConfig = modelSelectionConfig;
      return this;
    }
    @Override
    public GenerationConfig.Builder responseJsonSchema(Object responseJsonSchema) {
      this.responseJsonSchema = Optional.of(responseJsonSchema);
      return this;
    }
    @Override
    GenerationConfig.Builder responseJsonSchema(Optional<Object> responseJsonSchema) {
      if (responseJsonSchema == null) {
        throw new NullPointerException("Null responseJsonSchema");
      }
      this.responseJsonSchema = responseJsonSchema;
      return this;
    }
    @Override
    public GenerationConfig.Builder audioTimestamp(boolean audioTimestamp) {
      this.audioTimestamp = Optional.of(audioTimestamp);
      return this;
    }
    @Override
    GenerationConfig.Builder audioTimestamp(Optional<Boolean> audioTimestamp) {
      if (audioTimestamp == null) {
        throw new NullPointerException("Null audioTimestamp");
      }
      this.audioTimestamp = audioTimestamp;
      return this;
    }
    @Override
    public GenerationConfig.Builder candidateCount(Integer candidateCount) {
      this.candidateCount = Optional.of(candidateCount);
      return this;
    }
    @Override
    GenerationConfig.Builder candidateCount(Optional<Integer> candidateCount) {
      if (candidateCount == null) {
        throw new NullPointerException("Null candidateCount");
      }
      this.candidateCount = candidateCount;
      return this;
    }
    @Override
    public GenerationConfig.Builder enableAffectiveDialog(boolean enableAffectiveDialog) {
      this.enableAffectiveDialog = Optional.of(enableAffectiveDialog);
      return this;
    }
    @Override
    GenerationConfig.Builder enableAffectiveDialog(Optional<Boolean> enableAffectiveDialog) {
      if (enableAffectiveDialog == null) {
        throw new NullPointerException("Null enableAffectiveDialog");
      }
      this.enableAffectiveDialog = enableAffectiveDialog;
      return this;
    }
    @Override
    public GenerationConfig.Builder frequencyPenalty(Float frequencyPenalty) {
      this.frequencyPenalty = Optional.of(frequencyPenalty);
      return this;
    }
    @Override
    GenerationConfig.Builder frequencyPenalty(Optional<Float> frequencyPenalty) {
      if (frequencyPenalty == null) {
        throw new NullPointerException("Null frequencyPenalty");
      }
      this.frequencyPenalty = frequencyPenalty;
      return this;
    }
    @Override
    public GenerationConfig.Builder logprobs(Integer logprobs) {
      this.logprobs = Optional.of(logprobs);
      return this;
    }
    @Override
    GenerationConfig.Builder logprobs(Optional<Integer> logprobs) {
      if (logprobs == null) {
        throw new NullPointerException("Null logprobs");
      }
      this.logprobs = logprobs;
      return this;
    }
    @Override
    public GenerationConfig.Builder maxOutputTokens(Integer maxOutputTokens) {
      this.maxOutputTokens = Optional.of(maxOutputTokens);
      return this;
    }
    @Override
    GenerationConfig.Builder maxOutputTokens(Optional<Integer> maxOutputTokens) {
      if (maxOutputTokens == null) {
        throw new NullPointerException("Null maxOutputTokens");
      }
      this.maxOutputTokens = maxOutputTokens;
      return this;
    }
    @Override
    public GenerationConfig.Builder mediaResolution(MediaResolution mediaResolution) {
      this.mediaResolution = Optional.of(mediaResolution);
      return this;
    }
    @Override
    GenerationConfig.Builder mediaResolution(Optional<MediaResolution> mediaResolution) {
      if (mediaResolution == null) {
        throw new NullPointerException("Null mediaResolution");
      }
      this.mediaResolution = mediaResolution;
      return this;
    }
    @Override
    public GenerationConfig.Builder presencePenalty(Float presencePenalty) {
      this.presencePenalty = Optional.of(presencePenalty);
      return this;
    }
    @Override
    GenerationConfig.Builder presencePenalty(Optional<Float> presencePenalty) {
      if (presencePenalty == null) {
        throw new NullPointerException("Null presencePenalty");
      }
      this.presencePenalty = presencePenalty;
      return this;
    }
    @Override
    public GenerationConfig.Builder responseLogprobs(boolean responseLogprobs) {
      this.responseLogprobs = Optional.of(responseLogprobs);
      return this;
    }
    @Override
    GenerationConfig.Builder responseLogprobs(Optional<Boolean> responseLogprobs) {
      if (responseLogprobs == null) {
        throw new NullPointerException("Null responseLogprobs");
      }
      this.responseLogprobs = responseLogprobs;
      return this;
    }
    @Override
    public GenerationConfig.Builder responseMimeType(String responseMimeType) {
      this.responseMimeType = Optional.of(responseMimeType);
      return this;
    }
    @Override
    GenerationConfig.Builder responseMimeType(Optional<String> responseMimeType) {
      if (responseMimeType == null) {
        throw new NullPointerException("Null responseMimeType");
      }
      this.responseMimeType = responseMimeType;
      return this;
    }
    @Override
    public GenerationConfig.Builder responseModalities(List<Modality> responseModalities) {
      this.responseModalities = Optional.of(responseModalities);
      return this;
    }
    @Override
    GenerationConfig.Builder responseModalities(Optional<List<Modality>> responseModalities) {
      if (responseModalities == null) {
        throw new NullPointerException("Null responseModalities");
      }
      this.responseModalities = responseModalities;
      return this;
    }
    @Override
    public GenerationConfig.Builder responseSchema(Schema responseSchema) {
      this.responseSchema = Optional.of(responseSchema);
      return this;
    }
    @Override
    GenerationConfig.Builder responseSchema(Optional<Schema> responseSchema) {
      if (responseSchema == null) {
        throw new NullPointerException("Null responseSchema");
      }
      this.responseSchema = responseSchema;
      return this;
    }
    @Override
    public GenerationConfig.Builder routingConfig(GenerationConfigRoutingConfig routingConfig) {
      this.routingConfig = Optional.of(routingConfig);
      return this;
    }
    @Override
    GenerationConfig.Builder routingConfig(Optional<GenerationConfigRoutingConfig> routingConfig) {
      if (routingConfig == null) {
        throw new NullPointerException("Null routingConfig");
      }
      this.routingConfig = routingConfig;
      return this;
    }
    @Override
    public GenerationConfig.Builder seed(Integer seed) {
      this.seed = Optional.of(seed);
      return this;
    }
    @Override
    GenerationConfig.Builder seed(Optional<Integer> seed) {
      if (seed == null) {
        throw new NullPointerException("Null seed");
      }
      this.seed = seed;
      return this;
    }
    @Override
    public GenerationConfig.Builder speechConfig(SpeechConfig speechConfig) {
      this.speechConfig = Optional.of(speechConfig);
      return this;
    }
    @Override
    GenerationConfig.Builder speechConfig(Optional<SpeechConfig> speechConfig) {
      if (speechConfig == null) {
        throw new NullPointerException("Null speechConfig");
      }
      this.speechConfig = speechConfig;
      return this;
    }
    @Override
    public GenerationConfig.Builder stopSequences(List<String> stopSequences) {
      this.stopSequences = Optional.of(stopSequences);
      return this;
    }
    @Override
    GenerationConfig.Builder stopSequences(Optional<List<String>> stopSequences) {
      if (stopSequences == null) {
        throw new NullPointerException("Null stopSequences");
      }
      this.stopSequences = stopSequences;
      return this;
    }
    @Override
    public GenerationConfig.Builder temperature(Float temperature) {
      this.temperature = Optional.of(temperature);
      return this;
    }
    @Override
    GenerationConfig.Builder temperature(Optional<Float> temperature) {
      if (temperature == null) {
        throw new NullPointerException("Null temperature");
      }
      this.temperature = temperature;
      return this;
    }
    @Override
    public GenerationConfig.Builder thinkingConfig(ThinkingConfig thinkingConfig) {
      this.thinkingConfig = Optional.of(thinkingConfig);
      return this;
    }
    @Override
    GenerationConfig.Builder thinkingConfig(Optional<ThinkingConfig> thinkingConfig) {
      if (thinkingConfig == null) {
        throw new NullPointerException("Null thinkingConfig");
      }
      this.thinkingConfig = thinkingConfig;
      return this;
    }
    @Override
    public GenerationConfig.Builder topK(Float topK) {
      this.topK = Optional.of(topK);
      return this;
    }
    @Override
    GenerationConfig.Builder topK(Optional<Float> topK) {
      if (topK == null) {
        throw new NullPointerException("Null topK");
      }
      this.topK = topK;
      return this;
    }
    @Override
    public GenerationConfig.Builder topP(Float topP) {
      this.topP = Optional.of(topP);
      return this;
    }
    @Override
    GenerationConfig.Builder topP(Optional<Float> topP) {
      if (topP == null) {
        throw new NullPointerException("Null topP");
      }
      this.topP = topP;
      return this;
    }
    @Override
    public GenerationConfig.Builder enableEnhancedCivicAnswers(boolean enableEnhancedCivicAnswers) {
      this.enableEnhancedCivicAnswers = Optional.of(enableEnhancedCivicAnswers);
      return this;
    }
    @Override
    GenerationConfig.Builder enableEnhancedCivicAnswers(Optional<Boolean> enableEnhancedCivicAnswers) {
      if (enableEnhancedCivicAnswers == null) {
        throw new NullPointerException("Null enableEnhancedCivicAnswers");
      }
      this.enableEnhancedCivicAnswers = enableEnhancedCivicAnswers;
      return this;
    }
    @Override
    public GenerationConfig build() {
      return new AutoValue_GenerationConfig(
          this.modelSelectionConfig,
          this.responseJsonSchema,
          this.audioTimestamp,
          this.candidateCount,
          this.enableAffectiveDialog,
          this.frequencyPenalty,
          this.logprobs,
          this.maxOutputTokens,
          this.mediaResolution,
          this.presencePenalty,
          this.responseLogprobs,
          this.responseMimeType,
          this.responseModalities,
          this.responseSchema,
          this.routingConfig,
          this.seed,
          this.speechConfig,
          this.stopSequences,
          this.temperature,
          this.thinkingConfig,
          this.topK,
          this.topP,
          this.enableEnhancedCivicAnswers);
    }
  }

}
