package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TuningValidationDataset extends TuningValidationDataset {

  private final Optional<String> gcsUri;

  private final Optional<String> vertexDatasetResource;

  private AutoValue_TuningValidationDataset(
      Optional<String> gcsUri,
      Optional<String> vertexDatasetResource) {
    this.gcsUri = gcsUri;
    this.vertexDatasetResource = vertexDatasetResource;
  }

  @JsonProperty("gcsUri")
  @Override
  public Optional<String> gcsUri() {
    return gcsUri;
  }

  @JsonProperty("vertexDatasetResource")
  @Override
  public Optional<String> vertexDatasetResource() {
    return vertexDatasetResource;
  }

  @Override
  public String toString() {
    return "TuningValidationDataset{"
        + "gcsUri=" + gcsUri + ", "
        + "vertexDatasetResource=" + vertexDatasetResource
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TuningValidationDataset) {
      TuningValidationDataset that = (TuningValidationDataset) o;
      return this.gcsUri.equals(that.gcsUri())
          && this.vertexDatasetResource.equals(that.vertexDatasetResource());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= gcsUri.hashCode();
    h$ *= 1000003;
    h$ ^= vertexDatasetResource.hashCode();
    return h$;
  }

  @Override
  public TuningValidationDataset.Builder toBuilder() {
    return new AutoValue_TuningValidationDataset.Builder(this);
  }

  static final class Builder extends TuningValidationDataset.Builder {
    private Optional<String> gcsUri = Optional.empty();
    private Optional<String> vertexDatasetResource = Optional.empty();
    Builder() {
    }
    Builder(TuningValidationDataset source) {
      this.gcsUri = source.gcsUri();
      this.vertexDatasetResource = source.vertexDatasetResource();
    }
    @Override
    public TuningValidationDataset.Builder gcsUri(String gcsUri) {
      this.gcsUri = Optional.of(gcsUri);
      return this;
    }
    @Override
    TuningValidationDataset.Builder gcsUri(Optional<String> gcsUri) {
      if (gcsUri == null) {
        throw new NullPointerException("Null gcsUri");
      }
      this.gcsUri = gcsUri;
      return this;
    }
    @Override
    public TuningValidationDataset.Builder vertexDatasetResource(String vertexDatasetResource) {
      this.vertexDatasetResource = Optional.of(vertexDatasetResource);
      return this;
    }
    @Override
    TuningValidationDataset.Builder vertexDatasetResource(Optional<String> vertexDatasetResource) {
      if (vertexDatasetResource == null) {
        throw new NullPointerException("Null vertexDatasetResource");
      }
      this.vertexDatasetResource = vertexDatasetResource;
      return this;
    }
    @Override
    public TuningValidationDataset build() {
      return new AutoValue_TuningValidationDataset(
          this.gcsUri,
          this.vertexDatasetResource);
    }
  }

}
