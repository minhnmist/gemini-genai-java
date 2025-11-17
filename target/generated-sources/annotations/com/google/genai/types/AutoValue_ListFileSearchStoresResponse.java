package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListFileSearchStoresResponse extends ListFileSearchStoresResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> nextPageToken;

  private final Optional<List<FileSearchStore>> fileSearchStores;

  private AutoValue_ListFileSearchStoresResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> nextPageToken,
      Optional<List<FileSearchStore>> fileSearchStores) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.nextPageToken = nextPageToken;
    this.fileSearchStores = fileSearchStores;
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

  @JsonProperty("fileSearchStores")
  @Override
  public Optional<List<FileSearchStore>> fileSearchStores() {
    return fileSearchStores;
  }

  @Override
  public String toString() {
    return "ListFileSearchStoresResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "nextPageToken=" + nextPageToken + ", "
        + "fileSearchStores=" + fileSearchStores
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListFileSearchStoresResponse) {
      ListFileSearchStoresResponse that = (ListFileSearchStoresResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.nextPageToken.equals(that.nextPageToken())
          && this.fileSearchStores.equals(that.fileSearchStores());
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
    h$ ^= fileSearchStores.hashCode();
    return h$;
  }

  @Override
  public ListFileSearchStoresResponse.Builder toBuilder() {
    return new AutoValue_ListFileSearchStoresResponse.Builder(this);
  }

  static final class Builder extends ListFileSearchStoresResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> nextPageToken = Optional.empty();
    private Optional<List<FileSearchStore>> fileSearchStores = Optional.empty();
    Builder() {
    }
    Builder(ListFileSearchStoresResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.nextPageToken = source.nextPageToken();
      this.fileSearchStores = source.fileSearchStores();
    }
    @Override
    public ListFileSearchStoresResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    ListFileSearchStoresResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public ListFileSearchStoresResponse.Builder nextPageToken(String nextPageToken) {
      this.nextPageToken = Optional.of(nextPageToken);
      return this;
    }
    @Override
    ListFileSearchStoresResponse.Builder nextPageToken(Optional<String> nextPageToken) {
      if (nextPageToken == null) {
        throw new NullPointerException("Null nextPageToken");
      }
      this.nextPageToken = nextPageToken;
      return this;
    }
    @Override
    public ListFileSearchStoresResponse.Builder fileSearchStores(List<FileSearchStore> fileSearchStores) {
      this.fileSearchStores = Optional.of(fileSearchStores);
      return this;
    }
    @Override
    ListFileSearchStoresResponse.Builder fileSearchStores(Optional<List<FileSearchStore>> fileSearchStores) {
      if (fileSearchStores == null) {
        throw new NullPointerException("Null fileSearchStores");
      }
      this.fileSearchStores = fileSearchStores;
      return this;
    }
    @Override
    public ListFileSearchStoresResponse build() {
      return new AutoValue_ListFileSearchStoresResponse(
          this.sdkHttpResponse,
          this.nextPageToken,
          this.fileSearchStores);
    }
  }

}
