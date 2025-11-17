package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateTuningJobParameters extends CreateTuningJobParameters {

  private final Optional<String> baseModel;

  private final Optional<TuningDataset> trainingDataset;

  private final Optional<CreateTuningJobConfig> config;

  private AutoValue_CreateTuningJobParameters(
      Optional<String> baseModel,
      Optional<TuningDataset> trainingDataset,
      Optional<CreateTuningJobConfig> config) {
    this.baseModel = baseModel;
    this.trainingDataset = trainingDataset;
    this.config = config;
  }

  @JsonProperty("baseModel")
  @Override
  public Optional<String> baseModel() {
    return baseModel;
  }

  @JsonProperty("trainingDataset")
  @Override
  public Optional<TuningDataset> trainingDataset() {
    return trainingDataset;
  }

  @JsonProperty("config")
  @Override
  public Optional<CreateTuningJobConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "CreateTuningJobParameters{"
        + "baseModel=" + baseModel + ", "
        + "trainingDataset=" + trainingDataset + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateTuningJobParameters) {
      CreateTuningJobParameters that = (CreateTuningJobParameters) o;
      return this.baseModel.equals(that.baseModel())
          && this.trainingDataset.equals(that.trainingDataset())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= baseModel.hashCode();
    h$ *= 1000003;
    h$ ^= trainingDataset.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public CreateTuningJobParameters.Builder toBuilder() {
    return new AutoValue_CreateTuningJobParameters.Builder(this);
  }

  static final class Builder extends CreateTuningJobParameters.Builder {
    private Optional<String> baseModel = Optional.empty();
    private Optional<TuningDataset> trainingDataset = Optional.empty();
    private Optional<CreateTuningJobConfig> config = Optional.empty();
    Builder() {
    }
    Builder(CreateTuningJobParameters source) {
      this.baseModel = source.baseModel();
      this.trainingDataset = source.trainingDataset();
      this.config = source.config();
    }
    @Override
    public CreateTuningJobParameters.Builder baseModel(String baseModel) {
      this.baseModel = Optional.of(baseModel);
      return this;
    }
    @Override
    CreateTuningJobParameters.Builder baseModel(Optional<String> baseModel) {
      if (baseModel == null) {
        throw new NullPointerException("Null baseModel");
      }
      this.baseModel = baseModel;
      return this;
    }
    @Override
    public CreateTuningJobParameters.Builder trainingDataset(TuningDataset trainingDataset) {
      this.trainingDataset = Optional.of(trainingDataset);
      return this;
    }
    @Override
    CreateTuningJobParameters.Builder trainingDataset(Optional<TuningDataset> trainingDataset) {
      if (trainingDataset == null) {
        throw new NullPointerException("Null trainingDataset");
      }
      this.trainingDataset = trainingDataset;
      return this;
    }
    @Override
    public CreateTuningJobParameters.Builder config(CreateTuningJobConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    CreateTuningJobParameters.Builder config(Optional<CreateTuningJobConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public CreateTuningJobParameters build() {
      return new AutoValue_CreateTuningJobParameters(
          this.baseModel,
          this.trainingDataset,
          this.config);
    }
  }

}
