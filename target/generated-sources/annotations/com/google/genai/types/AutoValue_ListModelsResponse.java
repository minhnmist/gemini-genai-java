package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListModelsResponse extends ListModelsResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> nextPageToken;

  private final Optional<List<Model>> models;

  private AutoValue_ListModelsResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> nextPageToken,
      Optional<List<Model>> models) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.nextPageToken = nextPageToken;
    this.models = models;
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

  @JsonProperty("models")
  @Override
  public Optional<List<Model>> models() {
    return models;
  }

  @Override
  public String toString() {
    return "ListModelsResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "nextPageToken=" + nextPageToken + ", "
        + "models=" + models
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListModelsResponse) {
      ListModelsResponse that = (ListModelsResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.nextPageToken.equals(that.nextPageToken())
          && this.models.equals(that.models());
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
    h$ ^= models.hashCode();
    return h$;
  }

  @Override
  public ListModelsResponse.Builder toBuilder() {
    return new AutoValue_ListModelsResponse.Builder(this);
  }

  static final class Builder extends ListModelsResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> nextPageToken = Optional.empty();
    private Optional<List<Model>> models = Optional.empty();
    Builder() {
    }
    Builder(ListModelsResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.nextPageToken = source.nextPageToken();
      this.models = source.models();
    }
    @Override
    public ListModelsResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    ListModelsResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public ListModelsResponse.Builder nextPageToken(String nextPageToken) {
      this.nextPageToken = Optional.of(nextPageToken);
      return this;
    }
    @Override
    ListModelsResponse.Builder nextPageToken(Optional<String> nextPageToken) {
      if (nextPageToken == null) {
        throw new NullPointerException("Null nextPageToken");
      }
      this.nextPageToken = nextPageToken;
      return this;
    }
    @Override
    public ListModelsResponse.Builder models(List<Model> models) {
      this.models = Optional.of(models);
      return this;
    }
    @Override
    ListModelsResponse.Builder models(Optional<List<Model>> models) {
      if (models == null) {
        throw new NullPointerException("Null models");
      }
      this.models = models;
      return this;
    }
    @Override
    public ListModelsResponse build() {
      return new AutoValue_ListModelsResponse(
          this.sdkHttpResponse,
          this.nextPageToken,
          this.models);
    }
  }

}
