package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CountTokensResponse extends CountTokensResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<Integer> totalTokens;

  private final Optional<Integer> cachedContentTokenCount;

  private AutoValue_CountTokensResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<Integer> totalTokens,
      Optional<Integer> cachedContentTokenCount) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.totalTokens = totalTokens;
    this.cachedContentTokenCount = cachedContentTokenCount;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("totalTokens")
  @Override
  public Optional<Integer> totalTokens() {
    return totalTokens;
  }

  @JsonProperty("cachedContentTokenCount")
  @Override
  public Optional<Integer> cachedContentTokenCount() {
    return cachedContentTokenCount;
  }

  @Override
  public String toString() {
    return "CountTokensResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "totalTokens=" + totalTokens + ", "
        + "cachedContentTokenCount=" + cachedContentTokenCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CountTokensResponse) {
      CountTokensResponse that = (CountTokensResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.totalTokens.equals(that.totalTokens())
          && this.cachedContentTokenCount.equals(that.cachedContentTokenCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= totalTokens.hashCode();
    h$ *= 1000003;
    h$ ^= cachedContentTokenCount.hashCode();
    return h$;
  }

  @Override
  public CountTokensResponse.Builder toBuilder() {
    return new AutoValue_CountTokensResponse.Builder(this);
  }

  static final class Builder extends CountTokensResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<Integer> totalTokens = Optional.empty();
    private Optional<Integer> cachedContentTokenCount = Optional.empty();
    Builder() {
    }
    Builder(CountTokensResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.totalTokens = source.totalTokens();
      this.cachedContentTokenCount = source.cachedContentTokenCount();
    }
    @Override
    public CountTokensResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    CountTokensResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public CountTokensResponse.Builder totalTokens(Integer totalTokens) {
      this.totalTokens = Optional.of(totalTokens);
      return this;
    }
    @Override
    CountTokensResponse.Builder totalTokens(Optional<Integer> totalTokens) {
      if (totalTokens == null) {
        throw new NullPointerException("Null totalTokens");
      }
      this.totalTokens = totalTokens;
      return this;
    }
    @Override
    public CountTokensResponse.Builder cachedContentTokenCount(Integer cachedContentTokenCount) {
      this.cachedContentTokenCount = Optional.of(cachedContentTokenCount);
      return this;
    }
    @Override
    CountTokensResponse.Builder cachedContentTokenCount(Optional<Integer> cachedContentTokenCount) {
      if (cachedContentTokenCount == null) {
        throw new NullPointerException("Null cachedContentTokenCount");
      }
      this.cachedContentTokenCount = cachedContentTokenCount;
      return this;
    }
    @Override
    public CountTokensResponse build() {
      return new AutoValue_CountTokensResponse(
          this.sdkHttpResponse,
          this.totalTokens,
          this.cachedContentTokenCount);
    }
  }

}
