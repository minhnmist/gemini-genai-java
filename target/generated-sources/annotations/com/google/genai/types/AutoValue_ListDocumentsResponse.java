package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListDocumentsResponse extends ListDocumentsResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> nextPageToken;

  private final Optional<List<Document>> documents;

  private AutoValue_ListDocumentsResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> nextPageToken,
      Optional<List<Document>> documents) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.nextPageToken = nextPageToken;
    this.documents = documents;
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

  @JsonProperty("documents")
  @Override
  public Optional<List<Document>> documents() {
    return documents;
  }

  @Override
  public String toString() {
    return "ListDocumentsResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "nextPageToken=" + nextPageToken + ", "
        + "documents=" + documents
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListDocumentsResponse) {
      ListDocumentsResponse that = (ListDocumentsResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.nextPageToken.equals(that.nextPageToken())
          && this.documents.equals(that.documents());
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
    h$ ^= documents.hashCode();
    return h$;
  }

  @Override
  public ListDocumentsResponse.Builder toBuilder() {
    return new AutoValue_ListDocumentsResponse.Builder(this);
  }

  static final class Builder extends ListDocumentsResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> nextPageToken = Optional.empty();
    private Optional<List<Document>> documents = Optional.empty();
    Builder() {
    }
    Builder(ListDocumentsResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.nextPageToken = source.nextPageToken();
      this.documents = source.documents();
    }
    @Override
    public ListDocumentsResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    ListDocumentsResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public ListDocumentsResponse.Builder nextPageToken(String nextPageToken) {
      this.nextPageToken = Optional.of(nextPageToken);
      return this;
    }
    @Override
    ListDocumentsResponse.Builder nextPageToken(Optional<String> nextPageToken) {
      if (nextPageToken == null) {
        throw new NullPointerException("Null nextPageToken");
      }
      this.nextPageToken = nextPageToken;
      return this;
    }
    @Override
    public ListDocumentsResponse.Builder documents(List<Document> documents) {
      this.documents = Optional.of(documents);
      return this;
    }
    @Override
    ListDocumentsResponse.Builder documents(Optional<List<Document>> documents) {
      if (documents == null) {
        throw new NullPointerException("Null documents");
      }
      this.documents = documents;
      return this;
    }
    @Override
    public ListDocumentsResponse build() {
      return new AutoValue_ListDocumentsResponse(
          this.sdkHttpResponse,
          this.nextPageToken,
          this.documents);
    }
  }

}
