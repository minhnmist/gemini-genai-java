package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TuningDataset extends TuningDataset {

  private final Optional<String> gcsUri;

  private final Optional<String> vertexDatasetResource;

  private final Optional<List<TuningExample>> examples;

  private AutoValue_TuningDataset(
      Optional<String> gcsUri,
      Optional<String> vertexDatasetResource,
      Optional<List<TuningExample>> examples) {
    this.gcsUri = gcsUri;
    this.vertexDatasetResource = vertexDatasetResource;
    this.examples = examples;
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

  @JsonProperty("examples")
  @Override
  public Optional<List<TuningExample>> examples() {
    return examples;
  }

  @Override
  public String toString() {
    return "TuningDataset{"
        + "gcsUri=" + gcsUri + ", "
        + "vertexDatasetResource=" + vertexDatasetResource + ", "
        + "examples=" + examples
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TuningDataset) {
      TuningDataset that = (TuningDataset) o;
      return this.gcsUri.equals(that.gcsUri())
          && this.vertexDatasetResource.equals(that.vertexDatasetResource())
          && this.examples.equals(that.examples());
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
    h$ *= 1000003;
    h$ ^= examples.hashCode();
    return h$;
  }

  @Override
  public TuningDataset.Builder toBuilder() {
    return new AutoValue_TuningDataset.Builder(this);
  }

  static final class Builder extends TuningDataset.Builder {
    private Optional<String> gcsUri = Optional.empty();
    private Optional<String> vertexDatasetResource = Optional.empty();
    private Optional<List<TuningExample>> examples = Optional.empty();
    Builder() {
    }
    Builder(TuningDataset source) {
      this.gcsUri = source.gcsUri();
      this.vertexDatasetResource = source.vertexDatasetResource();
      this.examples = source.examples();
    }
    @Override
    public TuningDataset.Builder gcsUri(String gcsUri) {
      this.gcsUri = Optional.of(gcsUri);
      return this;
    }
    @Override
    TuningDataset.Builder gcsUri(Optional<String> gcsUri) {
      if (gcsUri == null) {
        throw new NullPointerException("Null gcsUri");
      }
      this.gcsUri = gcsUri;
      return this;
    }
    @Override
    public TuningDataset.Builder vertexDatasetResource(String vertexDatasetResource) {
      this.vertexDatasetResource = Optional.of(vertexDatasetResource);
      return this;
    }
    @Override
    TuningDataset.Builder vertexDatasetResource(Optional<String> vertexDatasetResource) {
      if (vertexDatasetResource == null) {
        throw new NullPointerException("Null vertexDatasetResource");
      }
      this.vertexDatasetResource = vertexDatasetResource;
      return this;
    }
    @Override
    public TuningDataset.Builder examples(List<TuningExample> examples) {
      this.examples = Optional.of(examples);
      return this;
    }
    @Override
    TuningDataset.Builder examples(Optional<List<TuningExample>> examples) {
      if (examples == null) {
        throw new NullPointerException("Null examples");
      }
      this.examples = examples;
      return this;
    }
    @Override
    public TuningDataset build() {
      return new AutoValue_TuningDataset(
          this.gcsUri,
          this.vertexDatasetResource,
          this.examples);
    }
  }

}
