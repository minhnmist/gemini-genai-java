package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MultiSpeakerVoiceConfig extends MultiSpeakerVoiceConfig {

  private final Optional<List<SpeakerVoiceConfig>> speakerVoiceConfigs;

  private AutoValue_MultiSpeakerVoiceConfig(
      Optional<List<SpeakerVoiceConfig>> speakerVoiceConfigs) {
    this.speakerVoiceConfigs = speakerVoiceConfigs;
  }

  @JsonProperty("speakerVoiceConfigs")
  @Override
  public Optional<List<SpeakerVoiceConfig>> speakerVoiceConfigs() {
    return speakerVoiceConfigs;
  }

  @Override
  public String toString() {
    return "MultiSpeakerVoiceConfig{"
        + "speakerVoiceConfigs=" + speakerVoiceConfigs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MultiSpeakerVoiceConfig) {
      MultiSpeakerVoiceConfig that = (MultiSpeakerVoiceConfig) o;
      return this.speakerVoiceConfigs.equals(that.speakerVoiceConfigs());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= speakerVoiceConfigs.hashCode();
    return h$;
  }

  @Override
  public MultiSpeakerVoiceConfig.Builder toBuilder() {
    return new AutoValue_MultiSpeakerVoiceConfig.Builder(this);
  }

  static final class Builder extends MultiSpeakerVoiceConfig.Builder {
    private Optional<List<SpeakerVoiceConfig>> speakerVoiceConfigs = Optional.empty();
    Builder() {
    }
    Builder(MultiSpeakerVoiceConfig source) {
      this.speakerVoiceConfigs = source.speakerVoiceConfigs();
    }
    @Override
    public MultiSpeakerVoiceConfig.Builder speakerVoiceConfigs(List<SpeakerVoiceConfig> speakerVoiceConfigs) {
      this.speakerVoiceConfigs = Optional.of(speakerVoiceConfigs);
      return this;
    }
    @Override
    MultiSpeakerVoiceConfig.Builder speakerVoiceConfigs(Optional<List<SpeakerVoiceConfig>> speakerVoiceConfigs) {
      if (speakerVoiceConfigs == null) {
        throw new NullPointerException("Null speakerVoiceConfigs");
      }
      this.speakerVoiceConfigs = speakerVoiceConfigs;
      return this;
    }
    @Override
    public MultiSpeakerVoiceConfig build() {
      return new AutoValue_MultiSpeakerVoiceConfig(
          this.speakerVoiceConfigs);
    }
  }

}
