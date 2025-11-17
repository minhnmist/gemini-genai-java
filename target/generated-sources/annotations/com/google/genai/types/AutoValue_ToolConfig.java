package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ToolConfig extends ToolConfig {

  private final Optional<FunctionCallingConfig> functionCallingConfig;

  private final Optional<RetrievalConfig> retrievalConfig;

  private AutoValue_ToolConfig(
      Optional<FunctionCallingConfig> functionCallingConfig,
      Optional<RetrievalConfig> retrievalConfig) {
    this.functionCallingConfig = functionCallingConfig;
    this.retrievalConfig = retrievalConfig;
  }

  @JsonProperty("functionCallingConfig")
  @Override
  public Optional<FunctionCallingConfig> functionCallingConfig() {
    return functionCallingConfig;
  }

  @JsonProperty("retrievalConfig")
  @Override
  public Optional<RetrievalConfig> retrievalConfig() {
    return retrievalConfig;
  }

  @Override
  public String toString() {
    return "ToolConfig{"
        + "functionCallingConfig=" + functionCallingConfig + ", "
        + "retrievalConfig=" + retrievalConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToolConfig) {
      ToolConfig that = (ToolConfig) o;
      return this.functionCallingConfig.equals(that.functionCallingConfig())
          && this.retrievalConfig.equals(that.retrievalConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= functionCallingConfig.hashCode();
    h$ *= 1000003;
    h$ ^= retrievalConfig.hashCode();
    return h$;
  }

  @Override
  public ToolConfig.Builder toBuilder() {
    return new AutoValue_ToolConfig.Builder(this);
  }

  static final class Builder extends ToolConfig.Builder {
    private Optional<FunctionCallingConfig> functionCallingConfig = Optional.empty();
    private Optional<RetrievalConfig> retrievalConfig = Optional.empty();
    Builder() {
    }
    Builder(ToolConfig source) {
      this.functionCallingConfig = source.functionCallingConfig();
      this.retrievalConfig = source.retrievalConfig();
    }
    @Override
    public ToolConfig.Builder functionCallingConfig(FunctionCallingConfig functionCallingConfig) {
      this.functionCallingConfig = Optional.of(functionCallingConfig);
      return this;
    }
    @Override
    ToolConfig.Builder functionCallingConfig(Optional<FunctionCallingConfig> functionCallingConfig) {
      if (functionCallingConfig == null) {
        throw new NullPointerException("Null functionCallingConfig");
      }
      this.functionCallingConfig = functionCallingConfig;
      return this;
    }
    @Override
    public ToolConfig.Builder retrievalConfig(RetrievalConfig retrievalConfig) {
      this.retrievalConfig = Optional.of(retrievalConfig);
      return this;
    }
    @Override
    ToolConfig.Builder retrievalConfig(Optional<RetrievalConfig> retrievalConfig) {
      if (retrievalConfig == null) {
        throw new NullPointerException("Null retrievalConfig");
      }
      this.retrievalConfig = retrievalConfig;
      return this;
    }
    @Override
    public ToolConfig build() {
      return new AutoValue_ToolConfig(
          this.functionCallingConfig,
          this.retrievalConfig);
    }
  }

}
