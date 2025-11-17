package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CountTokensResult extends CountTokensResult {

  private final Optional<Integer> totalTokens;

  private AutoValue_CountTokensResult(
      Optional<Integer> totalTokens) {
    this.totalTokens = totalTokens;
  }

  @JsonProperty("totalTokens")
  @Override
  public Optional<Integer> totalTokens() {
    return totalTokens;
  }

  @Override
  public String toString() {
    return "CountTokensResult{"
        + "totalTokens=" + totalTokens
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CountTokensResult) {
      CountTokensResult that = (CountTokensResult) o;
      return this.totalTokens.equals(that.totalTokens());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= totalTokens.hashCode();
    return h$;
  }

  @Override
  public CountTokensResult.Builder toBuilder() {
    return new AutoValue_CountTokensResult.Builder(this);
  }

  static final class Builder extends CountTokensResult.Builder {
    private Optional<Integer> totalTokens = Optional.empty();
    Builder() {
    }
    Builder(CountTokensResult source) {
      this.totalTokens = source.totalTokens();
    }
    @Override
    public CountTokensResult.Builder totalTokens(Integer totalTokens) {
      this.totalTokens = Optional.of(totalTokens);
      return this;
    }
    @Override
    CountTokensResult.Builder totalTokens(Optional<Integer> totalTokens) {
      if (totalTokens == null) {
        throw new NullPointerException("Null totalTokens");
      }
      this.totalTokens = totalTokens;
      return this;
    }
    @Override
    public CountTokensResult build() {
      return new AutoValue_CountTokensResult(
          this.totalTokens);
    }
  }

}
