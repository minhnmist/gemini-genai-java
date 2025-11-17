package com.google.genai.types;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AudioTranscriptionConfig extends AudioTranscriptionConfig {

  private AutoValue_AudioTranscriptionConfig() {
  }

  @Override
  public String toString() {
    return "AudioTranscriptionConfig{"
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AudioTranscriptionConfig) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    return h$;
  }

  @Override
  public AudioTranscriptionConfig.Builder toBuilder() {
    return new AutoValue_AudioTranscriptionConfig.Builder(this);
  }

  static final class Builder extends AudioTranscriptionConfig.Builder {
    Builder() {
    }
    Builder(AudioTranscriptionConfig source) {
    }
    @Override
    public AudioTranscriptionConfig build() {
      return new AutoValue_AudioTranscriptionConfig();
    }
  }

}
