package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GcsDestination extends GcsDestination {

  private final Optional<String> outputUriPrefix;

  private AutoValue_GcsDestination(
      Optional<String> outputUriPrefix) {
    this.outputUriPrefix = outputUriPrefix;
  }

  @JsonProperty("outputUriPrefix")
  @Override
  public Optional<String> outputUriPrefix() {
    return outputUriPrefix;
  }

  @Override
  public String toString() {
    return "GcsDestination{"
        + "outputUriPrefix=" + outputUriPrefix
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GcsDestination) {
      GcsDestination that = (GcsDestination) o;
      return this.outputUriPrefix.equals(that.outputUriPrefix());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= outputUriPrefix.hashCode();
    return h$;
  }

  @Override
  public GcsDestination.Builder toBuilder() {
    return new AutoValue_GcsDestination.Builder(this);
  }

  static final class Builder extends GcsDestination.Builder {
    private Optional<String> outputUriPrefix = Optional.empty();
    Builder() {
    }
    Builder(GcsDestination source) {
      this.outputUriPrefix = source.outputUriPrefix();
    }
    @Override
    public GcsDestination.Builder outputUriPrefix(String outputUriPrefix) {
      this.outputUriPrefix = Optional.of(outputUriPrefix);
      return this;
    }
    @Override
    GcsDestination.Builder outputUriPrefix(Optional<String> outputUriPrefix) {
      if (outputUriPrefix == null) {
        throw new NullPointerException("Null outputUriPrefix");
      }
      this.outputUriPrefix = outputUriPrefix;
      return this;
    }
    @Override
    public GcsDestination build() {
      return new AutoValue_GcsDestination(
          this.outputUriPrefix);
    }
  }

}
