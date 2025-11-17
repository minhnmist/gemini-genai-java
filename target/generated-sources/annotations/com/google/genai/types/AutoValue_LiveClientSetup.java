package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LiveClientSetup extends LiveClientSetup {

  private final Optional<String> model;

  private final Optional<GenerationConfig> generationConfig;

  private final Optional<Content> systemInstruction;

  private final Optional<List<Tool>> tools;

  private final Optional<RealtimeInputConfig> realtimeInputConfig;

  private final Optional<SessionResumptionConfig> sessionResumption;

  private final Optional<ContextWindowCompressionConfig> contextWindowCompression;

  private final Optional<AudioTranscriptionConfig> inputAudioTranscription;

  private final Optional<AudioTranscriptionConfig> outputAudioTranscription;

  private final Optional<ProactivityConfig> proactivity;

  private AutoValue_LiveClientSetup(
      Optional<String> model,
      Optional<GenerationConfig> generationConfig,
      Optional<Content> systemInstruction,
      Optional<List<Tool>> tools,
      Optional<RealtimeInputConfig> realtimeInputConfig,
      Optional<SessionResumptionConfig> sessionResumption,
      Optional<ContextWindowCompressionConfig> contextWindowCompression,
      Optional<AudioTranscriptionConfig> inputAudioTranscription,
      Optional<AudioTranscriptionConfig> outputAudioTranscription,
      Optional<ProactivityConfig> proactivity) {
    this.model = model;
    this.generationConfig = generationConfig;
    this.systemInstruction = systemInstruction;
    this.tools = tools;
    this.realtimeInputConfig = realtimeInputConfig;
    this.sessionResumption = sessionResumption;
    this.contextWindowCompression = contextWindowCompression;
    this.inputAudioTranscription = inputAudioTranscription;
    this.outputAudioTranscription = outputAudioTranscription;
    this.proactivity = proactivity;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
  }

  @JsonProperty("generationConfig")
  @Override
  public Optional<GenerationConfig> generationConfig() {
    return generationConfig;
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

  @JsonProperty("realtimeInputConfig")
  @Override
  public Optional<RealtimeInputConfig> realtimeInputConfig() {
    return realtimeInputConfig;
  }

  @JsonProperty("sessionResumption")
  @Override
  public Optional<SessionResumptionConfig> sessionResumption() {
    return sessionResumption;
  }

  @JsonProperty("contextWindowCompression")
  @Override
  public Optional<ContextWindowCompressionConfig> contextWindowCompression() {
    return contextWindowCompression;
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

  @JsonProperty("proactivity")
  @Override
  public Optional<ProactivityConfig> proactivity() {
    return proactivity;
  }

  @Override
  public String toString() {
    return "LiveClientSetup{"
        + "model=" + model + ", "
        + "generationConfig=" + generationConfig + ", "
        + "systemInstruction=" + systemInstruction + ", "
        + "tools=" + tools + ", "
        + "realtimeInputConfig=" + realtimeInputConfig + ", "
        + "sessionResumption=" + sessionResumption + ", "
        + "contextWindowCompression=" + contextWindowCompression + ", "
        + "inputAudioTranscription=" + inputAudioTranscription + ", "
        + "outputAudioTranscription=" + outputAudioTranscription + ", "
        + "proactivity=" + proactivity
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LiveClientSetup) {
      LiveClientSetup that = (LiveClientSetup) o;
      return this.model.equals(that.model())
          && this.generationConfig.equals(that.generationConfig())
          && this.systemInstruction.equals(that.systemInstruction())
          && this.tools.equals(that.tools())
          && this.realtimeInputConfig.equals(that.realtimeInputConfig())
          && this.sessionResumption.equals(that.sessionResumption())
          && this.contextWindowCompression.equals(that.contextWindowCompression())
          && this.inputAudioTranscription.equals(that.inputAudioTranscription())
          && this.outputAudioTranscription.equals(that.outputAudioTranscription())
          && this.proactivity.equals(that.proactivity());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= model.hashCode();
    h$ *= 1000003;
    h$ ^= generationConfig.hashCode();
    h$ *= 1000003;
    h$ ^= systemInstruction.hashCode();
    h$ *= 1000003;
    h$ ^= tools.hashCode();
    h$ *= 1000003;
    h$ ^= realtimeInputConfig.hashCode();
    h$ *= 1000003;
    h$ ^= sessionResumption.hashCode();
    h$ *= 1000003;
    h$ ^= contextWindowCompression.hashCode();
    h$ *= 1000003;
    h$ ^= inputAudioTranscription.hashCode();
    h$ *= 1000003;
    h$ ^= outputAudioTranscription.hashCode();
    h$ *= 1000003;
    h$ ^= proactivity.hashCode();
    return h$;
  }

  @Override
  public LiveClientSetup.Builder toBuilder() {
    return new AutoValue_LiveClientSetup.Builder(this);
  }

  static final class Builder extends LiveClientSetup.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<GenerationConfig> generationConfig = Optional.empty();
    private Optional<Content> systemInstruction = Optional.empty();
    private Optional<List<Tool>> tools = Optional.empty();
    private Optional<RealtimeInputConfig> realtimeInputConfig = Optional.empty();
    private Optional<SessionResumptionConfig> sessionResumption = Optional.empty();
    private Optional<ContextWindowCompressionConfig> contextWindowCompression = Optional.empty();
    private Optional<AudioTranscriptionConfig> inputAudioTranscription = Optional.empty();
    private Optional<AudioTranscriptionConfig> outputAudioTranscription = Optional.empty();
    private Optional<ProactivityConfig> proactivity = Optional.empty();
    Builder() {
    }
    Builder(LiveClientSetup source) {
      this.model = source.model();
      this.generationConfig = source.generationConfig();
      this.systemInstruction = source.systemInstruction();
      this.tools = source.tools();
      this.realtimeInputConfig = source.realtimeInputConfig();
      this.sessionResumption = source.sessionResumption();
      this.contextWindowCompression = source.contextWindowCompression();
      this.inputAudioTranscription = source.inputAudioTranscription();
      this.outputAudioTranscription = source.outputAudioTranscription();
      this.proactivity = source.proactivity();
    }
    @Override
    public LiveClientSetup.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    LiveClientSetup.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public LiveClientSetup.Builder generationConfig(GenerationConfig generationConfig) {
      this.generationConfig = Optional.of(generationConfig);
      return this;
    }
    @Override
    LiveClientSetup.Builder generationConfig(Optional<GenerationConfig> generationConfig) {
      if (generationConfig == null) {
        throw new NullPointerException("Null generationConfig");
      }
      this.generationConfig = generationConfig;
      return this;
    }
    @Override
    public LiveClientSetup.Builder systemInstruction(Content systemInstruction) {
      this.systemInstruction = Optional.of(systemInstruction);
      return this;
    }
    @Override
    LiveClientSetup.Builder systemInstruction(Optional<Content> systemInstruction) {
      if (systemInstruction == null) {
        throw new NullPointerException("Null systemInstruction");
      }
      this.systemInstruction = systemInstruction;
      return this;
    }
    @Override
    public LiveClientSetup.Builder tools(List<Tool> tools) {
      this.tools = Optional.of(tools);
      return this;
    }
    @Override
    LiveClientSetup.Builder tools(Optional<List<Tool>> tools) {
      if (tools == null) {
        throw new NullPointerException("Null tools");
      }
      this.tools = tools;
      return this;
    }
    @Override
    public LiveClientSetup.Builder realtimeInputConfig(RealtimeInputConfig realtimeInputConfig) {
      this.realtimeInputConfig = Optional.of(realtimeInputConfig);
      return this;
    }
    @Override
    LiveClientSetup.Builder realtimeInputConfig(Optional<RealtimeInputConfig> realtimeInputConfig) {
      if (realtimeInputConfig == null) {
        throw new NullPointerException("Null realtimeInputConfig");
      }
      this.realtimeInputConfig = realtimeInputConfig;
      return this;
    }
    @Override
    public LiveClientSetup.Builder sessionResumption(SessionResumptionConfig sessionResumption) {
      this.sessionResumption = Optional.of(sessionResumption);
      return this;
    }
    @Override
    LiveClientSetup.Builder sessionResumption(Optional<SessionResumptionConfig> sessionResumption) {
      if (sessionResumption == null) {
        throw new NullPointerException("Null sessionResumption");
      }
      this.sessionResumption = sessionResumption;
      return this;
    }
    @Override
    public LiveClientSetup.Builder contextWindowCompression(ContextWindowCompressionConfig contextWindowCompression) {
      this.contextWindowCompression = Optional.of(contextWindowCompression);
      return this;
    }
    @Override
    LiveClientSetup.Builder contextWindowCompression(Optional<ContextWindowCompressionConfig> contextWindowCompression) {
      if (contextWindowCompression == null) {
        throw new NullPointerException("Null contextWindowCompression");
      }
      this.contextWindowCompression = contextWindowCompression;
      return this;
    }
    @Override
    public LiveClientSetup.Builder inputAudioTranscription(AudioTranscriptionConfig inputAudioTranscription) {
      this.inputAudioTranscription = Optional.of(inputAudioTranscription);
      return this;
    }
    @Override
    LiveClientSetup.Builder inputAudioTranscription(Optional<AudioTranscriptionConfig> inputAudioTranscription) {
      if (inputAudioTranscription == null) {
        throw new NullPointerException("Null inputAudioTranscription");
      }
      this.inputAudioTranscription = inputAudioTranscription;
      return this;
    }
    @Override
    public LiveClientSetup.Builder outputAudioTranscription(AudioTranscriptionConfig outputAudioTranscription) {
      this.outputAudioTranscription = Optional.of(outputAudioTranscription);
      return this;
    }
    @Override
    LiveClientSetup.Builder outputAudioTranscription(Optional<AudioTranscriptionConfig> outputAudioTranscription) {
      if (outputAudioTranscription == null) {
        throw new NullPointerException("Null outputAudioTranscription");
      }
      this.outputAudioTranscription = outputAudioTranscription;
      return this;
    }
    @Override
    public LiveClientSetup.Builder proactivity(ProactivityConfig proactivity) {
      this.proactivity = Optional.of(proactivity);
      return this;
    }
    @Override
    LiveClientSetup.Builder proactivity(Optional<ProactivityConfig> proactivity) {
      if (proactivity == null) {
        throw new NullPointerException("Null proactivity");
      }
      this.proactivity = proactivity;
      return this;
    }
    @Override
    public LiveClientSetup build() {
      return new AutoValue_LiveClientSetup(
          this.model,
          this.generationConfig,
          this.systemInstruction,
          this.tools,
          this.realtimeInputConfig,
          this.sessionResumption,
          this.contextWindowCompression,
          this.inputAudioTranscription,
          this.outputAudioTranscription,
          this.proactivity);
    }
  }

}
