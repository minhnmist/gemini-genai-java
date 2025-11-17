package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpeakerVoiceConfig extends SpeakerVoiceConfig {

  private final Optional<String> speaker;

  private final Optional<VoiceConfig> voiceConfig;

  private AutoValue_SpeakerVoiceConfig(
      Optional<String> speaker,
      Optional<VoiceConfig> voiceConfig) {
    this.speaker = speaker;
    this.voiceConfig = voiceConfig;
  }

  @JsonProperty("speaker")
  @Override
  public Optional<String> speaker() {
    return speaker;
  }

  @JsonProperty("voiceConfig")
  @Override
  public Optional<VoiceConfig> voiceConfig() {
    return voiceConfig;
  }

  @Override
  public String toString() {
    return "SpeakerVoiceConfig{"
        + "speaker=" + speaker + ", "
        + "voiceConfig=" + voiceConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpeakerVoiceConfig) {
      SpeakerVoiceConfig that = (SpeakerVoiceConfig) o;
      return this.speaker.equals(that.speaker())
          && this.voiceConfig.equals(that.voiceConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= speaker.hashCode();
    h$ *= 1000003;
    h$ ^= voiceConfig.hashCode();
    return h$;
  }

  @Override
  public SpeakerVoiceConfig.Builder toBuilder() {
    return new AutoValue_SpeakerVoiceConfig.Builder(this);
  }

  static final class Builder extends SpeakerVoiceConfig.Builder {
    private Optional<String> speaker = Optional.empty();
    private Optional<VoiceConfig> voiceConfig = Optional.empty();
    Builder() {
    }
    Builder(SpeakerVoiceConfig source) {
      this.speaker = source.speaker();
      this.voiceConfig = source.voiceConfig();
    }
    @Override
    public SpeakerVoiceConfig.Builder speaker(String speaker) {
      this.speaker = Optional.of(speaker);
      return this;
    }
    @Override
    SpeakerVoiceConfig.Builder speaker(Optional<String> speaker) {
      if (speaker == null) {
        throw new NullPointerException("Null speaker");
      }
      this.speaker = speaker;
      return this;
    }
    @Override
    public SpeakerVoiceConfig.Builder voiceConfig(VoiceConfig voiceConfig) {
      this.voiceConfig = Optional.of(voiceConfig);
      return this;
    }
    @Override
    SpeakerVoiceConfig.Builder voiceConfig(Optional<VoiceConfig> voiceConfig) {
      if (voiceConfig == null) {
        throw new NullPointerException("Null voiceConfig");
      }
      this.voiceConfig = voiceConfig;
      return this;
    }
    @Override
    public SpeakerVoiceConfig build() {
      return new AutoValue_SpeakerVoiceConfig(
          this.speaker,
          this.voiceConfig);
    }
  }

}
