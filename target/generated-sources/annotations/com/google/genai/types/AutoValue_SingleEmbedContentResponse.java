package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SingleEmbedContentResponse extends SingleEmbedContentResponse {

  private final Optional<ContentEmbedding> embedding;

  private final Optional<Long> tokenCount;

  private AutoValue_SingleEmbedContentResponse(
      Optional<ContentEmbedding> embedding,
      Optional<Long> tokenCount) {
    this.embedding = embedding;
    this.tokenCount = tokenCount;
  }

  @JsonProperty("embedding")
  @Override
  public Optional<ContentEmbedding> embedding() {
    return embedding;
  }

  @JsonProperty("tokenCount")
  @Override
  public Optional<Long> tokenCount() {
    return tokenCount;
  }

  @Override
  public String toString() {
    return "SingleEmbedContentResponse{"
        + "embedding=" + embedding + ", "
        + "tokenCount=" + tokenCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SingleEmbedContentResponse) {
      SingleEmbedContentResponse that = (SingleEmbedContentResponse) o;
      return this.embedding.equals(that.embedding())
          && this.tokenCount.equals(that.tokenCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= embedding.hashCode();
    h$ *= 1000003;
    h$ ^= tokenCount.hashCode();
    return h$;
  }

  @Override
  public SingleEmbedContentResponse.Builder toBuilder() {
    return new AutoValue_SingleEmbedContentResponse.Builder(this);
  }

  static final class Builder extends SingleEmbedContentResponse.Builder {
    private Optional<ContentEmbedding> embedding = Optional.empty();
    private Optional<Long> tokenCount = Optional.empty();
    Builder() {
    }
    Builder(SingleEmbedContentResponse source) {
      this.embedding = source.embedding();
      this.tokenCount = source.tokenCount();
    }
    @Override
    public SingleEmbedContentResponse.Builder embedding(ContentEmbedding embedding) {
      this.embedding = Optional.of(embedding);
      return this;
    }
    @Override
    SingleEmbedContentResponse.Builder embedding(Optional<ContentEmbedding> embedding) {
      if (embedding == null) {
        throw new NullPointerException("Null embedding");
      }
      this.embedding = embedding;
      return this;
    }
    @Override
    public SingleEmbedContentResponse.Builder tokenCount(Long tokenCount) {
      this.tokenCount = Optional.of(tokenCount);
      return this;
    }
    @Override
    SingleEmbedContentResponse.Builder tokenCount(Optional<Long> tokenCount) {
      if (tokenCount == null) {
        throw new NullPointerException("Null tokenCount");
      }
      this.tokenCount = tokenCount;
      return this;
    }
    @Override
    public SingleEmbedContentResponse build() {
      return new AutoValue_SingleEmbedContentResponse(
          this.embedding,
          this.tokenCount);
    }
  }

}
