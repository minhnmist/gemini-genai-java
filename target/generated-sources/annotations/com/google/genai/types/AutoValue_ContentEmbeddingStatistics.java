package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ContentEmbeddingStatistics extends ContentEmbeddingStatistics {

  private final Optional<Boolean> truncated;

  private final Optional<Float> tokenCount;

  private AutoValue_ContentEmbeddingStatistics(
      Optional<Boolean> truncated,
      Optional<Float> tokenCount) {
    this.truncated = truncated;
    this.tokenCount = tokenCount;
  }

  @JsonProperty("truncated")
  @Override
  public Optional<Boolean> truncated() {
    return truncated;
  }

  @JsonProperty("tokenCount")
  @Override
  public Optional<Float> tokenCount() {
    return tokenCount;
  }

  @Override
  public String toString() {
    return "ContentEmbeddingStatistics{"
        + "truncated=" + truncated + ", "
        + "tokenCount=" + tokenCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ContentEmbeddingStatistics) {
      ContentEmbeddingStatistics that = (ContentEmbeddingStatistics) o;
      return this.truncated.equals(that.truncated())
          && this.tokenCount.equals(that.tokenCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= truncated.hashCode();
    h$ *= 1000003;
    h$ ^= tokenCount.hashCode();
    return h$;
  }

  @Override
  public ContentEmbeddingStatistics.Builder toBuilder() {
    return new AutoValue_ContentEmbeddingStatistics.Builder(this);
  }

  static final class Builder extends ContentEmbeddingStatistics.Builder {
    private Optional<Boolean> truncated = Optional.empty();
    private Optional<Float> tokenCount = Optional.empty();
    Builder() {
    }
    Builder(ContentEmbeddingStatistics source) {
      this.truncated = source.truncated();
      this.tokenCount = source.tokenCount();
    }
    @Override
    public ContentEmbeddingStatistics.Builder truncated(boolean truncated) {
      this.truncated = Optional.of(truncated);
      return this;
    }
    @Override
    ContentEmbeddingStatistics.Builder truncated(Optional<Boolean> truncated) {
      if (truncated == null) {
        throw new NullPointerException("Null truncated");
      }
      this.truncated = truncated;
      return this;
    }
    @Override
    public ContentEmbeddingStatistics.Builder tokenCount(Float tokenCount) {
      this.tokenCount = Optional.of(tokenCount);
      return this;
    }
    @Override
    ContentEmbeddingStatistics.Builder tokenCount(Optional<Float> tokenCount) {
      if (tokenCount == null) {
        throw new NullPointerException("Null tokenCount");
      }
      this.tokenCount = tokenCount;
      return this;
    }
    @Override
    public ContentEmbeddingStatistics build() {
      return new AutoValue_ContentEmbeddingStatistics(
          this.truncated,
          this.tokenCount);
    }
  }

}
