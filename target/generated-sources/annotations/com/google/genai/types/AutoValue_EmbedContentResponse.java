package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EmbedContentResponse extends EmbedContentResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<List<ContentEmbedding>> embeddings;

  private final Optional<EmbedContentMetadata> metadata;

  private AutoValue_EmbedContentResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<List<ContentEmbedding>> embeddings,
      Optional<EmbedContentMetadata> metadata) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.embeddings = embeddings;
    this.metadata = metadata;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("embeddings")
  @Override
  public Optional<List<ContentEmbedding>> embeddings() {
    return embeddings;
  }

  @JsonProperty("metadata")
  @Override
  public Optional<EmbedContentMetadata> metadata() {
    return metadata;
  }

  @Override
  public String toString() {
    return "EmbedContentResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "embeddings=" + embeddings + ", "
        + "metadata=" + metadata
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EmbedContentResponse) {
      EmbedContentResponse that = (EmbedContentResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.embeddings.equals(that.embeddings())
          && this.metadata.equals(that.metadata());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= embeddings.hashCode();
    h$ *= 1000003;
    h$ ^= metadata.hashCode();
    return h$;
  }

  @Override
  public EmbedContentResponse.Builder toBuilder() {
    return new AutoValue_EmbedContentResponse.Builder(this);
  }

  static final class Builder extends EmbedContentResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<List<ContentEmbedding>> embeddings = Optional.empty();
    private Optional<EmbedContentMetadata> metadata = Optional.empty();
    Builder() {
    }
    Builder(EmbedContentResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.embeddings = source.embeddings();
      this.metadata = source.metadata();
    }
    @Override
    public EmbedContentResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    EmbedContentResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public EmbedContentResponse.Builder embeddings(List<ContentEmbedding> embeddings) {
      this.embeddings = Optional.of(embeddings);
      return this;
    }
    @Override
    EmbedContentResponse.Builder embeddings(Optional<List<ContentEmbedding>> embeddings) {
      if (embeddings == null) {
        throw new NullPointerException("Null embeddings");
      }
      this.embeddings = embeddings;
      return this;
    }
    @Override
    public EmbedContentResponse.Builder metadata(EmbedContentMetadata metadata) {
      this.metadata = Optional.of(metadata);
      return this;
    }
    @Override
    EmbedContentResponse.Builder metadata(Optional<EmbedContentMetadata> metadata) {
      if (metadata == null) {
        throw new NullPointerException("Null metadata");
      }
      this.metadata = metadata;
      return this;
    }
    @Override
    public EmbedContentResponse build() {
      return new AutoValue_EmbedContentResponse(
          this.sdkHttpResponse,
          this.embeddings,
          this.metadata);
    }
  }

}
