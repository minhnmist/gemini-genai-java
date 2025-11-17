package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CancelBatchJobParameters extends CancelBatchJobParameters {

  private final Optional<String> name;

  private final Optional<CancelBatchJobConfig> config;

  private AutoValue_CancelBatchJobParameters(
      Optional<String> name,
      Optional<CancelBatchJobConfig> config) {
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
  public Optional<CancelBatchJobConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "CancelBatchJobParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CancelBatchJobParameters) {
      CancelBatchJobParameters that = (CancelBatchJobParameters) o;
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
  public CancelBatchJobParameters.Builder toBuilder() {
    return new AutoValue_CancelBatchJobParameters.Builder(this);
  }

  static final class Builder extends CancelBatchJobParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<CancelBatchJobConfig> config = Optional.empty();
    Builder() {
    }
    Builder(CancelBatchJobParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public CancelBatchJobParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    CancelBatchJobParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public CancelBatchJobParameters.Builder config(CancelBatchJobConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    CancelBatchJobParameters.Builder config(Optional<CancelBatchJobConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public CancelBatchJobParameters build() {
      return new AutoValue_CancelBatchJobParameters(
          this.name,
          this.config);
    }
  }

}
