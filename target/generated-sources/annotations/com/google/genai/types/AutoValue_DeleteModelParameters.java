package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteModelParameters extends DeleteModelParameters {

  private final Optional<String> model;

  private final Optional<DeleteModelConfig> config;

  private AutoValue_DeleteModelParameters(
      Optional<String> model,
      Optional<DeleteModelConfig> config) {
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
  public Optional<DeleteModelConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "DeleteModelParameters{"
        + "model=" + model + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteModelParameters) {
      DeleteModelParameters that = (DeleteModelParameters) o;
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
  public DeleteModelParameters.Builder toBuilder() {
    return new AutoValue_DeleteModelParameters.Builder(this);
  }

  static final class Builder extends DeleteModelParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<DeleteModelConfig> config = Optional.empty();
    Builder() {
    }
    Builder(DeleteModelParameters source) {
      this.model = source.model();
      this.config = source.config();
    }
    @Override
    public DeleteModelParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    DeleteModelParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public DeleteModelParameters.Builder config(DeleteModelConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    DeleteModelParameters.Builder config(Optional<DeleteModelConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public DeleteModelParameters build() {
      return new AutoValue_DeleteModelParameters(
          this.model,
          this.config);
    }
  }

}
