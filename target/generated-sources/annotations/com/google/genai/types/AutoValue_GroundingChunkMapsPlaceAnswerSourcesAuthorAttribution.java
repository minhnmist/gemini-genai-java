package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution extends GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution {

  private final Optional<String> displayName;

  private final Optional<String> photoUri;

  private final Optional<String> uri;

  private AutoValue_GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution(
      Optional<String> displayName,
      Optional<String> photoUri,
      Optional<String> uri) {
    this.displayName = displayName;
    this.photoUri = photoUri;
    this.uri = uri;
  }

  @JsonProperty("displayName")
  @Override
  public Optional<String> displayName() {
    return displayName;
  }

  @JsonProperty("photoUri")
  @Override
  public Optional<String> photoUri() {
    return photoUri;
  }

  @JsonProperty("uri")
  @Override
  public Optional<String> uri() {
    return uri;
  }

  @Override
  public String toString() {
    return "GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution{"
        + "displayName=" + displayName + ", "
        + "photoUri=" + photoUri + ", "
        + "uri=" + uri
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution) {
      GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution that = (GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution) o;
      return this.displayName.equals(that.displayName())
          && this.photoUri.equals(that.photoUri())
          && this.uri.equals(that.uri());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    h$ *= 1000003;
    h$ ^= photoUri.hashCode();
    h$ *= 1000003;
    h$ ^= uri.hashCode();
    return h$;
  }

  @Override
  public GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder toBuilder() {
    return new AutoValue_GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder(this);
  }

  static final class Builder extends GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder {
    private Optional<String> displayName = Optional.empty();
    private Optional<String> photoUri = Optional.empty();
    private Optional<String> uri = Optional.empty();
    Builder() {
    }
    Builder(GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution source) {
      this.displayName = source.displayName();
      this.photoUri = source.photoUri();
      this.uri = source.uri();
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder photoUri(String photoUri) {
      this.photoUri = Optional.of(photoUri);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder photoUri(Optional<String> photoUri) {
      if (photoUri == null) {
        throw new NullPointerException("Null photoUri");
      }
      this.photoUri = photoUri;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder uri(String uri) {
      this.uri = Optional.of(uri);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder uri(Optional<String> uri) {
      if (uri == null) {
        throw new NullPointerException("Null uri");
      }
      this.uri = uri;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution build() {
      return new AutoValue_GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution(
          this.displayName,
          this.photoUri,
          this.uri);
    }
  }

}
