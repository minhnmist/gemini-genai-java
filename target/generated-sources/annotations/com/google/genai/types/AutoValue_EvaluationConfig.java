package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EvaluationConfig extends EvaluationConfig {

  private final Optional<List<Metric>> metrics;

  private final Optional<OutputConfig> outputConfig;

  private final Optional<AutoraterConfig> autoraterConfig;

  private AutoValue_EvaluationConfig(
      Optional<List<Metric>> metrics,
      Optional<OutputConfig> outputConfig,
      Optional<AutoraterConfig> autoraterConfig) {
    this.metrics = metrics;
    this.outputConfig = outputConfig;
    this.autoraterConfig = autoraterConfig;
  }

  @JsonProperty("metrics")
  @Override
  public Optional<List<Metric>> metrics() {
    return metrics;
  }

  @JsonProperty("outputConfig")
  @Override
  public Optional<OutputConfig> outputConfig() {
    return outputConfig;
  }

  @JsonProperty("autoraterConfig")
  @Override
  public Optional<AutoraterConfig> autoraterConfig() {
    return autoraterConfig;
  }

  @Override
  public String toString() {
    return "EvaluationConfig{"
        + "metrics=" + metrics + ", "
        + "outputConfig=" + outputConfig + ", "
        + "autoraterConfig=" + autoraterConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EvaluationConfig) {
      EvaluationConfig that = (EvaluationConfig) o;
      return this.metrics.equals(that.metrics())
          && this.outputConfig.equals(that.outputConfig())
          && this.autoraterConfig.equals(that.autoraterConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= metrics.hashCode();
    h$ *= 1000003;
    h$ ^= outputConfig.hashCode();
    h$ *= 1000003;
    h$ ^= autoraterConfig.hashCode();
    return h$;
  }

  @Override
  public EvaluationConfig.Builder toBuilder() {
    return new AutoValue_EvaluationConfig.Builder(this);
  }

  static final class Builder extends EvaluationConfig.Builder {
    private Optional<List<Metric>> metrics = Optional.empty();
    private Optional<OutputConfig> outputConfig = Optional.empty();
    private Optional<AutoraterConfig> autoraterConfig = Optional.empty();
    Builder() {
    }
    Builder(EvaluationConfig source) {
      this.metrics = source.metrics();
      this.outputConfig = source.outputConfig();
      this.autoraterConfig = source.autoraterConfig();
    }
    @Override
    public EvaluationConfig.Builder metrics(List<Metric> metrics) {
      this.metrics = Optional.of(metrics);
      return this;
    }
    @Override
    EvaluationConfig.Builder metrics(Optional<List<Metric>> metrics) {
      if (metrics == null) {
        throw new NullPointerException("Null metrics");
      }
      this.metrics = metrics;
      return this;
    }
    @Override
    public EvaluationConfig.Builder outputConfig(OutputConfig outputConfig) {
      this.outputConfig = Optional.of(outputConfig);
      return this;
    }
    @Override
    EvaluationConfig.Builder outputConfig(Optional<OutputConfig> outputConfig) {
      if (outputConfig == null) {
        throw new NullPointerException("Null outputConfig");
      }
      this.outputConfig = outputConfig;
      return this;
    }
    @Override
    public EvaluationConfig.Builder autoraterConfig(AutoraterConfig autoraterConfig) {
      this.autoraterConfig = Optional.of(autoraterConfig);
      return this;
    }
    @Override
    EvaluationConfig.Builder autoraterConfig(Optional<AutoraterConfig> autoraterConfig) {
      if (autoraterConfig == null) {
        throw new NullPointerException("Null autoraterConfig");
      }
      this.autoraterConfig = autoraterConfig;
      return this;
    }
    @Override
    public EvaluationConfig build() {
      return new AutoValue_EvaluationConfig(
          this.metrics,
          this.outputConfig,
          this.autoraterConfig);
    }
  }

}
