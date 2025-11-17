package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateCachedContentParameters extends CreateCachedContentParameters {

  private final Optional<String> model;

  private final Optional<CreateCachedContentConfig> config;

  private AutoValue_CreateCachedContentParameters(
      Optional<String> model,
      Optional<CreateCachedContentConfig> config) {
    this.model = model;
    this.config = config;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
  }

  @JsonProperty("config")
  @Override
  public Optional<CreateCachedContentConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "CreateCachedContentParameters{"
        + "model=" + model + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateCachedContentParameters) {
      CreateCachedContentParameters that = (CreateCachedContentParameters) o;
      return this.model.equals(that.model())
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
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public CreateCachedContentParameters.Builder toBuilder() {
    return new AutoValue_CreateCachedContentParameters.Builder(this);
  }

  static final class Builder extends CreateCachedContentParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<CreateCachedContentConfig> config = Optional.empty();
    Builder() {
    }
    Builder(CreateCachedContentParameters source) {
      this.model = source.model();
      this.config = source.config();
    }
    @Override
    public CreateCachedContentParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    CreateCachedContentParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public CreateCachedContentParameters.Builder config(CreateCachedContentConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    CreateCachedContentParameters.Builder config(Optional<CreateCachedContentConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public CreateCachedContentParameters build() {
      return new AutoValue_CreateCachedContentParameters(
          this.model,
          this.config);
    }
  }

}
