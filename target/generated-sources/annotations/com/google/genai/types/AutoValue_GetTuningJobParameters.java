package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetTuningJobParameters extends GetTuningJobParameters {

  private final Optional<String> name;

  private final Optional<GetTuningJobConfig> config;

  private AutoValue_GetTuningJobParameters(
      Optional<String> name,
      Optional<GetTuningJobConfig> config) {
    this.name = name;
    this.config = config;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("config")
  @Override
  public Optional<GetTuningJobConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "GetTuningJobParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetTuningJobParameters) {
      GetTuningJobParameters that = (GetTuningJobParameters) o;
      return this.name.equals(that.name())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public GetTuningJobParameters.Builder toBuilder() {
    return new AutoValue_GetTuningJobParameters.Builder(this);
  }

  static final class Builder extends GetTuningJobParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<GetTuningJobConfig> config = Optional.empty();
    Builder() {
    }
    Builder(GetTuningJobParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public GetTuningJobParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    GetTuningJobParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public GetTuningJobParameters.Builder config(GetTuningJobConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    GetTuningJobParameters.Builder config(Optional<GetTuningJobConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public GetTuningJobParameters build() {
      return new AutoValue_GetTuningJobParameters(
          this.name,
          this.config);
    }
  }

}
