package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListCachedContentsResponse extends ListCachedContentsResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> nextPageToken;

  private final Optional<List<CachedContent>> cachedContents;

  private AutoValue_ListCachedContentsResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> nextPageToken,
      Optional<List<CachedContent>> cachedContents) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.nextPageToken = nextPageToken;
    this.cachedContents = cachedContents;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("nextPageToken")
  @Override
  public Optional<String> nextPageToken() {
    return nextPageToken;
  }

  @JsonProperty("cachedContents")
  @Override
  public Optional<List<CachedContent>> cachedContents() {
    return cachedContents;
  }

  @Override
  public String toString() {
    return "ListCachedContentsResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "nextPageToken=" + nextPageToken + ", "
        + "cachedContents=" + cachedContents
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListCachedContentsResponse) {
      ListCachedContentsResponse that = (ListCachedContentsResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.nextPageToken.equals(that.nextPageToken())
          && this.cachedContents.equals(that.cachedContents());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= nextPageToken.hashCode();
    h$ *= 1000003;
    h$ ^= cachedContents.hashCode();
    return h$;
  }

  @Override
  public ListCachedContentsResponse.Builder toBuilder() {
    return new AutoValue_ListCachedContentsResponse.Builder(this);
  }

  static final class Builder extends ListCachedContentsResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> nextPageToken = Optional.empty();
    private Optional<List<CachedContent>> cachedContents = Optional.empty();
    Builder() {
    }
    Builder(ListCachedContentsResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.nextPageToken = source.nextPageToken();
      this.cachedContents = source.cachedContents();
    }
    @Override
    public ListCachedContentsResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    ListCachedContentsResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public ListCachedContentsResponse.Builder nextPageToken(String nextPageToken) {
      this.nextPageToken = Optional.of(nextPageToken);
      return this;
    }
    @Override
    ListCachedContentsResponse.Builder nextPageToken(Optional<String> nextPageToken) {
      if (nextPageToken == null) {
        throw new NullPointerException("Null nextPageToken");
      }
      this.nextPageToken = nextPageToken;
      return this;
    }
    @Override
    public ListCachedContentsResponse.Builder cachedContents(List<CachedContent> cachedContents) {
      this.cachedContents = Optional.of(cachedContents);
      return this;
    }
    @Override
    ListCachedContentsResponse.Builder cachedContents(Optional<List<CachedContent>> cachedContents) {
      if (cachedContents == null) {
        throw new NullPointerException("Null cachedContents");
      }
      this.cachedContents = cachedContents;
      return this;
    }
    @Override
    public ListCachedContentsResponse build() {
      return new AutoValue_ListCachedContentsResponse(
          this.sdkHttpResponse,
          this.nextPageToken,
          this.cachedContents);
    }
  }

}
