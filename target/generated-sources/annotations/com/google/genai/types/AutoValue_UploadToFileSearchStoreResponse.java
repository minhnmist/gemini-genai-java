package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UploadToFileSearchStoreResponse extends UploadToFileSearchStoreResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> parent;

  private final Optional<String> documentName;

  private AutoValue_UploadToFileSearchStoreResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> parent,
      Optional<String> documentName) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.parent = parent;
    this.documentName = documentName;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("parent")
  @Override
  public Optional<String> parent() {
    return parent;
  }

  @JsonProperty("documentName")
  @Override
  public Optional<String> documentName() {
    return documentName;
  }

  @Override
  public String toString() {
    return "UploadToFileSearchStoreResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "parent=" + parent + ", "
        + "documentName=" + documentName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UploadToFileSearchStoreResponse) {
      UploadToFileSearchStoreResponse that = (UploadToFileSearchStoreResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.parent.equals(that.parent())
          && this.documentName.equals(that.documentName());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= parent.hashCode();
    h$ *= 1000003;
    h$ ^= documentName.hashCode();
    return h$;
  }

  @Override
  public UploadToFileSearchStoreResponse.Builder toBuilder() {
    return new AutoValue_UploadToFileSearchStoreResponse.Builder(this);
  }

  static final class Builder extends UploadToFileSearchStoreResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> parent = Optional.empty();
    private Optional<String> documentName = Optional.empty();
    Builder() {
    }
    Builder(UploadToFileSearchStoreResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.parent = source.parent();
      this.documentName = source.documentName();
    }
    @Override
    public UploadToFileSearchStoreResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    UploadToFileSearchStoreResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public UploadToFileSearchStoreResponse.Builder parent(String parent) {
      this.parent = Optional.of(parent);
      return this;
    }
    @Override
    UploadToFileSearchStoreResponse.Builder parent(Optional<String> parent) {
      if (parent == null) {
        throw new NullPointerException("Null parent");
      }
      this.parent = parent;
      return this;
    }
    @Override
    public UploadToFileSearchStoreResponse.Builder documentName(String documentName) {
      this.documentName = Optional.of(documentName);
      return this;
    }
    @Override
    UploadToFileSearchStoreResponse.Builder documentName(Optional<String> documentName) {
      if (documentName == null) {
        throw new NullPointerException("Null documentName");
      }
      this.documentName = documentName;
      return this;
    }
    @Override
    public UploadToFileSearchStoreResponse build() {
      return new AutoValue_UploadToFileSearchStoreResponse(
          this.sdkHttpResponse,
          this.parent,
          this.documentName);
    }
  }

}
