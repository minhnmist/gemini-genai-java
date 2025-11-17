package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AutoraterConfig extends AutoraterConfig {

  private final Optional<Integer> samplingCount;

  private final Optional<String> autoraterModel;

  private final Optional<GenerationConfig> generationConfig;

  private AutoValue_AutoraterConfig(
      Optional<Integer> samplingCount,
      Optional<String> autoraterModel,
      Optional<GenerationConfig> generationConfig) {
    this.samplingCount = samplingCount;
    this.autoraterModel = autoraterModel;
    this.generationConfig = generationConfig;
  }

  @JsonProperty("samplingCount")
  @Override
  public Optional<Integer> samplingCount() {
    return samplingCount;
  }

  @JsonProperty("autoraterModel")
  @Override
  public Optional<String> autoraterModel() {
    return autoraterModel;
  }

  @JsonProperty("generationConfig")
  @Override
  public Optional<GenerationConfig> generationConfig() {
    return generationConfig;
  }

  @Override
  public String toString() {
    return "AutoraterConfig{"
        + "samplingCount=" + samplingCount + ", "
        + "autoraterModel=" + autoraterModel + ", "
        + "generationConfig=" + generationConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AutoraterConfig) {
      AutoraterConfig that = (AutoraterConfig) o;
      return this.samplingCount.equals(that.samplingCount())
          && this.autoraterModel.equals(that.autoraterModel())
          && this.generationConfig.equals(that.generationConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= samplingCount.hashCode();
    h$ *= 1000003;
    h$ ^= autoraterModel.hashCode();
    h$ *= 1000003;
    h$ ^= generationConfig.hashCode();
    return h$;
  }

  @Override
  public AutoraterConfig.Builder toBuilder() {
    return new AutoValue_AutoraterConfig.Builder(this);
  }

  static final class Builder extends AutoraterConfig.Builder {
    private Optional<Integer> samplingCount = Optional.empty();
    private Optional<String> autoraterModel = Optional.empty();
    private Optional<GenerationConfig> generationConfig = Optional.empty();
    Builder() {
    }
    Builder(AutoraterConfig source) {
      this.samplingCount = source.samplingCount();
      this.autoraterModel = source.autoraterModel();
      this.generationConfig = source.generationConfig();
    }
    @Override
    public AutoraterConfig.Builder samplingCount(Integer samplingCount) {
      this.samplingCount = Optional.of(samplingCount);
      return this;
    }
    @Override
    AutoraterConfig.Builder samplingCount(Optional<Integer> samplingCount) {
      if (samplingCount == null) {
        throw new NullPointerException("Null samplingCount");
      }
      this.samplingCount = samplingCount;
      return this;
    }
    @Override
    public AutoraterConfig.Builder autoraterModel(String autoraterModel) {
      this.autoraterModel = Optional.of(autoraterModel);
      return this;
    }
    @Override
    AutoraterConfig.Builder autoraterModel(Optional<String> autoraterModel) {
      if (autoraterModel == null) {
        throw new NullPointerException("Null autoraterModel");
      }
      this.autoraterModel = autoraterModel;
      return this;
    }
    @Override
    public AutoraterConfig.Builder generationConfig(GenerationConfig generationConfig) {
      this.generationConfig = Optional.of(generationConfig);
      return this;
    }
    @Override
    AutoraterConfig.Builder generationConfig(Optional<GenerationConfig> generationConfig) {
      if (generationConfig == null) {
        throw new NullPointerException("Null generationConfig");
      }
      this.generationConfig = generationConfig;
      return this;
    }
    @Override
    public AutoraterConfig build() {
      return new AutoValue_AutoraterConfig(
          this.samplingCount,
          this.autoraterModel,
          this.generationConfig);
    }
  }

}
