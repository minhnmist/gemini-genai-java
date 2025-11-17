package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RecontextImageParameters extends RecontextImageParameters {

  private final Optional<String> model;

  private final Optional<RecontextImageSource> source;

  private final Optional<RecontextImageConfig> config;

  private AutoValue_RecontextImageParameters(
      Optional<String> model,
      Optional<RecontextImageSource> source,
      Optional<RecontextImageConfig> config) {
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
  public Optional<RecontextImageSource> source() {
    return source;
  }

  @JsonProperty("config")
  @Override
  public Optional<RecontextImageConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "RecontextImageParameters{"
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
    if (o instanceof RecontextImageParameters) {
      RecontextImageParameters that = (RecontextImageParameters) o;
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
  public RecontextImageParameters.Builder toBuilder() {
    return new AutoValue_RecontextImageParameters.Builder(this);
  }

  static final class Builder extends RecontextImageParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<RecontextImageSource> source = Optional.empty();
    private Optional<RecontextImageConfig> config = Optional.empty();
    Builder() {
    }
    Builder(RecontextImageParameters source) {
      this.model = source.model();
      this.source = source.source();
      this.config = source.config();
    }
    @Override
    public RecontextImageParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    RecontextImageParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public RecontextImageParameters.Builder source(RecontextImageSource source) {
      this.source = Optional.of(source);
      return this;
    }
    @Override
    RecontextImageParameters.Builder source(Optional<RecontextImageSource> source) {
      if (source == null) {
        throw new NullPointerException("Null source");
      }
      this.source = source;
      return this;
    }
    @Override
    public RecontextImageParameters.Builder config(RecontextImageConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    RecontextImageParameters.Builder config(Optional<RecontextImageConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public RecontextImageParameters build() {
      return new AutoValue_RecontextImageParameters(
          this.model,
          this.source,
          this.config);
    }
  }

}
