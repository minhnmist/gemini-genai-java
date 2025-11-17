package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UpdateModelParameters extends UpdateModelParameters {

  private final Optional<String> model;

  private final Optional<UpdateModelConfig> config;

  private AutoValue_UpdateModelParameters(
      Optional<String> model,
      Optional<UpdateModelConfig> config) {
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
  public Optional<UpdateModelConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "UpdateModelParameters{"
        + "model=" + model + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateModelParameters) {
      UpdateModelParameters that = (UpdateModelParameters) o;
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
  public UpdateModelParameters.Builder toBuilder() {
    return new AutoValue_UpdateModelParameters.Builder(this);
  }

  static final class Builder extends UpdateModelParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<UpdateModelConfig> config = Optional.empty();
    Builder() {
    }
    Builder(UpdateModelParameters source) {
      this.model = source.model();
      this.config = source.config();
    }
    @Override
    public UpdateModelParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    UpdateModelParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public UpdateModelParameters.Builder config(UpdateModelConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    UpdateModelParameters.Builder config(Optional<UpdateModelConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public UpdateModelParameters build() {
      return new AutoValue_UpdateModelParameters(
          this.model,
          this.config);
    }
  }

}
