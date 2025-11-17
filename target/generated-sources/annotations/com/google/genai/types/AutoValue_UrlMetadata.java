package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UrlMetadata extends UrlMetadata {

  private final Optional<String> retrievedUrl;

  private final Optional<UrlRetrievalStatus> urlRetrievalStatus;

  private AutoValue_UrlMetadata(
      Optional<String> retrievedUrl,
      Optional<UrlRetrievalStatus> urlRetrievalStatus) {
    this.retrievedUrl = retrievedUrl;
    this.urlRetrievalStatus = urlRetrievalStatus;
  }

  @JsonProperty("retrievedUrl")
  @Override
  public Optional<String> retrievedUrl() {
    return retrievedUrl;
  }

  @JsonProperty("urlRetrievalStatus")
  @Override
  public Optional<UrlRetrievalStatus> urlRetrievalStatus() {
    return urlRetrievalStatus;
  }

  @Override
  public String toString() {
    return "UrlMetadata{"
        + "retrievedUrl=" + retrievedUrl + ", "
        + "urlRetrievalStatus=" + urlRetrievalStatus
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UrlMetadata) {
      UrlMetadata that = (UrlMetadata) o;
      return this.retrievedUrl.equals(that.retrievedUrl())
          && this.urlRetrievalStatus.equals(that.urlRetrievalStatus());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= retrievedUrl.hashCode();
    h$ *= 1000003;
    h$ ^= urlRetrievalStatus.hashCode();
    return h$;
  }

  @Override
  public UrlMetadata.Builder toBuilder() {
    return new AutoValue_UrlMetadata.Builder(this);
  }

  static final class Builder extends UrlMetadata.Builder {
    private Optional<String> retrievedUrl = Optional.empty();
    private Optional<UrlRetrievalStatus> urlRetrievalStatus = Optional.empty();
    Builder() {
    }
    Builder(UrlMetadata source) {
      this.retrievedUrl = source.retrievedUrl();
      this.urlRetrievalStatus = source.urlRetrievalStatus();
    }
    @Override
    public UrlMetadata.Builder retrievedUrl(String retrievedUrl) {
      this.retrievedUrl = Optional.of(retrievedUrl);
      return this;
    }
    @Override
    UrlMetadata.Builder retrievedUrl(Optional<String> retrievedUrl) {
      if (retrievedUrl == null) {
        throw new NullPointerException("Null retrievedUrl");
      }
      this.retrievedUrl = retrievedUrl;
      return this;
    }
    @Override
    public UrlMetadata.Builder urlRetrievalStatus(UrlRetrievalStatus urlRetrievalStatus) {
      this.urlRetrievalStatus = Optional.of(urlRetrievalStatus);
      return this;
    }
    @Override
    UrlMetadata.Builder urlRetrievalStatus(Optional<UrlRetrievalStatus> urlRetrievalStatus) {
      if (urlRetrievalStatus == null) {
        throw new NullPointerException("Null urlRetrievalStatus");
      }
      this.urlRetrievalStatus = urlRetrievalStatus;
      return this;
    }
    @Override
    public UrlMetadata build() {
      return new AutoValue_UrlMetadata(
          this.retrievedUrl,
          this.urlRetrievalStatus);
    }
  }

}
