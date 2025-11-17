package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CountTokensParameters extends CountTokensParameters {

  private final Optional<String> model;

  private final Optional<List<Content>> contents;

  private final Optional<CountTokensConfig> config;

  private AutoValue_CountTokensParameters(
      Optional<String> model,
      Optional<List<Content>> contents,
      Optional<CountTokensConfig> config) {
    this.model = model;
    this.contents = contents;
    this.config = config;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
  }

  @JsonProperty("contents")
  @Override
  public Optional<List<Content>> contents() {
    return contents;
  }

  @JsonProperty("config")
  @Override
  public Optional<CountTokensConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "CountTokensParameters{"
        + "model=" + model + ", "
        + "contents=" + contents + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CountTokensParameters) {
      CountTokensParameters that = (CountTokensParameters) o;
      return this.model.equals(that.model())
          && this.contents.equals(that.contents())
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
    h$ ^= contents.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public CountTokensParameters.Builder toBuilder() {
    return new AutoValue_CountTokensParameters.Builder(this);
  }

  static final class Builder extends CountTokensParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<List<Content>> contents = Optional.empty();
    private Optional<CountTokensConfig> config = Optional.empty();
    Builder() {
    }
    Builder(CountTokensParameters source) {
      this.model = source.model();
      this.contents = source.contents();
      this.config = source.config();
    }
    @Override
    public CountTokensParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    CountTokensParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public CountTokensParameters.Builder contents(List<Content> contents) {
      this.contents = Optional.of(contents);
      return this;
    }
    @Override
    CountTokensParameters.Builder contents(Optional<List<Content>> contents) {
      if (contents == null) {
        throw new NullPointerException("Null contents");
      }
      this.contents = contents;
      return this;
    }
    @Override
    public CountTokensParameters.Builder config(CountTokensConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    CountTokensParameters.Builder config(Optional<CountTokensConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public CountTokensParameters build() {
      return new AutoValue_CountTokensParameters(
          this.model,
          this.contents,
          this.config);
    }
  }

}
