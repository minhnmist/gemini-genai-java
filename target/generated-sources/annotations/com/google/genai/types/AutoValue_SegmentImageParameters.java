package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SegmentImageParameters extends SegmentImageParameters {

  private final Optional<String> model;

  private final Optional<SegmentImageSource> source;

  private final Optional<SegmentImageConfig> config;

  private AutoValue_SegmentImageParameters(
      Optional<String> model,
      Optional<SegmentImageSource> source,
      Optional<SegmentImageConfig> config) {
    this.model = model;
    this.source = source;
    this.config = config;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
  }

  @JsonProperty("source")
  @Override
  public Optional<SegmentImageSource> source() {
    return source;
  }

  @JsonProperty("config")
  @Override
  public Optional<SegmentImageConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "SegmentImageParameters{"
        + "model=" + model + ", "
        + "source=" + source + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SegmentImageParameters) {
      SegmentImageParameters that = (SegmentImageParameters) o;
      return this.model.equals(that.model())
          && this.source.equals(that.source())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= model.hashCode();
    h$ *= 1000003;
    h$ ^= source.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public SegmentImageParameters.Builder toBuilder() {
    return new AutoValue_SegmentImageParameters.Builder(this);
  }

  static final class Builder extends SegmentImageParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<SegmentImageSource> source = Optional.empty();
    private Optional<SegmentImageConfig> config = Optional.empty();
    Builder() {
    }
    Builder(SegmentImageParameters source) {
      this.model = source.model();
      this.source = source.source();
      this.config = source.config();
    }
    @Override
    public SegmentImageParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    SegmentImageParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public SegmentImageParameters.Builder source(SegmentImageSource source) {
      this.source = Optional.of(source);
      return this;
    }
    @Override
    SegmentImageParameters.Builder source(Optional<SegmentImageSource> source) {
      if (source == null) {
        throw new NullPointerException("Null source");
      }
      this.source = source;
      return this;
    }
    @Override
    public SegmentImageParameters.Builder config(SegmentImageConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    SegmentImageParameters.Builder config(Optional<SegmentImageConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public SegmentImageParameters build() {
      return new AutoValue_SegmentImageParameters(
          this.model,
          this.source,
          this.config);
    }
  }

}
