package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SegmentImageResponse extends SegmentImageResponse {

  private final Optional<List<GeneratedImageMask>> generatedMasks;

  private AutoValue_SegmentImageResponse(
      Optional<List<GeneratedImageMask>> generatedMasks) {
    this.generatedMasks = generatedMasks;
  }

  @JsonProperty("generatedMasks")
  @Override
  public Optional<List<GeneratedImageMask>> generatedMasks() {
    return generatedMasks;
  }

  @Override
  public String toString() {
    return "SegmentImageResponse{"
        + "generatedMasks=" + generatedMasks
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SegmentImageResponse) {
      SegmentImageResponse that = (SegmentImageResponse) o;
      return this.generatedMasks.equals(that.generatedMasks());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= generatedMasks.hashCode();
    return h$;
  }

  @Override
  public SegmentImageResponse.Builder toBuilder() {
    return new AutoValue_SegmentImageResponse.Builder(this);
  }

  static final class Builder extends SegmentImageResponse.Builder {
    private Optional<List<GeneratedImageMask>> generatedMasks = Optional.empty();
    Builder() {
    }
    Builder(SegmentImageResponse source) {
      this.generatedMasks = source.generatedMasks();
    }
    @Override
    public SegmentImageResponse.Builder generatedMasks(List<GeneratedImageMask> generatedMasks) {
      this.generatedMasks = Optional.of(generatedMasks);
      return this;
    }
    @Override
    SegmentImageResponse.Builder generatedMasks(Optional<List<GeneratedImageMask>> generatedMasks) {
      if (generatedMasks == null) {
        throw new NullPointerException("Null generatedMasks");
      }
      this.generatedMasks = generatedMasks;
      return this;
    }
    @Override
    public SegmentImageResponse build() {
      return new AutoValue_SegmentImageResponse(
          this.generatedMasks);
    }
  }

}
