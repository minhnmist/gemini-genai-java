package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ProactivityConfig extends ProactivityConfig {

  private final Optional<Boolean> proactiveAudio;

  private AutoValue_ProactivityConfig(
      Optional<Boolean> proactiveAudio) {
    this.proactiveAudio = proactiveAudio;
  }

  @JsonProperty("proactiveAudio")
  @Override
  public Optional<Boolean> proactiveAudio() {
    return proactiveAudio;
  }

  @Override
  public String toString() {
    return "ProactivityConfig{"
        + "proactiveAudio=" + proactiveAudio
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProactivityConfig) {
      ProactivityConfig that = (ProactivityConfig) o;
      return this.proactiveAudio.equals(that.proactiveAudio());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= proactiveAudio.hashCode();
    return h$;
  }

  @Override
  public ProactivityConfig.Builder toBuilder() {
    return new AutoValue_ProactivityConfig.Builder(this);
  }

  static final class Builder extends ProactivityConfig.Builder {
    private Optional<Boolean> proactiveAudio = Optional.empty();
    Builder() {
    }
    Builder(ProactivityConfig source) {
      this.proactiveAudio = source.proactiveAudio();
    }
    @Override
    public ProactivityConfig.Builder proactiveAudio(boolean proactiveAudio) {
      this.proactiveAudio = Optional.of(proactiveAudio);
      return this;
    }
    @Override
    ProactivityConfig.Builder proactiveAudio(Optional<Boolean> proactiveAudio) {
      if (proactiveAudio == null) {
        throw new NullPointerException("Null proactiveAudio");
      }
      this.proactiveAudio = proactiveAudio;
      return this;
    }
    @Override
    public ProactivityConfig build() {
      return new AutoValue_ProactivityConfig(
          this.proactiveAudio);
    }
  }

}
