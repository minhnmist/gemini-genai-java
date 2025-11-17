package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetBatchJobParameters extends GetBatchJobParameters {

  private final Optional<String> name;

  private final Optional<GetBatchJobConfig> config;

  private AutoValue_GetBatchJobParameters(
      Optional<String> name,
      Optional<GetBatchJobConfig> config) {
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
  public Optional<GetBatchJobConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "GetBatchJobParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetBatchJobParameters) {
      GetBatchJobParameters that = (GetBatchJobParameters) o;
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
  public GetBatchJobParameters.Builder toBuilder() {
    return new AutoValue_GetBatchJobParameters.Builder(this);
  }

  static final class Builder extends GetBatchJobParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<GetBatchJobConfig> config = Optional.empty();
    Builder() {
    }
    Builder(GetBatchJobParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public GetBatchJobParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    GetBatchJobParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public GetBatchJobParameters.Builder config(GetBatchJobConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    GetBatchJobParameters.Builder config(Optional<GetBatchJobConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public GetBatchJobParameters build() {
      return new AutoValue_GetBatchJobParameters(
          this.name,
          this.config);
    }
  }

}
