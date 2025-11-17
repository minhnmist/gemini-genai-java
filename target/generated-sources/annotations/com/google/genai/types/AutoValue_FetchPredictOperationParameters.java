package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FetchPredictOperationParameters extends FetchPredictOperationParameters {

  private final Optional<String> operationName;

  private final Optional<String> resourceName;

  private final Optional<FetchPredictOperationConfig> config;

  private AutoValue_FetchPredictOperationParameters(
      Optional<String> operationName,
      Optional<String> resourceName,
      Optional<FetchPredictOperationConfig> config) {
    this.operationName = operationName;
    this.resourceName = resourceName;
    this.config = config;
  }

  @JsonProperty("operationName")
  @Override
  public Optional<String> operationName() {
    return operationName;
  }

  @JsonProperty("resourceName")
  @Override
  public Optional<String> resourceName() {
    return resourceName;
  }

  @JsonProperty("config")
  @Override
  public Optional<FetchPredictOperationConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "FetchPredictOperationParameters{"
        + "operationName=" + operationName + ", "
        + "resourceName=" + resourceName + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FetchPredictOperationParameters) {
      FetchPredictOperationParameters that = (FetchPredictOperationParameters) o;
      return this.operationName.equals(that.operationName())
          && this.resourceName.equals(that.resourceName())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= operationName.hashCode();
    h$ *= 1000003;
    h$ ^= resourceName.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public FetchPredictOperationParameters.Builder toBuilder() {
    return new AutoValue_FetchPredictOperationParameters.Builder(this);
  }

  static final class Builder extends FetchPredictOperationParameters.Builder {
    private Optional<String> operationName = Optional.empty();
    private Optional<String> resourceName = Optional.empty();
    private Optional<FetchPredictOperationConfig> config = Optional.empty();
    Builder() {
    }
    Builder(FetchPredictOperationParameters source) {
      this.operationName = source.operationName();
      this.resourceName = source.resourceName();
      this.config = source.config();
    }
    @Override
    public FetchPredictOperationParameters.Builder operationName(String operationName) {
      this.operationName = Optional.of(operationName);
      return this;
    }
    @Override
    FetchPredictOperationParameters.Builder operationName(Optional<String> operationName) {
      if (operationName == null) {
        throw new NullPointerException("Null operationName");
      }
      this.operationName = operationName;
      return this;
    }
    @Override
    public FetchPredictOperationParameters.Builder resourceName(String resourceName) {
      this.resourceName = Optional.of(resourceName);
      return this;
    }
    @Override
    FetchPredictOperationParameters.Builder resourceName(Optional<String> resourceName) {
      if (resourceName == null) {
        throw new NullPointerException("Null resourceName");
      }
      this.resourceName = resourceName;
      return this;
    }
    @Override
    public FetchPredictOperationParameters.Builder config(FetchPredictOperationConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    FetchPredictOperationParameters.Builder config(Optional<FetchPredictOperationConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public FetchPredictOperationParameters build() {
      return new AutoValue_FetchPredictOperationParameters(
          this.operationName,
          this.resourceName,
          this.config);
    }
  }

}
