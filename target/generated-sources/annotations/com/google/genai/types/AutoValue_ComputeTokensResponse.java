package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ComputeTokensResponse extends ComputeTokensResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<List<TokensInfo>> tokensInfo;

  private AutoValue_ComputeTokensResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<List<TokensInfo>> tokensInfo) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.tokensInfo = tokensInfo;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("tokensInfo")
  @Override
  public Optional<List<TokensInfo>> tokensInfo() {
    return tokensInfo;
  }

  @Override
  public String toString() {
    return "ComputeTokensResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "tokensInfo=" + tokensInfo
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ComputeTokensResponse) {
      ComputeTokensResponse that = (ComputeTokensResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.tokensInfo.equals(that.tokensInfo());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= tokensInfo.hashCode();
    return h$;
  }

  @Override
  public ComputeTokensResponse.Builder toBuilder() {
    return new AutoValue_ComputeTokensResponse.Builder(this);
  }

  static final class Builder extends ComputeTokensResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<List<TokensInfo>> tokensInfo = Optional.empty();
    Builder() {
    }
    Builder(ComputeTokensResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.tokensInfo = source.tokensInfo();
    }
    @Override
    public ComputeTokensResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    ComputeTokensResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public ComputeTokensResponse.Builder tokensInfo(List<TokensInfo> tokensInfo) {
      this.tokensInfo = Optional.of(tokensInfo);
      return this;
    }
    @Override
    ComputeTokensResponse.Builder tokensInfo(Optional<List<TokensInfo>> tokensInfo) {
      if (tokensInfo == null) {
        throw new NullPointerException("Null tokensInfo");
      }
      this.tokensInfo = tokensInfo;
      return this;
    }
    @Override
    public ComputeTokensResponse build() {
      return new AutoValue_ComputeTokensResponse(
          this.sdkHttpResponse,
          this.tokensInfo);
    }
  }

}
