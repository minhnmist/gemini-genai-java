package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetOperationParameters extends GetOperationParameters {

  private final Optional<String> operationName;

  private final Optional<GetOperationConfig> config;

  private AutoValue_GetOperationParameters(
      Optional<String> operationName,
      Optional<GetOperationConfig> config) {
    this.operationName = operationName;
    this.config = config;
  }

  @JsonProperty("operationName")
  @Override
  public Optional<String> operationName() {
    return operationName;
  }

  @JsonProperty("config")
  @Override
  public Optional<GetOperationConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "GetOperationParameters{"
        + "operationName=" + operationName + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetOperationParameters) {
      GetOperationParameters that = (GetOperationParameters) o;
      return this.operationName.equals(that.operationName())
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
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public GetOperationParameters.Builder toBuilder() {
    return new AutoValue_GetOperationParameters.Builder(this);
  }

  static final class Builder extends GetOperationParameters.Builder {
    private Optional<String> operationName = Optional.empty();
    private Optional<GetOperationConfig> config = Optional.empty();
    Builder() {
    }
    Builder(GetOperationParameters source) {
      this.operationName = source.operationName();
      this.config = source.config();
    }
    @Override
    public GetOperationParameters.Builder operationName(String operationName) {
      this.operationName = Optional.of(operationName);
      return this;
    }
    @Override
    GetOperationParameters.Builder operationName(Optional<String> operationName) {
      if (operationName == null) {
        throw new NullPointerException("Null operationName");
      }
      this.operationName = operationName;
      return this;
    }
    @Override
    public GetOperationParameters.Builder config(GetOperationConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    GetOperationParameters.Builder config(Optional<GetOperationConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public GetOperationParameters build() {
      return new AutoValue_GetOperationParameters(
          this.operationName,
          this.config);
    }
  }

}
