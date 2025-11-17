package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ContentEmbedding extends ContentEmbedding {

  private final Optional<List<Float>> values;

  private final Optional<ContentEmbeddingStatistics> statistics;

  private AutoValue_ContentEmbedding(
      Optional<List<Float>> values,
      Optional<ContentEmbeddingStatistics> statistics) {
    this.values = values;
    this.statistics = statistics;
  }

  @JsonProperty("values")
  @Override
  public Optional<List<Float>> values() {
    return values;
  }

  @JsonProperty("statistics")
  @Override
  public Optional<ContentEmbeddingStatistics> statistics() {
    return statistics;
  }

  @Override
  public String toString() {
    return "ContentEmbedding{"
        + "values=" + values + ", "
        + "statistics=" + statistics
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ContentEmbedding) {
      ContentEmbedding that = (ContentEmbedding) o;
      return this.values.equals(that.values())
          && this.statistics.equals(that.statistics());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= values.hashCode();
    h$ *= 1000003;
    h$ ^= statistics.hashCode();
    return h$;
  }

  @Override
  public ContentEmbedding.Builder toBuilder() {
    return new AutoValue_ContentEmbedding.Builder(this);
  }

  static final class Builder extends ContentEmbedding.Builder {
    private Optional<List<Float>> values = Optional.empty();
    private Optional<ContentEmbeddingStatistics> statistics = Optional.empty();
    Builder() {
    }
    Builder(ContentEmbedding source) {
      this.values = source.values();
      this.statistics = source.statistics();
    }
    @Override
    public ContentEmbedding.Builder values(List<Float> values) {
      this.values = Optional.of(values);
      return this;
    }
    @Override
    ContentEmbedding.Builder values(Optional<List<Float>> values) {
      if (values == null) {
        throw new NullPointerException("Null values");
      }
      this.values = values;
      return this;
    }
    @Override
    public ContentEmbedding.Builder statistics(ContentEmbeddingStatistics statistics) {
      this.statistics = Optional.of(statistics);
      return this;
    }
    @Override
    ContentEmbedding.Builder statistics(Optional<ContentEmbeddingStatistics> statistics) {
      if (statistics == null) {
        throw new NullPointerException("Null statistics");
      }
      this.statistics = statistics;
      return this;
    }
    @Override
    public ContentEmbedding build() {
      return new AutoValue_ContentEmbedding(
          this.values,
          this.statistics);
    }
  }

}
