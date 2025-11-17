package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SupervisedTuningSpec extends SupervisedTuningSpec {

  private final Optional<Boolean> exportLastCheckpointOnly;

  private final Optional<SupervisedHyperParameters> hyperParameters;

  private final Optional<String> trainingDatasetUri;

  private final Optional<TuningMode> tuningMode;

  private final Optional<String> validationDatasetUri;

  private AutoValue_SupervisedTuningSpec(
      Optional<Boolean> exportLastCheckpointOnly,
      Optional<SupervisedHyperParameters> hyperParameters,
      Optional<String> trainingDatasetUri,
      Optional<TuningMode> tuningMode,
      Optional<String> validationDatasetUri) {
    this.exportLastCheckpointOnly = exportLastCheckpointOnly;
    this.hyperParameters = hyperParameters;
    this.trainingDatasetUri = trainingDatasetUri;
    this.tuningMode = tuningMode;
    this.validationDatasetUri = validationDatasetUri;
  }

  @JsonProperty("exportLastCheckpointOnly")
  @Override
  public Optional<Boolean> exportLastCheckpointOnly() {
    return exportLastCheckpointOnly;
  }

  @JsonProperty("hyperParameters")
  @Override
  public Optional<SupervisedHyperParameters> hyperParameters() {
    return hyperParameters;
  }

  @JsonProperty("trainingDatasetUri")
  @Override
  public Optional<String> trainingDatasetUri() {
    return trainingDatasetUri;
  }

  @JsonProperty("tuningMode")
  @Override
  public Optional<TuningMode> tuningMode() {
    return tuningMode;
  }

  @JsonProperty("validationDatasetUri")
  @Override
  public Optional<String> validationDatasetUri() {
    return validationDatasetUri;
  }

  @Override
  public String toString() {
    return "SupervisedTuningSpec{"
        + "exportLastCheckpointOnly=" + exportLastCheckpointOnly + ", "
        + "hyperParameters=" + hyperParameters + ", "
        + "trainingDatasetUri=" + trainingDatasetUri + ", "
        + "tuningMode=" + tuningMode + ", "
        + "validationDatasetUri=" + validationDatasetUri
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SupervisedTuningSpec) {
      SupervisedTuningSpec that = (SupervisedTuningSpec) o;
      return this.exportLastCheckpointOnly.equals(that.exportLastCheckpointOnly())
          && this.hyperParameters.equals(that.hyperParameters())
          && this.trainingDatasetUri.equals(that.trainingDatasetUri())
          && this.tuningMode.equals(that.tuningMode())
          && this.validationDatasetUri.equals(that.validationDatasetUri());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= exportLastCheckpointOnly.hashCode();
    h$ *= 1000003;
    h$ ^= hyperParameters.hashCode();
    h$ *= 1000003;
    h$ ^= trainingDatasetUri.hashCode();
    h$ *= 1000003;
    h$ ^= tuningMode.hashCode();
    h$ *= 1000003;
    h$ ^= validationDatasetUri.hashCode();
    return h$;
  }

  @Override
  public SupervisedTuningSpec.Builder toBuilder() {
    return new AutoValue_SupervisedTuningSpec.Builder(this);
  }

  static final class Builder extends SupervisedTuningSpec.Builder {
    private Optional<Boolean> exportLastCheckpointOnly = Optional.empty();
    private Optional<SupervisedHyperParameters> hyperParameters = Optional.empty();
    private Optional<String> trainingDatasetUri = Optional.empty();
    private Optional<TuningMode> tuningMode = Optional.empty();
    private Optional<String> validationDatasetUri = Optional.empty();
    Builder() {
    }
    Builder(SupervisedTuningSpec source) {
      this.exportLastCheckpointOnly = source.exportLastCheckpointOnly();
      this.hyperParameters = source.hyperParameters();
      this.trainingDatasetUri = source.trainingDatasetUri();
      this.tuningMode = source.tuningMode();
      this.validationDatasetUri = source.validationDatasetUri();
    }
    @Override
    public SupervisedTuningSpec.Builder exportLastCheckpointOnly(boolean exportLastCheckpointOnly) {
      this.exportLastCheckpointOnly = Optional.of(exportLastCheckpointOnly);
      return this;
    }
    @Override
    SupervisedTuningSpec.Builder exportLastCheckpointOnly(Optional<Boolean> exportLastCheckpointOnly) {
      if (exportLastCheckpointOnly == null) {
        throw new NullPointerException("Null exportLastCheckpointOnly");
      }
      this.exportLastCheckpointOnly = exportLastCheckpointOnly;
      return this;
    }
    @Override
    public SupervisedTuningSpec.Builder hyperParameters(SupervisedHyperParameters hyperParameters) {
      this.hyperParameters = Optional.of(hyperParameters);
      return this;
    }
    @Override
    SupervisedTuningSpec.Builder hyperParameters(Optional<SupervisedHyperParameters> hyperParameters) {
      if (hyperParameters == null) {
        throw new NullPointerException("Null hyperParameters");
      }
      this.hyperParameters = hyperParameters;
      return this;
    }
    @Override
    public SupervisedTuningSpec.Builder trainingDatasetUri(String trainingDatasetUri) {
      this.trainingDatasetUri = Optional.of(trainingDatasetUri);
      return this;
    }
    @Override
    SupervisedTuningSpec.Builder trainingDatasetUri(Optional<String> trainingDatasetUri) {
      if (trainingDatasetUri == null) {
        throw new NullPointerException("Null trainingDatasetUri");
      }
      this.trainingDatasetUri = trainingDatasetUri;
      return this;
    }
    @Override
    public SupervisedTuningSpec.Builder tuningMode(TuningMode tuningMode) {
      this.tuningMode = Optional.of(tuningMode);
      return this;
    }
    @Override
    SupervisedTuningSpec.Builder tuningMode(Optional<TuningMode> tuningMode) {
      if (tuningMode == null) {
        throw new NullPointerException("Null tuningMode");
      }
      this.tuningMode = tuningMode;
      return this;
    }
    @Override
    public SupervisedTuningSpec.Builder validationDatasetUri(String validationDatasetUri) {
      this.validationDatasetUri = Optional.of(validationDatasetUri);
      return this;
    }
    @Override
    SupervisedTuningSpec.Builder validationDatasetUri(Optional<String> validationDatasetUri) {
      if (validationDatasetUri == null) {
        throw new NullPointerException("Null validationDatasetUri");
      }
      this.validationDatasetUri = validationDatasetUri;
      return this;
    }
    @Override
    public SupervisedTuningSpec build() {
      return new AutoValue_SupervisedTuningSpec(
          this.exportLastCheckpointOnly,
          this.hyperParameters,
          this.trainingDatasetUri,
          this.tuningMode,
          this.validationDatasetUri);
    }
  }

}
