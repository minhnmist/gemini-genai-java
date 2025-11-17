package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_OutputConfig extends OutputConfig {

  private final Optional<GcsDestination> gcsDestination;

  private AutoValue_OutputConfig(
      Optional<GcsDestination> gcsDestination) {
    this.gcsDestination = gcsDestination;
  }

  @JsonProperty("gcsDestination")
  @Override
  public Optional<GcsDestination> gcsDestination() {
    return gcsDestination;
  }

  @Override
  public String toString() {
    return "OutputConfig{"
        + "gcsDestination=" + gcsDestination
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OutputConfig) {
      OutputConfig that = (OutputConfig) o;
      return this.gcsDestination.equals(that.gcsDestination());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= gcsDestination.hashCode();
    return h$;
  }

  @Override
  public OutputConfig.Builder toBuilder() {
    return new AutoValue_OutputConfig.Builder(this);
  }

  static final class Builder extends OutputConfig.Builder {
    private Optional<GcsDestination> gcsDestination = Optional.empty();
    Builder() {
    }
    Builder(OutputConfig source) {
      this.gcsDestination = source.gcsDestination();
    }
    @Override
    public OutputConfig.Builder gcsDestination(GcsDestination gcsDestination) {
      this.gcsDestination = Optional.of(gcsDestination);
      return this;
    }
    @Override
    OutputConfig.Builder gcsDestination(Optional<GcsDestination> gcsDestination) {
      if (gcsDestination == null) {
        throw new NullPointerException("Null gcsDestination");
      }
      this.gcsDestination = gcsDestination;
      return this;
    }
    @Override
    public OutputConfig build() {
      return new AutoValue_OutputConfig(
          this.gcsDestination);
    }
  }

}
