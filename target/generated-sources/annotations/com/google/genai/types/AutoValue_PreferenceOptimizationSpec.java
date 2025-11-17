package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_PreferenceOptimizationSpec extends PreferenceOptimizationSpec {

  private final Optional<Boolean> exportLastCheckpointOnly;

  private final Optional<PreferenceOptimizationHyperParameters> hyperParameters;

  private final Optional<String> trainingDatasetUri;

  private final Optional<String> validationDatasetUri;

  private AutoValue_PreferenceOptimizationSpec(
      Optional<Boolean> exportLastCheckpointOnly,
      Optional<PreferenceOptimizationHyperParameters> hyperParameters,
      Optional<String> trainingDatasetUri,
      Optional<String> validationDatasetUri) {
    this.exportLastCheckpointOnly = exportLastCheckpointOnly;
    this.hyperParameters = hyperParameters;
    this.trainingDatasetUri = trainingDatasetUri;
    this.validationDatasetUri = validationDatasetUri;
  }

  @JsonProperty("exportLastCheckpointOnly")
  @Override
  public Optional<Boolean> exportLastCheckpointOnly() {
    return exportLastCheckpointOnly;
  }

  @JsonProperty("hyperParameters")
  @Override
  public Optional<PreferenceOptimizationHyperParameters> hyperParameters() {
    return hyperParameters;
  }

  @JsonProperty("trainingDatasetUri")
  @Override
  public Optional<String> trainingDatasetUri() {
    return trainingDatasetUri;
  }

  @JsonProperty("validationDatasetUri")
  @Override
  public Optional<String> validationDatasetUri() {
    return validationDatasetUri;
  }

  @Override
  public String toString() {
    return "PreferenceOptimizationSpec{"
        + "exportLastCheckpointOnly=" + exportLastCheckpointOnly + ", "
        + "hyperParameters=" + hyperParameters + ", "
        + "trainingDatasetUri=" + trainingDatasetUri + ", "
        + "validationDatasetUri=" + validationDatasetUri
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PreferenceOptimizationSpec) {
      PreferenceOptimizationSpec that = (PreferenceOptimizationSpec) o;
      return this.exportLastCheckpointOnly.equals(that.exportLastCheckpointOnly())
          && this.hyperParameters.equals(that.hyperParameters())
          && this.trainingDatasetUri.equals(that.trainingDatasetUri())
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
    h$ ^= validationDatasetUri.hashCode();
    return h$;
  }

  @Override
  public PreferenceOptimizationSpec.Builder toBuilder() {
    return new AutoValue_PreferenceOptimizationSpec.Builder(this);
  }

  static final class Builder extends PreferenceOptimizationSpec.Builder {
    private Optional<Boolean> exportLastCheckpointOnly = Optional.empty();
    private Optional<PreferenceOptimizationHyperParameters> hyperParameters = Optional.empty();
    private Optional<String> trainingDatasetUri = Optional.empty();
    private Optional<String> validationDatasetUri = Optional.empty();
    Builder() {
    }
    Builder(PreferenceOptimizationSpec source) {
      this.exportLastCheckpointOnly = source.exportLastCheckpointOnly();
      this.hyperParameters = source.hyperParameters();
      this.trainingDatasetUri = source.trainingDatasetUri();
      this.validationDatasetUri = source.validationDatasetUri();
    }
    @Override
    public PreferenceOptimizationSpec.Builder exportLastCheckpointOnly(boolean exportLastCheckpointOnly) {
      this.exportLastCheckpointOnly = Optional.of(exportLastCheckpointOnly);
      return this;
    }
    @Override
    PreferenceOptimizationSpec.Builder exportLastCheckpointOnly(Optional<Boolean> exportLastCheckpointOnly) {
      if (exportLastCheckpointOnly == null) {
        throw new NullPointerException("Null exportLastCheckpointOnly");
      }
      this.exportLastCheckpointOnly = exportLastCheckpointOnly;
      return this;
    }
    @Override
    public PreferenceOptimizationSpec.Builder hyperParameters(PreferenceOptimizationHyperParameters hyperParameters) {
      this.hyperParameters = Optional.of(hyperParameters);
      return this;
    }
    @Override
    PreferenceOptimizationSpec.Builder hyperParameters(Optional<PreferenceOptimizationHyperParameters> hyperParameters) {
      if (hyperParameters == null) {
        throw new NullPointerException("Null hyperParameters");
      }
      this.hyperParameters = hyperParameters;
      return this;
    }
    @Override
    public PreferenceOptimizationSpec.Builder trainingDatasetUri(String trainingDatasetUri) {
      this.trainingDatasetUri = Optional.of(trainingDatasetUri);
      return this;
    }
    @Override
    PreferenceOptimizationSpec.Builder trainingDatasetUri(Optional<String> trainingDatasetUri) {
      if (trainingDatasetUri == null) {
        throw new NullPointerException("Null trainingDatasetUri");
      }
      this.trainingDatasetUri = trainingDatasetUri;
      return this;
    }
    @Override
    public PreferenceOptimizationSpec.Builder validationDatasetUri(String validationDatasetUri) {
      this.validationDatasetUri = Optional.of(validationDatasetUri);
      return this;
    }
    @Override
    PreferenceOptimizationSpec.Builder validationDatasetUri(Optional<String> validationDatasetUri) {
      if (validationDatasetUri == null) {
        throw new NullPointerException("Null validationDatasetUri");
      }
      this.validationDatasetUri = validationDatasetUri;
      return this;
    }
    @Override
    public PreferenceOptimizationSpec build() {
      return new AutoValue_PreferenceOptimizationSpec(
          this.exportLastCheckpointOnly,
          this.hyperParameters,
          this.trainingDatasetUri,
          this.validationDatasetUri);
    }
  }

}
