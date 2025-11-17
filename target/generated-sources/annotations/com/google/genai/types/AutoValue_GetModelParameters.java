package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetModelParameters extends GetModelParameters {

  private final Optional<String> model;

  private final Optional<GetModelConfig> config;

  private AutoValue_GetModelParameters(
      Optional<String> model,
      Optional<GetModelConfig> config) {
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
  public Optional<GetModelConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "GetModelParameters{"
        + "model=" + model + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetModelParameters) {
      GetModelParameters that = (GetModelParameters) o;
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
  public GetModelParameters.Builder toBuilder() {
    return new AutoValue_GetModelParameters.Builder(this);
  }

  static final class Builder extends GetModelParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<GetModelConfig> config = Optional.empty();
    Builder() {
    }
    Builder(GetModelParameters source) {
      this.model = source.model();
      this.config = source.config();
    }
    @Override
    public GetModelParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    GetModelParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public GetModelParameters.Builder config(GetModelConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    GetModelParameters.Builder config(Optional<GetModelConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public GetModelParameters build() {
      return new AutoValue_GetModelParameters(
          this.model,
          this.config);
    }
  }

}
