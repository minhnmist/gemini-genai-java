package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LiveConnectParameters extends LiveConnectParameters {

  private final Optional<String> model;

  private final Optional<LiveConnectConfig> config;

  private AutoValue_LiveConnectParameters(
      Optional<String> model,
      Optional<LiveConnectConfig> config) {
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
  public Optional<LiveConnectConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "LiveConnectParameters{"
        + "model=" + model + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LiveConnectParameters) {
      LiveConnectParameters that = (LiveConnectParameters) o;
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
  public LiveConnectParameters.Builder toBuilder() {
    return new AutoValue_LiveConnectParameters.Builder(this);
  }

  static final class Builder extends LiveConnectParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<LiveConnectConfig> config = Optional.empty();
    Builder() {
    }
    Builder(LiveConnectParameters source) {
      this.model = source.model();
      this.config = source.config();
    }
    @Override
    public LiveConnectParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    LiveConnectParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public LiveConnectParameters.Builder config(LiveConnectConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    LiveConnectParameters.Builder config(Optional<LiveConnectConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public LiveConnectParameters build() {
      return new AutoValue_LiveConnectParameters(
          this.model,
          this.config);
    }
  }

}
