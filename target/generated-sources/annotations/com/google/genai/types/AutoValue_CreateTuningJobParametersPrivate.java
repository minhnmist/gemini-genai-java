package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateTuningJobParametersPrivate extends CreateTuningJobParametersPrivate {

  private final Optional<String> baseModel;

  private final Optional<PreTunedModel> preTunedModel;

  private final Optional<TuningDataset> trainingDataset;

  private final Optional<CreateTuningJobConfig> config;

  private AutoValue_CreateTuningJobParametersPrivate(
      Optional<String> baseModel,
      Optional<PreTunedModel> preTunedModel,
      Optional<TuningDataset> trainingDataset,
      Optional<CreateTuningJobConfig> config) {
    this.baseModel = baseModel;
    this.preTunedModel = preTunedModel;
    this.trainingDataset = trainingDataset;
    this.config = config;
  }

  @JsonProperty("baseModel")
  @Override
  public Optional<String> baseModel() {
    return baseModel;
  }

  @JsonProperty("preTunedModel")
  @Override
  public Optional<PreTunedModel> preTunedModel() {
    return preTunedModel;
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
    return "CreateTuningJobParametersPrivate{"
        + "baseModel=" + baseModel + ", "
        + "preTunedModel=" + preTunedModel + ", "
        + "trainingDataset=" + trainingDataset + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateTuningJobParametersPrivate) {
      CreateTuningJobParametersPrivate that = (CreateTuningJobParametersPrivate) o;
      return this.baseModel.equals(that.baseModel())
          && this.preTunedModel.equals(that.preTunedModel())
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
    h$ ^= preTunedModel.hashCode();
    h$ *= 1000003;
    h$ ^= trainingDataset.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public CreateTuningJobParametersPrivate.Builder toBuilder() {
    return new AutoValue_CreateTuningJobParametersPrivate.Builder(this);
  }

  static final class Builder extends CreateTuningJobParametersPrivate.Builder {
    private Optional<String> baseModel = Optional.empty();
    private Optional<PreTunedModel> preTunedModel = Optional.empty();
    private Optional<TuningDataset> trainingDataset = Optional.empty();
    private Optional<CreateTuningJobConfig> config = Optional.empty();
    Builder() {
    }
    Builder(CreateTuningJobParametersPrivate source) {
      this.baseModel = source.baseModel();
      this.preTunedModel = source.preTunedModel();
      this.trainingDataset = source.trainingDataset();
      this.config = source.config();
    }
    @Override
    public CreateTuningJobParametersPrivate.Builder baseModel(String baseModel) {
      this.baseModel = Optional.of(baseModel);
      return this;
    }
    @Override
    CreateTuningJobParametersPrivate.Builder baseModel(Optional<String> baseModel) {
      if (baseModel == null) {
        throw new NullPointerException("Null baseModel");
      }
      this.baseModel = baseModel;
      return this;
    }
    @Override
    public CreateTuningJobParametersPrivate.Builder preTunedModel(PreTunedModel preTunedModel) {
      this.preTunedModel = Optional.of(preTunedModel);
      return this;
    }
    @Override
    CreateTuningJobParametersPrivate.Builder preTunedModel(Optional<PreTunedModel> preTunedModel) {
      if (preTunedModel == null) {
        throw new NullPointerException("Null preTunedModel");
      }
      this.preTunedModel = preTunedModel;
      return this;
    }
    @Override
    public CreateTuningJobParametersPrivate.Builder trainingDataset(TuningDataset trainingDataset) {
      this.trainingDataset = Optional.of(trainingDataset);
      return this;
    }
    @Override
    CreateTuningJobParametersPrivate.Builder trainingDataset(Optional<TuningDataset> trainingDataset) {
      if (trainingDataset == null) {
        throw new NullPointerException("Null trainingDataset");
      }
      this.trainingDataset = trainingDataset;
      return this;
    }
    @Override
    public CreateTuningJobParametersPrivate.Builder config(CreateTuningJobConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    CreateTuningJobParametersPrivate.Builder config(Optional<CreateTuningJobConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public CreateTuningJobParametersPrivate build() {
      return new AutoValue_CreateTuningJobParametersPrivate(
          this.baseModel,
          this.preTunedModel,
          this.trainingDataset,
          this.config);
    }
  }

}
