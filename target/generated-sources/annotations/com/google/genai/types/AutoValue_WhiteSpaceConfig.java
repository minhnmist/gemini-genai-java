package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_WhiteSpaceConfig extends WhiteSpaceConfig {

  private final Optional<Integer> maxTokensPerChunk;

  private final Optional<Integer> maxOverlapTokens;

  private AutoValue_WhiteSpaceConfig(
      Optional<Integer> maxTokensPerChunk,
      Optional<Integer> maxOverlapTokens) {
    this.maxTokensPerChunk = maxTokensPerChunk;
    this.maxOverlapTokens = maxOverlapTokens;
  }

  @JsonProperty("maxTokensPerChunk")
  @Override
  public Optional<Integer> maxTokensPerChunk() {
    return maxTokensPerChunk;
  }

  @JsonProperty("maxOverlapTokens")
  @Override
  public Optional<Integer> maxOverlapTokens() {
    return maxOverlapTokens;
  }

  @Override
  public String toString() {
    return "WhiteSpaceConfig{"
        + "maxTokensPerChunk=" + maxTokensPerChunk + ", "
        + "maxOverlapTokens=" + maxOverlapTokens
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof WhiteSpaceConfig) {
      WhiteSpaceConfig that = (WhiteSpaceConfig) o;
      return this.maxTokensPerChunk.equals(that.maxTokensPerChunk())
          && this.maxOverlapTokens.equals(that.maxOverlapTokens());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= maxTokensPerChunk.hashCode();
    h$ *= 1000003;
    h$ ^= maxOverlapTokens.hashCode();
    return h$;
  }

  @Override
  public WhiteSpaceConfig.Builder toBuilder() {
    return new AutoValue_WhiteSpaceConfig.Builder(this);
  }

  static final class Builder extends WhiteSpaceConfig.Builder {
    private Optional<Integer> maxTokensPerChunk = Optional.empty();
    private Optional<Integer> maxOverlapTokens = Optional.empty();
    Builder() {
    }
    Builder(WhiteSpaceConfig source) {
      this.maxTokensPerChunk = source.maxTokensPerChunk();
      this.maxOverlapTokens = source.maxOverlapTokens();
    }
    @Override
    public WhiteSpaceConfig.Builder maxTokensPerChunk(Integer maxTokensPerChunk) {
      this.maxTokensPerChunk = Optional.of(maxTokensPerChunk);
      return this;
    }
    @Override
    WhiteSpaceConfig.Builder maxTokensPerChunk(Optional<Integer> maxTokensPerChunk) {
      if (maxTokensPerChunk == null) {
        throw new NullPointerException("Null maxTokensPerChunk");
      }
      this.maxTokensPerChunk = maxTokensPerChunk;
      return this;
    }
    @Override
    public WhiteSpaceConfig.Builder maxOverlapTokens(Integer maxOverlapTokens) {
      this.maxOverlapTokens = Optional.of(maxOverlapTokens);
      return this;
    }
    @Override
    WhiteSpaceConfig.Builder maxOverlapTokens(Optional<Integer> maxOverlapTokens) {
      if (maxOverlapTokens == null) {
        throw new NullPointerException("Null maxOverlapTokens");
      }
      this.maxOverlapTokens = maxOverlapTokens;
      return this;
    }
    @Override
    public WhiteSpaceConfig build() {
      return new AutoValue_WhiteSpaceConfig(
          this.maxTokensPerChunk,
          this.maxOverlapTokens);
    }
  }

}
