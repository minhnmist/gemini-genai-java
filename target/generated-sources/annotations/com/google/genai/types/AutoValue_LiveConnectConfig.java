package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LiveConnectConfig extends LiveConnectConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<List<Modality>> responseModalities;

  private final Optional<Float> temperature;

  private final Optional<Float> topP;

  private final Optional<Float> topK;

  private final Optional<Integer> maxOutputTokens;

  private final Optional<MediaResolution> mediaResolution;

  private final Optional<Integer> seed;

  private final Optional<SpeechConfig> speechConfig;

  private final Optional<ThinkingConfig> thinkingConfig;

  private final Optional<Boolean> enableAffectiveDialog;

  private final Optional<Content> systemInstruction;

  private final Optional<List<Tool>> tools;

  private final Optional<SessionResumptionConfig> sessionResumption;

  private final Optional<AudioTranscriptionConfig> inputAudioTranscription;

  private final Optional<AudioTranscriptionConfig> outputAudioTranscription;

  private final Optional<RealtimeInputConfig> realtimeInputConfig;

  private final Optional<ContextWindowCompressionConfig> contextWindowCompression;

  private final Optional<ProactivityConfig> proactivity;

  private AutoValue_LiveConnectConfig(
      Optional<HttpOptions> httpOptions,
      Optional<List<Modality>> responseModalities,
      Optional<Float> temperature,
      Optional<Float> topP,
      Optional<Float> topK,
      Optional<Integer> maxOutputTokens,
      Optional<MediaResolution> mediaResolution,
      Optional<Integer> seed,
      Optional<SpeechConfig> speechConfig,
      Optional<ThinkingConfig> thinkingConfig,
      Optional<Boolean> enableAffectiveDialog,
      Optional<Content> systemInstruction,
      Optional<List<Tool>> tools,
      Optional<SessionResumptionConfig> sessionResumption,
      Optional<AudioTranscriptionConfig> inputAudioTranscription,
      Optional<AudioTranscriptionConfig> outputAudioTranscription,
      Optional<RealtimeInputConfig> realtimeInputConfig,
      Optional<ContextWindowCompressionConfig> contextWindowCompression,
      Optional<ProactivityConfig> proactivity) {
    this.httpOptions = httpOptions;
    this.responseModalities = responseModalities;
    this.temperature = temperature;
    this.topP = topP;
    this.topK = topK;
    this.maxOutputTokens = maxOutputTokens;
    this.mediaResolution = mediaResolution;
    this.seed = seed;
    this.speechConfig = speechConfig;
    this.thinkingConfig = thinkingConfig;
    this.enableAffectiveDialog = enableAffectiveDialog;
    this.systemInstruction = systemInstruction;
    this.tools = tools;
    this.sessionResumption = sessionResumption;
    this.inputAudioTranscription = inputAudioTranscription;
    this.outputAudioTranscription = outputAudioTranscription;
    this.realtimeInputConfig = realtimeInputConfig;
    this.contextWindowCompression = contextWindowCompression;
    this.proactivity = proactivity;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("responseModalities")
  @Override
  public Optional<List<Modality>> responseModalities() {
    return responseModalities;
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

  @JsonProperty("thinkingConfig")
  @Override
  public Optional<ThinkingConfig> thinkingConfig() {
    return thinkingConfig;
  }

  @JsonProperty("enableAffectiveDialog")
  @Override
  public Optional<Boolean> enableAffectiveDialog() {
    return enableAffectiveDialog;
  }

  @JsonProperty("systemInstruction")
  @Override
  public Optional<Content> systemInstruction() {
    return systemInstruction;
  }

  @JsonProperty("tools")
  @Override
  public Optional<List<Tool>> tools() {
    return tools;
  }

  @JsonProperty("sessionResumption")
  @Override
  public Optional<SessionResumptionConfig> sessionResumption() {
    return sessionResumption;
  }

  @JsonProperty("inputAudioTranscription")
  @Override
  public Optional<AudioTranscriptionConfig> inputAudioTranscription() {
    return inputAudioTranscription;
  }

  @JsonProperty("outputAudioTranscription")
  @Override
  public Optional<AudioTranscriptionConfig> outputAudioTranscription() {
    return outputAudioTranscription;
  }

  @JsonProperty("realtimeInputConfig")
  @Override
  public Optional<RealtimeInputConfig> realtimeInputConfig() {
    return realtimeInputConfig;
  }

  @JsonProperty("contextWindowCompression")
  @Override
  public Optional<ContextWindowCompressionConfig> contextWindowCompression() {
    return contextWindowCompression;
  }

  @JsonProperty("proactivity")
  @Override
  public Optional<ProactivityConfig> proactivity() {
    return proactivity;
  }

  @Override
  public String toString() {
    return "LiveConnectConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "responseModalities=" + responseModalities + ", "
        + "temperature=" + temperature + ", "
        + "topP=" + topP + ", "
        + "topK=" + topK + ", "
        + "maxOutputTokens=" + maxOutputTokens + ", "
        + "mediaResolution=" + mediaResolution + ", "
        + "seed=" + seed + ", "
        + "speechConfig=" + speechConfig + ", "
        + "thinkingConfig=" + thinkingConfig + ", "
        + "enableAffectiveDialog=" + enableAffectiveDialog + ", "
        + "systemInstruction=" + systemInstruction + ", "
        + "tools=" + tools + ", "
        + "sessionResumption=" + sessionResumption + ", "
        + "inputAudioTranscription=" + inputAudioTranscription + ", "
        + "outputAudioTranscription=" + outputAudioTranscription + ", "
        + "realtimeInputConfig=" + realtimeInputConfig + ", "
        + "contextWindowCompression=" + contextWindowCompression + ", "
        + "proactivity=" + proactivity
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LiveConnectConfig) {
      LiveConnectConfig that = (LiveConnectConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.responseModalities.equals(that.responseModalities())
          && this.temperature.equals(that.temperature())
          && this.topP.equals(that.topP())
          && this.topK.equals(that.topK())
          && this.maxOutputTokens.equals(that.maxOutputTokens())
          && this.mediaResolution.equals(that.mediaResolution())
          && this.seed.equals(that.seed())
          && this.speechConfig.equals(that.speechConfig())
          && this.thinkingConfig.equals(that.thinkingConfig())
          && this.enableAffectiveDialog.equals(that.enableAffectiveDialog())
          && this.systemInstruction.equals(that.systemInstruction())
          && this.tools.equals(that.tools())
          && this.sessionResumption.equals(that.sessionResumption())
          && this.inputAudioTranscription.equals(that.inputAudioTranscription())
          && this.outputAudioTranscription.equals(that.outputAudioTranscription())
          && this.realtimeInputConfig.equals(that.realtimeInputConfig())
          && this.contextWindowCompression.equals(that.contextWindowCompression())
          && this.proactivity.equals(that.proactivity());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= responseModalities.hashCode();
    h$ *= 1000003;
    h$ ^= temperature.hashCode();
    h$ *= 1000003;
    h$ ^= topP.hashCode();
    h$ *= 1000003;
    h$ ^= topK.hashCode();
    h$ *= 1000003;
    h$ ^= maxOutputTokens.hashCode();
    h$ *= 1000003;
    h$ ^= mediaResolution.hashCode();
    h$ *= 1000003;
    h$ ^= seed.hashCode();
    h$ *= 1000003;
    h$ ^= speechConfig.hashCode();
    h$ *= 1000003;
    h$ ^= thinkingConfig.hashCode();
    h$ *= 1000003;
    h$ ^= enableAffectiveDialog.hashCode();
    h$ *= 1000003;
    h$ ^= systemInstruction.hashCode();
    h$ *= 1000003;
    h$ ^= tools.hashCode();
    h$ *= 1000003;
    h$ ^= sessionResumption.hashCode();
    h$ *= 1000003;
    h$ ^= inputAudioTranscription.hashCode();
    h$ *= 1000003;
    h$ ^= outputAudioTranscription.hashCode();
    h$ *= 1000003;
    h$ ^= realtimeInputConfig.hashCode();
    h$ *= 1000003;
    h$ ^= contextWindowCompression.hashCode();
    h$ *= 1000003;
    h$ ^= proactivity.hashCode();
    return h$;
  }

  @Override
  public LiveConnectConfig.Builder toBuilder() {
    return new AutoValue_LiveConnectConfig.Builder(this);
  }

  static final class Builder extends LiveConnectConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<List<Modality>> responseModalities = Optional.empty();
    private Optional<Float> temperature = Optional.empty();
    private Optional<Float> topP = Optional.empty();
    private Optional<Float> topK = Optional.empty();
    private Optional<Integer> maxOutputTokens = Optional.empty();
    private Optional<MediaResolution> mediaResolution = Optional.empty();
    private Optional<Integer> seed = Optional.empty();
    private Optional<SpeechConfig> speechConfig = Optional.empty();
    private Optional<ThinkingConfig> thinkingConfig = Optional.empty();
    private Optional<Boolean> enableAffectiveDialog = Optional.empty();
    private Optional<Content> systemInstruction = Optional.empty();
    private Optional<List<Tool>> tools = Optional.empty();
    private Optional<SessionResumptionConfig> sessionResumption = Optional.empty();
    private Optional<AudioTranscriptionConfig> inputAudioTranscription = Optional.empty();
    private Optional<AudioTranscriptionConfig> outputAudioTranscription = Optional.empty();
    private Optional<RealtimeInputConfig> realtimeInputConfig = Optional.empty();
    private Optional<ContextWindowCompressionConfig> contextWindowCompression = Optional.empty();
    private Optional<ProactivityConfig> proactivity = Optional.empty();
    Builder() {
    }
    Builder(LiveConnectConfig source) {
      this.httpOptions = source.httpOptions();
      this.responseModalities = source.responseModalities();
      this.temperature = source.temperature();
      this.topP = source.topP();
      this.topK = source.topK();
      this.maxOutputTokens = source.maxOutputTokens();
      this.mediaResolution = source.mediaResolution();
      this.seed = source.seed();
      this.speechConfig = source.speechConfig();
      this.thinkingConfig = source.thinkingConfig();
      this.enableAffectiveDialog = source.enableAffectiveDialog();
      this.systemInstruction = source.systemInstruction();
      this.tools = source.tools();
      this.sessionResumption = source.sessionResumption();
      this.inputAudioTranscription = source.inputAudioTranscription();
      this.outputAudioTranscription = source.outputAudioTranscription();
      this.realtimeInputConfig = source.realtimeInputConfig();
      this.contextWindowCompression = source.contextWindowCompression();
      this.proactivity = source.proactivity();
    }
    @Override
    public LiveConnectConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    LiveConnectConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder responseModalities(List<Modality> responseModalities) {
      this.responseModalities = Optional.of(responseModalities);
      return this;
    }
    @Override
    LiveConnectConfig.Builder responseModalities(Optional<List<Modality>> responseModalities) {
      if (responseModalities == null) {
        throw new NullPointerException("Null responseModalities");
      }
      this.responseModalities = responseModalities;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder temperature(Float temperature) {
      this.temperature = Optional.of(temperature);
      return this;
    }
    @Override
    LiveConnectConfig.Builder temperature(Optional<Float> temperature) {
      if (temperature == null) {
        throw new NullPointerException("Null temperature");
      }
      this.temperature = temperature;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder topP(Float topP) {
      this.topP = Optional.of(topP);
      return this;
    }
    @Override
    LiveConnectConfig.Builder topP(Optional<Float> topP) {
      if (topP == null) {
        throw new NullPointerException("Null topP");
      }
      this.topP = topP;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder topK(Float topK) {
      this.topK = Optional.of(topK);
      return this;
    }
    @Override
    LiveConnectConfig.Builder topK(Optional<Float> topK) {
      if (topK == null) {
        throw new NullPointerException("Null topK");
      }
      this.topK = topK;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder maxOutputTokens(Integer maxOutputTokens) {
      this.maxOutputTokens = Optional.of(maxOutputTokens);
      return this;
    }
    @Override
    LiveConnectConfig.Builder maxOutputTokens(Optional<Integer> maxOutputTokens) {
      if (maxOutputTokens == null) {
        throw new NullPointerException("Null maxOutputTokens");
      }
      this.maxOutputTokens = maxOutputTokens;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder mediaResolution(MediaResolution mediaResolution) {
      this.mediaResolution = Optional.of(mediaResolution);
      return this;
    }
    @Override
    LiveConnectConfig.Builder mediaResolution(Optional<MediaResolution> mediaResolution) {
      if (mediaResolution == null) {
        throw new NullPointerException("Null mediaResolution");
      }
      this.mediaResolution = mediaResolution;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder seed(Integer seed) {
      this.seed = Optional.of(seed);
      return this;
    }
    @Override
    LiveConnectConfig.Builder seed(Optional<Integer> seed) {
      if (seed == null) {
        throw new NullPointerException("Null seed");
      }
      this.seed = seed;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder speechConfig(SpeechConfig speechConfig) {
      this.speechConfig = Optional.of(speechConfig);
      return this;
    }
    @Override
    LiveConnectConfig.Builder speechConfig(Optional<SpeechConfig> speechConfig) {
      if (speechConfig == null) {
        throw new NullPointerException("Null speechConfig");
      }
      this.speechConfig = speechConfig;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder thinkingConfig(ThinkingConfig thinkingConfig) {
      this.thinkingConfig = Optional.of(thinkingConfig);
      return this;
    }
    @Override
    LiveConnectConfig.Builder thinkingConfig(Optional<ThinkingConfig> thinkingConfig) {
      if (thinkingConfig == null) {
        throw new NullPointerException("Null thinkingConfig");
      }
      this.thinkingConfig = thinkingConfig;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder enableAffectiveDialog(boolean enableAffectiveDialog) {
      this.enableAffectiveDialog = Optional.of(enableAffectiveDialog);
      return this;
    }
    @Override
    LiveConnectConfig.Builder enableAffectiveDialog(Optional<Boolean> enableAffectiveDialog) {
      if (enableAffectiveDialog == null) {
        throw new NullPointerException("Null enableAffectiveDialog");
      }
      this.enableAffectiveDialog = enableAffectiveDialog;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder systemInstruction(Content systemInstruction) {
      this.systemInstruction = Optional.of(systemInstruction);
      return this;
    }
    @Override
    LiveConnectConfig.Builder systemInstruction(Optional<Content> systemInstruction) {
      if (systemInstruction == null) {
        throw new NullPointerException("Null systemInstruction");
      }
      this.systemInstruction = systemInstruction;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder tools(List<Tool> tools) {
      this.tools = Optional.of(tools);
      return this;
    }
    @Override
    LiveConnectConfig.Builder tools(Optional<List<Tool>> tools) {
      if (tools == null) {
        throw new NullPointerException("Null tools");
      }
      this.tools = tools;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder sessionResumption(SessionResumptionConfig sessionResumption) {
      this.sessionResumption = Optional.of(sessionResumption);
      return this;
    }
    @Override
    LiveConnectConfig.Builder sessionResumption(Optional<SessionResumptionConfig> sessionResumption) {
      if (sessionResumption == null) {
        throw new NullPointerException("Null sessionResumption");
      }
      this.sessionResumption = sessionResumption;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder inputAudioTranscription(AudioTranscriptionConfig inputAudioTranscription) {
      this.inputAudioTranscription = Optional.of(inputAudioTranscription);
      return this;
    }
    @Override
    LiveConnectConfig.Builder inputAudioTranscription(Optional<AudioTranscriptionConfig> inputAudioTranscription) {
      if (inputAudioTranscription == null) {
        throw new NullPointerException("Null inputAudioTranscription");
      }
      this.inputAudioTranscription = inputAudioTranscription;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder outputAudioTranscription(AudioTranscriptionConfig outputAudioTranscription) {
      this.outputAudioTranscription = Optional.of(outputAudioTranscription);
      return this;
    }
    @Override
    LiveConnectConfig.Builder outputAudioTranscription(Optional<AudioTranscriptionConfig> outputAudioTranscription) {
      if (outputAudioTranscription == null) {
        throw new NullPointerException("Null outputAudioTranscription");
      }
      this.outputAudioTranscription = outputAudioTranscription;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder realtimeInputConfig(RealtimeInputConfig realtimeInputConfig) {
      this.realtimeInputConfig = Optional.of(realtimeInputConfig);
      return this;
    }
    @Override
    LiveConnectConfig.Builder realtimeInputConfig(Optional<RealtimeInputConfig> realtimeInputConfig) {
      if (realtimeInputConfig == null) {
        throw new NullPointerException("Null realtimeInputConfig");
      }
      this.realtimeInputConfig = realtimeInputConfig;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder contextWindowCompression(ContextWindowCompressionConfig contextWindowCompression) {
      this.contextWindowCompression = Optional.of(contextWindowCompression);
      return this;
    }
    @Override
    LiveConnectConfig.Builder contextWindowCompression(Optional<ContextWindowCompressionConfig> contextWindowCompression) {
      if (contextWindowCompression == null) {
        throw new NullPointerException("Null contextWindowCompression");
      }
      this.contextWindowCompression = contextWindowCompression;
      return this;
    }
    @Override
    public LiveConnectConfig.Builder proactivity(ProactivityConfig proactivity) {
      this.proactivity = Optional.of(proactivity);
      return this;
    }
    @Override
    LiveConnectConfig.Builder proactivity(Optional<ProactivityConfig> proactivity) {
      if (proactivity == null) {
        throw new NullPointerException("Null proactivity");
      }
      this.proactivity = proactivity;
      return this;
    }
    @Override
    public LiveConnectConfig build() {
      return new AutoValue_LiveConnectConfig(
          this.httpOptions,
          this.responseModalities,
          this.temperature,
          this.topP,
          this.topK,
          this.maxOutputTokens,
          this.mediaResolution,
          this.seed,
          this.speechConfig,
          this.thinkingConfig,
          this.enableAffectiveDialog,
          this.systemInstruction,
          this.tools,
          this.sessionResumption,
          this.inputAudioTranscription,
          this.outputAudioTranscription,
          this.realtimeInputConfig,
          this.contextWindowCompression,
          this.proactivity);
    }
  }

}
