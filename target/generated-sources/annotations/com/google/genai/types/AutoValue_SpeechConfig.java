package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpeechConfig extends SpeechConfig {

  private final Optional<String> languageCode;

  private final Optional<VoiceConfig> voiceConfig;

  private final Optional<MultiSpeakerVoiceConfig> multiSpeakerVoiceConfig;

  private AutoValue_SpeechConfig(
      Optional<String> languageCode,
      Optional<VoiceConfig> voiceConfig,
      Optional<MultiSpeakerVoiceConfig> multiSpeakerVoiceConfig) {
    this.languageCode = languageCode;
    this.voiceConfig = voiceConfig;
    this.multiSpeakerVoiceConfig = multiSpeakerVoiceConfig;
  }

  @JsonProperty("languageCode")
  @Override
  public Optional<String> languageCode() {
    return languageCode;
  }

  @JsonProperty("voiceConfig")
  @Override
  public Optional<VoiceConfig> voiceConfig() {
    return voiceConfig;
  }

  @JsonProperty("multiSpeakerVoiceConfig")
  @Override
  public Optional<MultiSpeakerVoiceConfig> multiSpeakerVoiceConfig() {
    return multiSpeakerVoiceConfig;
  }

  @Override
  public String toString() {
    return "SpeechConfig{"
        + "languageCode=" + languageCode + ", "
        + "voiceConfig=" + voiceConfig + ", "
        + "multiSpeakerVoiceConfig=" + multiSpeakerVoiceConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpeechConfig) {
      SpeechConfig that = (SpeechConfig) o;
      return this.languageCode.equals(that.languageCode())
          && this.voiceConfig.equals(that.voiceConfig())
          && this.multiSpeakerVoiceConfig.equals(that.multiSpeakerVoiceConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= languageCode.hashCode();
    h$ *= 1000003;
    h$ ^= voiceConfig.hashCode();
    h$ *= 1000003;
    h$ ^= multiSpeakerVoiceConfig.hashCode();
    return h$;
  }

  @Override
  public SpeechConfig.Builder toBuilder() {
    return new AutoValue_SpeechConfig.Builder(this);
  }

  static final class Builder extends SpeechConfig.Builder {
    private Optional<String> languageCode = Optional.empty();
    private Optional<VoiceConfig> voiceConfig = Optional.empty();
    private Optional<MultiSpeakerVoiceConfig> multiSpeakerVoiceConfig = Optional.empty();
    Builder() {
    }
    Builder(SpeechConfig source) {
      this.languageCode = source.languageCode();
      this.voiceConfig = source.voiceConfig();
      this.multiSpeakerVoiceConfig = source.multiSpeakerVoiceConfig();
    }
    @Override
    public SpeechConfig.Builder languageCode(String languageCode) {
      this.languageCode = Optional.of(languageCode);
      return this;
    }
    @Override
    SpeechConfig.Builder languageCode(Optional<String> languageCode) {
      if (languageCode == null) {
        throw new NullPointerException("Null languageCode");
      }
      this.languageCode = languageCode;
      return this;
    }
    @Override
    public SpeechConfig.Builder voiceConfig(VoiceConfig voiceConfig) {
      this.voiceConfig = Optional.of(voiceConfig);
      return this;
    }
    @Override
    SpeechConfig.Builder voiceConfig(Optional<VoiceConfig> voiceConfig) {
      if (voiceConfig == null) {
        throw new NullPointerException("Null voiceConfig");
      }
      this.voiceConfig = voiceConfig;
      return this;
    }
    @Override
    public SpeechConfig.Builder multiSpeakerVoiceConfig(MultiSpeakerVoiceConfig multiSpeakerVoiceConfig) {
      this.multiSpeakerVoiceConfig = Optional.of(multiSpeakerVoiceConfig);
      return this;
    }
    @Override
    SpeechConfig.Builder multiSpeakerVoiceConfig(Optional<MultiSpeakerVoiceConfig> multiSpeakerVoiceConfig) {
      if (multiSpeakerVoiceConfig == null) {
        throw new NullPointerException("Null multiSpeakerVoiceConfig");
      }
      this.multiSpeakerVoiceConfig = multiSpeakerVoiceConfig;
      return this;
    }
    @Override
    public SpeechConfig build() {
      return new AutoValue_SpeechConfig(
          this.languageCode,
          this.voiceConfig,
          this.multiSpeakerVoiceConfig);
    }
  }

}
