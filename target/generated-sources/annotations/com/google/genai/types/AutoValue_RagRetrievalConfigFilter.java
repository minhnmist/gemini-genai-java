package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RagRetrievalConfigFilter extends RagRetrievalConfigFilter {

  private final Optional<String> metadataFilter;

  private final Optional<Double> vectorDistanceThreshold;

  private final Optional<Double> vectorSimilarityThreshold;

  private AutoValue_RagRetrievalConfigFilter(
      Optional<String> metadataFilter,
      Optional<Double> vectorDistanceThreshold,
      Optional<Double> vectorSimilarityThreshold) {
    this.metadataFilter = metadataFilter;
    this.vectorDistanceThreshold = vectorDistanceThreshold;
    this.vectorSimilarityThreshold = vectorSimilarityThreshold;
  }

  @JsonProperty("metadataFilter")
  @Override
  public Optional<String> metadataFilter() {
    return metadataFilter;
  }

  @JsonProperty("vectorDistanceThreshold")
  @Override
  public Optional<Double> vectorDistanceThreshold() {
    return vectorDistanceThreshold;
  }

  @JsonProperty("vectorSimilarityThreshold")
  @Override
  public Optional<Double> vectorSimilarityThreshold() {
    return vectorSimilarityThreshold;
  }

  @Override
  public String toString() {
    return "RagRetrievalConfigFilter{"
        + "metadataFilter=" + metadataFilter + ", "
        + "vectorDistanceThreshold=" + vectorDistanceThreshold + ", "
        + "vectorSimilarityThreshold=" + vectorSimilarityThreshold
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RagRetrievalConfigFilter) {
      RagRetrievalConfigFilter that = (RagRetrievalConfigFilter) o;
      return this.metadataFilter.equals(that.metadataFilter())
          && this.vectorDistanceThreshold.equals(that.vectorDistanceThreshold())
          && this.vectorSimilarityThreshold.equals(that.vectorSimilarityThreshold());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= metadataFilter.hashCode();
    h$ *= 1000003;
    h$ ^= vectorDistanceThreshold.hashCode();
    h$ *= 1000003;
    h$ ^= vectorSimilarityThreshold.hashCode();
    return h$;
  }

  @Override
  public RagRetrievalConfigFilter.Builder toBuilder() {
    return new AutoValue_RagRetrievalConfigFilter.Builder(this);
  }

  static final class Builder extends RagRetrievalConfigFilter.Builder {
    private Optional<String> metadataFilter = Optional.empty();
    private Optional<Double> vectorDistanceThreshold = Optional.empty();
    private Optional<Double> vectorSimilarityThreshold = Optional.empty();
    Builder() {
    }
    Builder(RagRetrievalConfigFilter source) {
      this.metadataFilter = source.metadataFilter();
      this.vectorDistanceThreshold = source.vectorDistanceThreshold();
      this.vectorSimilarityThreshold = source.vectorSimilarityThreshold();
    }
    @Override
    public RagRetrievalConfigFilter.Builder metadataFilter(String metadataFilter) {
      this.metadataFilter = Optional.of(metadataFilter);
      return this;
    }
    @Override
    RagRetrievalConfigFilter.Builder metadataFilter(Optional<String> metadataFilter) {
      if (metadataFilter == null) {
        throw new NullPointerException("Null metadataFilter");
      }
      this.metadataFilter = metadataFilter;
      return this;
    }
    @Override
    public RagRetrievalConfigFilter.Builder vectorDistanceThreshold(Double vectorDistanceThreshold) {
      this.vectorDistanceThreshold = Optional.of(vectorDistanceThreshold);
      return this;
    }
    @Override
    RagRetrievalConfigFilter.Builder vectorDistanceThreshold(Optional<Double> vectorDistanceThreshold) {
      if (vectorDistanceThreshold == null) {
        throw new NullPointerException("Null vectorDistanceThreshold");
      }
      this.vectorDistanceThreshold = vectorDistanceThreshold;
      return this;
    }
    @Override
    public RagRetrievalConfigFilter.Builder vectorSimilarityThreshold(Double vectorSimilarityThreshold) {
      this.vectorSimilarityThreshold = Optional.of(vectorSimilarityThreshold);
      return this;
    }
    @Override
    RagRetrievalConfigFilter.Builder vectorSimilarityThreshold(Optional<Double> vectorSimilarityThreshold) {
      if (vectorSimilarityThreshold == null) {
        throw new NullPointerException("Null vectorSimilarityThreshold");
      }
      this.vectorSimilarityThreshold = vectorSimilarityThreshold;
      return this;
    }
    @Override
    public RagRetrievalConfigFilter build() {
      return new AutoValue_RagRetrievalConfigFilter(
          this.metadataFilter,
          this.vectorDistanceThreshold,
          this.vectorSimilarityThreshold);
    }
  }

}
