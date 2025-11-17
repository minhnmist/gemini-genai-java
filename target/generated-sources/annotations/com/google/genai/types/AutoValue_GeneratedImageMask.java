package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GeneratedImageMask extends GeneratedImageMask {

  private final Optional<Image> mask;

  private final Optional<List<EntityLabel>> labels;

  private AutoValue_GeneratedImageMask(
      Optional<Image> mask,
      Optional<List<EntityLabel>> labels) {
    this.mask = mask;
    this.labels = labels;
  }

  @JsonProperty("mask")
  @Override
  public Optional<Image> mask() {
    return mask;
  }

  @JsonProperty("labels")
  @Override
  public Optional<List<EntityLabel>> labels() {
    return labels;
  }

  @Override
  public String toString() {
    return "GeneratedImageMask{"
        + "mask=" + mask + ", "
        + "labels=" + labels
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GeneratedImageMask) {
      GeneratedImageMask that = (GeneratedImageMask) o;
      return this.mask.equals(that.mask())
          && this.labels.equals(that.labels());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= mask.hashCode();
    h$ *= 1000003;
    h$ ^= labels.hashCode();
    return h$;
  }

  @Override
  public GeneratedImageMask.Builder toBuilder() {
    return new AutoValue_GeneratedImageMask.Builder(this);
  }

  static final class Builder extends GeneratedImageMask.Builder {
    private Optional<Image> mask = Optional.empty();
    private Optional<List<EntityLabel>> labels = Optional.empty();
    Builder() {
    }
    Builder(GeneratedImageMask source) {
      this.mask = source.mask();
      this.labels = source.labels();
    }
    @Override
    public GeneratedImageMask.Builder mask(Image mask) {
      this.mask = Optional.of(mask);
      return this;
    }
    @Override
    GeneratedImageMask.Builder mask(Optional<Image> mask) {
      if (mask == null) {
        throw new NullPointerException("Null mask");
      }
      this.mask = mask;
      return this;
    }
    @Override
    public GeneratedImageMask.Builder labels(List<EntityLabel> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    GeneratedImageMask.Builder labels(Optional<List<EntityLabel>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public GeneratedImageMask build() {
      return new AutoValue_GeneratedImageMask(
          this.mask,
          this.labels);
    }
  }

}
